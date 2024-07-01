package com.client;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


import com.client.definitions.SeqFrame;
import com.client.definitions.SequenceDefinition;
import com.client.definitions.ItemDefinition;
import com.client.definitions.NpcDefinition;
import com.client.definitions.SpotAnimation;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.*;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldArea;
import net.runelite.api.coords.WorldPoint;
import net.runelite.rs.api.*;
import org.jetbrains.annotations.Nullable;

@Slf4j
public final class Player extends Entity implements RSPlayer {



    @Override
	public Model getRotatedModel() {
		if (!visible)
			return null;
		Model model = method452();
		if (model == null)
			return null;
		super.defaultHeight = model.modelBaseY;
		model.singleTile = true;
		if (aBoolean1699)
			return model;
		Iterator spotAnimIterator = spotAnims.iterator();
		int processedGraphics = 0;
		while(spotAnimIterator.hasNext()) {
			EntitySpotAnim graphicObject = (EntitySpotAnim) spotAnimIterator.next();
			if(graphicObject.getId() == -1 ) {
				graphicObject.remove();
				continue;
			}
			if(graphicObject.getFrame() == -1)
				continue;
			if(this == Client.localPlayer)
            	log.info("Processing [{}] graphics for player!", processedGraphics++);
			SpotAnimation spotAnim = SpotAnimation.lookup(graphicObject.getId());
			Model model_2 = spotAnim.getModel();
			if (model_2 != null) {
				SequenceDefinition seq = spotAnim.animationSequence;
				Model model_3 = new Model(true, SeqFrame.noAnimationInProgress(graphicObject.getFrame()), false, model_2);
				model_3.offsetBy(0, -graphicObject.getHeight(), 0);
				if (seq != null && seq.isSkeletalAnimation()) {
					model_3.playSkeletal(seq, graphicObject.getFrame());
				} else {
					model_3.prepareSkeleton();
					model_3.interpolate(spotAnim.animationSequence.frameIDs[graphicObject.getFrame()]);
				}

				model_3.groupedTriangleLabels = null;
				model_3.groupedVertexLabels = null;
				if (spotAnim.resizeXY != 128 || spotAnim.resizeZ != 128)
					model_3.scale(spotAnim.resizeXY, spotAnim.resizeXY,
							spotAnim.resizeZ);
				model_3.light(64 + spotAnim.modelBrightness,
						850 + spotAnim.modelShadow, -30, -50, -30, true);
				Model aclass30_sub2_sub4_sub6_1s[] = { model, model_3 };
				model = new Model(aclass30_sub2_sub4_sub6_1s);
			}
		}
		if (aModel_1714 != null) {
			if (Client.cycle >= anInt1708)
				aModel_1714 = null;
			if (Client.cycle >= anInt1707 && Client.cycle < anInt1708) {
				Model model_1 = aModel_1714;
				model_1.offsetBy(anInt1711 - super.x, anInt1712 - anInt1709,
						anInt1713 - super.y);
				if (super.getTurnDirection() == 512) {
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
				} else if (super.getTurnDirection() == 1024) {
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
				} else if (super.getTurnDirection() == 1536)
					model_1.rotate90Degrees();
				Model aclass30_sub2_sub4_sub6s[] = { model, model_1 };
				model = new Model(aclass30_sub2_sub4_sub6s);
				if (super.getTurnDirection() == 512)
					model_1.rotate90Degrees();
				else if (super.getTurnDirection() == 1024) {
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
				} else if (super.getTurnDirection() == 1536) {
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
					model_1.rotate90Degrees();
				}
				model_1.offsetBy(super.x - anInt1711, anInt1709 - anInt1712,
						super.y - anInt1713);
			}
		}
		model.singleTile = true;
		return model;
	}

	public int usedItemID;
	public String title;
	public String titleColor;

