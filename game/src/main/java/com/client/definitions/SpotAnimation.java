package com.client.definitions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Arrays;

import com.client.*;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;

public final class SpotAnimation extends DualNode {

	public static EvictingDualNodeHashTable cached = new EvictingDualNodeHashTable(64);

	public static SpotAnimation lookup(int id) {
		SpotAnimation data = (SpotAnimation) SpotAnimation.cached.get(id);
		if (data == null) {
			byte[] var2 = Js5List.configs.takeFile(Js5ConfigType.SPOTANIM, id);
			data = new SpotAnimation();
			data.id = id;
			if (var2 != null) {
				data.readValues(new Buffer(var2));
			}

			cached.put(data, id);
		}
		return data;
	}
	private static SpotAnimation createCustomAnimation(int id, int modelId, int animationId, int resizeXY, int resizeZ, int rotation, int brightness, int shadow) {
		SpotAnimation anim = new SpotAnimation();
		anim.id = id;
		anim.modelId = modelId;
		anim.animationId = animationId;
		anim.animationSequence = SequenceDefinition.get(animationId);
		anim.resizeXY = resizeXY;
		anim.resizeZ = resizeZ;
		anim.rotation = rotation;
		anim.modelBrightness = brightness;
		anim.modelShadow = shadow;

		// Optionally handle recoloring/retexturing
		anim.recolorToFind = new int[]{0};
		anim.recolorToReplace = new int[]{0};
		anim.textureFind = new short[]{0};
		anim.textureReplace = new short[]{0};

		// Add to cache
		cached.put(anim, id);
		return anim;
	}

	public static void unpackConfig() {
		// Creating custom animations using the factory method
		createCustomAnimation(3000, 54291, 11491, 128, 128, 0, 64, 850);
		createCustomAnimation(3001, 60972, SpotAnimation.lookup(2852).animationId, SpotAnimation.lookup(2852).resizeXY, SpotAnimation.lookup(2852).resizeZ, SpotAnimation.lookup(2852).rotation, SpotAnimation.lookup(2852).modelBrightness, SpotAnimation.lookup(2852).modelShadow);
		createCustomAnimation(3002, 60973, SpotAnimation.lookup(2855).animationId, SpotAnimation.lookup(2855).resizeXY, SpotAnimation.lookup(2855).resizeZ, SpotAnimation.lookup(2855).rotation, SpotAnimation.lookup(2855).modelBrightness, SpotAnimation.lookup(2855).modelShadow);
		createCustomAnimation(3003, 60972, SpotAnimation.lookup(2850).animationId, SpotAnimation.lookup(2850).resizeXY, SpotAnimation.lookup(2850).resizeZ, SpotAnimation.lookup(2850).rotation, SpotAnimation.lookup(2850).modelBrightness, SpotAnimation.lookup(2850).modelShadow);
	}

	public short[] textureReplace;
	public short[] textureFind;

	private void readValues(Buffer buffer) {
		while(true) {
			int opcode = buffer.readUnsignedByte();
			if (opcode == 0) {
				return;
			}
			if (opcode == 1) {
				modelId = buffer.readUShort();
			} else if (opcode == 2) {
				animationId = buffer.readUShort();
				animationSequence = SequenceDefinition.get(animationId);
			} else if (opcode == 4) {
				resizeXY = buffer.readUShort();
			} else if (opcode == 5) {
				resizeZ = buffer.readUShort();
			} else if (opcode == 6) {
				rotation = buffer.readUShort();
			} else if (opcode == 7) {
				modelBrightness = buffer.readUnsignedByte();
			} else if (opcode == 8) {
				modelShadow = buffer.readUnsignedByte();
			} else if (opcode == 40) {
				int j = buffer.readUnsignedByte();
				for (int k = 0; k < j; k++) {
					recolorToFind[k] = buffer.readUShort();
					recolorToReplace[k] = buffer.readUShort();
				}
			} else if (opcode == 41) { // re-texture
				int len = buffer.readUnsignedByte();
				textureFind = new short[len];
				textureReplace = new short[len];
				for (int i = 0; i < len; i++) {
					textureFind[i] = (short) buffer.readUShort();
					textureReplace[i] = (short) buffer.readUShort();
				}
			} else {
				System.out.println("Error unrecognised spotanim config code: " + opcode);
			}
		}
	}



	public Model getModel() {
		Model model = (Model) aMRUNodes_415.get(id);
		if (model != null)
			return model;
		model = Model.getModel(modelId);
		if (model == null)
			return null;
		for (int i = 0; i < recolorToFind.length; i++)
			if (recolorToFind[0] != 0) //default frame id
				model.recolor(recolorToFind[i], recolorToReplace[i]);
		if (textureReplace != null) {
			for (int i1 = 0; i1 < textureReplace.length; i1++)
				model.retexture(textureReplace[i1], textureFind[i1]);
		}
		aMRUNodes_415.put(model, id);
		return model;
	}
	
	private void setDefault() {
		modelId = -1;
		animationId = -1;
		recolorToFind = new int[6];
		recolorToReplace = new int[6];
		resizeXY = 128;
		resizeZ = 128;
		rotation = 0;
		modelBrightness = 0;
		modelShadow = 0;
	}

	public SpotAnimation() {
		anInt400 = 9;
		animationId = -1;
		recolorToFind = new int[6];
		recolorToReplace = new int[6];
		resizeXY = 128;
		resizeZ = 128;
	}
	
	public int getModelId() {
		return modelId;
	}
	
	public int getId() {
		return id;
	}

	public final int anInt400;
	public int id;
	private int modelId;
	public int animationId;
	public SequenceDefinition animationSequence;
	public int[] recolorToFind;
	public int[] recolorToReplace;
	public int resizeXY;
	public int resizeZ;
	public int rotation;
	public int modelBrightness;
	public int modelShadow;
	public static EvictingDualNodeHashTable aMRUNodes_415 = new EvictingDualNodeHashTable(30);

}
