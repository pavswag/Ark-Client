package com.client.graphics.loaders;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.zip.GZIPInputStream;

import com.client.*;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import com.client.sign.Signlink;
import com.client.utilities.FileOperations;

public class SpriteLoader3 {

	/**
	 * Loads the sprite data and index files from the overlays location. This can be
	 * edited to use an archive such as config or media to load from the overlays.
	 * 
	 * @param archive
	 */
	public static void loadSprites() {
		try {
			DataInputStream indexFile = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(FileUtility.readFile(Signlink.getCacheDirectory() + "LIVE/13.idx"))));
			DataInputStream dataFile = new DataInputStream(new GZIPInputStream(new ByteArrayInputStream(FileUtility.readFile(Signlink.getCacheDirectory() + "LIVE/12.dat"))));
			int totalSprites = indexFile.readInt();
			if (cache == null) {
				cache = new SpriteLoader3[totalSprites];
				sprites = new Sprite[totalSprites];
			}
			for (int i = 0; i < totalSprites; i++) {
				int id = indexFile.readInt();
				if (cache[id] == null) {
					cache[id] = new SpriteLoader3();
				}
				cache[id].readValues(indexFile, dataFile);
				createSprite(cache[id]);
			}
			indexFile.close();
			dataFile.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Reads the information from the index and data files.
	 * 
	 * @param index
	 *            holds the sprite indices
	 * @param data
	 *            holds the sprite data per index
	 * @throws IOException
	 */
	public void readValues(DataInputStream index, DataInputStream data) throws IOException {
		do {
			int opCode = data.readByte();
			if (opCode == 0) {
				break;
			}
			if (opCode == 1) {
				id = data.readShort();
			} else if (opCode == 2) {
				name = data.readUTF();
			} else if (opCode == 3) {
				drawOffsetX = data.readShort();
			} else if (opCode == 4) {
				drawOffsetY = data.readShort();
			} else if (opCode == 5) {
				int indexLength = index.readInt();
				byte[] dataread = new byte[indexLength];
				data.readFully(dataread);
				spriteData = dataread;
			}
		} while (true);
	}

	/**
	 * Creates a sprite out of the spriteData.
	 * 
	 * @param sprite
	 */
	public static void createSprite(SpriteLoader3 sprite) {
		if (Configuration.DUMP_SPRITES) {
			File directory = new File(Signlink.getCacheDirectory() + "Sprites/dump3/");
			if (!directory.exists()) {
				directory.mkdir();
			}
			DataUtils.writeFile(
					new File(directory.getAbsolutePath() + System.getProperty("file.separator") + sprite.id + ".png"),
					sprite.spriteData);
		}
		sprites[sprite.id] = new Sprite(sprite.spriteData);
		sprites[sprite.id].xOffset = sprite.drawOffsetX;
		sprites[sprite.id].yOffset = sprite.drawOffsetY;
	}

	/**
	 * Gets the name of a specified sprite index.
	 * 
	 * @param index
	 * @return
	 */
	public static String getName(int index) {
		if (cache[index].name != null) {
			return cache[index].name;
		} else {
			return "null";
		}
	}

	/**
	 * Gets the drawOffsetX of a specified sprite index.
	 * 
	 * @param index
	 * @return
	 */
	public static int getOffsetX(int index) {
		return cache[index].drawOffsetX;
	}

	/**
	 * Gets the drawOffsetY of a specified sprite index.
	 * 
	 * @param index
	 * @return
	 */
	public static int getOffsetY(int index) {
		return cache[index].drawOffsetY;
	}

	/**
	 * Sets the default values.
	 */
	public SpriteLoader3() {
		name = "name";
		id = -1;
		drawOffsetX = 0;
		drawOffsetY = 0;
		spriteData = null;
	}

	public static SpriteLoader3[] cache;
	public static Sprite[] sprites = null;
	public static int totalSprites;
	public String name;
	public int id;
	public int drawOffsetX;
	public int drawOffsetY;
	public byte[] spriteData;
}