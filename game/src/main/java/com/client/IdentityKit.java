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
				hasCached.originalColors[0] = (short) 55232;
				hasCached.replacementColors[0] = 6798;
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
				bodyPartId = buffer.readUnsignedByte();
			else if (opcode == 2) {
				int j = buffer.readUnsignedByte();
				bodyModels = new int[j];
				for (int k = 0; k < j; k++)
					bodyModels[k] = buffer.readUShort();
			} else if (opcode == 3) {
				validStyle = true;
			} else if (opcode == 40) {
				int length = buffer.readUnsignedByte();
				originalColors = new short[length];
				replacementColors = new short[length];

				for (int index = 0; index < length; ++index) {
					originalColors[index] = (short) buffer.readShort();
					replacementColors[index] = (short) buffer.readShort();
				}
			} else if (opcode == 41) {
				int length = buffer.readUnsignedByte();
				retextureToFind = new short[length];
				retextureToReplace = new short[length];

				for (int index = 0; index < length; ++index) {
					retextureToFind[index] = (short) buffer.readShort();
					retextureToReplace[index] = (short) buffer.readShort();
				}
			} else if (opcode >= 60 && opcode < 70) {
				headModels[opcode - 60] = buffer.readUShort();
			} else {
				System.out.println("Error unrecognised config code: " + opcode);
			}
		} while (true);
	}

	public boolean method537() {
		if (bodyModels == null)
			return true;
		boolean flag = true;
		for (int j = 0; j < bodyModels.length; j++)
			if (!Model.isCached(bodyModels[j]))
				flag = false;

		return flag;
	}

	public Model method538() {
		if (bodyModels == null)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[bodyModels.length];
		for (int i = 0; i < bodyModels.length; i++)
			aclass30_sub2_sub4_sub6s[i] = Model.getModel(bodyModels[i]);

		Model model;
		if (aclass30_sub2_sub4_sub6s.length == 1)
			model = aclass30_sub2_sub4_sub6s[0];
		else
			model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
		if(originalColors != null)
		for (int j = 0; j < originalColors.length; j++) {
			model.recolor(originalColors[j], replacementColors[j]);
		}

		if(retextureToFind != null)
		for (int j = 0; j < retextureToFind.length; j++) {
			model.retexture(retextureToFind[j], retextureToReplace[j]);
		}

		return model;
	}

	public boolean method539() {
		boolean flag1 = true;
		for (int i = 0; i < 5; i++)
			if (headModels[i] != -1 && !Model.isCached(headModels[i]))
				flag1 = false;

		return flag1;
	}

	public Model method540() {
		Model aclass30_sub2_sub4_sub6s[] = new Model[5];
		int j = 0;
		for (int k = 0; k < 5; k++)
			if (headModels[k] != -1)
				aclass30_sub2_sub4_sub6s[j++] = Model
						.getModel(headModels[k]);

		Model model = new Model(j, aclass30_sub2_sub4_sub6s);
		if(originalColors != null)
			for (int l = 0; l < originalColors.length; l++) {
				model.recolor(originalColors[l], replacementColors[l]);
			}
		if(retextureToFind != null)
		for (int l = 0; l < retextureToFind.length; l++) {
			model.retexture(retextureToFind[l], retextureToReplace[l]);
		}


		return model;
	}

	private IdentityKit() {
		bodyPartId = -1;
		validStyle = false;

		// these aren't set when loading osrs idk
		originalColors = new short[6];
		replacementColors = new short[6];
	}

	public static int length;
	public static IdentityKit cache[];
	public int bodyPartId;
	private int[] bodyModels;
	private short[] originalColors;
	private short[] replacementColors;
	private short[] retextureToFind;
	private short[] retextureToReplace;
	private final int[] headModels = { -1, -1, -1, -1, -1 };
	public boolean validStyle;
}
