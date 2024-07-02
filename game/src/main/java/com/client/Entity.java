package com.client;

import com.client.audio.StaticSound;
import com.client.cache.IterableNodeHashTable;
import com.client.definitions.HealthBarDefinition;
import com.client.definitions.HitSplatDefinition;
import com.client.definitions.SequenceDefinition;

public class Entity extends Renderable {

	void playAnimationSound(SequenceDefinition var0, int var1, int var2, int var3) {
		StaticSound.playAnimationSound(var0,var1,var2,var3,this);
	}

	void playSkeletalSounds(SequenceDefinition var0, int var1, int var2, int var3) {
		StaticSound.playSkeletalSounds(var0,var1,var2,var3,this);
	}
	public boolean isLocalPlayer() {
		return this == Client.localPlayer;
	}

	public int getAbsoluteX() {
		int x = Client.baseX + (this.x - 6 >> 7);
		if (this instanceof Npc) {
			return x - ((Npc) this).definition.size / 2;
		}
		return x;
	}

	public int getAbsoluteY() {
		int y = Client.baseY + (this.y - 6 >> 7);
		if (this instanceof Npc) {
			return y - ((Npc) this).definition.size / 2;
		}
		return y;
	}

	public int getDistanceFrom(Entity entity) {
		return getDistanceFrom(entity.getAbsoluteX(), entity.getAbsoluteY());
	}

	public int getDistanceFrom(int x2, int y2) {
		int x = (int) Math.pow(getAbsoluteX() - x2, 2.0D);
		int y = (int) Math.pow(getAbsoluteY() - y2, 2.0D);
		return (int) Math.floor(Math.sqrt(x + y));
	}

	public final void setPos(int i, int j, boolean flag) {
		if (primarySeqID != -1 && SequenceDefinition.get(primarySeqID).idleStyle == 1)
			primarySeqID = -1;
		if (!flag) {
			int k = i - pathX[0];
			int l = j - pathY[0];
			if (k >= -8 && k <= 8 && l >= -8 && l <= 8) {
				if (smallXYIndex < 9)
					smallXYIndex++;
				for (int i1 = smallXYIndex; i1 > 0; i1--) {
					pathX[i1] = pathX[i1 - 1];
					pathY[i1] = pathY[i1 - 1];
					aBooleanArray1553[i1] = aBooleanArray1553[i1 - 1];
				}

				pathX[0] = i;
				pathY[0] = j;
				aBooleanArray1553[0] = false;
				return;
			}
		}
		smallXYIndex = 0;
		remaining_steps = 0;
		anInt1503 = 0;
		pathX[0] = i;
		pathY[0] = j;
		x = pathX[0] * 128 + anInt1540 * 64;
		y = pathY[0] * 128 + anInt1540 * 64;
	}

	public final void method446() {
		smallXYIndex = 0;
		remaining_steps = 0;
	}

	public final void updateHitData(int j, int k, int delay, int source) {
		for (int i1 = 0; i1 < 4; i1++)
			if (hitSplatCycles[i1] <= delay) {
				hitSplatValues[i1] = k;
				hitSplatTypes[i1] = j;
				hitSplatCycles[i1] = delay + 70;
				hitSource[i1] = source - 32768;
				return;
			}
	}

	public final void moveInDir(boolean flag, int i) {
		int j = pathX[0];
		int k = pathY[0];
		if (i == 0) {
			j--;
			k++;
		}
		if (i == 1)
			k++;
		if (i == 2) {
			j++;
			k++;
		}
		if (i == 3)
			j--;
		if (i == 4)
			j++;
		if (i == 5) {
			j--;
			k--;
		}
		if (i == 6)
			k--;
		if (i == 7) {
			j++;
			k--;
		}
		if (primarySeqID != -1 && SequenceDefinition.get(primarySeqID).idleStyle == 1)
			primarySeqID = -1;
		if (smallXYIndex < 9)
			smallXYIndex++;
		for (int l = smallXYIndex; l > 0; l--) {
			pathX[l] = pathX[l - 1];
			pathY[l] = pathY[l - 1];
			aBooleanArray1553[l] = aBooleanArray1553[l - 1];
		}
		pathX[0] = j;
		pathY[0] = k;
		aBooleanArray1553[0] = flag;
	}

