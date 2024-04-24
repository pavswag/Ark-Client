package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.FileArchive;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public final class VariableBits extends DualNode {
	public static EvictingDualNodeHashTable cached = new EvictingDualNodeHashTable(64);

	public static VariableBits lookup(int id) {
		VariableBits cached = (VariableBits)VariableBits.cached.get(id);
		VariableBits newVarp;
		if (cached == null) {
			byte[] data = Js5List.configs.takeFile(Js5ConfigType.VARBIT, id);
			cached = new VariableBits();
			if (data != null) {
				cached.load(new Buffer(data));
			}

			VariableBits.cached.put(cached, id);
		}
		newVarp = cached;

		return newVarp;
	}
	private void load(Buffer buffer)
	{
		for (;;)
		{
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0)
			{
				break;
			}

			if (opcode == 1)
			{
				baseVar = (buffer.readUnsignedShort());
				startBit = (buffer.readUnsignedByte());
				endBit = (buffer.readUnsignedByte());
			}
		}
	}

	public int baseVar;
	public int startBit;
	public int endBit;
	
}
