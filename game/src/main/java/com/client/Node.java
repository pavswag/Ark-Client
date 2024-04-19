package com.client;


import net.runelite.rs.api.RSNode;

public class Node implements RSNode {

	@Override
	public RSNode getNext() {
		return next;
	}

	@Override
	public long getHash() {
		return key;
	}

	@Override
	public RSNode getPrevious() {
		return previous;
	}


	public boolean hasNext() {
		return this.next != null;
	}

	public void remove() {
		if (next == null) {
		} else {
			next.previous = previous;
			previous.next = next;
			previous = null;
			next = null;
		}
	}

	@Override
	public void onUnlink() {

	}

	public Node() {
	}

	public long key;
	public Node previous;
	public Node next;
}