	public void updatePlayer(Buffer stream) {
		stream.pos = 0;

		colourFind = new int[12][];
		colourReplace = new int[12][];

		myGender = stream.readUnsignedByte();
		title = stream.readString();
		titleColor = stream.readString();
		healthState = stream.readUnsignedByte();
		headIcon = stream.readUnsignedByte();
		skullIcon = stream.readUnsignedByte();
		npcDefinition = null;
		team = 0;
		for (int j = 0; j < 12; j++) {
			int k = stream.readUnsignedByte();
			if (k == 0) {
				equipment[j] = 0;
				continue;
			}
			int i1 = stream.readUnsignedByte();
			equipment[j] = (k << 8) + i1;
			System.out.println("[" + j + "] = " + equipment[j]);
			if (j == 0 && equipment[0] == 65535) {
				npcDefinition = NpcDefinition.lookup(stream.readUShort());
				break;
			}
			if (j == 8) {
				Client.myHeadAndJaw[0] = equipment[j] - 256;
			}
			if (j == 11) {
				Client.myHeadAndJaw[1] = equipment[j] - 256;
			}
			if (equipment[j] >= 512 && equipment[j] - 512 < ItemDefinition.totalItems) {
				int l1 = ItemDefinition.lookup(equipment[j] - 512).teamCape;
				if (l1 != 0)
					team = l1;
			}
		}

		for (int l = 0; l < 5; l++) {
			int j1 = stream.readUnsignedByte();
			if (j1 < 0 || j1 >= Client.anIntArrayArray1003[l].length)
				j1 = 0;
			anIntArray1700[l] = j1;
		}

		super.seqStandID = stream.readUShort();
		if (super.seqStandID == 65535)
			super.seqStandID = -1;
		super.standTurnAnimIndex = stream.readUShort();
		if (super.standTurnAnimIndex == 65535)
			super.standTurnAnimIndex = -1;
		super.walkAnimIndex = stream.readUShort();
		if (super.walkAnimIndex == 65535)
			super.walkAnimIndex = -1;
		super.turn180AnimIndex = stream.readUShort();
		if (super.turn180AnimIndex == 65535)
			super.turn180AnimIndex = -1;
		super.turn90CWAnimIndex = stream.readUShort();
		if (super.turn90CWAnimIndex == 65535)
			super.turn90CWAnimIndex = -1;
		super.turn90CCWAnimIndex = stream.readUShort();
		if (super.turn90CCWAnimIndex == 65535)
			super.turn90CCWAnimIndex = -1;
		super.anInt1505 = stream.readUShort();
		if (super.anInt1505 == 65535)
			super.anInt1505 = -1;
		displayName = stream.readString();
		playerId = stream.readInt();
		hideDonor = Boolean.parseBoolean(stream.readString());
		visible = stream.readUnsignedByte() == 0;
		centurion = stream.readUnsignedByte();
		combatLevel = stream.readUnsignedByte();
		rights = PlayerRights.readRightsFromPacket(stream).getRight();
		displayedRights = PlayerRights.getDisplayedRights(rights);
		skill = stream.readUShort();
		aLong1718 = 0L;

		for (int k1 = 0; k1 < 12; k1++) {
			aLong1718 <<= 4;
			if (equipment[k1] >= 256)
				aLong1718 += equipment[k1] - 256;
			if(colourFind[k1] != null) {
				for(int i = 0;i<colourFind[k1].length;i++)
					aLong1718 += colourReplace[k1][i];
			}
		}

		if (equipment[0] >= 256)
			aLong1718 += equipment[0] - 256 >> 4;
		if (equipment[1] >= 256)
			aLong1718 += equipment[1] - 256 >> 8;
		for (int i2 = 0; i2 < 5; i2++) {
			aLong1718 <<= 3;
			aLong1718 += anIntArray1700[i2];
		}

		aLong1718 <<= 1;
		aLong1718 += myGender;
	}

