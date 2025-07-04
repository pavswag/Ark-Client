/*
 * Copyright (c) 2018, Tomas Slusny <slusnucky@gmail.com>
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
package net.runelite.client.util;

import net.runelite.api.*;
import net.runelite.api.events.*;
import net.runelite.client.callback.ClientThread;
import net.runelite.client.eventbus.EventBus;

import javax.inject.Inject;
import javax.inject.Singleton;
import java.util.function.Consumer;

@Singleton
public class GameEventManager
{
	private final EventBus eventBus = new EventBus();
	private final Client client;
	private final ClientThread clientThread;

	@Inject
	private GameEventManager(Client client, ClientThread clientThread)
	{
		this.client = client;
		this.clientThread = clientThread;
	}

	/**
	 * Iterates over each tile in the scene if player is logged in
	 *
	 * @param consumer consumer accepting tile as parameter
	 */
	private void forEachTile(Consumer<Tile> consumer)
	{
		final Scene scene = client.getScene();
		final Tile[][][] tiles = scene.getTiles();

		for (int z = 0; z < Constants.MAX_Z; ++z)
		{
			for (int x = 0; x < Constants.SCENE_SIZE; ++x)
			{
				for (int y = 0; y < Constants.SCENE_SIZE; ++y)
				{
					Tile tile = tiles[z][x][y];

					if (tile == null)
					{
						continue;
					}

					consumer.accept(tile);

					if (tile.getBridge() != null)
					{
						consumer.accept(tile.getBridge());
					}
				}
			}
		}
	}

	/**
	 * Simulate game events for EventBus subscriber
	 *
	 * @param subscriber EventBus subscriber
	 */
	public void simulateGameEvents(Object subscriber)
	{
		if (client.getGameState() != GameState.LOGGED_IN)
		{
			return;
		}

		clientThread.invoke(() ->
		{

			eventBus.register(subscriber);


			for (NPC npc : client.getCachedNPCs())
			{
				if (npc != null)
				{
					final NpcSpawned npcSpawned = new NpcSpawned(npc);
					eventBus.post(npcSpawned);
				}
			}

			for (Player player : client.getCachedPlayers())
			{
				if (player != null)
				{
					final PlayerSpawned playerSpawned = new PlayerSpawned(player);
					eventBus.post(playerSpawned);
				}
			}

			forEachTile((tile) ->
			{
				WallObject wallObject = tile.getWallObject();
				if (wallObject != null)
				{
					final WallObjectSpawned objectSpawned = new WallObjectSpawned();
					objectSpawned.setTile(tile);
					objectSpawned.setWallObject(wallObject);
					eventBus.post(objectSpawned);
				}

				DecorativeObject decorativeObject = tile.getDecorativeObject();
				if (decorativeObject != null)
				{
					final DecorativeObjectSpawned objectSpawned = new DecorativeObjectSpawned();
					objectSpawned.setTile(tile);
					objectSpawned.setDecorativeObject(decorativeObject);
					eventBus.post(objectSpawned);
				}

				GroundObject groundObject = tile.getGroundObject();
				if (groundObject != null)
				{
					final GroundObjectSpawned objectSpawned = new GroundObjectSpawned();
					objectSpawned.setTile(tile);
					objectSpawned.setGroundObject(groundObject);
					eventBus.post(objectSpawned);
				}

				for (GameObject object : tile.getGameObjects())
				{
					if (object != null)
					{
						if (object.getSceneMinLocation().equals(tile.getSceneLocation()))
						{
							final GameObjectSpawned objectSpawned = new GameObjectSpawned();
							objectSpawned.setTile(tile);
							objectSpawned.setGameObject(object);
							eventBus.post(objectSpawned);
						}
					}
				}

				ItemLayer itemLayer = tile.getItemLayer();
				if (itemLayer != null)
				{
					Node current = itemLayer.getTop();
					while (current instanceof TileItem)
					{
						final TileItem item = (TileItem) current;

						current = current.getNext();

						final ItemSpawned itemSpawned = new ItemSpawned(tile, item);
						eventBus.post(itemSpawned);
					}
				}
			});

			eventBus.unregister(subscriber);
		});
	}
}