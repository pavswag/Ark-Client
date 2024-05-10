package com.client;

import com.client.definitions.ObjectDefinition;
import com.client.definitions.SequenceDefinition;
import com.client.definitions.VariableBits;

final class SceneObject extends Renderable {

	private final int level;
	private final int sceneX;
	private final int sceneY;

	private final int objectId;
	private final int type;
	private final int orientation;

	private int animationFrame;
	private SequenceDefinition seq;
	private int cycleDelay;


	@Override
	public Model getRotatedModel() {
		int frameId = -1;
		if (seq != null) {
			if(seq.isSkeletalAnimation()) {
				int length = seq.getSkeletalLength();
				animationFrame++;
				if (animationFrame >= length) {
					seq = null;
					//animation_frame = 0;
				}

				if (seq != null) {
					frameId = seq.getSkeletalId();
				}
			} else {
				int step = Client.cycle - cycleDelay;
				if (step > 100 && seq.getFrameStep() > 0) {
					step = 100;
				}
				while (step > seq.getDuration(animationFrame)) {
					step -= seq.getDuration(animationFrame);
					animationFrame++;
					if (animationFrame < seq.getFrameCount())
						continue;

					animationFrame -= seq.getFrameStep();
					if (animationFrame >= 0 && animationFrame < seq.getFrameCount())
						continue;

					seq = null;
					break;
				}
				cycleDelay = Client.cycle - step;
				if (seq != null) {
					frameId = seq.isSkeletalAnimation() ? seq.getSkeletalId() : seq.getFrameIDs()[animationFrame];
				}
			}
		}
		ObjectDefinition objectDefinition = ObjectDefinition.lookup(objectId);
		if (objectDefinition.transforms != null) {
			objectDefinition = objectDefinition.transform();
		}
		if (objectDefinition == null) {
			return null;
		} else {
			int sizeX;
			int sizeY;
			// Orientation
			if (this.orientation != 1 && this.orientation != 3) {
				sizeX = objectDefinition.sizeX;
				sizeY = objectDefinition.sizeY;
			} else {
				sizeX = objectDefinition.sizeY;
				sizeY = objectDefinition.sizeX;
			}

			int primaryX = (sizeX >> 1) + this.sceneX;
			int secondaryX = (sizeX + 1 >> 1) + this.sceneX;
			int primaryY = (sizeY >> 1) + this.sceneY;
			int secondaryY = (sizeY + 1 >> 1) + this.sceneY;
			int[][] heights = Client.instance.getTileHeights()[this.level];
			int mean = heights[secondaryX][secondaryY] + heights[primaryX][secondaryY] + heights[secondaryX][primaryY] + heights[primaryX][primaryY] >> 2;
			int x = (this.sceneX << 7) + (sizeX << 6);
			int y = (this.sceneY << 7) + (sizeY << 6);
			return objectDefinition.getModel(type, orientation, frameId, heights, x, mean, y,seq, animationFrame);
		}

	}

	public SceneObject(final int objectId, final int orientation, final int type, int level, int sceneX, int sceneY, final int animationId, final boolean animating) {
		this.objectId = objectId;
		this.type = type;
		this.orientation = orientation;
		this.level = level;
		this.sceneX = sceneX;
		this.sceneY = sceneY;

		if (animationId != -1) {
			try {
				seq = SequenceDefinition.get(animationId);
				animationFrame = 0;
				cycleDelay = Client.cycle;
				if (animating && seq.frameStep != -1) {
					animationFrame = (int) (Math.random() * seq.frameCount);
					cycleDelay -= (int) (Math.random() * seq.getDuration(animationFrame));
				}
			}catch (Exception e) {

			}
		}
	}
}