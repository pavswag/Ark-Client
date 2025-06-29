package com.client;

import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;


import com.client.definitions.ObjectDefinition;
import com.client.utilities.ObjectKeyUtil;
import net.runelite.api.Model;
import net.runelite.api.Perspective;
import net.runelite.api.Point;
import net.runelite.api.coords.LocalPoint;
import net.runelite.api.coords.WorldPoint;
import net.runelite.rs.api.RSFloorDecoration;
import net.runelite.rs.api.RSModel;
import net.runelite.rs.api.RSRenderable;

public final class GroundDecoration implements RSFloorDecoration
{

	public GroundDecoration()
	{
	}

	public int zLoc;
	public int tileHeights;
	public int xPos;
	public int yPos;
	public Renderable renderable;
	public long uid;
	public byte mask;

	@Override
	public Model getModel() {
		RSRenderable entity = getRenderable();
		if (entity == null)
		{
			return null;
		}

		if (entity instanceof Model)
		{
			return (RSModel) entity;
		}
		else
		{
			return entity.getModel();
		}
	}

	@Override
	public Shape getConvexHull() {
		RSModel model = (RSModel) getModel();

		if (model == null)
		{
			return null;
		}

		int tileHeight = Perspective.getTileHeight(Client.instance, new LocalPoint(getX(), getY()), Client.instance.getPlane());

		return model.getConvexHull(getX(), getY(), 0, tileHeight);
	}

	@Override
	public int getPlane() {
		return tileHeights;
	}

	@Override
	public int getId() {
		return ObjectKeyUtil.getObjectId(uid);
	}

	@Override
	public Point getCanvasLocation() {
		return Perspective.localToCanvas(Client.instance, getLocalLocation(), getPlane(), 0);
	}

	@Override
	public Point getCanvasLocation(int zOffset) {
		return Perspective.localToCanvas((net.runelite.api.Client) Client.instance, this.getLocalLocation(), this.getPlane(), zOffset);
	}

	@Override
	public Polygon getCanvasTilePoly() {
		return Perspective.getCanvasTilePoly(Client.instance, this.getLocalLocation());
	}

	@Override
	public Point getCanvasTextLocation(Graphics2D graphics, String text, int zOffset) {
		return Perspective.getCanvasTextLocation(Client.instance, graphics, getLocalLocation(), text, zOffset);
	}

	@Override
	public Point getMinimapLocation() {
		return Perspective.localToMinimap(Client.instance, getLocalLocation());
	}

	@Override
	public Shape getClickbox() {
		return Perspective.getClickbox(Client.instance, getModel(), 0, getLocalLocation());
	}

	@Override
	public String getName() {
		return ObjectDefinition.lookup(getId()).name;
	}

	@Override
	public String[] getActions() {
		return ObjectDefinition.lookup(getId()).actions;
	}

	@Override
	public WorldPoint getWorldLocation() {
		return WorldPoint.fromLocal(Client.instance, this.getX(), this.getY(), this.getPlane());
	}

	@Override
	public LocalPoint getLocalLocation() {
		return new LocalPoint(this.getX(), this.getY());
	}

	@Override
	public long getHash() {
		return uid;
	}

	@Override
	public int getX() {
		return xPos;
	}

	@Override
	public int getY() {
		return yPos;
	}

	@Override
	public RSRenderable getRenderable() {
		return renderable;
	}

	@Override
	public void setPlane(int plane) {
		zLoc = plane;
	}

	@Override
	public int getConfig() {
		return mask;
	}
}