	public Model method452() {

		SequenceDefinition primarySeq = null;

		int current_frame = -1;

		if (npcDefinition != null) {
			if (super.primarySeqID >= 0 && super.primarySeqDelay == 0) {
				primarySeq = SequenceDefinition.get(super.primarySeqID);
				if (!primarySeq.isSkeletalAnimation()) {
					current_frame = primarySeq.getFrameIDs()[super.primarySeqFrame];
				}
			}
			if (primarySeq != null && primarySeq.isSkeletalAnimation()) {
				return npcDefinition.getAnimatedModelSkeletal(primarySeq, null,  primarySeqFrame, secondarySeqFrame);
			}
			return npcDefinition.getAnimatedModel(-1, current_frame, null);
		}
		long l = aLong1718;
		int k = -1;
		int i1 = -1;
		int j1 = -1;
		int k1 = -1;
		if (super.primarySeqID >= 0 && super.primarySeqDelay == 0) {
			SequenceDefinition animation = SequenceDefinition.get(super.primarySeqID);
			k = animation.frameIDs[super.primarySeqFrame];
			if (super.secondarySeqID >= 0 && super.secondarySeqID != super.seqStandID)
				i1 = SequenceDefinition.get(super.secondarySeqID).frameIDs[super.secondarySeqFrame];
			if (animation.leftHandItem >= 0) {
				j1 = animation.leftHandItem;
				l += j1 - equipment[5] << 40;
			}
			if (animation.rightHandItem >= 0) {
				k1 = animation.rightHandItem;
				l += k1 - equipment[3] << 48;
			}
		} else if (super.secondarySeqID >= 0)
			k = SequenceDefinition.get(super.secondarySeqID).frameIDs[super.secondarySeqFrame];
		Model model_1 = (Model) mruNodes.get(l);
		if (model_1 == null) {
			boolean flag = false;
			for (int i2 = 0; i2 < 12; i2++) {
				int k2 = equipment[i2];
				if (k1 >= 0 && i2 == 3)
					k2 = k1;
				if (j1 >= 0 && i2 == 5)
					k2 = j1;
				if (k2 >= 256 && k2 < 512 && !IdentityKit.lookup(k2 - 256).method537())
					flag = true;
				int itemId = k2 - 256;
				if (k2 >= 512 && !ItemDefinition.lookup(itemId == 22869 ? 22613 : itemId).isEquippedModelCached(myGender))
					flag = true;
			}

			if (flag) {
				if (aLong1697 != -1L)
					model_1 = (Model) mruNodes.get(aLong1697);
				if (model_1 == null)
					return null;
			}
		}
		if (model_1 == null) {
			Model aclass30_sub2_sub4_sub6s[] = new Model[12];
			int j2 = 0;
			for (int l2 = 0; l2 < 12; l2++) {
				int i3 = equipment[l2];
				if (k1 >= 0 && l2 == 3)
					i3 = k1;
				if (j1 >= 0 && l2 == 5)
					i3 = j1;
				if (i3 >= 256 && i3 < 512) {
					Model model_3 = IdentityKit.lookup(i3 - 256).method538();
					if (model_3 != null)
						aclass30_sub2_sub4_sub6s[j2++] = model_3;
				}
				if (i3 >= 512) {
					Model model_4 = ItemDefinition.lookup(i3 - 512 == 22869 ? 22613 : i3 - 512)
							.getEquippedModel(myGender);
					if (model_4 != null) {
						aclass30_sub2_sub4_sub6s[j2++] = model_4;
					} else {
						return null;
					}
				}
			}

			model_1 = new Model(j2, aclass30_sub2_sub4_sub6s);
			for (int j3 = 0; j3 < 5; j3++)
				if (anIntArray1700[j3] != 0) {
					model_1.recolor(Client.anIntArrayArray1003[j3][0],
							Client.anIntArrayArray1003[j3][anIntArray1700[j3]]);
					if (j3 == 1)
						model_1.recolor(Client.anIntArray1204[0],
								Client.anIntArray1204[anIntArray1700[j3]]);
				}

			model_1.prepareSkeleton();
			 model_1.light(64, 850, -30, -50, -30, true);
			//model_1.method479(84, 1000, -90, -580, -90, true);
			mruNodes.put(model_1, l);
			aLong1697 = l;
		}
		if (aBoolean1699)
			return model_1;
		Model model_2 = Model.emptyModel;
		model_2.buildSharedSequenceModel(model_1, SeqFrame.noAnimationInProgress(k) & SeqFrame.noAnimationInProgress(i1));
		if (k != -1 && i1 != -1)
			model_2.mix(SequenceDefinition.get(super.primarySeqID).masks, i1, k);
		else if (k != -1)
			model_2.interpolate(k);
		model_2.calculateBoundsCylinder();
		model_2.groupedTriangleLabels = null;
		model_2.groupedVertexLabels = null;
		return model_2;
	}

