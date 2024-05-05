import java.io.EOFException;
import java.io.IOException;

// 
// Decompiled by Procyon v0.5.36
// 

public class BufferedFile
{
    int readBufferLength;
    byte[] readBuffer;
    AccessFile accessFile;
    long writeBufferOffset;
    byte[] writeBuffer;
    int writeBufferLength;
    long readBufferOffset;
    long offset;
    long fileLength;
    long length;
    long fileOffset;
    
    public BufferedFile(final AccessFile accessFile, final int n, final int n2) throws IOException {
        this.readBufferOffset = 3718207757638450433L;
        this.writeBufferOffset = -699769937149266301L;
        this.writeBufferLength = 0;
        this.accessFile = accessFile;
        final long fileLength = accessFile.length(2094967238) * 5255811969167658705L;
        this.fileLength = fileLength;
        this.length = fileLength * 6082200808648199633L;
        this.readBuffer = new byte[n];
        this.writeBuffer = new byte[n2];
        this.offset = 0L;
    }
    
    public void ad(final byte[] array, int n, int n2) throws IOException {
        try {
            if (8429326271465132299L * this.offset + n2 > this.length * -1243507284389482911L) {
                this.length = -8298185492872661599L * (n2 + this.offset * 8429326271465132299L);
            }
            if (this.writeBufferOffset * -8462239109085136939L != -1L && (8429326271465132299L * this.offset < this.writeBufferOffset * -8462239109085136939L || 8429326271465132299L * this.offset > this.writeBufferOffset * -8462239109085136939L + -568312444 * this.writeBufferLength)) {
                ig(this, 402353448);
            }
            if (-8462239109085136939L * this.writeBufferOffset != -1L && n2 + 8429326271465132299L * this.offset > -8462239109085136939L * this.writeBufferOffset + this.writeBuffer.length) {
                final int n3 = (int)(this.writeBuffer.length - (8429326271465132299L * this.offset - this.writeBufferOffset * -8462239109085136939L));
                System.arraycopy(array, n, this.writeBuffer, (int)(this.offset * 8429326271465132299L - this.writeBufferOffset * -8462239109085136939L), n3);
                this.offset += n3 * -6181027881899576669L;
                n += n3;
                n2 -= n3;
                this.writeBufferLength = 527428796 * this.writeBuffer.length;
                ig(this, 535258946);
            }
            if (n2 > this.writeBuffer.length) {
                if (31144933894015367L * this.fileOffset != 8429326271465132299L * this.offset) {
                    this.accessFile.seek(8429326271465132299L * this.offset);
                    this.fileOffset = -140630493748753059L * this.offset;
                }
                this.accessFile.write(array, n, n2, 185047612);
                this.fileOffset += n2 * -9042087461339190217L;
                if (this.fileOffset * 31144933894015367L > 3127984517526915633L * this.fileLength) {
                    this.fileLength = this.fileOffset * 5080559548865145143L;
                }
                long n4 = -1L;
                long n5 = -1L;
                if (8429326271465132299L * this.offset >= this.readBufferOffset * 8734338143670189311L && 8429326271465132299L * this.offset < this.readBufferLength * 789993571 + this.readBufferOffset * 8734338143670189311L) {
                    n4 = this.offset * 8429326271465132299L;
                }
                else if (8734338143670189311L * this.readBufferOffset >= this.offset * 8429326271465132299L && 8734338143670189311L * this.readBufferOffset < n2 + 8429326271465132299L * this.offset) {
                    n4 = this.readBufferOffset * 8734338143670189311L;
                }
                if (this.offset * 8429326271465132299L + n2 > 8734338143670189311L * this.readBufferOffset && n2 + 8429326271465132299L * this.offset <= -232073801 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                    n5 = this.offset * 8429326271465132299L + n2;
                }
                else if (-71594204 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L > 8429326271465132299L * this.offset && this.readBufferOffset * 8734338143670189311L + this.readBufferLength * -1668641475 <= 8429326271465132299L * this.offset + n2) {
                    n5 = this.readBufferOffset * 8734338143670189311L + this.readBufferLength * -1691135521;
                }
                if (n4 > -1L && n5 > n4) {
                    System.arraycopy(array, (int)(n + n4 - 8429326271465132299L * this.offset), this.readBuffer, (int)(n4 - 8734338143670189311L * this.readBufferOffset), (int)(n5 - n4));
                }
                this.offset += n2 * -6181027881899576669L;
                return;
            }
            if (n2 > 0) {
                if (-1L == this.writeBufferOffset * -8462239109085136939L) {
                    this.writeBufferOffset = 2422695430762542431L * this.offset;
                }
                System.arraycopy(array, n, this.writeBuffer, (int)(8429326271465132299L * this.offset - -8462239109085136939L * this.writeBufferOffset), n2);
                this.offset += n2 * -6181027881899576669L;
                if (this.offset * 8429326271465132299L - this.writeBufferOffset * -8462239109085136939L > this.writeBufferLength * -1958836101) {
                    this.writeBufferLength = (int)(this.offset * 8429326271465132299L - -8462239109085136939L * this.writeBufferOffset) * -1669068099;
                }
            }
        }
        catch (IOException ex) {
            this.fileOffset = 9042087461339190217L;
            throw ex;
        }
    }
    
    public void ae(final byte[] array, int n, int n2) throws IOException {
        try {
            if (8429326271465132299L * this.offset + n2 > this.length * -1243507284389482911L) {
                this.length = -8298185492872661599L * (n2 + this.offset * 8429326271465132299L);
            }
            if (this.writeBufferOffset * -8462239109085136939L != -1L && (8429326271465132299L * this.offset < this.writeBufferOffset * -8462239109085136939L || 8429326271465132299L * this.offset > this.writeBufferOffset * -8462239109085136939L + -654786411 * this.writeBufferLength)) {
                ig(this, 1217522500);
            }
            if (-8462239109085136939L * this.writeBufferOffset != -1L && n2 + 8429326271465132299L * this.offset > -8462239109085136939L * this.writeBufferOffset + this.writeBuffer.length) {
                final int n3 = (int)(this.writeBuffer.length - (8429326271465132299L * this.offset - this.writeBufferOffset * -8462239109085136939L));
                System.arraycopy(array, n, this.writeBuffer, (int)(this.offset * 8429326271465132299L - this.writeBufferOffset * -8462239109085136939L), n3);
                this.offset += n3 * -6181027881899576669L;
                n += n3;
                n2 -= n3;
                this.writeBufferLength = -1669068099 * this.writeBuffer.length;
                ig(this, 723226691);
            }
            if (n2 > this.writeBuffer.length) {
                if (31144933894015367L * this.fileOffset != 8429326271465132299L * this.offset) {
                    this.accessFile.seek(8429326271465132299L * this.offset);
                    this.fileOffset = -140630493748753059L * this.offset;
                }
                this.accessFile.write(array, n, n2, 185047612);
                this.fileOffset += n2 * -9042087461339190217L;
                if (this.fileOffset * 31144933894015367L > 3127984517526915633L * this.fileLength) {
                    this.fileLength = this.fileOffset * 5080559548865145143L;
                }
                long n4 = -1L;
                long n5 = -1L;
                if (8429326271465132299L * this.offset >= this.readBufferOffset * 8734338143670189311L && 8429326271465132299L * this.offset < this.readBufferLength * -1691135521 + this.readBufferOffset * 8734338143670189311L) {
                    n4 = this.offset * 8429326271465132299L;
                }
                else if (8734338143670189311L * this.readBufferOffset >= this.offset * 8429326271465132299L && 8734338143670189311L * this.readBufferOffset < n2 + 8429326271465132299L * this.offset) {
                    n4 = this.readBufferOffset * 8734338143670189311L;
                }
                if (this.offset * 8429326271465132299L + n2 > 8734338143670189311L * this.readBufferOffset && n2 + 8429326271465132299L * this.offset <= -1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                    n5 = this.offset * 8429326271465132299L + n2;
                }
                else if (-1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L > 8429326271465132299L * this.offset && this.readBufferOffset * 8734338143670189311L + this.readBufferLength * -1691135521 <= 8429326271465132299L * this.offset + n2) {
                    n5 = this.readBufferOffset * 8734338143670189311L + this.readBufferLength * -1691135521;
                }
                if (n4 > -1L && n5 > n4) {
                    System.arraycopy(array, (int)(n + n4 - 8429326271465132299L * this.offset), this.readBuffer, (int)(n4 - 8734338143670189311L * this.readBufferOffset), (int)(n5 - n4));
                }
                this.offset += n2 * -6181027881899576669L;
                return;
            }
            if (n2 > 0) {
                if (-1L == this.writeBufferOffset * -8462239109085136939L) {
                    this.writeBufferOffset = 2422695430762542431L * this.offset;
                }
                System.arraycopy(array, n, this.writeBuffer, (int)(8429326271465132299L * this.offset - -8462239109085136939L * this.writeBufferOffset), n2);
                this.offset += n2 * -6181027881899576669L;
                if (this.offset * 8429326271465132299L - this.writeBufferOffset * -8462239109085136939L > this.writeBufferLength * -654786411) {
                    this.writeBufferLength = (int)(this.offset * 8429326271465132299L - -8462239109085136939L * this.writeBufferOffset) * -1669068099;
                }
            }
        }
        catch (IOException ex) {
            this.fileOffset = 9042087461339190217L;
            throw ex;
        }
    }
    
