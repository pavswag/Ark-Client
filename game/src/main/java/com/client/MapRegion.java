package com.client;

import com.client.audio.ObjectSound;
import com.client.definitions.FloorOverlayDefinition;
import com.client.definitions.FloorUnderlayDefinition;
import com.client.definitions.ObjectDefinition;
import com.client.utilities.ChunkUtil;
import com.client.utilities.ObjectKeyUtil;

public final class MapRegion {

	private final int[] hues;
	private final int[] saturations;
	private final int[] luminances;
	private final int[] chromas;
	private final int[] anIntArray128;
	private final int[][][] tileHeights;
	public short[][][] overlays;
	public static int anInt131;
	private final byte[][][] shading;
	private final int[][][] anIntArrayArrayArray135;
	public byte[][][] overlayTypes;
	private static final int COSINE_VERTICES[] = { 1, 0, -1, 0 };
	private final int[][] tileLighting;
	private static final int anIntArray140[] = { 16, 32, 64, 128 };
	public short[][][] underlays;
	private static final int SINE_VERTICIES[] = { 0, -1, 0, 1 };
	public static int maximumPlane = 99;
	private final int regionSizeX;
	private final int regionSizeY;
	public static int ExpandedRegionSize = 0;
	private final byte[][][] overlayOrientations;
	private final byte[][][] tileFlags;
	public static boolean lowMem = false;
	private static final int anIntArray152[] = { 1, 2, 4, 8 };

	private static final int BLOCKED_TILE = 1;
	public static final int BRIDGE_TILE = 2;
	private static final int FORCE_LOWEST_PLANE = 8;

	public MapRegion(byte fileFlags[][][], int tileHeights[][][]) {
		maximumPlane = 99;
		regionSizeX = 104;
		regionSizeY = 104;
		this.tileHeights = tileHeights;
		this.tileFlags = fileFlags;
		underlays = new short[4][regionSizeX][regionSizeY];
		overlays = new short[4][regionSizeX][regionSizeY];
		overlayTypes = new byte[4][regionSizeX][regionSizeY];
		overlayOrientations = new byte[4][regionSizeX][regionSizeY];
		anIntArrayArrayArray135 = new int[4][regionSizeX + 1][regionSizeY + 1];
		shading = new byte[4][regionSizeX + 1][regionSizeY + 1];
		tileLighting = new int[regionSizeX + 1][regionSizeY + 1];
		hues = new int[regionSizeY];
		saturations = new int[regionSizeY];
		luminances = new int[regionSizeY];
		chromas = new int[regionSizeY];
		anIntArray128 = new int[regionSizeY];
	}

	private static int calculateNoise(int x, int y) {
		int k = x + y * 57;
		k = k << 13 ^ k;
		int l = k * (k * k * 15731 + 0xc0ae5) + 0x5208dd0d & 0x7fffffff;
		return l >> 19 & 0xff;
	}

	public int rndLightness = (int) (Math.random() * 33.0D) - 16;