	@Override
	public boolean isVisible() {
		return visible;
	}

	public int privelage;

	public boolean isAdminRights() {
		return hasRights(PlayerRights.ADMINISTRATOR)
				|| hasRights(PlayerRights.STAFF_MANAGER)
				|| hasRights(PlayerRights.GAME_DEVELOPER);
	}

	public boolean hasRightsOtherThan(PlayerRights playerRight) {
		return PlayerRights.hasRightsOtherThan(rights, playerRight);
	}

	public boolean hasRights(PlayerRights playerRights) {
		return PlayerRights.hasRights(rights, playerRights);
	}

	public boolean hasRightsLevel(int rightsId) {
		return PlayerRights.hasRightsLevel(rights, rightsId);
	}

	public boolean hasRightsBetween(int low, int high) {
		return PlayerRights.hasRightsBetween(rights, low, high);
	}

	public Model method453() {
		if (!visible)
			return null;
		if (npcDefinition != null)
			return npcDefinition.method160();
		boolean flag = false;
		for (int i = 0; i < 12; i++) {
			int j = equipment[i];
			if (j >= 256 && j < 512 && !IdentityKit.lookup(j - 256).method539())
				flag = true;
			if (j >= 512 && !ItemDefinition.lookup(j - 512 == 22869 ? 22613 : j - 512).isDialogueModelCached(myGender))
				flag = true;
		}

		if (flag)
			return null;
		Model aclass30_sub2_sub4_sub6s[] = new Model[12];
		int k = 0;
		for (int l = 0; l < 12; l++) {
			int i1 = equipment[l];
			if (i1 >= 256 && i1 < 512) {
				Model model_1 = IdentityKit.lookup(i1 - 256).method540();
				if (model_1 != null)
					aclass30_sub2_sub4_sub6s[k++] = model_1;
			}
			if (i1 >= 512) {
				Model model_2 = ItemDefinition.lookup(i1 - 512 == 22869 ? 22613 : i1 - 512).getChatEquipModel(myGender);
				if (model_2 != null)
					aclass30_sub2_sub4_sub6s[k++] = model_2;
			}
		}

		Model model = new Model(k, aclass30_sub2_sub4_sub6s);
		for (int j1 = 0; j1 < 5; j1++)
			if (anIntArray1700[j1] != 0) {
				model.recolor(Client.anIntArrayArray1003[j1][0],
						Client.anIntArrayArray1003[j1][anIntArray1700[j1]]);
				if (j1 == 1)
					model.recolor(Client.anIntArray1204[0],
							Client.anIntArray1204[anIntArray1700[j1]]);
			}

		return model;
	}

	Player() {
		aLong1697 = -1L;
		aBoolean1699 = false;
		anIntArray1700 = new int[5];
		visible = false;
		equipment = new int[12];
	}

	public boolean inFlowerPokerArea() {
		int x = getAbsoluteX();
		int y = getAbsoluteY();
		return x >= 3109 && y >= 3504 && x <= 3121 && y <= 3515;
	}

	public boolean inFlowerPokerChatProximity() {
		int x = getAbsoluteX();
		int y = getAbsoluteY();
		return x >= 3106 && y >= 3502 && x <= 3123 && y <= 3517;
	}

	public PlayerRights[] getRights() {
		return rights;
	}

	public List<PlayerRights> getDisplayedRights() {
		return displayedRights;
	}

	public int getHealthState() {
		return healthState;
	}

