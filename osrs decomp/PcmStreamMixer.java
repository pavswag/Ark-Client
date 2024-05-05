// 
// Decompiled by Procyon v0.5.36
// 

public class PcmStreamMixer extends PcmStream
{
    NodeDeque subStreams;
    NodeDeque field169;
    int field171;
    int field170;
    
    public PcmStreamMixer() {
        this.subStreams = new NodeDeque();
        this.field169 = new NodeDeque();
        this.field171 = 0;
        this.field170 = -1;
    }
    
    void bs(final int[] array, final int n, final int n2) {
        for (PcmStream pcmStream = (PcmStream)this.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)this.subStreams.previous()) {
            PcmStream.wk(pcmStream, array, n, n2);
        }
    }
    
    void ad(Node previous, final PcmStreamMixerListener pcmStreamMixerListener) {
        while (previous != this.subStreams.sentinel && ((PcmStreamMixerListener)previous).field300 <= pcmStreamMixerListener.field300) {
            previous = previous.previous;
        }
        NodeDeque.NodeDeque_addBefore(pcmStreamMixerListener, previous);
        this.field171 = ((PcmStreamMixerListener)this.field169.sentinel.next).field300;
    }
    
    @Override
    protected PcmStream bb() {
        return (PcmStream)this.subStreams.last();
    }
    
    public static void id(final PcmStreamMixer pcmStreamMixer, final int[] array, final int n, final int n2) {
        if (pcmStreamMixer == null) {
            pcmStreamMixer.updateSubStreams(array, n, n);
        }
        for (PcmStream pcmStream = (PcmStream)pcmStreamMixer.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)pcmStreamMixer.subStreams.previous()) {
            PcmStream.wk(pcmStream, array, n, n2);
        }
    }
    
    void skipSubStreams(final int n) {
        for (PcmStream pcmStream = (PcmStream)this.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)this.subStreams.previous()) {
            pcmStream.skip(n);
        }
    }
    
    public final synchronized void fill(final int[] array, int n, int n2) {
        while (this.field170 >= 0) {
            if (this.field171 + n2 < this.field170) {
                this.field171 += n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field170 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    void ak() {
        if (this.field171 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.previous()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= this.field171;
            }
            this.field170 -= this.field171;
            this.field171 = 0;
        }
    }
    
    public final synchronized void av(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    @Override
    protected PcmStream be() {
        return (PcmStream)this.subStreams.previous();
    }
    
    void as() {
        if (this.field171 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.previous()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= this.field171;
            }
            this.field170 -= this.field171;
            this.field171 = 0;
        }
    }
    
    public NodeDeque hi() {
        return this.subStreams;
    }
    
    void az() {
        if (this.field171 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.previous()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= this.field171;
            }
            this.field170 -= this.field171;
            this.field171 = 0;
        }
    }
    
    public final synchronized void ax(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    public final synchronized void skip(int n) {
        while (this.field170 >= 0) {
            if (this.field171 + n < this.field170) {
                this.field171 += n;
                this.skipSubStreams(n);
                return;
            }
            final int n2 = this.field170 - this.field171;
            this.skipSubStreams(n2);
            n -= n2;
            this.field171 += n2;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.skipSubStreams(n);
    }
    
    @Override
    protected PcmStream bi() {
        return (PcmStream)this.subStreams.last();
    }
    
    @Override
    protected int bo() {
        return 0;
    }
    
    public static void rt(final PcmStreamMixer pcmStreamMixer, Node previous, final PcmStreamMixerListener pcmStreamMixerListener) {
        if (pcmStreamMixer == null) {
            pcmStreamMixer.ad(previous, pcmStreamMixerListener);
            return;
        }
        while (previous != pcmStreamMixer.field169.sentinel && ((PcmStreamMixerListener)previous).field300 <= pcmStreamMixerListener.field300) {
            previous = previous.previous;
        }
        NodeDeque.NodeDeque_addBefore(pcmStreamMixerListener, previous);
        pcmStreamMixer.field170 = ((PcmStreamMixerListener)pcmStreamMixer.field169.sentinel.previous).field300;
    }
    
    public final synchronized void bt(final int[] array, int n, int n2) {
        while (this.field170 >= 0) {
            if (this.field171 + n2 < this.field170) {
                this.field171 += n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field170 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    void br(final int[] array, final int n, final int n2) {
        for (PcmStream pcmStream = (PcmStream)this.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)this.subStreams.previous()) {
            PcmStream.wk(pcmStream, array, n, n2);
        }
    }
    
    void method203() {
        if (this.field170 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.subStreams.as(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.ad()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= this.field171;
            }
            this.field170 -= this.field171;
            this.field170 = 0;
        }
    }
    
    public final synchronized void am(final PcmStream pcmStream) {
        pcmStream.hw();
    }
    
    @Override
    protected int vmethod5648() {
        return 0;
    }
    
    public final synchronized void removeSubStream(final PcmStream pcmStream) {
        pcmStream.hw();
    }
    
    void method204(Node previous, final PcmStreamMixerListener pcmStreamMixerListener) {
        while (previous != this.field169.sentinel && ((PcmStreamMixerListener)previous).field300 <= pcmStreamMixerListener.field300) {
            previous = previous.previous;
        }
        NodeDeque.NodeDeque_addBefore(pcmStreamMixerListener, previous);
        this.field170 = ((PcmStreamMixerListener)this.field169.sentinel.previous).field300;
    }
    
    void bq(final int n) {
        for (PcmStream pcmStream = (PcmStream)this.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)this.subStreams.previous()) {
            pcmStream.skip(n);
        }
    }
    
    public static void tk(final PcmStreamMixer pcmStreamMixer, final PcmStreamMixerListener pcmStreamMixerListener) {
        if (pcmStreamMixer == null) {
            pcmStreamMixer.method209(pcmStreamMixerListener);
            return;
        }
        pcmStreamMixerListener.hw();
        pcmStreamMixerListener.remove2();
        final Node previous = pcmStreamMixer.field169.sentinel.previous;
        if (previous == pcmStreamMixer.field169.sentinel) {
            pcmStreamMixer.field170 = -1;
        }
        else {
            pcmStreamMixer.field170 = ((PcmStreamMixerListener)previous).field300;
        }
    }
    
    void method209(final PcmStreamMixerListener pcmStreamMixerListener) {
        pcmStreamMixerListener.hw();
        pcmStreamMixerListener.remove2();
        final Node previous = this.field169.sentinel.previous;
        if (previous == this.field169.sentinel) {
            this.field170 = -1;
        }
        else {
            this.field170 = ((PcmStreamMixerListener)previous).field300;
        }
    }
    
    void updateSubStreams(final int[] array, int n, int n2) {
        while (this.field171 >= 0) {
            if (this.field171 + n2 < this.field171) {
                this.field170 = this.field171 + n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field171 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.th();
            synchronized (pcmStreamMixerListener) {
                final int update = pcmStreamMixerListener.update(this);
                if (update < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = update;
                    this.ad(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    public final synchronized void ai(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    public static void dx(final PcmStreamMixer pcmStreamMixer) {
        if (pcmStreamMixer == null) {
            pcmStreamMixer.method203();
        }
        if (pcmStreamMixer.field171 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)pcmStreamMixer.field169.last(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)pcmStreamMixer.field169.previous()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= pcmStreamMixer.field171;
            }
            pcmStreamMixer.field170 -= pcmStreamMixer.field171;
            pcmStreamMixer.field171 = 0;
        }
    }
    
    void by(final PcmStreamMixerListener pcmStreamMixerListener) {
        pcmStreamMixerListener.hw();
        pcmStreamMixerListener.remove2();
        final Node previous = this.field169.sentinel.previous;
        if (previous == this.field169.sentinel) {
            this.field170 = -1;
        }
        else {
            this.field170 = ((PcmStreamMixerListener)previous).field300;
        }
    }
    
    @Override
    protected PcmStream bx() {
        return (PcmStream)this.subStreams.previous();
    }
    
    public final synchronized void ar(final PcmStream pcmStream) {
        pcmStream.hw();
    }
    
    public final synchronized void bd(final int[] array, int n, int n2) {
        while (this.field170 >= 0) {
            if (this.field171 + n2 < this.field170) {
                this.field171 += n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field170 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    public final synchronized void bg(int n) {
        while (this.field170 >= 0) {
            if (this.field171 + n < this.field170) {
                this.field171 += n;
                this.skipSubStreams(n);
                return;
            }
            final int n2 = this.field170 - this.field171;
            this.skipSubStreams(n2);
            n -= n2;
            this.field171 += n2;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.skipSubStreams(n);
    }
    
    public final synchronized void addSubStream(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    void bn(final int[] array, final int n, final int n2) {
        for (PcmStream pcmStream = (PcmStream)this.subStreams.last(); pcmStream != null; pcmStream = (PcmStream)this.subStreams.previous()) {
            PcmStream.wk(pcmStream, array, n, n2);
        }
    }
    
    @Override
    protected PcmStream firstSubStream() {
        return (PcmStream)this.subStreams.last();
    }
    
    @Override
    protected PcmStream nextSubStream() {
        return (PcmStream)this.subStreams.previous();
    }
    
    void aj() {
        if (this.field171 > 0) {
            for (PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last(); pcmStreamMixerListener != null; pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.previous()) {
                final PcmStreamMixerListener pcmStreamMixerListener2 = pcmStreamMixerListener;
                pcmStreamMixerListener2.field300 -= this.field171;
            }
            this.field170 -= this.field171;
            this.field171 = 0;
        }
    }
    
    public final synchronized void ag(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    public void ep(final PcmStream pcmStream) {
        this.addSubStream(pcmStream);
    }
    
    @Override
    protected int bz() {
        return 0;
    }
    
    public final synchronized void bj(final int[] array, int n, int n2) {
        while (this.field170 >= 0) {
            if (this.field171 + n2 < this.field170) {
                this.field171 += n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field170 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    public final synchronized void bm(final int[] array, int n, int n2) {
        while (this.field170 >= 0) {
            if (this.field171 + n2 < this.field170) {
                this.field171 += n2;
                id(this, array, n, n2);
                return;
            }
            final int n3 = this.field170 - this.field171;
            id(this, array, n, n3);
            n += n3;
            n2 -= n3;
            this.field171 += n3;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n2 == 0) {
                return;
            }
        }
        id(this, array, n, n2);
    }
    
    @Override
    protected PcmStream bk() {
        return (PcmStream)this.subStreams.previous();
    }
    
    public final synchronized void ah(final PcmStream pcmStream) {
        this.subStreams.addLast(pcmStream);
    }
    
    public final synchronized void bf(int n) {
        while (this.field170 >= 0) {
            if (this.field171 + n < this.field170) {
                this.field171 += n;
                this.skipSubStreams(n);
                return;
            }
            final int n2 = this.field170 - this.field171;
            this.skipSubStreams(n2);
            n -= n2;
            this.field171 += n2;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.skipSubStreams(n);
    }
    
    public final synchronized void bu(int n) {
        while (this.field170 >= 0) {
            if (this.field171 + n < this.field170) {
                this.field171 += n;
                this.skipSubStreams(n);
                return;
            }
            final int n2 = this.field170 - this.field171;
            this.skipSubStreams(n2);
            n -= n2;
            this.field171 += n2;
            dx(this);
            final PcmStreamMixerListener pcmStreamMixerListener = (PcmStreamMixerListener)this.field169.last();
            synchronized (pcmStreamMixerListener) {
                final int aq = pcmStreamMixerListener.aq(this);
                if (aq < 0) {
                    pcmStreamMixerListener.field300 = 0;
                    this.by(pcmStreamMixerListener);
                }
                else {
                    pcmStreamMixerListener.field300 = aq;
                    this.method204(pcmStreamMixerListener.hc, pcmStreamMixerListener);
                }
            }
            if (n == 0) {
                return;
            }
        }
        this.skipSubStreams(n);
    }
}
