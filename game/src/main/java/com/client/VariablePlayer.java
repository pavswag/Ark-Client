package com.client;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public final class VariablePlayer extends DualNode {

	static EvictingDualNodeHashTable cached = new EvictingDualNodeHashTable(64);

	public static VariablePlayer lookup(int id) {
		VariablePlayer varp = (VariablePlayer)VariablePlayer.cached.get((long)id);
		if (varp == null) {
			byte[] data = Js5List.configs.takeFile(Js5ConfigType.VARPLAYER, id);
			varp = new VariablePlayer();
			if (data != null) {
				varp.decode(new Buffer(data));
			}

			cached.put(varp, id);
		}
		return varp;
	}   void decode(Buffer buffer) {
		while(true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				return;
			}

			this.decodeNext(buffer, opcode);
		}
	}


	void decodeNext(Buffer buffer, int opcode) {
		if (opcode == 5) {
			this.type = buffer.readUnsignedShort();
		}

	}

	public int type;

}