	public int entScreenX;
	public int entScreenY;

	public boolean isVisible() {
		return false;
	}

	Entity() {
		pathX = new int[10];
		pathY = new int[10];
		interactingEntity = -1;
		anInt1504 = 32;
		anInt1505 = -1;
		defaultHeight = 200;
		seqStandID = -1;
		standTurnAnimIndex = -1;
		hitSplatValues = new int[4];
		hitSplatTypes = new int[4];
		hitSplatValues2 = new int[4];
		hitSplatTypes2 = new int[4];
		hitSplatCycles = new int[4];
		hitSource = new int[4];
		secondarySeqID = -1;
		graphicId = -1;
		primarySeqID = -1;
		loopCycleStatus = -1000;
		textCycle = 100;
		anInt1540 = 1;
		dynamic = false;
		aBooleanArray1553 = new boolean[10];
		walkAnimIndex = -1;
		turn180AnimIndex = -1;
		turn90CWAnimIndex = -1;
		turn90CCWAnimIndex = -1;
		this.healthBars = new IterableNodeDeque();
	}

	public final int[] pathX;
	public final int[] pathY;
	public int interactingEntity;
	int anInt1503;
	int anInt1504;
	int anInt1505;
	public String textSpoken;
	public String lastForceChat;
	public int defaultHeight;
	private int turnDirection;
	int seqStandID;
	int standTurnAnimIndex;
	int anInt1513;

	byte hitSplatCount;
	final int[] hitSplatValues;
	final int[] hitSplatTypes;
	final int[] hitSplatValues2;
	final int[] hitSplatTypes2;
	final int[] hitSplatCycles;

	final void addHitSplat(int type, int damage, int type2, int damage2, int cycle, int delay) {
		boolean var7 = true;
		boolean var8 = true;

		int var9;
		for (var9 = 0; var9 < 4; ++var9) {
			if (this.hitSplatCycles[var9] > cycle) {
				var7 = false;
			} else {
				var8 = false;
			}
		}
		var9 = -1;
		int var10 = -1;
		int var11 = 0;
		if (type >= 0) {
			//type = 16;
			HitSplatDefinition var12 = HitSplatDefinition.getHitSplatDefinition(type);
			var10 = var12.field2229;
			var11 = var12.hitsplatLifeTime;
		}

		int var14;
		if (var8) {
			if (var10 == -1) {
				return;
			}

			var9 = 0;
			var14 = 0;
			if (var10 == 0) {
				var14 = this.hitSplatCycles[0];
			} else if (var10 == 1) {
				var14 = this.hitSplatValues[0];
			}

			for (int var13 = 1; var13 < 4; ++var13) {
				if (var10 == 0) {
					if (this.hitSplatCycles[var13] < var14) {
						var9 = var13;
						var14 = this.hitSplatCycles[var13];
					}
				} else if (var10 == 1 && this.hitSplatValues[var13] < var14) {
					var9 = var13;
					var14 = this.hitSplatValues[var13];
				}
			}

			if (var10 == 1 && var14 >= damage) {
				return;
			}
		} else {
			if (var7) {
				this.hitSplatCount = 0;
			}

			for (var14 = 0; var14 < 4; ++var14) {
				byte var15 = this.hitSplatCount;
				this.hitSplatCount = (byte)((this.hitSplatCount + 1) % 4);
				if (this.hitSplatCycles[var15] <= cycle) {
					var9 = var15;
					break;
				}
			}
		}

		if (var9 >= 0) {
			//26 block
			//27 = tinted block
			//28 = hit
			//29 = tinted hit
			this.hitSplatTypes[var9] = type;
			this.hitSplatValues[var9] = damage;
			this.hitSplatTypes2[var9] = type2;
			this.hitSplatValues2[var9] = damage2;
			this.hitSplatCycles[var9] = cycle + var11 + delay;
		}
	}

