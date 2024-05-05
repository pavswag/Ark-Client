import java.util.Iterator;
import net.runelite.api.Deque;

// 
// Decompiled by Procyon v0.5.36
// 

public class LinkDeque implements Deque
{
    Link current;
    Link sentinel;
    
    public LinkDeque() {
        this.current = new Link();
        this.current.previous = this.current;
        this.current.next = this.current;
    }
    
    public void clear() {
        final Iterator iterator = this.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }
    
    public Iterator iterator() {
        return new rl10(this);
    }
    
    public Link previous() {
        final Link sentinel = this.sentinel;
        if (sentinel == this.current) {
            return this.sentinel = null;
        }
        this.sentinel = sentinel.previous;
        return sentinel;
    }
    
    public Link al() {
        final Link sentinel = this.sentinel;
        if (sentinel == this.current) {
            return this.sentinel = null;
        }
        this.sentinel = sentinel.previous;
        return sentinel;
    }
    
    public Link last() {
        final Link previous = this.current.previous;
        if (previous == this.current) {
            return this.sentinel = null;
        }
        this.sentinel = previous.previous;
        return previous;
    }
    
    public void au(final Link link) {
        if (link.next != null) {
            link.remove();
        }
        link.next = this.current.next;
        link.previous = this.current;
        link.next.previous = link;
        link.previous.next = link;
    }
    
    public void addFirst(final Link link) {
        if (link.next != null) {
            link.remove();
        }
        link.next = this.current.next;
        link.previous = this.current;
        link.next.previous = link;
        link.previous.next = link;
    }
    
    public static Link kk(final LinkDeque linkDeque) {
        final Link previous = linkDeque.current.previous;
        if (previous == linkDeque.current) {
            return linkDeque.sentinel = null;
        }
        linkDeque.sentinel = previous.previous;
        return previous;
    }
    
    public Link aq() {
        final Link previous = this.current.previous;
        if (previous == this.current) {
            return this.sentinel = null;
        }
        this.sentinel = previous.previous;
        return previous;
    }
    
    public static void vl(final LinkDeque linkDeque, final Link link) {
        if (linkDeque == null) {
            linkDeque.iterator();
        }
        if (link.next != null) {
            link.remove();
        }
        link.next = linkDeque.current.next;
        link.previous = linkDeque.current;
        link.next.previous = link;
        link.previous.next = link;
    }
    
    public void qg(final FriendLoginUpdate friendLoginUpdate) {
        this.addFirst(friendLoginUpdate);
    }
}
