/*
 * Copyright (c) 2016-2017, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.api;

import net.runelite.api.coords.WorldPoint;

/**
 * Represents the entire 3D scene
 */
public interface Scene
{
	/**
	 * Gets the tiles in the scene
	 *
	 * @return the tiles in [plane][x][y]
	 */
	Tile[][][] getTiles();

	/**
	 * Adds an item to the scene
	 */
	void addItem(int id, int quantity, WorldPoint point);

	/**
	 * Removes an item from the scene
	 */
	void removeItem(int id, int quantity, WorldPoint point);

	int getDrawDistance();
	void setDrawDistance(int drawDistance);

	/**
	 * Get the minimum scene level which will be rendered
	 *
	 * @return the plane of the minimum level
	 */
	int getMinLevel();

	/**
	 * Set the minimum scene level which will be rendered
	 *
	 * @param minLevel the plane of the minimum level
	 */
	void setMinLevel(int minLevel);

	/**
	 * Remove a game object from the scene
	 * @param gameObject
	 */
	void removeGameObject(GameObject gameObject);

	/**
	 * Remove a game object from the scene
	 * @param plane
	 * @param x
	 * @param y
	 */
	void removeGameObject(int plane, int x, int y);

	/**
	 * Remove a game object from the scene
	 * @param wallObject
	 */
	void removeWallObject(WallObject wallObject);

	/**
	 * Remove a wall object from the scene
	 * @param plane
	 * @param x
	 * @param y
	 */
	void removeWallObject(int plane, int x, int y);

	/**
	 * Remove a decorative object from the scene
	 * @param decorativeObject
	 */
	void removeDecorativeObject(DecorativeObject decorativeObject);

	/**
	 * Remove a decorative object from the scene
	 * @param plane
	 * @param x
	 * @param y
	 */
	void removeDecorativeObject(int plane, int x, int y);

	/**
	 * Remove a ground object from the scene
	 * @param groundObject
	 */
	void removeGroundObject(GroundObject groundObject);

	/**
	 * Remove a ground object from the scene
	 * @param plane
	 * @param x
	 * @param y
	 */
	void removeGroundObject(int plane, int x, int y);

	void generateHouses();

	void setRoofRemovalMode(int flags);

	/**
	 * Get the underlay ids for the scene. The value stored is id + 1, with 0 for no underlay.
	 * @return
	 */
	short[][][] getUnderlayIds();

	/**
	 * Get the overlay ids for the scene. The value stored is id + 1, with 0 for no overlay.
	 * @return
	 */
	short[][][] getOverlayIds();

	/**
	 * Get the shapes of the tiles for the scene.
	 * @return
	 */
	byte[][][] getTileShapes();

	/**
	 * Get the heights of the tiles on the scene.
	 * @return
	 */
	int[][][] getTileHeights();

	/**
	 * Returns the x-axis base coordinate.
	 * <p>
	 * This value is the x-axis world coordinate of tile (0, 0) in
	 * this scene (ie. the bottom-left most coordinates in the scene).
	 *
	 * @return the base x-axis coordinate
	 */
	int getBaseX();

	/**
	 * Returns the y-axis base coordinate.
	 * <p>
	 * This value is the y-axis world coordinate of tile (0, 0) in
	 * this scene (ie. the bottom-left most coordinates in the scene).
	 *
	 * @return the base y-axis coordinate
	 */
	int getBaseY();

	/**
	 * Check if this scene is an instance
	 * @see #getInstanceTemplateChunks()
	 * @return
	 */
	boolean isInstance();

	/**
	 * Contains a 3D array of template chunks for instanced areas.
	 * <p>
	 * The array returned is of format [z][x][y], where z is the
	 * plane, x and y the x-axis and y-axis coordinates of a tile
	 * divided by the size of a chunk.
	 * <p>
	 * The bits of the int value held by the coordinates are -1 if there is no data,
	 * structured in the following format:
	 * <pre>{@code
	 *  0                   1                   2                   3
	 *  0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1 2 3 4 5 6 7 8 9 0 1
	 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 * | |rot|     y chunk coord     |    x chunk coord    |pln|       |
	 * +-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+-+
	 * }</pre>
	 * @return the array of instance template chunks
	 * @see Constants#CHUNK_SIZE
	 * @see InstanceTemplates
	 */
	int[][][] getInstanceTemplateChunks();

    Tile[][][] getExtendedTiles();

    void removeTile(Tile tile);
}