	final int[] hitSource;
	int secondarySeqID;
	int secondarySeqFrame;
	int secondarySeqCycle;
	int graphicId;
	int graphicFrame;
	int currentAnimationTimeRemaining;
	int graphic_cycle;
	int graphicHeight;
	public int nextAnimationFrame;
	public int nextIdleFrame;
	public int nextGraphicFrame;
	int smallXYIndex;
	public int primarySeqID;
	int primarySeqFrame;
	int primarySeqCycle;
	int primarySeqDelay;
	int animationLoops;
	int anInt1531;
	public int loopCycleStatus;
	public int currentHealth;
	public int maxHealth;
	int textCycle;
	int anInt1537;
	int anInt1538;
	int anInt1539;
	int anInt1540;
	boolean dynamic;
	int remaining_steps;
	int anInt1543;
	int anInt1544;
	int anInt1545;
	int anInt1546;
	int initiate_movement;
	int cease_movement;
	int forceMovementDirection;
	public int x;
	public int y;
	int orientation;
	final boolean[] aBooleanArray1553;
	int walkAnimIndex;
	int turn180AnimIndex;
	int turn90CWAnimIndex;
	int turn90CCWAnimIndex;


	public IterableNodeHashTable spotAnims = new IterableNodeHashTable(500);

	public int getTurnDirection() {
		return turnDirection;
	}

	public void setTurnDirection(int turnDirection) {
		this.turnDirection = turnDirection;
	}


	public void addHealthBar(Buffer buffer) {
		int healthBarCount = buffer.readUnsignedByte();
		if (healthBarCount > 0) {
			for (int i = 0; i < healthBarCount; i++) {
				int barId = buffer.readUShort();
				int barValue = buffer.readUShort();

				if (barValue != 32767) {
					int cycleDuration = buffer.readUShort();
					int healthBarEndCycle = buffer.readUShort();
					int healthBarCycleOffset = barValue > 0 ? buffer.readUShort() : healthBarEndCycle;

					addHealthBar(barId, Client.cycle, barValue, cycleDuration, healthBarEndCycle, healthBarCycleOffset);
				} else {
					removeHealthBar(barId);
				}
			}
		}
	}

	final void addHealthBar(int type, int cycle, int barValue, int cycleDuration, int healthBarEndCycle, int healthBarCycleOffset) {
		HealthBarDefinition var8 = (HealthBarDefinition)HealthBarDefinition.cache.get((long)type);
		HealthBarDefinition var7;
		if (var8 != null) {
			var7 = var8;
		} else {
			var8 = HealthBarDefinition.lookup(type);
			var7 = var8;
		}

		var8 = var7;
		HealthBar var14 = null;
		HealthBar var10 = null;
		int var11 = var7.int2;
		int var12 = 0;

		HealthBar var13;
		for (var13 = (HealthBar)this.healthBars.last(); var13 != null; var13 = (HealthBar)this.healthBars.previous()) {
			++var12;
			if (var13.definition.field2049 == var8.field2049) {
				var13.put(cycle + cycleDuration, healthBarEndCycle, healthBarCycleOffset, barValue);
				return;
			}

			if (var13.definition.int1 <= var8.int1) {
				var14 = var13;
			}

			if (var13.definition.int2 > var11) {
				var10 = var13;
				var11 = var13.definition.int2;
			}
		}

		if (var10 != null || var12 < 4) {
			var13 = new HealthBar(var8);
			if (var14 == null) {
				this.healthBars.addLast(var13);
			} else {
				IterableNodeDeque.IterableNodeDeque_addBefore(var13, var14);
			}

			var13.put(cycle + cycleDuration, healthBarEndCycle, healthBarCycleOffset, barValue);
			if (var12 >= 4) {
				var10.remove();
			}

		}
	}

	final void removeHealthBar(int var1) {
		HealthBarDefinition var3 = (HealthBarDefinition)HealthBarDefinition.cache.get((long)var1);
		HealthBarDefinition var2;
		if (var3 != null) {
			var2 = var3;
		} else {
			var3 = HealthBarDefinition.lookup(var1);
			var3.field2049 = var1;
			var2 = var3;
		}

		var3 = var2;

		for (HealthBar var5 = (HealthBar)this.healthBars.last(); var5 != null; var5 = (HealthBar)this.healthBars.previous()) {
			if (var3 == var5.definition) {
				var5.remove();
				return;
			}
		}

	}

	IterableNodeDeque healthBars;
}
