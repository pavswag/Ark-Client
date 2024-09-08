package com.client;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public final class IdentityKit extends DualNode {
	public static EvictingDualNodeHashTable cached = new EvictingDualNodeHashTable(64);


	public static void unpackConfig() {
		length = Js5List.configs.getGroupFileCount(Js5ConfigType.IDENTKIT);
		System.out.println("Loaded [" + length + "] Identity Kits");
	}

	public static IdentityKit lookup(int id) {
		IdentityKit hasCached = (IdentityKit)IdentityKit.cached.get(id);
		if (hasCached == null) {
			byte[] data = Js5List.configs.takeFile(Js5ConfigType.IDENTKIT, id);
			hasCached = new IdentityKit();
			if (data != null) {
				hasCached.readValues(new Buffer(data));
				hasCached.recolorFrom[0] = (short) 55232;
				hasCached.recolorTo[0] = 6798;
			}

			cached.put(hasCached, id);
		}
		return hasCached;
	}

	private void readValues(Buffer buffer) {
		do {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0)
				return;
			if (opcode == 1)
				bodypartID = buffer.readUnsignedByte();
			else if (opcode == 2) {
				int j = buffer.readUnsignedByte();
				models2 = new int[j];
				for (int k = 0; k < j; k++)
					models2[k] = buffer.readUShort();
			} else if (opcode == 3) {
				nonSelectable = true;
			} else if (opcode == 40) {
				int length = buffer.readUnsignedByte();
				recolorFrom = new short[length];
				recolorTo = new short[length];

				for (int index = 0; index < length; ++index) {
					recolorFrom[index] = (short) buffer.readShort();
					recolorTo[index] = (short) buffer.readShort();
				}
			} else if (opcode == 41) {
				int length = buffer.readUnsignedByte();
				retextureFrom = new short[length];
				retextureTo = new short[length];

				for (int index = 0; index < length; ++index) {
					retextureFrom[index] = (short) buffer.readShort();
					retextureTo[index] = (short) buffer.readShort();
				}
			} else if (opcode >= 60 && opcode < 70) {
				models[opcode - 60] = buffer.readUShort();
			} else {
				System.out.println("Error unrecognised config code: " + opcode);
			}
		} while (true);
	}

	public boolean method537() {
		if (models2 == null)
			return true;
		boolean flag = true;
		for (int j = 0; j < models2.length; j++)
			if (!Model.isCached(models2[j]))
				flag = false;

		return flag;
	}

	public Model method538() {
		if (models2 == null)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[models2.length];
		for (int i = 0; i < models2.length; i++)
			aclass30_sub2_sub4_sub6s[i] = Model.getModel(models2[i]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if(recolorFrom != null)
		for (int j = 0; j < recolorFrom.length; j++) {
			model.recolor(recolorFrom[j], recolorTo[j]);
		}

		if(retextureFrom != null)
		for (int j = 0; j < retextureFrom.length; j++) {
			model.retexture(retextureFrom[j], retextureTo[j]);
		}

		return model;
	}

	public boolean method539() {
		boolean flag1 = true;
		for (int i = 0; i < 5; i++)
			if (models[i] != -1 && !Model.isCached(models[i]))
				flag1 = false;

		return flag1;
	}

	public Model method540() {
		Model aclass30_sub2_sub4_sub6s[] = new Model[5];
		int j = 0;
		for (int k = 0; k < 5; k++)
			if (models[k] != -1)
				aclass30_sub2_sub4_sub6s[j++] = Model
						.getModel(models[k]);

		Model model = new Model(j, aclass30_sub2_sub4_sub6s);
		if(recolorFrom != null)
			for (int l = 0; l < recolorFrom.length; l++) {
				model.recolor(recolorFrom[l], recolorTo[l]);
			}
		if(retextureFrom != null)
		for (int l = 0; l < retextureFrom.length; l++) {
			model.retexture(retextureFrom[l], retextureTo[l]);
		}


		return model;
	}

	private IdentityKit() {
		bodypartID = -1;
		nonSelectable = false;

		// these aren't set when loading osrs idk
		recolorFrom = new short[6];
		recolorTo = new short[6];
	}

	public static int length;
	public static IdentityKit cache[];
	public int bodypartID;
	private int[] models2;
	private short[] recolorFrom;
	private short[] recolorTo;
	private short[] retextureFrom;
	private short[] retextureTo;
	private final int[] models = { -1, -1, -1, -1, -1 };
	public boolean nonSelectable;
}