	private PlayerRights[] rights = new PlayerRights[] {PlayerRights.PLAYER};
	public int centurion;
	private List<PlayerRights> displayedRights = new ArrayList<>();
	private long aLong1697;
	public NpcDefinition npcDefinition;
	boolean aBoolean1699;
	final int[] anIntArray1700;
	public int team;
	public int myGender;
	public String displayName;
	public int playerId;
	static EvictingDualNodeHashTable mruNodes = new EvictingDualNodeHashTable(260);
	public int combatLevel;
	public int headIcon;
	public int skullIcon;
	public int hintIcon;
	public int anInt1707;
	int anInt1708;
	int anInt1709;
	boolean visible;
	int anInt1711;
	int anInt1712;
	int anInt1713;
	Model aModel_1714;
	public final int[] equipment;

	public int[][] colourFind = new int[12][];
	public int[][] colourReplace = new int[12][];
	private long aLong1718;
	int anInt1719;
	int anInt1720;
	int anInt1721;
	int anInt1722;
	int skill;
	private int healthState;
	public boolean hideDonor = false;

	@Override
	public String getName() {
		return displayName;
	}

	@Override
	public Actor getInteracting() {
		int index = interactingEntity;
		if (index == -1 || index == 65535)
		{
			return null;
		}
		Client client = Client.instance;

		if (index < 32768)
		{
			NPC[] npcs = client.getCachedNPCs();
			return npcs[index];
		}

		index -= 32768;
		Player[] players = client.players;
		return players[index];
	}

	@Override
	public int getHealthRatio() {
		return Math.round(this.currentHealth / this.maxHealth);
	}

	@Override
	public int getHealthScale() {
		return currentHealth;
	}