    void bb() throws IOException {
        if (-8462239109085136939L * this.writeBufferOffset != -1L) {
            if (this.fileOffset * 31144933894015367L != this.writeBufferOffset * -8462239109085136939L) {
                this.accessFile.seek(this.writeBufferOffset * -8462239109085136939L);
                this.fileOffset = 7312697603599620803L * this.writeBufferOffset;
            }
            this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength * -654786411, 185047612);
            this.fileOffset += -9056128312498455549L * this.writeBufferLength;
            if (this.fileOffset * 31144933894015367L > 3127984517526915633L * this.fileLength) {
                this.fileLength = this.fileOffset * 5080559548865145143L;
            }
            long n = -1L;
            long n2 = -1L;
            if (this.writeBufferOffset * -8462239109085136939L >= this.readBufferOffset * 8734338143670189311L && -8462239109085136939L * this.writeBufferOffset < -1691135521 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset) {
                n = -8462239109085136939L * this.writeBufferOffset;
            }
            else if (8734338143670189311L * this.readBufferOffset >= this.writeBufferOffset * -8462239109085136939L && 8734338143670189311L * this.readBufferOffset < -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L) {
                n = 8734338143670189311L * this.readBufferOffset;
            }
            if (this.writeBufferOffset * -8462239109085136939L + -654786411 * this.writeBufferLength > 8734338143670189311L * this.readBufferOffset && -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L <= -1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                n2 = this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411;
            }
            else if (8734338143670189311L * this.readBufferOffset + -1691135521 * this.readBufferLength > this.writeBufferOffset * -8462239109085136939L && -1691135521 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset <= -8462239109085136939L * this.writeBufferOffset + -654786411 * this.writeBufferLength) {
                n2 = this.readBufferLength * -1691135521 + this.readBufferOffset * 8734338143670189311L;
            }
            if (n > -1L && n2 > n) {
                System.arraycopy(this.writeBuffer, (int)(n - this.writeBufferOffset * -8462239109085136939L), this.readBuffer, (int)(n - this.readBufferOffset * 8734338143670189311L), (int)(n2 - n));
            }
            this.writeBufferOffset = -699769937149266301L;
            this.writeBufferLength = 0;
        }
    }
    
    public static void me(final BufferedFile bufferedFile, final byte[] array, int n, int n2) throws IOException {
        try {
            if (8429326271465132299L * bufferedFile.offset + n2 > bufferedFile.length * -1243507284389482911L) {
                bufferedFile.length = -8298185492872661599L * (n2 + bufferedFile.offset * 8429326271465132299L);
            }
            if (bufferedFile.writeBufferOffset * -8462239109085136939L != -1L && (8429326271465132299L * bufferedFile.offset < bufferedFile.writeBufferOffset * -8462239109085136939L || 8429326271465132299L * bufferedFile.offset > bufferedFile.writeBufferOffset * -8462239109085136939L + 84307282 * bufferedFile.writeBufferLength)) {
                ig(bufferedFile, -884074474);
            }
            if (-8462239109085136939L * bufferedFile.writeBufferOffset != -1L && n2 + 8429326271465132299L * bufferedFile.offset > -8462239109085136939L * bufferedFile.writeBufferOffset + bufferedFile.writeBuffer.length) {
                final int n3 = (int)(bufferedFile.writeBuffer.length - (8429326271465132299L * bufferedFile.offset - bufferedFile.writeBufferOffset * -8462239109085136939L));
                System.arraycopy(array, n, bufferedFile.writeBuffer, (int)(bufferedFile.offset * 8429326271465132299L - bufferedFile.writeBufferOffset * -8462239109085136939L), n3);
                bufferedFile.offset += n3 * -6181027881899576669L;
                n += n3;
                n2 -= n3;
                bufferedFile.writeBufferLength = 316285557 * bufferedFile.writeBuffer.length;
                ig(bufferedFile, -358591900);
            }
            if (n2 > bufferedFile.writeBuffer.length) {
                if (31144933894015367L * bufferedFile.fileOffset != 8429326271465132299L * bufferedFile.offset) {
                    bufferedFile.accessFile.seek(8429326271465132299L * bufferedFile.offset);
                    bufferedFile.fileOffset = -140630493748753059L * bufferedFile.offset;
                }
                bufferedFile.accessFile.write(array, n, n2, 185047612);
                bufferedFile.fileOffset += n2 * -9042087461339190217L;
                if (bufferedFile.fileOffset * 31144933894015367L > 3127984517526915633L * bufferedFile.fileLength) {
                    bufferedFile.fileLength = bufferedFile.fileOffset * 5080559548865145143L;
                }
                long n4 = -1L;
                long n5 = -1L;
                if (8429326271465132299L * bufferedFile.offset >= bufferedFile.readBufferOffset * 8734338143670189311L && 8429326271465132299L * bufferedFile.offset < bufferedFile.readBufferLength * -1691135521 + bufferedFile.readBufferOffset * 8734338143670189311L) {
                    n4 = bufferedFile.offset * 8429326271465132299L;
                }
                else if (8734338143670189311L * bufferedFile.readBufferOffset >= bufferedFile.offset * 8429326271465132299L && 8734338143670189311L * bufferedFile.readBufferOffset < n2 + 8429326271465132299L * bufferedFile.offset) {
                    n4 = bufferedFile.readBufferOffset * 8734338143670189311L;
                }
                if (bufferedFile.offset * 8429326271465132299L + n2 > 8734338143670189311L * bufferedFile.readBufferOffset && n2 + 8429326271465132299L * bufferedFile.offset <= -1691135521 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L) {
                    n5 = bufferedFile.offset * 8429326271465132299L + n2;
                }
                else if (-718914329 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L > 8429326271465132299L * bufferedFile.offset && bufferedFile.readBufferOffset * 8734338143670189311L + bufferedFile.readBufferLength * -301145734 <= 8429326271465132299L * bufferedFile.offset + n2) {
                    n5 = bufferedFile.readBufferOffset * 8734338143670189311L + bufferedFile.readBufferLength * 1606160039;
                }
                if (n4 > -1L && n5 > n4) {
                    System.arraycopy(array, (int)(n + n4 - 8429326271465132299L * bufferedFile.offset), bufferedFile.readBuffer, (int)(n4 - 8734338143670189311L * bufferedFile.readBufferOffset), (int)(n5 - n4));
                }
                bufferedFile.offset += n2 * -6181027881899576669L;
                return;
            }
            if (n2 > 0) {
                if (-1L == bufferedFile.writeBufferOffset * -8462239109085136939L) {
                    bufferedFile.writeBufferOffset = 2422695430762542431L * bufferedFile.offset;
                }
                System.arraycopy(array, n, bufferedFile.writeBuffer, (int)(8429326271465132299L * bufferedFile.offset - -8462239109085136939L * bufferedFile.writeBufferOffset), n2);
                bufferedFile.offset += n2 * -6181027881899576669L;
                if (bufferedFile.offset * 8429326271465132299L - bufferedFile.writeBufferOffset * -8462239109085136939L > bufferedFile.writeBufferLength * -654786411) {
                    bufferedFile.writeBufferLength = (int)(bufferedFile.offset * 8429326271465132299L - -8462239109085136939L * bufferedFile.writeBufferOffset) * -1669068099;
                }
            }
        }
        catch (IOException ex) {
            bufferedFile.fileOffset = 9042087461339190217L;
            throw ex;
        }
    }
    
    public void ao(final long n) {
        try {
            if (n < 0L) {
                throw new IOException("");
            }
            this.length = n * -6181027881899576669L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.an(" + ')');
        }
    }
    
    void ak() throws IOException {
        this.readBufferLength = 0;
        if (this.offset * 8429326271465132299L != 31144933894015367L * this.fileOffset) {
            this.accessFile.seek(8429326271465132299L * this.offset);
            this.fileOffset = -140630493748753059L * this.offset;
        }
        this.readBufferOffset = 2440797830623285237L * this.offset;
        while (this.readBufferLength * -1691135521 < this.readBuffer.length) {
            int n = this.readBuffer.length - -1691135521 * this.readBufferLength;
            if (n > 200000000) {
                n = 200000000;
            }
            final int read = this.accessFile.read(this.readBuffer, -1691135521 * this.readBufferLength, n, 945781013);
            if (read == -1) {
                break;
            }
            this.fileOffset += read * -9042087461339190217L;
            this.readBufferLength += read * -84563425;
        }
    }
    
    public void av(final byte[] array) throws IOException {
        this.read(array, 0, array.length, -576327973);
    }
    
    void be() throws IOException {
        if (-8462239109085136939L * this.writeBufferOffset != -1L) {
            if (this.fileOffset * 31144933894015367L != this.writeBufferOffset * -8462239109085136939L) {
                this.accessFile.seek(this.writeBufferOffset * -8462239109085136939L);
                this.fileOffset = 7312697603599620803L * this.writeBufferOffset;
            }
            this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength * 438407466, 185047612);
            this.fileOffset += -9056128312498455549L * this.writeBufferLength;
            if (this.fileOffset * 31144933894015367L > 3127984517526915633L * this.fileLength) {
                this.fileLength = this.fileOffset * 5080559548865145143L;
            }
            long n = -1L;
            long n2 = -1L;
            if (this.writeBufferOffset * -8462239109085136939L >= this.readBufferOffset * 8734338143670189311L && -8462239109085136939L * this.writeBufferOffset < 1111206150 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset) {
                n = -8462239109085136939L * this.writeBufferOffset;
            }
            else if (8734338143670189311L * this.readBufferOffset >= this.writeBufferOffset * -8462239109085136939L && 8734338143670189311L * this.readBufferOffset < 220042435 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L) {
                n = 8734338143670189311L * this.readBufferOffset;
            }
            if (this.writeBufferOffset * -8462239109085136939L + -739162078 * this.writeBufferLength > 8734338143670189311L * this.readBufferOffset && -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L <= -1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                n2 = this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -1662061988;
            }
            else if (8734338143670189311L * this.readBufferOffset + -1691135521 * this.readBufferLength > this.writeBufferOffset * -8462239109085136939L && -132450191 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset <= -8462239109085136939L * this.writeBufferOffset + 964963750 * this.writeBufferLength) {
                n2 = this.readBufferLength * -1691135521 + this.readBufferOffset * 8734338143670189311L;
            }
            if (n > -1L && n2 > n) {
                System.arraycopy(this.writeBuffer, (int)(n - this.writeBufferOffset * -8462239109085136939L), this.readBuffer, (int)(n - this.readBufferOffset * 8734338143670189311L), (int)(n2 - n));
            }
            this.writeBufferOffset = -699769937149266301L;
            this.writeBufferLength = 0;
        }
    }
    
    void az() throws IOException {
        this.readBufferLength = 0;
        if (this.offset * 8429326271465132299L != 31144933894015367L * this.fileOffset) {
            this.accessFile.seek(8429326271465132299L * this.offset);
            this.fileOffset = -140630493748753059L * this.offset;
        }
        this.readBufferOffset = 2440797830623285237L * this.offset;
        while (this.readBufferLength * -1691135521 < this.readBuffer.length) {
            int n = this.readBuffer.length - -1691135521 * this.readBufferLength;
            if (n > -1463945323) {
                n = 200000000;
            }
            final int read = this.accessFile.read(this.readBuffer, -1691135521 * this.readBufferLength, n, -1878239542);
            if (read == -1) {
                break;
            }
            this.fileOffset += read * -9042087461339190217L;
            this.readBufferLength += read * 567466757;
        }
    }
    
    public long ax() {
        return this.length * -1243507284389482911L;
    }
    
    public void ay(final long n) throws IOException {
        if (n < 0L) {
            throw new IOException("");
        }
        this.offset = n * -6181027881899576669L;
    }
    
    public static void ih(final BufferedFile bufferedFile) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.az();
        }
        bufferedFile.readBufferLength = 0;
        if (bufferedFile.offset * 8429326271465132299L != 31144933894015367L * bufferedFile.fileOffset) {
            bufferedFile.accessFile.seek(8429326271465132299L * bufferedFile.offset);
            bufferedFile.fileOffset = -140630493748753059L * bufferedFile.offset;
        }
        bufferedFile.readBufferOffset = 2440797830623285237L * bufferedFile.offset;
        while (bufferedFile.readBufferLength * -1691135521 < bufferedFile.readBuffer.length) {
            int n = bufferedFile.readBuffer.length - -1691135521 * bufferedFile.readBufferLength;
            if (n > 200000000) {
                n = 200000000;
            }
            final int read = bufferedFile.accessFile.read(bufferedFile.readBuffer, -1691135521 * bufferedFile.readBufferLength, n, 2063330178);
            if (read == -1) {
                break;
            }
            bufferedFile.fileOffset += read * -9042087461339190217L;
            bufferedFile.readBufferLength += read * -84563425;
        }
    }
    
    public long length(final short n) {
        try {
            return this.length * -1243507284389482911L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.aw(" + ')');
        }
    }
    
    void flush(final int n) {
        try {
            if (-8462239109085136939L * this.fileOffset != -1L) {
                if (this.offset * 31144933894015367L != this.fileLength * -8462239109085136939L) {
                    if (n <= -1254834640) {
                        return;
                    }
                    this.accessFile.al(this.length * -8462239109085136939L);
                    this.offset = 7312697603599620803L * this.fileLength;
                }
                this.accessFile.write(this.writeBuffer, 0, this.readBufferLength * -654786411, 185047612);
                this.fileOffset = this.offset + -9056128312498455549L * this.readBufferLength;
                if (this.writeBufferOffset * 31144933894015367L > 3127984517526915633L * this.writeBufferOffset) {
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    this.fileLength = this.readBufferOffset * 5080559548865145143L;
                }
                long n2 = -1L;
                long n3 = -1L;
                while (true) {
                    Label_0312: {
                        if (this.readBufferOffset * -8462239109085136939L < this.writeBufferOffset * 8734338143670189311L) {
                            break Label_0312;
                        }
                        if (n <= -1254834640) {
                            throw new IllegalStateException();
                        }
                        if (-8462239109085136939L * this.writeBufferOffset >= -1691135521 * this.readBufferLength + 8734338143670189311L * this.writeBufferOffset) {
                            break Label_0312;
                        }
                        if (n <= -1254834640) {
                            throw new IllegalStateException();
                        }
                        n2 = -8462239109085136939L * this.fileLength;
                        while (true) {
                            Label_0603: {
                                if (this.fileOffset * -8462239109085136939L + -654786411 * this.readBufferLength <= 8734338143670189311L * this.writeBufferOffset) {
                                    break Label_0603;
                                }
                                if (n <= -1254834640) {
                                    throw new IllegalStateException();
                                }
                                if (-654786411 * this.readBufferLength + this.readBufferOffset * -8462239109085136939L > -1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                                    break Label_0603;
                                }
                                if (n <= -1254834640) {
                                    throw new IllegalStateException();
                                }
                                n3 = this.fileOffset * -8462239109085136939L + this.readBufferLength * -654786411;
                                if (n2 > -1L) {
                                    if (n <= -1254834640) {
                                        throw new IllegalStateException();
                                    }
                                    if (n3 > n2) {
                                        if (n <= -1254834640) {
                                            throw new IllegalStateException();
                                        }
                                        System.arraycopy(this.readBuffer, (int)(n2 - this.readBufferOffset * -8462239109085136939L), this.readBuffer, (int)(n2 - this.fileOffset * 8734338143670189311L), (int)(n3 - n2));
                                    }
                                }
                                this.readBufferOffset = -699769937149266301L;
                                this.readBufferLength = 0;
                                return;
                            }
                            if (8734338143670189311L * this.readBufferOffset + -1691135521 * this.writeBufferLength <= this.fileLength * -8462239109085136939L) {
                                continue;
                            }
                            if (n <= -1254834640) {
                                throw new IllegalStateException();
                            }
                            if (-1691135521 * this.writeBufferLength + 8734338143670189311L * this.fileLength > -8462239109085136939L * this.readBufferOffset + -654786411 * this.writeBufferLength) {
                                continue;
                            }
                            if (n <= -1254834640) {
                                return;
                            }
                            n3 = this.writeBufferLength * -1691135521 + this.readBufferOffset * 8734338143670189311L;
                            continue;
                        }
                    }
                    if (8734338143670189311L * this.fileLength < this.fileOffset * -8462239109085136939L) {
                        continue;
                    }
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    if (8734338143670189311L * this.readBufferOffset >= -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L) {
                        continue;
                    }
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    n2 = 8734338143670189311L * this.length;
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.al(" + ')');
        }
    }
    
    public static void cu(final BufferedFile bufferedFile, final long n) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.ao(n);
            return;
        }
        try {
            if (n < 0L) {
                throw new IOException("");
            }
            bufferedFile.offset = n * -6181027881899576669L;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.an(" + ')');
        }
    }
    
    public void seek(final long n) throws IOException {
        if (n < 0L) {
            throw new IOException("");
        }
        this.offset = n * -6181027881899576669L;
    }
    
    public void readFully(final byte[] array, final int n) {
        try {
            this.read(array, 0, array.length, -1928644410);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.ac(" + ')');
        }
    }
    
    public static void ox(final BufferedFile bufferedFile) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.ag();
        }
        if (-8462239109085136939L * bufferedFile.writeBufferOffset != -1L) {
            if (bufferedFile.fileOffset * 31144933894015367L != bufferedFile.writeBufferOffset * -8462239109085136939L) {
                bufferedFile.accessFile.seek(bufferedFile.writeBufferOffset * -8462239109085136939L);
                bufferedFile.fileOffset = 7312697603599620803L * bufferedFile.writeBufferOffset;
            }
            bufferedFile.accessFile.write(bufferedFile.writeBuffer, 0, bufferedFile.writeBufferLength * 1623776851, 185047612);
            bufferedFile.fileOffset += -9056128312498455549L * bufferedFile.writeBufferLength;
            if (bufferedFile.fileOffset * 31144933894015367L > 3127984517526915633L * bufferedFile.fileLength) {
                bufferedFile.fileLength = bufferedFile.fileOffset * 5080559548865145143L;
            }
            long n = -1L;
            long n2 = -1L;
            if (bufferedFile.writeBufferOffset * -8462239109085136939L >= bufferedFile.readBufferOffset * 8734338143670189311L && -8462239109085136939L * bufferedFile.writeBufferOffset < -1780960820 * bufferedFile.readBufferLength + 8734338143670189311L * bufferedFile.readBufferOffset) {
                n = -8462239109085136939L * bufferedFile.writeBufferOffset;
            }
            else if (8734338143670189311L * bufferedFile.readBufferOffset >= bufferedFile.writeBufferOffset * -8462239109085136939L && 8734338143670189311L * bufferedFile.readBufferOffset < 812726269 * bufferedFile.writeBufferLength + bufferedFile.writeBufferOffset * -8462239109085136939L) {
                n = 8734338143670189311L * bufferedFile.readBufferOffset;
            }
            if (bufferedFile.writeBufferOffset * -8462239109085136939L + -870514707 * bufferedFile.writeBufferLength > 8734338143670189311L * bufferedFile.readBufferOffset && -654786411 * bufferedFile.writeBufferLength + bufferedFile.writeBufferOffset * -8462239109085136939L <= 1665092852 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L) {
                n2 = bufferedFile.writeBufferOffset * -8462239109085136939L + bufferedFile.writeBufferLength * -654786411;
            }
            else if (8734338143670189311L * bufferedFile.readBufferOffset + -1691135521 * bufferedFile.readBufferLength > bufferedFile.writeBufferOffset * -8462239109085136939L && -1691135521 * bufferedFile.readBufferLength + 8734338143670189311L * bufferedFile.readBufferOffset <= -8462239109085136939L * bufferedFile.writeBufferOffset + 626501264 * bufferedFile.writeBufferLength) {
                n2 = bufferedFile.readBufferLength * 1770708571 + bufferedFile.readBufferOffset * 8734338143670189311L;
            }
            if (n > -1L && n2 > n) {
                System.arraycopy(bufferedFile.writeBuffer, (int)(n - bufferedFile.writeBufferOffset * -8462239109085136939L), bufferedFile.readBuffer, (int)(n - bufferedFile.readBufferOffset * 8734338143670189311L), (int)(n2 - n));
            }
            bufferedFile.writeBufferOffset = -699769937149266301L;
            bufferedFile.writeBufferLength = 0;
        }
    }
    
    public static void ri(final BufferedFile bufferedFile, final byte[] array, int i, int j) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.az();
            return;
        }
        try {
            if (i + j > array.length) {
                throw new ArrayIndexOutOfBoundsException(i + j - array.length);
            }
            if (-8462239109085136939L * bufferedFile.writeBufferOffset != -1L && bufferedFile.offset * 8429326271465132299L >= -8462239109085136939L * bufferedFile.writeBufferOffset && 8429326271465132299L * bufferedFile.offset + j <= bufferedFile.writeBufferOffset * -8462239109085136939L + bufferedFile.writeBufferLength * -654786411) {
                System.arraycopy(bufferedFile.writeBuffer, (int)(bufferedFile.offset * 8429326271465132299L - -8462239109085136939L * bufferedFile.writeBufferOffset), array, i, j);
                bufferedFile.offset += -6181027881899576669L * j;
                return;
            }
            final long n = 8429326271465132299L * bufferedFile.offset;
            final int n2 = i;
            final int n3 = j;
            if (bufferedFile.offset * 8429326271465132299L >= bufferedFile.readBufferOffset * 8734338143670189311L && 8429326271465132299L * bufferedFile.offset < 8734338143670189311L * bufferedFile.readBufferOffset + -1691135521 * bufferedFile.readBufferLength) {
                int n4 = (int)(-1691135521 * bufferedFile.readBufferLength - (bufferedFile.offset * 8429326271465132299L - bufferedFile.readBufferOffset * 8734338143670189311L));
                if (n4 > j) {
                    n4 = j;
                }
                System.arraycopy(bufferedFile.readBuffer, (int)(8429326271465132299L * bufferedFile.offset - 8734338143670189311L * bufferedFile.readBufferOffset), array, i, n4);
                bufferedFile.offset += -6181027881899576669L * n4;
                i += n4;
                j -= n4;
            }
            if (j > bufferedFile.readBuffer.length) {
                bufferedFile.accessFile.seek(bufferedFile.offset * 8429326271465132299L);
                bufferedFile.fileOffset = -140630493748753059L * bufferedFile.offset;
                while (j > 0) {
                    final int read = bufferedFile.accessFile.read(array, i, j, -1731167481);
                    if (-1 == read) {
                        break;
                    }
                    bufferedFile.fileOffset += -9042087461339190217L * read;
                    bufferedFile.offset += read * -6181027881899576669L;
                    i += read;
                    j -= read;
                }
            }
            else if (j > 0) {
                bufferedFile.load((byte)(-48));
                int n5 = j;
                if (n5 > bufferedFile.readBufferLength * -1691135521) {
                    n5 = -1691135521 * bufferedFile.readBufferLength;
                }
                System.arraycopy(bufferedFile.readBuffer, 0, array, i, n5);
                i += n5;
                j -= n5;
                bufferedFile.offset += n5 * -6181027881899576669L;
            }
            if (bufferedFile.writeBufferOffset * -8462239109085136939L != -1L) {
                if (-8462239109085136939L * bufferedFile.writeBufferOffset > bufferedFile.offset * 8429326271465132299L && j > 0) {
                    int n6 = (int)(-8462239109085136939L * bufferedFile.writeBufferOffset - bufferedFile.offset * 8429326271465132299L) + i;
                    if (n6 > j + i) {
                        n6 = j + i;
                    }
                    while (i < n6) {
                        array[i++] = 0;
                        --j;
                        bufferedFile.offset -= 6181027881899576669L;
                    }
                }
                long n7 = -1L;
                long n8 = -1L;
                if (bufferedFile.writeBufferOffset * -8462239109085136939L >= n && -8462239109085136939L * bufferedFile.writeBufferOffset < n + n3) {
                    n7 = bufferedFile.writeBufferOffset * -8462239109085136939L;
                }
                else if (n >= -8462239109085136939L * bufferedFile.writeBufferOffset && n < bufferedFile.writeBufferOffset * -8462239109085136939L + bufferedFile.writeBufferLength * -654786411) {
                    n7 = n;
                }
                if (-8462239109085136939L * bufferedFile.writeBufferOffset + bufferedFile.writeBufferLength * -654786411 > n && -654786411 * bufferedFile.writeBufferLength + -8462239109085136939L * bufferedFile.writeBufferOffset <= n3 + n) {
                    n8 = bufferedFile.writeBufferOffset * -8462239109085136939L + bufferedFile.writeBufferLength * -654786411;
                }
                else if (n + n3 > bufferedFile.writeBufferOffset * -8462239109085136939L && n + n3 <= bufferedFile.writeBufferLength * -654786411 + bufferedFile.writeBufferOffset * -8462239109085136939L) {
                    n8 = n + n3;
                }
                if (n7 > -1L && n8 > n7) {
                    System.arraycopy(bufferedFile.writeBuffer, (int)(n7 - -8462239109085136939L * bufferedFile.writeBufferOffset), array, (int)(n7 - n) + n2, (int)(n8 - n7));
                    if (n8 > bufferedFile.offset * 8429326271465132299L) {
                        j -= (int)(n8 - bufferedFile.offset * 8429326271465132299L);
                        bufferedFile.offset = n8 * -6181027881899576669L;
                    }
                }
            }
        }
        catch (IOException ex) {
            bufferedFile.fileOffset = 9042087461339190217L;
            throw ex;
        }
        if (j > 0) {
            throw new EOFException();
        }
    }
    
    public void read(final byte[] array, int i, int j, final int n) throws IOException {
        try {
            try {
                if (i + j > array.length) {
                    if (n >= 296386112) {
                        return;
                    }
                    throw new ArrayIndexOutOfBoundsException(i + j - array.length);
                }
                else {
                    if (-8462239109085136939L * this.writeBufferOffset != -1L) {
                        if (n >= 296386112) {
                            throw new IllegalStateException();
                        }
                        if (this.offset * 8429326271465132299L >= -8462239109085136939L * this.writeBufferOffset) {
                            if (n >= 296386112) {
                                throw new IllegalStateException();
                            }
                            if (8429326271465132299L * this.offset + j <= this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411) {
                                if (n >= 296386112) {
                                    return;
                                }
                                System.arraycopy(this.writeBuffer, (int)(this.offset * 8429326271465132299L - -8462239109085136939L * this.writeBufferOffset), array, i, j);
                                this.offset += -6181027881899576669L * j;
                                return;
                            }
                        }
                    }
                    final long n2 = 8429326271465132299L * this.offset;
                    final int n3 = i;
                    final int n4 = j;
                    if (this.offset * 8429326271465132299L >= this.readBufferOffset * 8734338143670189311L) {
                        if (n >= 296386112) {
                            return;
                        }
                        if (8429326271465132299L * this.offset < 8734338143670189311L * this.readBufferOffset + -1691135521 * this.readBufferLength) {
                            int n5 = (int)(-1691135521 * this.readBufferLength - (this.offset * 8429326271465132299L - this.readBufferOffset * 8734338143670189311L));
                            if (n5 > j) {
                                if (n >= 296386112) {
                                    throw new IllegalStateException();
                                }
                                n5 = j;
                            }
                            System.arraycopy(this.readBuffer, (int)(8429326271465132299L * this.offset - 8734338143670189311L * this.readBufferOffset), array, i, n5);
                            this.offset += -6181027881899576669L * n5;
                            i += n5;
                            j -= n5;
                        }
                    }
                    if (j > this.readBuffer.length) {
                        if (n >= 296386112) {
                            throw new IllegalStateException();
                        }
                        this.accessFile.seek(this.offset * 8429326271465132299L);
                        this.fileOffset = -140630493748753059L * this.offset;
                        while (j > 0) {
                            final int read = this.accessFile.read(array, i, j, -1969365793);
                            if (-1 == read) {
                                if (n >= 296386112) {
                                    throw new IllegalStateException();
                                }
                                break;
                            }
                            else {
                                this.fileOffset += -9042087461339190217L * read;
                                this.offset += read * -6181027881899576669L;
                                i += read;
                                j -= read;
                            }
                        }
                    }
                    else if (j > 0) {
                        if (n >= 296386112) {
                            throw new IllegalStateException();
                        }
                        this.load((byte)(-75));
                        int n6 = j;
                        if (n6 > this.readBufferLength * -1691135521) {
                            if (n >= 296386112) {
                                return;
                            }
                            n6 = -1691135521 * this.readBufferLength;
                        }
                        System.arraycopy(this.readBuffer, 0, array, i, n6);
                        i += n6;
                        j -= n6;
                        this.offset += n6 * -6181027881899576669L;
                    }
                    if (this.writeBufferOffset * -8462239109085136939L != -1L) {
                        if (n >= 296386112) {
                            return;
                        }
                        if (-8462239109085136939L * this.writeBufferOffset > this.offset * 8429326271465132299L) {
                            if (n >= 296386112) {
                                throw new IllegalStateException();
                            }
                            if (j > 0) {
                                int n7 = (int)(-8462239109085136939L * this.writeBufferOffset - this.offset * 8429326271465132299L) + i;
                                if (n7 > j + i) {
                                    if (n >= 296386112) {
                                        throw new IllegalStateException();
                                    }
                                    n7 = j + i;
                                }
                                while (i < n7) {
                                    if (n >= 296386112) {
                                        return;
                                    }
                                    array[i++] = 0;
                                    --j;
                                    this.offset -= 6181027881899576669L;
                                }
                            }
                        }
                        long n8 = -1L;
                        long n9 = -1L;
                        Label_0878: {
                            if (this.writeBufferOffset * -8462239109085136939L >= n2) {
                                if (n >= 296386112) {
                                    return;
                                }
                                if (-8462239109085136939L * this.writeBufferOffset < n2 + n4) {
                                    n8 = this.writeBufferOffset * -8462239109085136939L;
                                    break Label_0878;
                                }
                            }
                            if (n2 >= -8462239109085136939L * this.writeBufferOffset) {
                                if (n >= 296386112) {
                                    throw new IllegalStateException();
                                }
                                if (n2 < this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411) {
                                    if (n >= 296386112) {
                                        throw new IllegalStateException();
                                    }
                                    n8 = n2;
                                }
                            }
                        }
                        Label_1041: {
                            if (-8462239109085136939L * this.writeBufferOffset + this.writeBufferLength * -654786411 > n2) {
                                if (n >= 296386112) {
                                    throw new IllegalStateException();
                                }
                                if (-654786411 * this.writeBufferLength + -8462239109085136939L * this.writeBufferOffset <= n4 + n2) {
                                    n9 = this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411;
                                    break Label_1041;
                                }
                            }
                            if (n2 + n4 > this.writeBufferOffset * -8462239109085136939L) {
                                if (n >= 296386112) {
                                    return;
                                }
                                if (n2 + n4 <= this.writeBufferLength * -654786411 + this.writeBufferOffset * -8462239109085136939L) {
                                    if (n >= 296386112) {
                                        throw new IllegalStateException();
                                    }
                                    n9 = n2 + n4;
                                }
                            }
                        }
                        if (n8 > -1L) {
                            if (n >= 296386112) {
                                throw new IllegalStateException();
                            }
                            if (n9 > n8) {
                                System.arraycopy(this.writeBuffer, (int)(n8 - -8462239109085136939L * this.writeBufferOffset), array, (int)(n8 - n2) + n3, (int)(n9 - n8));
                                if (n9 > this.offset * 8429326271465132299L) {
                                    if (n >= 296386112) {
                                        throw new IllegalStateException();
                                    }
                                    j -= (int)(n9 - this.offset * 8429326271465132299L);
                                    this.offset = n9 * -6181027881899576669L;
                                }
                            }
                        }
                    }
                }
            }
            catch (IOException ex) {
                this.fileOffset = 9042087461339190217L;
                throw ex;
            }
            if (j > 0) {
                throw new EOFException();
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "sj.au(" + ')');
        }
    }
    
    public void aa() throws IOException {
        ig(this, -160081256);
        this.accessFile.close((byte)(-97));
    }
    
    public long ai() {
        return this.length * -1243507284389482911L;
    }
    
    public static void ki(final BufferedFile bufferedFile) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.ag();
        }
        ig(bufferedFile, -212056417);
        bufferedFile.accessFile.close((byte)(-65));
    }
    
    public static void fx(final MusicPatch musicPatch) {
        if (musicPatch == null) {
            musicPatch.ab();
            return;
        }
        musicPatch.field2777 = null;
    }
    
    void by() throws IOException {
        if (-8462239109085136939L * this.writeBufferOffset != -1L) {
            if (this.fileOffset * 31144933894015367L != this.writeBufferOffset * -8462239109085136939L) {
                this.accessFile.seek(this.writeBufferOffset * -8462239109085136939L);
                this.fileOffset = 7312697603599620803L * this.writeBufferOffset;
            }
            this.accessFile.write(this.writeBuffer, 0, this.writeBufferLength * -654786411, 185047612);
            this.fileOffset += -9056128312498455549L * this.writeBufferLength;
            if (this.fileOffset * 31144933894015367L > 3127984517526915633L * this.fileLength) {
                this.fileLength = this.fileOffset * 5080559548865145143L;
            }
            long n = -1L;
            long n2 = -1L;
            if (this.writeBufferOffset * -8462239109085136939L >= this.readBufferOffset * 8734338143670189311L && -8462239109085136939L * this.writeBufferOffset < -1691135521 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset) {
                n = -8462239109085136939L * this.writeBufferOffset;
            }
            else if (8734338143670189311L * this.readBufferOffset >= this.writeBufferOffset * -8462239109085136939L && 8734338143670189311L * this.readBufferOffset < -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L) {
                n = 8734338143670189311L * this.readBufferOffset;
            }
            if (this.writeBufferOffset * -8462239109085136939L + -654786411 * this.writeBufferLength > 8734338143670189311L * this.readBufferOffset && -654786411 * this.writeBufferLength + this.writeBufferOffset * -8462239109085136939L <= -1691135521 * this.readBufferLength + this.readBufferOffset * 8734338143670189311L) {
                n2 = this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411;
            }
            else if (8734338143670189311L * this.readBufferOffset + -1691135521 * this.readBufferLength > this.writeBufferOffset * -8462239109085136939L && -1691135521 * this.readBufferLength + 8734338143670189311L * this.readBufferOffset <= -8462239109085136939L * this.writeBufferOffset + -654786411 * this.writeBufferLength) {
                n2 = this.readBufferLength * -1691135521 + this.readBufferOffset * 8734338143670189311L;
            }
            if (n > -1L && n2 > n) {
                System.arraycopy(this.writeBuffer, (int)(n - this.writeBufferOffset * -8462239109085136939L), this.readBuffer, (int)(n - this.readBufferOffset * 8734338143670189311L), (int)(n2 - n));
            }
            this.writeBufferOffset = -699769937149266301L;
            this.writeBufferLength = 0;
        }
    }
    
    public void ar(final byte[] array, int i, int j) throws IOException {
        try {
            if (i + j > array.length) {
                throw new ArrayIndexOutOfBoundsException(i + j - array.length);
            }
            if (-8462239109085136939L * this.writeBufferOffset != -1L && this.offset * 8429326271465132299L >= -8462239109085136939L * this.writeBufferOffset && 8429326271465132299L * this.offset + j <= this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -684970853) {
                System.arraycopy(this.writeBuffer, (int)(this.offset * 8429326271465132299L - -8462239109085136939L * this.writeBufferOffset), array, i, j);
                this.offset += -6181027881899576669L * j;
                return;
            }
            final long n = 8429326271465132299L * this.offset;
            final int n2 = i;
            final int n3 = j;
            if (this.offset * 8429326271465132299L >= this.readBufferOffset * 8734338143670189311L && 8429326271465132299L * this.offset < 8734338143670189311L * this.readBufferOffset + -1691135521 * this.readBufferLength) {
                int n4 = (int)(-1691135521 * this.readBufferLength - (this.offset * 8429326271465132299L - this.readBufferOffset * 8734338143670189311L));
                if (n4 > j) {
                    n4 = j;
                }
                System.arraycopy(this.readBuffer, (int)(8429326271465132299L * this.offset - 8734338143670189311L * this.readBufferOffset), array, i, n4);
                this.offset += -6181027881899576669L * n4;
                i += n4;
                j -= n4;
            }
            if (j > this.readBuffer.length) {
                this.accessFile.seek(this.offset * 8429326271465132299L);
                this.fileOffset = -140630493748753059L * this.offset;
                while (j > 0) {
                    final int read = this.accessFile.read(array, i, j, -582788217);
                    if (-1 == read) {
                        break;
                    }
                    this.fileOffset += -9042087461339190217L * read;
                    this.offset += read * -6181027881899576669L;
                    i += read;
                    j -= read;
                }
            }
            else if (j > 0) {
                this.load((byte)83);
                int n5 = j;
                if (n5 > this.readBufferLength * 1119603991) {
                    n5 = 2051691812 * this.readBufferLength;
                }
                System.arraycopy(this.readBuffer, 0, array, i, n5);
                i += n5;
                j -= n5;
                this.offset += n5 * -6181027881899576669L;
            }
            if (this.writeBufferOffset * -8462239109085136939L != -1L) {
                if (-8462239109085136939L * this.writeBufferOffset > this.offset * 8429326271465132299L && j > 0) {
                    int n6 = (int)(-8462239109085136939L * this.writeBufferOffset - this.offset * 8429326271465132299L) + i;
                    if (n6 > j + i) {
                        n6 = j + i;
                    }
                    while (i < n6) {
                        array[i++] = 0;
                        --j;
                        this.offset -= 6181027881899576669L;
                    }
                }
                long n7 = -1L;
                long n8 = -1L;
                if (this.writeBufferOffset * -8462239109085136939L >= n && -8462239109085136939L * this.writeBufferOffset < n + n3) {
                    n7 = this.writeBufferOffset * -8462239109085136939L;
                }
                else if (n >= -8462239109085136939L * this.writeBufferOffset && n < this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -1917773553) {
                    n7 = n;
                }
                if (-8462239109085136939L * this.writeBufferOffset + this.writeBufferLength * -654786411 > n && -281857446 * this.writeBufferLength + -8462239109085136939L * this.writeBufferOffset <= n3 + n) {
                    n8 = this.writeBufferOffset * -8462239109085136939L + this.writeBufferLength * -654786411;
                }
                else if (n + n3 > this.writeBufferOffset * -8462239109085136939L && n + n3 <= this.writeBufferLength * -654786411 + this.writeBufferOffset * -8462239109085136939L) {
                    n8 = n + n3;
                }
                if (n7 > -1L && n8 > n7) {
                    System.arraycopy(this.writeBuffer, (int)(n7 - -8462239109085136939L * this.writeBufferOffset), array, (int)(n7 - n) + n2, (int)(n8 - n7));
                    if (n8 > this.offset * 8429326271465132299L) {
                        j -= (int)(n8 - this.offset * 8429326271465132299L);
                        this.offset = n8 * -6181027881899576669L;
                    }
                }
            }
        }
        catch (IOException ex) {
            this.fileOffset = 9042087461339190217L;
            throw ex;
        }
        if (j > 0) {
            throw new EOFException();
        }
    }
    
    public void close(final int n) throws IOException {
        try {
            ig(this, 789688414);
            this.accessFile.close((byte)(-64));
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.af(" + ')');
        }
    }
    
    public static void gu(final BufferedFile bufferedFile, final byte[] array, int n, int n2, final byte b) throws IOException {
        Label_0013: {
            if (bufferedFile != null) {
                break Label_0013;
            }
            bufferedFile.write(array, n, n, b);
            try {
                try {
                    if (8429326271465132299L * bufferedFile.offset + n2 > bufferedFile.length * -1243507284389482911L) {
                        bufferedFile.length = -8298185492872661599L * (n2 + bufferedFile.offset * 8429326271465132299L);
                    }
                    Label_0139: {
                        if (bufferedFile.writeBufferOffset * -8462239109085136939L != -1L) {
                            if (8429326271465132299L * bufferedFile.offset >= bufferedFile.writeBufferOffset * -8462239109085136939L) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                if (8429326271465132299L * bufferedFile.offset <= bufferedFile.writeBufferOffset * -8462239109085136939L + -654786411 * bufferedFile.writeBufferLength) {
                                    break Label_0139;
                                }
                            }
                            ig(bufferedFile, 252549395);
                        }
                    }
                    if (-8462239109085136939L * bufferedFile.writeBufferOffset != -1L) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        if (n2 + 8429326271465132299L * bufferedFile.offset > -8462239109085136939L * bufferedFile.writeBufferOffset + bufferedFile.writeBuffer.length) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            final int n3 = (int)(bufferedFile.writeBuffer.length - (8429326271465132299L * bufferedFile.offset - bufferedFile.writeBufferOffset * -8462239109085136939L));
                            System.arraycopy(array, n, bufferedFile.writeBuffer, (int)(bufferedFile.offset * 8429326271465132299L - bufferedFile.writeBufferOffset * -8462239109085136939L), n3);
                            bufferedFile.offset += n3 * -6181027881899576669L;
                            n += n3;
                            n2 -= n3;
                            bufferedFile.writeBufferLength = -1669068099 * bufferedFile.writeBuffer.length;
                            ig(bufferedFile, -1249936249);
                        }
                    }
                    if (n2 > bufferedFile.writeBuffer.length) {
                        if (31144933894015367L * bufferedFile.fileOffset != 8429326271465132299L * bufferedFile.offset) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            bufferedFile.accessFile.seek(8429326271465132299L * bufferedFile.offset);
                            bufferedFile.fileOffset = -140630493748753059L * bufferedFile.offset;
                        }
                        bufferedFile.accessFile.write(array, n, n2, 185047612);
                        bufferedFile.fileOffset += n2 * -9042087461339190217L;
                        if (bufferedFile.fileOffset * 31144933894015367L > 3127984517526915633L * bufferedFile.fileLength) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            bufferedFile.fileLength = bufferedFile.fileOffset * 5080559548865145143L;
                        }
                        long n4 = -1L;
                        long n5 = -1L;
                        Label_0629: {
                            if (8429326271465132299L * bufferedFile.offset >= bufferedFile.readBufferOffset * 8734338143670189311L) {
                                if (b != 3) {
                                    return;
                                }
                                if (8429326271465132299L * bufferedFile.offset < bufferedFile.readBufferLength * -1691135521 + bufferedFile.readBufferOffset * 8734338143670189311L) {
                                    if (b != 3) {
                                        throw new IllegalStateException();
                                    }
                                    n4 = bufferedFile.offset * 8429326271465132299L;
                                    break Label_0629;
                                }
                            }
                            if (8734338143670189311L * bufferedFile.readBufferOffset >= bufferedFile.offset * 8429326271465132299L) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                if (8734338143670189311L * bufferedFile.readBufferOffset < n2 + 8429326271465132299L * bufferedFile.offset) {
                                    if (b != 3) {
                                        throw new IllegalStateException();
                                    }
                                    n4 = bufferedFile.readBufferOffset * 8734338143670189311L;
                                }
                            }
                        }
                        if (bufferedFile.offset * 8429326271465132299L + n2 > 8734338143670189311L * bufferedFile.readBufferOffset && n2 + 8429326271465132299L * bufferedFile.offset <= -1691135521 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L) {
                            if (b != 3) {
                                return;
                            }
                            n5 = bufferedFile.offset * 8429326271465132299L + n2;
                        }
                        else if (-1691135521 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L > 8429326271465132299L * bufferedFile.offset) {
                            if (b != 3) {
                                return;
                            }
                            if (bufferedFile.readBufferOffset * 8734338143670189311L + bufferedFile.readBufferLength * -1691135521 <= 8429326271465132299L * bufferedFile.offset + n2) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                n5 = bufferedFile.readBufferOffset * 8734338143670189311L + bufferedFile.readBufferLength * -1691135521;
                            }
                        }
                        if (n4 > -1L) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            if (n5 > n4) {
                                if (b != 3) {
                                    return;
                                }
                                System.arraycopy(array, (int)(n + n4 - 8429326271465132299L * bufferedFile.offset), bufferedFile.readBuffer, (int)(n4 - 8734338143670189311L * bufferedFile.readBufferOffset), (int)(n5 - n4));
                            }
                        }
                        bufferedFile.offset += n2 * -6181027881899576669L;
                        return;
                    }
                    if (n2 > 0) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        if (-1L == bufferedFile.writeBufferOffset * -8462239109085136939L) {
                            bufferedFile.writeBufferOffset = 2422695430762542431L * bufferedFile.offset;
                        }
                        System.arraycopy(array, n, bufferedFile.writeBuffer, (int)(8429326271465132299L * bufferedFile.offset - -8462239109085136939L * bufferedFile.writeBufferOffset), n2);
                        bufferedFile.offset += n2 * -6181027881899576669L;
                        if (bufferedFile.offset * 8429326271465132299L - bufferedFile.writeBufferOffset * -8462239109085136939L > bufferedFile.writeBufferLength * -654786411) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            bufferedFile.writeBufferLength = (int)(bufferedFile.offset * 8429326271465132299L - -8462239109085136939L * bufferedFile.writeBufferOffset) * -1669068099;
                        }
                    }
                }
                catch (IOException ex) {
                    bufferedFile.fileOffset = 9042087461339190217L;
                    throw ex;
                }
            }
            catch (RuntimeException ex2) {
                throw HealthBar.get(ex2, "sj.aq(" + ')');
            }
        }
    }
    
    void load(final byte b) throws IOException {
        try {
            this.readBufferLength = 0;
            if (this.offset * 8429326271465132299L != 31144933894015367L * this.fileOffset) {
                if (b == 3) {
                    throw new IllegalStateException();
                }
                this.accessFile.seek(8429326271465132299L * this.offset);
                this.fileOffset = -140630493748753059L * this.offset;
            }
            this.readBufferOffset = 2440797830623285237L * this.offset;
            while (this.readBufferLength * -1691135521 < this.readBuffer.length) {
                if (b == 3) {
                    throw new IllegalStateException();
                }
                int n = this.readBuffer.length - -1691135521 * this.readBufferLength;
                if (n > 200000000) {
                    if (b == 3) {
                        return;
                    }
                    n = 200000000;
                }
                final int read = this.accessFile.read(this.readBuffer, -1691135521 * this.readBufferLength, n, 82145259);
                if (read == -1) {
                    break;
                }
                this.fileOffset += read * -9042087461339190217L;
                this.readBufferLength += read * -84563425;
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.ab(" + ')');
        }
    }
    
    public void write(final byte[] array, int n, int n2, final byte b) {
        try {
            try {
                if (8429326271465132299L * this.fileOffset + n2 > this.writeBufferOffset * -1243507284389482911L) {
                    this.fileOffset = -8298185492872661599L * (n2 + this.writeBufferOffset * 8429326271465132299L);
                }
                Label_0126: {
                    if (this.offset * -8462239109085136939L != -1L) {
                        if (8429326271465132299L * this.writeBufferOffset >= this.fileOffset * -8462239109085136939L) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            if (8429326271465132299L * this.length <= this.length * -8462239109085136939L + -654786411 * this.writeBufferLength) {
                                break Label_0126;
                            }
                        }
                        ig(this, 252549395);
                    }
                }
                if (-8462239109085136939L * this.readBufferOffset != -1L) {
                    if (b != 3) {
                        throw new IllegalStateException();
                    }
                    if (n2 + 8429326271465132299L * this.offset > -8462239109085136939L * this.readBufferOffset + this.readBuffer.length) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        final int n3 = (int)(this.readBuffer.length - (8429326271465132299L * this.offset - this.offset * -8462239109085136939L));
                        System.arraycopy(array, n, this.readBuffer, (int)(this.readBufferOffset * 8429326271465132299L - this.length * -8462239109085136939L), n3);
                        this.writeBufferOffset = this.fileLength + n3 * -6181027881899576669L;
                        n += n3;
                        n2 -= n3;
                        this.writeBufferLength = -1669068099 * this.readBuffer.length;
                        ig(this, -1249936249);
                    }
                }
                if (n2 > this.writeBuffer.length) {
                    if (31144933894015367L * this.fileLength != 8429326271465132299L * this.fileOffset) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        this.accessFile.seek(8429326271465132299L * this.readBufferOffset);
                        this.readBufferOffset *= -140630493748753059L;
                    }
                    this.accessFile.write(array, n, n2, 185047612);
                    this.readBufferOffset = this.fileLength + n2 * -9042087461339190217L;
                    if (this.fileLength * 31144933894015367L > 3127984517526915633L * this.writeBufferOffset) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        this.readBufferOffset = this.length * 5080559548865145143L;
                    }
                    long n4 = -1L;
                    long n5 = -1L;
                    Label_0616: {
                        if (8429326271465132299L * this.length >= this.fileOffset * 8734338143670189311L) {
                            if (b != 3) {
                                return;
                            }
                            if (8429326271465132299L * this.writeBufferOffset < this.writeBufferLength * -1691135521 + this.writeBufferOffset * 8734338143670189311L) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                n4 = this.offset * 8429326271465132299L;
                                break Label_0616;
                            }
                        }
                        if (8734338143670189311L * this.readBufferOffset >= this.offset * 8429326271465132299L) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            if (8734338143670189311L * this.fileLength < n2 + 8429326271465132299L * this.fileOffset) {
                                if (b != 3) {
                                    throw new IllegalStateException();
                                }
                                n4 = this.fileOffset * 8734338143670189311L;
                            }
                        }
                    }
                    if (this.fileOffset * 8429326271465132299L + n2 > 8734338143670189311L * this.fileOffset && n2 + 8429326271465132299L * this.length <= -1691135521 * this.writeBufferLength + this.fileOffset * 8734338143670189311L) {
                        if (b != 3) {
                            return;
                        }
                        n5 = this.length * 8429326271465132299L + n2;
                    }
                    else if (-1691135521 * this.readBufferLength + this.length * 8734338143670189311L > 8429326271465132299L * this.offset) {
                        if (b != 3) {
                            return;
                        }
                        if (this.writeBufferOffset * 8734338143670189311L + this.readBufferLength * -1691135521 <= 8429326271465132299L * this.fileLength + n2) {
                            if (b != 3) {
                                throw new IllegalStateException();
                            }
                            n5 = this.fileOffset * 8734338143670189311L + this.writeBufferLength * -1691135521;
                        }
                    }
                    if (n4 > -1L) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        if (n5 > n4) {
                            if (b != 3) {
                                return;
                            }
                            System.arraycopy(array, (int)(n + n4 - 8429326271465132299L * this.writeBufferOffset), this.readBuffer, (int)(n4 - 8734338143670189311L * this.readBufferOffset), (int)(n5 - n4));
                        }
                    }
                    this.fileOffset = this.writeBufferOffset + n2 * -6181027881899576669L;
                    return;
                }
                if (n2 > 0) {
                    if (b != 3) {
                        throw new IllegalStateException();
                    }
                    if (-1L == this.length * -8462239109085136939L) {
                        this.readBufferOffset = 2422695430762542431L * this.offset;
                    }
                    System.arraycopy(array, n, this.writeBuffer, (int)(8429326271465132299L * this.fileLength - -8462239109085136939L * this.offset), n2);
                    this.writeBufferOffset = this.length + n2 * -6181027881899576669L;
                    if (this.fileOffset * 8429326271465132299L - this.readBufferOffset * -8462239109085136939L > this.readBufferLength * -654786411) {
                        if (b != 3) {
                            throw new IllegalStateException();
                        }
                        this.writeBufferLength = (int)(this.offset * 8429326271465132299L - -8462239109085136939L * this.offset) * -1669068099;
                    }
                }
            }
            catch (IOException ex) {
                this.fileLength = 9042087461339190217L;
                throw ex;
            }
        }
        catch (RuntimeException ex2) {
            throw HealthBar.get(ex2, "sj.aq(" + ')');
        }
    }
    
    void aj() throws IOException {
        this.readBufferLength = 0;
        if (this.offset * 8429326271465132299L != 31144933894015367L * this.fileOffset) {
            this.accessFile.seek(8429326271465132299L * this.offset);
            this.fileOffset = -140630493748753059L * this.offset;
        }
        this.readBufferOffset = 2440797830623285237L * this.offset;
        while (this.readBufferLength * -1691135521 < this.readBuffer.length) {
            int n = this.readBuffer.length - -1691135521 * this.readBufferLength;
            if (n > 200000000) {
                n = 200000000;
            }
            final int read = this.accessFile.read(this.readBuffer, -1691135521 * this.readBufferLength, n, -361938312);
            if (read == -1) {
                break;
            }
            this.fileOffset += read * -9042087461339190217L;
            this.readBufferLength += read * -84563425;
        }
    }
    
    public long ag() {
        return this.length * -1243507284389482911L;
    }
    
    public static void mg(final BufferedFile bufferedFile, final byte[] array, final int n) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.readFully(array, n);
            return;
        }
        try {
            bufferedFile.read(array, 0, array.length, -1928644410);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.ac(" + ')');
        }
    }
    
    public static void ig(final BufferedFile bufferedFile, final int n) throws IOException {
        if (bufferedFile == null) {
            bufferedFile.flush(n);
            return;
        }
        try {
            if (-8462239109085136939L * bufferedFile.writeBufferOffset != -1L) {
                if (bufferedFile.fileOffset * 31144933894015367L != bufferedFile.writeBufferOffset * -8462239109085136939L) {
                    if (n <= -1254834640) {
                        return;
                    }
                    bufferedFile.accessFile.seek(bufferedFile.writeBufferOffset * -8462239109085136939L);
                    bufferedFile.fileOffset = 7312697603599620803L * bufferedFile.writeBufferOffset;
                }
                bufferedFile.accessFile.write(bufferedFile.writeBuffer, 0, bufferedFile.writeBufferLength * -654786411, 185047612);
                bufferedFile.fileOffset += -9056128312498455549L * bufferedFile.writeBufferLength;
                if (bufferedFile.fileOffset * 31144933894015367L > 3127984517526915633L * bufferedFile.fileLength) {
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    bufferedFile.fileLength = bufferedFile.fileOffset * 5080559548865145143L;
                }
                long n2 = -1L;
                long n3 = -1L;
                while (true) {
                    Label_0322: {
                        if (bufferedFile.writeBufferOffset * -8462239109085136939L < bufferedFile.readBufferOffset * 8734338143670189311L) {
                            break Label_0322;
                        }
                        if (n <= -1254834640) {
                            throw new IllegalStateException();
                        }
                        if (-8462239109085136939L * bufferedFile.writeBufferOffset >= -1691135521 * bufferedFile.readBufferLength + 8734338143670189311L * bufferedFile.readBufferOffset) {
                            break Label_0322;
                        }
                        if (n <= -1254834640) {
                            throw new IllegalStateException();
                        }
                        n2 = -8462239109085136939L * bufferedFile.writeBufferOffset;
                        while (true) {
                            Label_0613: {
                                if (bufferedFile.writeBufferOffset * -8462239109085136939L + -654786411 * bufferedFile.writeBufferLength <= 8734338143670189311L * bufferedFile.readBufferOffset) {
                                    break Label_0613;
                                }
                                if (n <= -1254834640) {
                                    throw new IllegalStateException();
                                }
                                if (-654786411 * bufferedFile.writeBufferLength + bufferedFile.writeBufferOffset * -8462239109085136939L > -1691135521 * bufferedFile.readBufferLength + bufferedFile.readBufferOffset * 8734338143670189311L) {
                                    break Label_0613;
                                }
                                if (n <= -1254834640) {
                                    throw new IllegalStateException();
                                }
                                n3 = bufferedFile.writeBufferOffset * -8462239109085136939L + bufferedFile.writeBufferLength * -654786411;
                                if (n2 > -1L) {
                                    if (n <= -1254834640) {
                                        throw new IllegalStateException();
                                    }
                                    if (n3 > n2) {
                                        if (n <= -1254834640) {
                                            throw new IllegalStateException();
                                        }
                                        System.arraycopy(bufferedFile.writeBuffer, (int)(n2 - bufferedFile.writeBufferOffset * -8462239109085136939L), bufferedFile.readBuffer, (int)(n2 - bufferedFile.readBufferOffset * 8734338143670189311L), (int)(n3 - n2));
                                    }
                                }
                                bufferedFile.writeBufferOffset = -699769937149266301L;
                                bufferedFile.writeBufferLength = 0;
                                return;
                            }
                            if (8734338143670189311L * bufferedFile.readBufferOffset + -1691135521 * bufferedFile.readBufferLength <= bufferedFile.writeBufferOffset * -8462239109085136939L) {
                                continue;
                            }
                            if (n <= -1254834640) {
                                throw new IllegalStateException();
                            }
                            if (-1691135521 * bufferedFile.readBufferLength + 8734338143670189311L * bufferedFile.readBufferOffset > -8462239109085136939L * bufferedFile.writeBufferOffset + -654786411 * bufferedFile.writeBufferLength) {
                                continue;
                            }
                            if (n <= -1254834640) {
                                return;
                            }
                            n3 = bufferedFile.readBufferLength * -1691135521 + bufferedFile.readBufferOffset * 8734338143670189311L;
                            continue;
                        }
                    }
                    if (8734338143670189311L * bufferedFile.readBufferOffset < bufferedFile.writeBufferOffset * -8462239109085136939L) {
                        continue;
                    }
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    if (8734338143670189311L * bufferedFile.readBufferOffset >= -654786411 * bufferedFile.writeBufferLength + bufferedFile.writeBufferOffset * -8462239109085136939L) {
                        continue;
                    }
                    if (n <= -1254834640) {
                        throw new IllegalStateException();
                    }
                    n2 = 8734338143670189311L * bufferedFile.readBufferOffset;
                    continue;
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "sj.al(" + ')');
        }
    }
}