	public int rndHue = (int) (Math.random() * 17.0D) - 8;
	public final void createRegionScene(CollisionMap maps[], SceneGraph scene) {
		try {

			for (int z = 0; z < 4; z++) {
				for (int x = 0; x < 104; x++) {
					for (int y = 0; y < 104; y++)
						if ((tileFlags[z][x][y] & BLOCKED_TILE) == 1) {
							int plane = z;
							if ((tileFlags[1][x][y] & BRIDGE_TILE) == 2)
								plane--;
							if (plane >= 0)
								maps[plane].block(x, y);
						}

				}

			}
			int mapLight = Client.instance.isHdMinimapEnabled() ? 52 : 96;
			for (int z = 0; z < 4; z++) {
				byte shading[][] = this.shading[z];

				char diffusion = '\u0300';
				byte lightX = -50;
				byte lightY = -10;
				byte lightZ = -50;
				int light = (int) Math.sqrt(lightX * lightX + lightY * lightY + lightZ * lightZ);
				int l3 = diffusion * light >> 8;
				for (int j4 = 1; j4 < regionSizeY - 1; j4++) {
					for (int j5 = 1; j5 < regionSizeX - 1; j5++) {
						int k6 = tileHeights[z][j5 + 1][j4] - tileHeights[z][j5 - 1][j4];
						int l7 = tileHeights[z][j5][j4 + 1] - tileHeights[z][j5][j4 - 1];
						int j9 = (int) Math.sqrt(k6 * k6 + 0x10000 + l7 * l7);
						int k12 = (k6 << 8) / j9;
						int l13 = 0x10000 / j9;
						int j15 = (l7 << 8) / j9;
						int j16 = 96 + (lightX * k12 + lightY * l13 + lightZ * j15) / l3;
						int j17 = (shading[j5 - 1][j4] >> 2) + (shading[j5 + 1][j4] >> 3) + (shading[j5][j4 - 1] >> 2) + (shading[j5][j4 + 1] >> 3) + (shading[j5][j4] >> 1);
						tileLighting[j5][j4] = j16 - j17;
					}

				}

				for (int k5 = 0; k5 < regionSizeY; k5++) {
					hues[k5] = 0;
					saturations[k5] = 0;
					luminances[k5] = 0;
					chromas[k5] = 0;
					anIntArray128[k5] = 0;
				}

				for (int l6 = -5; l6 < regionSizeX + 5; l6++) {
					for (int i8 = 0; i8 < regionSizeY; i8++) {
						int k9 = l6 + 5;
						if (k9 >= 0 && k9 < regionSizeX) {
							int l12 = underlays[z][k9][i8] & 0x7FFF;
							if (l12 > 0) {
								FloorUnderlayDefinition flo = FloorUnderlayDefinition.lookup(l12 - 1);
								hues[i8] += flo.getHue();
								saturations[i8] += flo.getSaturation();
								luminances[i8] += flo.getLightness();
								chromas[i8] += flo.getHueMultiplier();
								anIntArray128[i8]++;
							}
						}
						int i13 = l6 - 5;
						if (i13 >= 0 && i13 < regionSizeX) {
							int i14 = underlays[z][i13][i8] & 0x7FFF;
							if (i14 > 0) {
								FloorUnderlayDefinition flo_1 = FloorUnderlayDefinition.lookup(i14 - 1);
								hues[i8] -= flo_1.getHue();
								saturations[i8] -= flo_1.getSaturation();
								luminances[i8] -= flo_1.getLightness();
								chromas[i8] -= flo_1.getHueMultiplier();
								anIntArray128[i8]--;
							}
						}
					}

					if (l6 >= 1 && l6 < regionSizeX - 1) {
						int l9 = 0;
						int j13 = 0;
						int j14 = 0;
						int k15 = 0;
						int k16 = 0;
						for (int k17 = -5; k17 < regionSizeY + 5; k17++) {
							int j18 = k17 + 5;
							if (j18 >= 0 && j18 < regionSizeY) {
								l9 += hues[j18];
								j13 += saturations[j18];
								j14 += luminances[j18];
								k15 += chromas[j18];
								k16 += anIntArray128[j18];
							}
							int k18 = k17 - 5;
							if (k18 >= 0 && k18 < regionSizeY) {
								l9 -= hues[k18];
								j13 -= saturations[k18];
								j14 -= luminances[k18];
								k15 -= chromas[k18];
								k16 -= anIntArray128[k18];
							}
							if (k17 >= 1 && k17 < regionSizeY - 1 && (!lowMem || (tileFlags[0][l6][k17] & 2) != 0 || (tileFlags[z][l6][k17] & 0x10) == 0 && getCollisionPlane(k17, z, l6) == anInt131)) {
								if (z < maximumPlane)
									maximumPlane = z;
								int l18 = underlays[z][l6][k17] & 0x7FFF;
								int i19 = overlays[z][l6][k17] & 0x7FFF;
								if (l18 > 0 || i19 > 0) {
									int j19 = tileHeights[z][l6][k17];
									int k19 = tileHeights[z][l6 + 1][k17];
									int l19 = tileHeights[z][l6 + 1][k17 + 1];
									int i20 = tileHeights[z][l6][k17 + 1];
									int j20 = tileLighting[l6][k17];
									int k20 = tileLighting[l6 + 1][k17];
									int l20 = tileLighting[l6 + 1][k17 + 1];
									int i21 = tileLighting[l6][k17 + 1];
									int j21 = -1;
									int k21 = -1;
									if (l18 > 0) {
										int l21 = (l9 * 256) / k15;
										int j22 = j13 / k16;
										int l22 = j14 / k16;
										j21 = encode(l21, j22, l22);

										if (l22 < 0)
											l22 = 0;
										else if (l22 > 255)
											l22 = 255;

										k21 = encode(l21, j22, l22);
									}
									if (z > 0) {
										boolean flag = true;
										if (l18 == 0 && overlayTypes[z][l6][k17] != 0)
											flag = false;
										if (i19 > 0 && !FloorOverlayDefinition.lookup(i19 - 1).hideUnderlay)
											flag = false;
										if (flag && j19 == k19 && j19 == l19 && j19 == i20)
											anIntArrayArrayArray135[z][l6][k17] |= 2340;
									}
									int i22 = 0;

									if (j21 != -1)
										i22 = Rasterizer3D.hslToRgb[method187(k21, mapLight)];
									if (i19 == 0) {
										scene.add_tile(z, l6, k17, 0, 0, -1, j19, k19, l19, i20, method187(j21, j20), method187(j21, k20), method187(j21, l20), method187(j21, i21), 0, 0, 0, 0, i22, 0);
									} else {

										int k22 = overlayTypes[z][l6][k17] + 1;
										byte byte4 = overlayOrientations[z][l6][k17];
										FloorOverlayDefinition overlay_flo = FloorOverlayDefinition.lookup(i19 - 1);
										int texture = overlay_flo.texture;
										int encodedTile;
										int minimapColor;
										int encodedMinimap;
										int lightness;
										if (texture >= 0) {
											minimapColor = Rasterizer3D.textureLoader.getAverageTextureRGB(texture);
											encodedTile = -1;
										} else if (overlay_flo.primaryRgb == 16711935) {
											encodedTile = -2;
											texture = -1;
											minimapColor = -2;
										} else {
											encodedTile = encode(overlay_flo.hue, overlay_flo.saturation, overlay_flo.lightness);
											encodedMinimap = overlay_flo.hue;
											lightness = overlay_flo.lightness;
											if (lightness < 0) {
												lightness = 0;
											} else if (lightness > 255) {
												lightness = 255;
											}
											minimapColor = encode(encodedMinimap, overlay_flo.saturation, lightness);
										}
										encodedMinimap = 0;
										if (minimapColor != -2) {
											encodedMinimap = Rasterizer3D.hslToRgb[checkedLight(minimapColor, 96)];
										}
										if (overlay_flo.secondaryRgb != -1) {
											lightness = overlay_flo.secondaryHue;
											int secondaryLightness = overlay_flo.secondaryLightness;
											if (secondaryLightness < 0) {
												secondaryLightness = 0;
											} else if (secondaryLightness > 255) {
												secondaryLightness = 255;
											}
											minimapColor = encode(lightness, overlay_flo.secondarySaturation, secondaryLightness);
											encodedMinimap = Rasterizer3D.hslToRgb[checkedLight(minimapColor, 96)];
										}

										if (overlay_flo.secondaryRgb != -1) {
											lightness = rndHue + overlay_flo.secondaryHue & 255;
											int var45 = overlay_flo.secondaryLightness + rndLightness;
											if (var45 < 0) {
												var45 = 0;
											} else if (var45 > 255) {
												var45 = 255;
											}

											minimapColor = set_hsl_bitset(lightness, overlay_flo.secondarySaturation, var45);
											encodedMinimap = Rasterizer3D.hslToRgb[method425(minimapColor, 96)];
										}

										scene.add_tile(z, l6, k17, k22, byte4, texture, j19, k19, l19, i20, method187(j21, j20), method187(j21, k20), method187(j21, l20), method187(j21, i21), checkedLight(encodedTile, j20), checkedLight(encodedTile, k20), checkedLight(encodedTile, l20), checkedLight(encodedTile, i21), i22, encodedMinimap);
									}
								}
							}
						}

					}
				}

				for (int j8 = 1; j8 < regionSizeY - 1; j8++) {
					for (int i10 = 1; i10 < regionSizeX - 1; i10++)
						scene.setTileLogicHeight(z, i10, j8, getCollisionPlane(j8, z, i10));

				}
			}

			scene.shadeModels(-50, -10, -50);
			for (int j1 = 0; j1 < regionSizeX; j1++) {
				for (int l1 = 0; l1 < regionSizeY; l1++)
					if ((tileFlags[1][j1][l1] & 2) == 2)
						scene.applyBridgeMode(l1, j1);

			}

			int i2 = 1;
			int j2 = 2;
			int k2 = 4;
			for (int l2 = 0; l2 < 4; l2++) {
				if (l2 > 0) {
					i2 <<= 3;
					j2 <<= 3;
					k2 <<= 3;
				}
				for (int i3 = 0; i3 <= l2; i3++) {
					for (int k3 = 0; k3 <= regionSizeY; k3++) {
						for (int i4 = 0; i4 <= regionSizeX; i4++) {
							if ((anIntArrayArrayArray135[i3][i4][k3] & i2) != 0) {
								int k4 = k3;
								int l5 = k3;
								int i7 = i3;
								int k8 = i3;
								for (; k4 > 0 && (anIntArrayArrayArray135[i3][i4][k4 - 1] & i2) != 0; k4--)
									;
								for (; l5 < regionSizeY && (anIntArrayArrayArray135[i3][i4][l5 + 1] & i2) != 0; l5++)
									;
								label0: for (; i7 > 0; i7--) {
									for (int j10 = k4; j10 <= l5; j10++)
										if ((anIntArrayArrayArray135[i7 - 1][i4][j10] & i2) == 0)
											break label0;

								}

								label1: for (; k8 < l2; k8++) {
									for (int k10 = k4; k10 <= l5; k10++)
										if ((anIntArrayArrayArray135[k8 + 1][i4][k10] & i2) == 0)
											break label1;

								}

								int l10 = ((k8 + 1) - i7) * ((l5 - k4) + 1);
								if (l10 >= 8) {
									char c1 = '\360';
									int k14 = tileHeights[k8][i4][k4] - c1;
									int l15 = tileHeights[i7][i4][k4];
									SceneGraph.createNewSceneCluster(l2, i4 * 128, l15, i4 * 128, l5 * 128 + 128, k14, k4 * 128, 1);
									for (int l16 = i7; l16 <= k8; l16++) {
										for (int l17 = k4; l17 <= l5; l17++)
											anIntArrayArrayArray135[l16][i4][l17] &= ~i2;

									}

								}
							}
							if ((anIntArrayArrayArray135[i3][i4][k3] & j2) != 0) {
								int l4 = i4;
								int i6 = i4;
								int j7 = i3;
								int l8 = i3;
								for (; l4 > 0 && (anIntArrayArrayArray135[i3][l4 - 1][k3] & j2) != 0; l4--)
									;
								for (; i6 < regionSizeX && (anIntArrayArrayArray135[i3][i6 + 1][k3] & j2) != 0; i6++)
									;
								label2: for (; j7 > 0; j7--) {
									for (int i11 = l4; i11 <= i6; i11++)
										if ((anIntArrayArrayArray135[j7 - 1][i11][k3] & j2) == 0)
											break label2;

								}

								label3: for (; l8 < l2; l8++) {
									for (int j11 = l4; j11 <= i6; j11++)
										if ((anIntArrayArrayArray135[l8 + 1][j11][k3] & j2) == 0)
											break label3;

								}

								int k11 = ((l8 + 1) - j7) * ((i6 - l4) + 1);
								if (k11 >= 8) {
									char c2 = '\360';
									int l14 = tileHeights[l8][l4][k3] - c2;
									int i16 = tileHeights[j7][l4][k3];
									SceneGraph.createNewSceneCluster(l2, l4 * 128, i16, i6 * 128 + 128, k3 * 128, l14, k3 * 128, 2);
									for (int i17 = j7; i17 <= l8; i17++) {
										for (int i18 = l4; i18 <= i6; i18++)
											anIntArrayArrayArray135[i17][i18][k3] &= ~j2;

									}

								}
							}
							if ((anIntArrayArrayArray135[i3][i4][k3] & k2) != 0) {
								int i5 = i4;
								int j6 = i4;
								int k7 = k3;
								int i9 = k3;
								for (; k7 > 0 && (anIntArrayArrayArray135[i3][i4][k7 - 1] & k2) != 0; k7--)
									;
								for (; i9 < regionSizeY && (anIntArrayArrayArray135[i3][i4][i9 + 1] & k2) != 0; i9++)
									;
								label4: for (; i5 > 0; i5--) {
									for (int l11 = k7; l11 <= i9; l11++)
										if ((anIntArrayArrayArray135[i3][i5 - 1][l11] & k2) == 0)
											break label4;

								}

								label5: for (; j6 < regionSizeX; j6++) {
									for (int i12 = k7; i12 <= i9; i12++)
										if ((anIntArrayArrayArray135[i3][j6 + 1][i12] & k2) == 0)
											break label5;

								}

								if (((j6 - i5) + 1) * ((i9 - k7) + 1) >= 4) {
									int j12 = tileHeights[i3][i5][k7];
									SceneGraph.createNewSceneCluster(l2, i5 * 128, j12, j6 * 128 + 128, i9 * 128 + 128, j12, k7 * 128, 4);
									for (int k13 = i5; k13 <= j6; k13++) {
										for (int i15 = k7; i15 <= i9; i15++)
											anIntArrayArrayArray135[i3][k13][i15] &= ~k2;

									}

								}
							}
						}

					}

				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int method425(int var0, int var1) {
		if (var0 == -2) {
			return 12345678;
		} else if (var0 == -1) {
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return var1;
		} else {
			var1 = (var0 & 127) * var1 / 128;
			if (var1 < 2) {
				var1 = 2;
			} else if (var1 > 126) {
				var1 = 126;
			}

			return (var0 & 0xFF80) + var1;
		}
	}


	private static int calculateVertexHeight(int i, int j) {
		int mapHeight = (interpolatedNoise(i + 45365, j + 0x16713, 4) - 128) + (interpolatedNoise(i + 10294, j + 37821, 2) - 128 >> 1) + (interpolatedNoise(i, j, 1) - 128 >> 2);
		mapHeight = (int) ((double) mapHeight * 0.29999999999999999D) + 35;
		if (mapHeight < 10) {
			mapHeight = 10;
		}
		else if (mapHeight > 60) {
			mapHeight = 60;
		}
		return mapHeight;
	}

	static int set_hsl_bitset(int h, int s, int l) {
		if (l > 179) {
			s /= 2;
		}
		if (l > 192) {
			s /= 2;
		}
		if (l > 217) {
			s /= 2;
		}
		if (l > 243) {
			s /= 2;
		}
		int hsl = (s / 32 << 7) + (h / 4 << 10) + l / 2;
		return hsl;
	}

	public final void initiateVertexHeights(int yOffset, int yLength, int xLength, int xOffset) {
		for (int y = yOffset; y <= yOffset + yLength; y++) {
			for (int x = xOffset; x <= xOffset + xLength; x++) {
				if (x >= 0 && x < regionSizeX && y >= 0 && y < regionSizeY) {
					shading[0][x][y] = 127;
					if (x == xOffset && x > 0) {
						tileHeights[0][x][y] = tileHeights[0][x - 1][y];
					}
					if (x == xOffset + xLength && x < regionSizeX - 1) {
						tileHeights[0][x][y] = tileHeights[0][x + 1][y];
					}
					if (y == yOffset && y > 0) {
						tileHeights[0][x][y] = tileHeights[0][x][y - 1];
					}
					if (y == yOffset + yLength && y < regionSizeY - 1) {
						tileHeights[0][x][y] = tileHeights[0][x][y + 1];
					}
				}
			}
		}
	}

	private void renderObject(int var2, SceneGraph scene, CollisionMap class11, int type, int var0, int var1, int objectId, int face) {
		if (lowMem && (tileFlags[0][var1][var2] & BRIDGE_TILE) == 0) {
			if ((tileFlags[var0][var1][var2] & 0x10) != 0) {
				return;
			}

			if (getCollisionPlane(var2, var0, var1) != anInt131) {
				return;
			}
		}
		if (var0 < maximumPlane) {
			maximumPlane = var0;
		}
		int mX = Client.instance.currentRegionX - 6;
		int mY = Client.instance.currentRegionY - 6;

		ObjectDefinition definition = ObjectDefinition.lookup(objectId);
		int center;
		int east;
		int northEast;
		int north;
		int objectSizeY;
		int objectSizeX;
		if (face != 1 && face != 3) {
			objectSizeX = definition.sizeX;
			objectSizeY = definition.sizeY;
		} else {
			objectSizeX = definition.sizeY;
			objectSizeY = definition.sizeX;
		}

		int editX;
		int editX2;
		if (var1 + objectSizeX <= 104) {
			editX = var1 + (objectSizeX >> 1);
			editX2 = var1 + (1 + objectSizeX >> 1);
		} else {
			editX = var1;
			editX2 = 1 + var1;
		}

		int editY;
		int editY2;
		if (objectSizeY + var2 <= 104) {
			editY = (objectSizeY >> 1) + var2;
			editY2 = var2 + (1 + objectSizeY >> 1);
		} else {
			editY = var2;
			editY2 = 1 + var2;
		}
		center = tileHeights[var0][editX][editY];
		east = tileHeights[var0][editX2][editY];
		northEast = tileHeights[var0][editX2][editY2];
		north = tileHeights[var0][editX][editY2];

		int[][] heights = tileHeights[var0];
		int mean = center + east + northEast + north >> 2;
		int vertexX = (var1 << 7) + (objectSizeX << 6);
		int vertexY = (var2 << 7) + (objectSizeY << 6);

		long key = (long) ((long) face << 20 | (long) type << 14 | ((long) var2 << 7 | var1) + 0x40000000);
		if (definition.interactive == 0)
			key |= ~0x7fffffffffffffffL;
		if(definition.supportItems == 1) {
			key |= 0x400000L;
		}
		key |= (long) objectId << 32;
		byte config = (byte) ((face << 6) + type);
		if (type == 22) {
			if (lowMem && definition.interactive == 0 && !definition.obstructive) {
				return;
			}
			Object obj;
			if (definition.animation == -1 && definition.transforms == null) {
				obj = definition.getEntity(22, face, heights, vertexX, mean, vertexY);
			} else {
				obj = new SceneObject(objectId, face, 22, var0, var1, var2, definition.animation,definition.randomAnimStart);
			}
			scene.addGroundDecoration(var0, mean, var2, ((Renderable) (obj)), config, key, var1);
			if (definition.solid == 1 && definition.interactive != 0 && class11 != null) {
				class11.block(var1, var2);
			}
			return;
		}
		if (type == 10 || type == 11) {
			Object obj1;
			if (definition.animation == -1 && definition.transforms == null) {
				obj1 = definition.getEntity(10, face, heights, vertexX, mean, vertexY);
			} else {
				obj1 = new SceneObject(objectId, face, 10, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			if (obj1 != null) {
				int i5 = 0;
				if (type == 11) {
					i5 += 256;
				}
				int j4;
				int l4;
				if (face == 1 || face == 3) {
					j4 = definition.sizeY;
					l4 = definition.sizeX;
				} else {
					j4 = definition.sizeX;
					l4 = definition.sizeY;
				}
				if (scene.addTiledObject(key, config, mean, l4, ((Renderable) (obj1)), j4, var0, i5, var2, var1) && definition.clipped) {
					Renderable model = definition.getEntity(10, face, heights, vertexX, mean, vertexY);

					int var24 = 0;
					if (model instanceof Model) {
						var24 = ((Model) model).getShadowIntensity() / 4;
						if (var24 > 30) {
							var24 = 30;
						}
					}
					for (int j5 = 0; j5 <= j4; j5++) {
						for (int k5 = 0; k5 <= l4; k5++) {
							if (var24 > shading[var0][var1 + j5][var2 + k5]) {
								shading[var0][var1 + j5][var2 + k5] = (byte) var24;
							}
						}

					}
				}
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method212(definition.impenetrable, definition.sizeX, definition.sizeY, var1, var2, face);
			}
			return;
		}
		if (type >= 12) {
			Object obj2;
			if (definition.animation == -1 && definition.transforms == null) {
				obj2 = definition.getEntity(type, face, heights, vertexX, mean, vertexY);
			} else {
				obj2 = new SceneObject(objectId, face, type, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addTiledObject(key, config, mean, 1, ((Renderable) (obj2)), 1, var0, 0, var2, var1);
			if (type <= 17 && type != 13 && var0 > 0) {
				anIntArrayArrayArray135[var0][var1][var2] |= 0x924;
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method212(definition.impenetrable, definition.sizeX, definition.sizeY,
						var1, var2, face);
			}
			return;
		}
		if (type == 0) {
			Object obj3;
			if (definition.animation == -1 && definition.transforms == null) {
				obj3 = definition.getEntity(0, face, heights, vertexX, mean, vertexY);
			} else {
				obj3 = new SceneObject(objectId, face, 0, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallObject(anIntArray152[face], ((Renderable) (obj3)), key, var2, config, var1, null, mean,
					0, var0);
			if (face == 0) {
				if (definition.clipped) {
					shading[var0][var1][var2] = 50;
					shading[var0][var1][var2 + 1] = 50;
				}
				if (definition.modelClipped) {
					anIntArrayArrayArray135[var0][var1][var2] |= 0x249;
				}
			} else if (face == 1) {
				if (definition.clipped) {
					shading[var0][var1][var2 + 1] = 50;
					shading[var0][var1 + 1][var2 + 1] = 50;
				}
				if (definition.modelClipped) {
					anIntArrayArrayArray135[var0][var1][var2 + 1] |= 0x492;
				}
			} else if (face == 2) {
				if (definition.clipped) {
					shading[var0][var1 + 1][var2] = 50;
					shading[var0][var1 + 1][var2 + 1] = 50;
				}
				if (definition.modelClipped) {
					anIntArrayArrayArray135[var0][var1 + 1][var2] |= 0x249;
				}
			} else {
				if (definition.clipped) {
					shading[var0][var1][var2] = 50;
					shading[var0][var1 + 1][var2] = 50;
				}
				if (definition.modelClipped) {
					anIntArrayArrayArray135[var0][var1][var2] |= 0x492;
				}
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method211(var2, face, var1, type, definition.impenetrable);
			}
			if (definition.decorDisplacement != 16) {
				scene.method290(var2, definition.decorDisplacement, var1, var0);
			}
			return;
		}
		if (type == 1) {
			Object obj4;
			if (definition.animation == -1 && definition.transforms == null) {
				obj4 = definition.getEntity(1, face, heights, vertexX, mean, vertexY);
			} else {
				obj4 = new SceneObject(objectId, face, 1, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallObject(anIntArray140[face], ((Renderable) (obj4)), key, var2, config, var1, null, mean,
					0, var0);
			if (definition.clipped) {
				if (face == 0) {
					shading[var0][var1][var2 + 1] = 50;
				} else if (face == 1) {
					shading[var0][var1 + 1][var2 + 1] = 50;
				} else if (face == 2) {
					shading[var0][var1 + 1][var2] = 50;
				} else {
					shading[var0][var1][var2] = 50;
				}
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method211(var2, face, var1, type, definition.impenetrable);
			}
			return;
		}
		if (type == 2) {
			int i3 = face + 1 & 3;
			Object obj11;
			Object obj12;
			if (definition.animation == -1 && definition.transforms == null) {
				obj11 = definition.getEntity(2, 4 + face, heights, vertexX, mean, vertexY);
				obj12 = definition.getEntity(2, i3, heights, vertexX, mean, vertexY);
			} else {
				obj11 = new SceneObject(objectId, 4 + face, 2, var0, var1, var2, definition.animation, definition.randomAnimStart);
				obj12 = new SceneObject(objectId, 4 + face, 2, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallObject(anIntArray152[face], ((Renderable) (obj11)), key, var2, config, var1,
					((Renderable) (obj12)), mean, anIntArray152[i3], var0);
			if (definition.modelClipped) {
				if (face == 0) {
					anIntArrayArrayArray135[var0][var1][var2] |= 0x249;
					anIntArrayArrayArray135[var0][var1][var2 + 1] |= 0x492;
				} else if (face == 1) {
					anIntArrayArrayArray135[var0][var1][var2 + 1] |= 0x492;
					anIntArrayArrayArray135[var0][var1 + 1][var2] |= 0x249;
				} else if (face == 2) {
					anIntArrayArrayArray135[var0][var1 + 1][var2] |= 0x249;
					anIntArrayArrayArray135[var0][var1][var2] |= 0x492;
				} else {
					anIntArrayArrayArray135[var0][var1][var2] |= 0x492;
					anIntArrayArrayArray135[var0][var1][var2] |= 0x249;
				}
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method211(var2, face, var1, type, definition.impenetrable);
			}
			if (definition.decorDisplacement != 16) {
				scene.method290(var2, definition.decorDisplacement, var1, var0);
			}
			return;
		}
		if (type == 3) {
			Object obj5;
			if (definition.animation == -1 && definition.transforms == null) {
				obj5 = definition.getEntity(3, face, heights, vertexX, mean, vertexY);
			} else {
				obj5 = new SceneObject(objectId, face, 3, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallObject(anIntArray140[face], ((Renderable) (obj5)), key, var2, config, var1, null, mean,
					0, var0);
			if (definition.clipped) {
				if (face == 0) {
					shading[var0][var1][var2 + 1] = 50;
				} else if (face == 1) {
					shading[var0][var1 + 1][var2 + 1] = 50;
				} else if (face == 2) {
					shading[var0][var1 + 1][var2] = 50;
				} else {
					shading[var0][var1][var2] = 50;
				}
			}
			if (definition.solid == 1 && class11 != null) {
				class11.method211(var2, face, var1, type, definition.impenetrable);
			}
			return;
		}
		if (type == 9) {
			Object obj6;
			if (definition.animation == -1 && definition.transforms == null) {
				obj6 = definition.getEntity(type, face, heights, vertexX, mean, vertexY);
			} else {
				obj6 = new SceneObject(objectId, face, type, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addTiledObject(key, config, mean, 1, ((Renderable) (obj6)), 1, var0, 0, var2, var1);
			if (definition.solid == 1 && class11 != null) {
				class11.method212(definition.impenetrable, definition.sizeX, definition.sizeY,
						var1, var2, face);
			}
			return;
		}

		if (type == 4) {
			Object obj7;
			if (definition.animation == -1 && definition.transforms == null) {
				obj7 = definition.getEntity(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj7 = new SceneObject(objectId, 0, 4, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallDecoration(key, var2, face * 512, var0, 0, mean, ((Renderable) (obj7)), var1, config, 0,
					anIntArray152[face]);
			return;
		}
		if (type == 5) {
			int i4 = 16;
			long k4 = scene.getWallObjectUid(var0, var1, var2);
			if (k4 > 0) {
				i4 = ObjectDefinition.lookup(ObjectKeyUtil.getObjectId(k4)).decorDisplacement;
			}
			Object obj13;
			if (definition.animation == -1 && definition.transforms == null) {
				obj13 = definition.getEntity(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj13 = new SceneObject(objectId, 0, 4, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallDecoration(key, var2, face * 512, var0, COSINE_VERTICES[face] * i4, mean,
					((Renderable) (obj13)), var1, config, SINE_VERTICIES[face] * i4, anIntArray152[face]);
			return;
		}
		if (type == 6) {
			Object obj8;
			if (definition.animation == -1 && definition.transforms == null) {
				obj8 = definition.getEntity(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj8 = new SceneObject(objectId, 0, 4, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallDecoration(key, var2, face, var0, 0, mean, ((Renderable) (obj8)), var1, config, 0, 256);
			return;
		}
		if (type == 7) {
			Object obj9;
			if (definition.animation == -1 && definition.transforms == null) {
				obj9 = definition.getEntity(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj9 = new SceneObject(objectId, 0, 4, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallDecoration(key, var2, face, var0, 0, mean, ((Renderable) (obj9)), var1, config, 0, 512);
			return;
		}
		if (type == 8) {
			Object obj10;
			if (definition.animation == -1 && definition.transforms == null) {
				obj10 = definition.getEntity(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj10 = new SceneObject(objectId, 0, 4, var0, var1, var2, definition.animation, definition.randomAnimStart);
			}
			scene.addWallDecoration(key, var2, face, var0, 0, mean, ((Renderable) (obj10)), var1, config, 0, 768);
		}
	}

	private static int interpolatedNoise(int x, int y, int frequencyReciprocal) {
		int l = x / frequencyReciprocal;
		int i1 = x & frequencyReciprocal - 1;
		int j1 = y / frequencyReciprocal;
		int k1 = y & frequencyReciprocal - 1;
		int l1 = smoothNoise(l, j1);
		int i2 = smoothNoise(l + 1, j1);
		int j2 = smoothNoise(l, j1 + 1);
		int k2 = smoothNoise(l + 1, j1 + 1);
		int l2 = interpolate(l1, i2, i1, frequencyReciprocal);
		int i3 = interpolate(j2, k2, i1, frequencyReciprocal);
		return interpolate(l2, i3, k1, frequencyReciprocal);
	}

	/**
	 * Encodes the hue, saturation, and luminance into a colour value.
	 *
	 * @param hue The hue.
	 * @param saturation The saturation.
	 * @param luminance The luminance.
	 * @return The colour.
	 */
	private int encode(int hue, int saturation, int luminance) {
		if (luminance > 179)
			saturation /= 2;
		if (luminance > 192)
			saturation /= 2;
		if (luminance > 217)
			saturation /= 2;
		if (luminance > 243)
			saturation /= 2;
		return (hue / 4 << 10) + (saturation / 32 << 7) + luminance / 2;
	}

	public static boolean modelReady(int i, int j) {
		ObjectDefinition class46 = ObjectDefinition.lookup(i);
		if (j == 11)
			j = 10;
		if (j >= 5 && j <= 8)
			j = 4;
		return class46.modelTypeCached(j);
	}

	public final void loadMapChunk(int i, int j, CollisionMap clips[], int l, int i1, byte abyte0[], int j1, int k1, int l1) {
		for (int i2 = 0; i2 < 8; i2++) { //Add clipping
			for (int j2 = 0; j2 < 8; j2++)
				if (l + i2 > 0 && l + i2 < 103 && l1 + j2 > 0 && l1 + j2 < 103)
					clips[k1].clipData[l + i2][l1 + j2] &= 0xfeffffff;

		}

		Buffer stream = new Buffer(abyte0);
		for (int l2 = 0; l2 < 4; l2++) {
			for (int i3 = 0; i3 < 64; i3++) {
				for (int j3 = 0; j3 < 64; j3++)
					if (l2 == i && i3 >= i1 && i3 < i1 + 8 && j3 >= j1 && j3 < j1 + 8)
						loadTile(l1 + ChunkUtil.getRotatedMapChunkY(j3 & 7, j, i3 & 7), 0, stream, l + ChunkUtil.getRotatedMapChunkX(j, j3 & 7, i3 & 7), k1, j, 0);
					else
						loadTile(-1, 0, stream, -1, 0, 0, 0);

			}

		}

	}

	public final void method180(byte abyte0[], int i, int j, int k, int l, CollisionMap aclass11[]) {
		for (int i1 = 0; i1 < 4; i1++) {
			for (int j1 = 0; j1 < 64; j1++) {
				for (int k1 = 0; k1 < 64; k1++)
					if (j + j1 > 0 && j + j1 < 103 && i + k1 > 0 && i + k1 < 103)
						aclass11[i1].clipData[j + j1][i + k1] &= 0xfeffffff;
			}

		}

		Buffer stream = new Buffer(abyte0);
		for (int l1 = 0; l1 < 4; l1++) {
			for (int i2 = 0; i2 < 64; i2++) {
				for (int j2 = 0; j2 < 64; j2++)
					loadTile(j2 + i, l, stream, i2 + j, l1, 0, k);

			}

		}
	}

	private void loadTile(int x, int y, Buffer buffer, int z, int level, int overlayRotation, int seed) {
		if (level >= 0 && level < 4 && z >= 0 && z < 104 && x >= 0 && x < 104) {
			tileFlags[level][z][x] = 0;
			while(true) {
				int opcode = buffer.readUShort();
				if (opcode == 0) {
					if (level == 0) {
						tileHeights[0][z][x] = -calculateVertexHeight(0xe3b7b + z + seed, 0x87cce + x + y) * 8;
					} else {
						tileHeights[level][z][x] = tileHeights[level - 1][z][x] - 240;
					}
					break;
				}

				if (opcode == 1) {
					int height = buffer.readUnsignedByte();
					if (height == 1) {
						height = 0;
					}

					if (level == 0) {
						tileHeights[0][z][x] = -height * 8;
					} else {
						tileHeights[level][z][x] = tileHeights[level - 1][z][x] - height * 8;
					}
					break;
				}

				if (opcode <= 49) {
					overlays[level][z][x] = (short)buffer.readShort();
					overlayTypes[level][z][x] = (byte)((opcode - 2) / 4);
					overlayOrientations[level][z][x] = (byte)(opcode - 2 + overlayRotation & 3);
				} else if (opcode <= 81) {
					tileFlags[level][z][x] = (byte)(opcode - 49);
				} else {
					underlays[level][z][x] = (short)(opcode - 81);
				}
			}
		} else {
			while (true) {
				int opcode = buffer.readUShort();
				if (opcode == 0) {
					break;
				} else if (opcode == 1) {
					buffer.readUnsignedByte();
					break;
				} else if (opcode <= 49) {
					buffer.readShort();
				}
			}
		}
	}
	/**
	 * Returns the plane that actually contains the collision flag, to adjust for objects such as bridges. TODO better
	 * name
	 *
	 * @param x The x coordinate.
	 * @param y The y coordinate.
	 * @param z The z coordinate.
	 * @return The correct z coordinate.
	 */
	private int getCollisionPlane(int y, int z, int x) {
		if ((tileFlags[z][x][y] & FORCE_LOWEST_PLANE) != 0) {
			return 0;
		}
		if (z > 0 && (tileFlags[1][x][y] & BRIDGE_TILE) != 0) {
			return z - 1;
		} else {
			return z;
		}
	}

	public final void readObjectMap(CollisionMap aclass11[], SceneGraph worldController, int i, int j, int k, int l, byte abyte0[], int i1, int j1, int k1) {
		label0: {
			Buffer stream = new Buffer(abyte0);
			int l1 = -1;
			do {
				int i2 = stream.readUSmart2();
				if (i2 == 0)
					break label0;
				l1 += i2;
				int j2 = 0;
				do {
					int k2 = stream.readUSmart2();
					if (k2 == 0)
						break;
					j2 += k2 - 1;
					int l2 = j2 & 0x3f;
					int i3 = j2 >> 6 & 0x3f;
					int j3 = j2 >> 12;
					int k3 = stream.readUnsignedByte();
					int l3 = k3 >> 2;
					int i4 = k3 & 3;
					if (j3 == i && i3 >= i1 && i3 < i1 + 8 && l2 >= k && l2 < k + 8) {
						ObjectDefinition class46 = ObjectDefinition.lookup(l1);
						int j4 = j + ChunkUtil.method157(j1, class46.sizeY, i3 & 7, l2 & 7, class46.sizeX);
						int k4 = k1 + ChunkUtil.method158(l2 & 7, class46.sizeY, j1, class46.sizeX, i3 & 7);
						if (j4 > 0 && k4 > 0 && j4 < 103 && k4 < 103) {
							int l4 = j3;
							if ((tileFlags[1][j4][k4] & 2) == 2)
								l4--;
							CollisionMap class11 = null;
							if (l4 >= 0)
								class11 = aclass11[l4];
							renderObject(k4, worldController, class11, l3, l, j4, l1, i4 + j1 & 3);
						}
					}
				} while (true);
			} while (true);
		}
	}

	private static int interpolate(int a, int b, int angle, int frequencyReciprocal) {
		int cosine = 0x10000 - Rasterizer3D.COSINE[(angle * 1024) / frequencyReciprocal] >> 1;
		return (a * (0x10000 - cosine) >> 16) + (b * cosine >> 16);
	}



	private int checkedLight(int color, int light) {
		if (color == -2) {
			return 12345678;
		} else if (color == -1) {
			if (SceneGraph.lowMem) {
				if (light < 0)
					light = 0;
				else if (light > 127)
					light = 127;
				light = 127 - light;
				return light;
			} else {
				if (light < 2) {
					light = 2;
				} else if (light > 126) {
					light = 126;
				}

				return light;
			}
		} else {
			light = (color & 0x7F) * light / 128;
			if (light < 2) {
				light = 2;
			} else if (light > 126) {
				light = 126;
			}

			return (color & 0xFF80) + light;
		}
	}

	private static int method187(int hslBitmap, int lightIntensity) {
		if (hslBitmap == -1) {
			return 12345678;
		} else {
			lightIntensity = (hslBitmap & 0x7F) * lightIntensity / 128;
			if (lightIntensity < 2) {
				lightIntensity = 2;
			} else if (lightIntensity > 126) {
				lightIntensity = 126;
			}

			return (hslBitmap & 0xFF80) + lightIntensity;
		}
	}

	private static int smoothNoise(int x, int y) {
		int corners = calculateNoise(x - 1, y - 1) + calculateNoise(x + 1, y - 1) + calculateNoise(x - 1, y + 1) + calculateNoise(x + 1, y + 1);
		int sides = calculateNoise(x - 1, y) + calculateNoise(x + 1, y) + calculateNoise(x, y - 1) + calculateNoise(x, y + 1);
		int center = calculateNoise(x, y);
		return corners / 16 + sides / 8 + center / 4;
	}

	public static void placeObject(SceneGraph sceneGraph, int face, int y, int type, int l,
								   CollisionMap collisionMap, int[][][] groundArray, int x, int objectId, int z) {
		ObjectDefinition definition = ObjectDefinition.lookup(objectId);
		int center;
		int east;
		int northEast;
		int north;
		int objectSizeY;
		int objectSizeX;
		if (face != 1 && face != 3) {
			objectSizeX = definition.sizeX;
			objectSizeY = definition.sizeY;
		} else {
			objectSizeX = definition.sizeY;
			objectSizeY = definition.sizeX;
		}

		int editX;
		int editX2;
		if (x + objectSizeX <= 104) {
			editX = x + (objectSizeX >> 1);
			editX2 = x + (1 + objectSizeX >> 1);
		} else {
			editX = x;
			editX2 = 1 + x;
		}

		int editY;
		int editY2;
		if (objectSizeY + y <= 104) {
			editY = (objectSizeY >> 1) + y;
			editY2 = y + (1 + objectSizeY >> 1);
		} else {
			editY = y;
			editY2 = 1 + y;
		}
		center = groundArray[l][editX][editY];
		east = groundArray[l][editX2][editY];
		northEast = groundArray[l][editX2][editY2];
		north = groundArray[l][editX][editY2];

		int[][] heights = groundArray[l];
		int mean = center + east + northEast + north >> 2;
		int vertexX = (x << 7) + (objectSizeX << 6);
		int vertexY = (y << 7) + (objectSizeY << 6);

		long key = (long) ((long) face << 20 | (long) type << 14 | ((long) y << 7 | x) + 0x40000000);
		if (definition.interactive == 0)
			key |= ~0x7fffffffffffffffL;

		if(definition.supportItems == 1) {
			key |= 0x400000L;
		}

		key |= (long) objectId << 32;
		byte byte1 = (byte) ((face << 6) + type);
		if (definition.hasSound()) {
			System.out.println(definition.getId() + " has sound");
			System.out.println("Local player x/y = " + Client.localPlayer.x + "/" + Client.localPlayer.y);
			System.out.println("Object x/y/z=" + x + "/" + y + "/" + z);
			ObjectSound.addObjectSounds(z, x, y, definition, face);
		}
		if (type == 22) {
			Object obj;
			if (definition.animation == -1 && definition.transforms == null) {
				obj = definition.getModel(22, face, heights, vertexX, mean, vertexY);
			} else {
				obj = new SceneObject(objectId, face, 22, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addGroundDecoration(z, mean, y, ((Renderable) (obj)), byte1, key, x);
			if (definition.solid == 1 && definition.interactive != 0) {
				collisionMap.block(x, y);
			}
			return;
		}
		if (type == 10 || type == 11) {
			Object obj1;
			if (definition.animation == -1 && definition.transforms == null) {
				obj1 = definition.getModel(10, face, heights, vertexX, mean, vertexY);
			} else {
				obj1 = new SceneObject(objectId, face, 10, l, x, y, definition.animation, definition.randomAnimStart);
			}
			if (obj1 != null) {
				int j5 = 0;
				if (type == 11) {
					j5 += 256;
				}
				int k4;
				int i5;
				if (face == 1 || face == 3) {
					k4 = definition.sizeY;
					i5 = definition.sizeX;
				} else {
					k4 = definition.sizeX;
					i5 = definition.sizeY;
				}
				sceneGraph.addTiledObject(key, byte1, mean, i5, ((Renderable) (obj1)), k4, z, j5, y, x);
			}
			if (definition.solid == 1) {
				collisionMap.method212(definition.impenetrable, definition.sizeX, definition.sizeY, x, y, face);
			}
			return;
		}
		if (type >= 12) {
			Object obj2;
			if (definition.animation == -1 && definition.transforms == null) {
				obj2 = definition.getModel(type, face, heights, vertexX, mean, vertexY);
			} else {
				obj2 =  new SceneObject(objectId, face, type, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addTiledObject(key, byte1, mean, 1, ((Renderable) (obj2)), 1, z, 0, y, x);
			if (definition.solid == 1) {
				collisionMap.method212(definition.impenetrable, definition.sizeX, definition.sizeY, x, y, face);
			}
			return;
		}
		if (type == 0) {
			Object obj3;
			if (definition.animation == -1 && definition.transforms == null) {
				obj3 = definition.getModel(0, face, heights, vertexX, mean, vertexY);
			} else {
				obj3 = new SceneObject(objectId, face, 0, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallObject(anIntArray152[face], ((Renderable) (obj3)), key, y, byte1, x, null,
					mean, 0, z);
			if (definition.solid == 1) {
				collisionMap.method211(y, face, x, type, definition.impenetrable);
			}
			return;
		}
		if (type == 1) {
			Object obj4;
			if (definition.animation == -1 && definition.transforms == null) {
				obj4 = definition.getModel(1, face, heights, vertexX, mean, vertexY);
			} else {
				obj4 = new SceneObject(objectId, face, 1, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallObject(anIntArray140[face], ((Renderable) (obj4)), key, y, byte1, x, null,
					mean, 0, z);
			if (definition.solid == 1) {
				collisionMap.method211(y, face, x, type, definition.impenetrable);
			}
			return;
		}
		if (type == 2) {
			int objectFace = face + 1 & 3;
			Object obj11;
			Object obj12;
			if (definition.animation == -1 && definition.transforms == null) {
				obj11 = definition.getModel(2, 4 + face, heights, vertexX, mean, vertexY);
				obj12 = definition.getModel(2, face, heights, vertexX, mean, vertexY);
			} else {
				obj11 =  new SceneObject(objectId, 4 + face, 2, l, x, y, definition.animation, definition.randomAnimStart);
				obj12 = new SceneObject(objectId, objectFace, 2, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallObject(anIntArray152[face], ((Renderable) (obj11)), key, y, byte1, x,
					((Renderable) (obj12)), mean, anIntArray152[objectFace], z);
			if (definition.solid == 1) {
				collisionMap.method211(y, face, x, type, definition.impenetrable);
			}
			return;
		}
		if (type == 3) {
			Object obj5;
			if (definition.animation == -1 && definition.transforms == null) {
				obj5 = definition.getModel(3, face, heights, vertexX, mean, vertexY);
			} else {
				obj5 =  new SceneObject(objectId, face, 3, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallObject(anIntArray140[face], ((Renderable) (obj5)), key, y, byte1, x, null,
					mean, 0, z);
			if (definition.solid == 1) {
				collisionMap.method211(y, face, x, type, definition.impenetrable);
			}
			return;
		}
		if (type == 9) {
			Object obj6;
			if (definition.animation == -1 && definition.transforms == null) {
				obj6 = definition.getModel(type, face, heights, vertexX, mean, vertexY);
			} else {
				obj6 = new SceneObject(objectId, face, type, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addTiledObject(key, byte1, mean, 1, ((Renderable) (obj6)), 1, z, 0, y, x);
			if (definition.solid == 1) {
				collisionMap.method212(definition.impenetrable, definition.sizeX, definition.sizeY, x, y, face);
			}
			return;
		}

		if (type == 4) {
			Object obj7;
			if (definition.animation == -1 && definition.transforms == null) {
				obj7 = definition.getModel(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj7 = new SceneObject(objectId, 0, 4, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallDecoration(key, y, face * 512, z, 0, mean, ((Renderable) (obj7)), x, byte1,
					0, anIntArray152[face]);
			return;
		}
		if (type == 5) {
			int j4 = 16;
			long l4 = sceneGraph.getWallObjectUid(z, x, y);
			if (l4 > 0) {
				j4 = ObjectDefinition.lookup(ObjectKeyUtil.getObjectId(l4)).decorDisplacement;
			}
			Object obj13;
			if (definition.animation == -1 && definition.transforms == null) {
				obj13 = definition.getModel(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj13 = new SceneObject(objectId, 0, 4, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallDecoration(key, y, face * 512, z, COSINE_VERTICES[face] * j4, mean,
					((Renderable) (obj13)), x, byte1, SINE_VERTICIES[face] * j4, anIntArray152[face]);
			return;
		}
		if (type == 6) {
			Object obj8;
			if (definition.animation == -1 && definition.transforms == null) {
				obj8 = definition.getModel(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj8 =  new SceneObject(objectId, 0, 4, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallDecoration(key, y, face, z, 0, mean, ((Renderable) (obj8)), x, byte1, 0,
					256);
			return;
		}
		if (type == 7) {
			Object obj9;
			if (definition.animation == -1 && definition.transforms == null) {
				obj9 = definition.getModel(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj9 = new SceneObject(objectId, 0, 4, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallDecoration(key, y, face, z, 0, mean, ((Renderable) (obj9)), x, byte1, 0,
					512);
			return;
		}
		if (type == 8) {
			Object obj10;
			if (definition.animation == -1 && definition.transforms == null) {
				obj10 = definition.getModel(4, 0, heights, vertexX, mean, vertexY);
			} else {
				obj10 =  new SceneObject(objectId, 0, 4, l, x, y, definition.animation, definition.randomAnimStart);
			}
			sceneGraph.addWallDecoration(key, y, face, z, 0, mean, ((Renderable) (obj10)), x, byte1, 0,
					768);
		}
	}

	public static void requestModelPreload(byte[] is) {
		label0: {
			Buffer stream = new Buffer(is);
			int l = -1;
			do {
				int i1 = stream.readUSmart();
				if (i1 == 0)
					break label0;
				l += i1;
				int j1 = 0;
				do {
					int k1 = stream.readUSmart();
					if (k1 == 0)
						break;
					j1 += k1 - 1;
					int j2 = j1 >> 12;
					int k2 = stream.readUnsignedByte();
					ObjectDefinition class46 = ObjectDefinition.lookup(l);
					class46.modelCached();


				} while (true);
			} while (true);
		}
	}

	public static boolean method787(byte[] var0, int var1, int var2) {
		boolean var3 = true;
		Buffer var4 = new Buffer(var0);
		int var5 = -1;

		label57:
		while (true) {
			int var6 = var4.readUnsignedIntSmartShortCompat();
			if (var6 == 0) {
				return var3;
			}

			var5 += var6;
			int var7 = 0;
			boolean var8 = false;

			while (true) {
				int var9;
				while (!var8) {
					var9 = var4.readUSmart();
					if (var9 == 0) {
						continue label57;
					}

					var7 += var9 - 1;
					int var10 = var7 & 63;
					int var11 = var7 >> 6 & 63;
					int var12 = var4.readUnsignedByte() >> 2;
					int var13 = var11 + var1;
					int var14 = var10 + var2;
					if (var13 > 0 && var14 > 0 && var13 < 103 && var14 < 103) {
						ObjectDefinition def = ObjectDefinition.lookup(var5);
//						System.out.println("LOOKUP");
						if (var12 != 22 || !lowMem || def.interactive != 0 || def.obstructive) {
							if (!def.needsModelFiles()) {
								++Client.objectsLoaded;
								var3 = false;
							}

							var8 = true;
						}
					}
				}

				var9 = var4.get_unsignedsmart_byteorshort();
				if (var9 == 0) {
					break;
				}

				var4.readUnsignedByte();
			}
		}
	}


	public static int method5908(int var0, int var1, int var2, int var3, int var4, int var5) {
		if ((var5 & 1) == 1) {
			int var6 = var3;
			var3 = var4;
			var4 = var6;
		}

		var2 &= 3;
		if (var2 == 0) {
			return var1;
		} else if (var2 == 1) {
			return 7 - var0 - (var3 - 1);
		} else {
			return var2 == 2 ? 7 - var1 - (var4 - 1) : var0;
		}
	}


	 public void method2260(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, SceneGraph var8, CollisionMap[] var9) {
		Buffer var10 = new Buffer(var0);
		int var11 = -1;

		while (true) {
			int var12 = var10.readIncrSmallSmart();
			if (var12 == 0) {
				return;
			}

			var11 += var12;
			int var13 = 0;

			while (true) {
				int var14 = var10.readUShortSmart1();
				if (var14 == 0) {
					break;
				}

				var13 += var14 - 1;
				int var15 = var13 & 63;
				int var16 = var13 >> 6 & 63;
				int var17 = var13 >> 12;
				int var18 = var10.readUnsignedByte();
				int var19 = var18 >> 2;
				int var20 = var18 & 3;
				if (var17 == var4 && var16 >= var5 && var16 < var5 + 8 && var15 >= var6 && var15 < var6 + 8) {
					ObjectDefinition var21 = ObjectDefinition.lookup(var11);
					System.out.println("Found chunk object [" + var11 + "] = " + var21.name);
					int var24 = var16 & 7;
					int var25 = var15 & 7;
					int var27 = var21.sizeX;
					int var28 = var21.sizeY;
					int var29;
					if ((var20 & 1) == 1) {
						var29 = var27;
						var27 = var28;
						var28 = var29;
					}

					int var26 = var7 & 3;
					int var23;
					if (var26 == 0) {
						var23 = var24;
					} else if (var26 == 1) {
						var23 = var25;
					} else if (var26 == 2) {
						var23 = 7 - var24 - (var27 - 1);
					} else {
						var23 = 7 - var25 - (var28 - 1);
					}

					var29 = var23 + var2;
					int var30 = var3 + method5908(var16 & 7, var15 & 7, var7, var21.sizeX, var21.sizeY, var20);
					if (var29 > 0 && var30 > 0 && var29 < 103 && var30 < 103) {
						int var31 = var1;
						if ((tileFlags[1][var29][var30] & 2) == 2) {
							var31 = var1 - 1;
						}

						CollisionMap var32 = null;
						if (var31 >= 0) {
							var32 = var9[var31];
						}

						addObjects(var1, var29, var30, var11, var20 + var7 & 3, var19, var8, var32);
					}
				}
			}
		}
	}

	public final void addObjects(int var0, int var1, int var2, int var3, int var4, int var5, SceneGraph var6, CollisionMap var7) {
		renderObject(var2,var6,var7,var5,var0,var1,var3,var4);
	}


	public final void loadObjectsInScene(int i, CollisionMap aclass11[], int j, SceneGraph scene, byte abyte0[]) {
		label0: {
			Buffer stream = new Buffer(abyte0);
			int l = -1;
			do {
				int i1 = stream.readUnsignedIntSmartShortCompat();
				if (i1 == 0)
					break label0;
				l += i1;
				int j1 = 0;
				do {
					int k1 = stream.readUSmart();
					if (k1 == 0)
						break;
					j1 += k1 - 1;
					int l1 = j1 & 0x3f;
					int i2 = j1 >> 6 & 0x3f;
					int z = j1 >> 12;
					int k2 = stream.readUnsignedByte();
					int type = k2 >> 2;
					int rotation = k2 & 3;
					int x = i2 + i;
					int y = l1 + j;
					if (x > 0 && y > 0 && x < 103 && y < 103 && z >= 0 && z < 4) {
						int l3 = z;
						if ((tileFlags[1][x][y] & 2) == 2)
							l3--;
						CollisionMap collisionMap = null;
						if (l3 >= 0)
							collisionMap = aclass11[l3];


						renderObject(y, scene, collisionMap, type, z, x, l, rotation);
					}
				} while (true);
			} while (true);
		}
	}



}