	@Override
	public WorldPoint getWorldLocation() {
		return WorldPoint.fromLocal(Client.instance,
				this.getPathX()[0] * Perspective.LOCAL_TILE_SIZE + Perspective.LOCAL_TILE_SIZE / 2,
				this.getPathY()[0] * Perspective.LOCAL_TILE_SIZE + Perspective.LOCAL_TILE_SIZE / 2,
				Client.instance.getPlane());
	}

	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.x, this.y);
	}

	@Override
	public void setIdleRotateLeft(int animationID) {

	}

	@Override
	public void setIdleRotateRight(int animationID) {

	}

	@Override
	public void setWalkAnimation(int animationID) {

	}

	@Override
	public void setWalkRotateLeft(int animationID) {

	}

	@Override
	public void setWalkRotateRight(int animationID) {

	}

	@Override
	public void setWalkRotate180(int animationID) {

	}

	@Override
	public void setRunAnimation(int animationID) {

	}

	@Override
	public Polygon getCanvasTilePoly() {
		return Perspective.getCanvasTilePoly(Client.instance, this.getLocalLocation());
	}

	@Nullable
	@Override
	public Point getCanvasTextLocation(Graphics2D graphics, String text, int zOffset) {
		return Perspective.getCanvasTextLocation(Client.instance, (Graphics2D) Client.instance.getGameComponent().getGraphics(), getLocalLocation(), text, zOffset);
	}


	@Override
	public Point getCanvasImageLocation(BufferedImage image, int zOffset) {
		return Perspective.getCanvasImageLocation(Client.instance, getLocalLocation(), image, zOffset);
	}

	@Override
	public Point getCanvasSpriteLocation(SpritePixels sprite, int zOffset) {
		return null;
	}


	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(Client.instance, getLocalLocation());
	}
	@Override
	public Shape getConvexHull() {
		RSModel model = getModel();
		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(Client.instance, new LocalPoint(getX(), getY()), Client.instance.getPlane());

		return model.getConvexHull(getX(), getY(), getOrientation(), tileHeight);
	}
	@Override
	public WorldArea getWorldArea() {
		return new WorldArea(getWorldLocation(), 1, 1);
	}

	@Override
	public boolean isDead() {
		return currentHealth <= 0;
	}

	@Override
	public boolean isMoving() {
		return false;
	}

	@Override
	public Polygon[] getPolygons()
	{
		RSModel model = getModel();

		if (model == null)
		{
			return null;
		}

		int[] x2d = new int[model.getVerticesCount()];
		int[] y2d = new int[model.getVerticesCount()];

		int localX = getX();
		int localY = getY();

		final int tileHeight = Perspective.getTileHeight(Client.instance, new LocalPoint(localX, localY), Client.instance.getPlane());

		Perspective.modelToCanvas(Client.instance, model.getVerticesCount(), localX, localY, tileHeight, getOrientation(), model.getVerticesX(), model.getVerticesZ(), model.getVerticesY(), x2d, y2d);
		ArrayList polys = new ArrayList(model.getFaceCount());

		int[] trianglesX = model.getFaceIndices1();
		int[] trianglesY = model.getFaceIndices2();
		int[] trianglesZ = model.getFaceIndices3();

		for (int triangle = 0; triangle < model.getFaceCount(); ++triangle)
		{
			int[] xx =
					{
							x2d[trianglesX[triangle]], x2d[trianglesY[triangle]], x2d[trianglesZ[triangle]]
					};

			int[] yy =
					{
							y2d[trianglesX[triangle]], y2d[trianglesY[triangle]], y2d[trianglesZ[triangle]]
					};

			polys.add(new Polygon(xx, yy, 3));
		}

		return (Polygon[]) polys.toArray(new Polygon[0]);
	}

	@Nullable
	@Override
	public HeadIcon getOverheadIcon() {
		return null;
	}

	@Nullable
	@Override
	public SkullIcon getSkullIcon() {
		return null;
	}

	@Override
	public boolean isHidden() {
		return false;
	}

	@Override
	public int getRSInteracting() {
		return 0;
	}

	@Override
	public String getOverheadText() {
		return null;
	}

	@Override
	public void setOverheadText(String overheadText) {

	}


	@Override
	public int getX() {
		return x;
	}

	@Override
	public int getY() {
		return y;
	}

	@Override
	public int[] getPathX() {
		return pathX;
	}

	@Override
	public int[] getPathY() {
		return pathY;
	}

	@Override
	public int getAnimation() {
		return primarySeqID;
	}

	@Override
	public void setAnimation(int animation) {
		this.primarySeqID = animation;
		System.out.println("set " + displayName + " animation too " + animation);
	}

	@Override
	public int getAnimationFrame() {
		return primarySeqFrame;
	}

	@Override
	public int getActionFrame() {
		return 0;
	}

	@Override
	public void setAnimationFrame(int frame) {
		this.primarySeqFrame = frame;
	}

	@Override
	public void setActionFrame(int frame) {
		this.primarySeqFrame = frame;
	}

	@Override
	public int getActionFrameCycle() {
		return 0;
	}

	@Override
	public int getGraphic() {
		return graphicId;
	}

	@Override
	public void setGraphic(int id) {
		this.graphicId = id;
	}

	@Override
	public int getSpotAnimFrame() {
		return graphic_cycle;
	}

	@Override
	public void setSpotAnimFrame(int id) {
		this.graphic_cycle = id;
	}

	@Override
	public int getSpotAnimationFrameCycle() {
		return 0;
	}

	@Override
	public int getIdlePoseAnimation() {
		return 0;
	}

	@Override
	public void setIdlePoseAnimation(int animation) {

	}

	@Override
	public int getPoseAnimation() {
		return 0;
	}

	@Override
	public void setPoseAnimation(int animation) {

	}

	@Override
	public int getPoseFrame() {
		return 0;
	}

	@Override
	public void setPoseFrame(int frame) {

	}

	@Override
	public int getPoseFrameCycle() {
		return 0;
	}

	@Override
	public int getLogicalHeight() {
		return defaultHeight;
	}

	@Override
	public int getOrientation() {
		return getTurnDirection();
	}

	@Override
	public int getCurrentOrientation() {
		return getTurnDirection();
	}

	@Override
	public RSIterableNodeDeque getHealthBars() {
		return null;
	}

	@Override
	public int[] getHitsplatValues() {
		return new int[0];
	}

	@Override
	public int[] getHitsplatTypes() {
		return new int[0];
	}

	@Override
	public int[] getHitsplatCycles() {
		return new int[0];
	}

	@Override
	public int getIdleRotateLeft() {
		return 0;
	}

	@Override
	public int getIdleRotateRight() {
		return 0;
	}

	@Override
	public int getWalkAnimation() {
		return 0;
	}

	@Override
	public int getWalkRotate180() {
		return 0;
	}

	@Override
	public int getWalkRotateLeft() {
		return 0;
	}

	@Override
	public int getWalkRotateRight() {
		return 0;
	}

	@Override
	public int getRunAnimation() {
		return 0;
	}
	public boolean deadPlayer = false;
	@Override
	public void setDead(boolean dead) {
		deadPlayer = dead;
	}
	@Override
	public IterableHashTable<ActorSpotAnim> getSpotAnims() {
		return this.spotAnims;
	}

	@Override
	public boolean hasSpotAnim(int customGfxID) {
		return spotAnims.get(customGfxID) != null;
	}

	@Override
	public void removeSpotAnim(int hash) {
		Iterator ir = spotAnims.iterator();
		while(ir.hasNext()) {
			EntitySpotAnim graphicObject = (EntitySpotAnim) ir.next();
			if(graphicObject.getHash() == hash) {
				graphicObject.remove();
				ir.remove();
            }
		}
	}

	@Override
	public void createSpotAnim(int customGfxID, int customGfxID1, int i, int i1) {
		EntitySpotAnim entitySpotAnim = new EntitySpotAnim();
		entitySpotAnim.setId(customGfxID);
		entitySpotAnim.setHeight(i);
		entitySpotAnim.setCycle(Client.instance.getGameCycle() + i1);
		entitySpotAnim.setFrame(0);
		spotAnims.insert(entitySpotAnim, entitySpotAnim.getHash());
	}

	@Override
	public int getId() {
		return (int) aLong1697;
	}

	@Override
	public int getPathLength() {
		return 0;
	}

	@Override
	public int getOverheadCycle() {
		return 0;
	}

	@Override
	public void setOverheadCycle(int cycle) {

	}

	@Override
	public int getPoseAnimationFrame() {
		return 0;
	}

	@Override
	public void setPoseAnimationFrame(int frame) {

	}

	@Override
	public RSNode getNext() {
		return next;
	}

	@Override
	public long getHash() {
		return 0;
	}

	@Override
	public RSNode getPrevious() {
		return previous;
	}

	@Override
	public void onUnlink() {

	}

	@Override
	public RSUsername getRsName() {
		return null;
	}

	@Override
	public int getPlayerId() {
		return playerId;
	}

	@Override
	public RSPlayerComposition getPlayerComposition() {
        return null;
	}

	@Override
	public int getCombatLevel() {
		return combatLevel;
	}

	@Override
	public int getTotalLevel() {
		return 0;
	}

	@Override
	public int getTeam() {
		return 0;
	}

	@Override
	public boolean isFriendsChatMember() {
		return false;
	}

	@Override
	public boolean isClanMember() {
		return false;
	}

	@Override
	public boolean isFriend() {

		return false;
	}

	@Override
	public boolean isFriended() {
		return false;
	}

	@Override
	public int getRsOverheadIcon() {
		return 0;
	}

	@Override
	public int getRsSkullIcon() {
		return 0;
	}

	@Override
	public int getRSSkillLevel() {
		return 0;
	}

	@Override
	public String[] getActions() {
		return new String[0];
	}

	@Override
	public int getModelHeight() {
		return defaultHeight;
	}

	@Override
	public void setModelHeight(int modelHeight) {

	}

	@Override
	public RSModel getModel() {
		return getRotatedModel();
	}

	@Override
	public void draw(int orientation, int pitchSin, int pitchCos, int yawSin, int yawCos, int x, int y, int z, long hash) {

	}


}