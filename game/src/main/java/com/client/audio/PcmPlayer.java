package com.client.audio;


import com.client.util.Equations;
import net.runelite.rs.api.RSPcmPlayer;

import java.util.concurrent.ScheduledExecutorService;
public class PcmPlayer implements RSPcmPlayer {
	
	public static ScheduledExecutorService soundSystemExecutor;
	
	public static SoundSystem soundSystem;
	
	public int[] samples;
	
	PcmStream stream;
	
	int field274;
	
	long timeMs;
	
	public int capacity;
	
	public int field282;
	
	int field283;
	
	long field284;
	
	int field285;
	
	int field286;
	
	int field296;
	
	long field288;
	boolean field293;
	
	int field291;
	
	PcmStream[] field289;
	
	PcmStream[] field292;
	public PcmPlayer() {
		this.field274 = 32;
		this.timeMs = Equations.getCurrentTime();
		this.field284 = 0L;
		this.field285 = 0;
		this.field286 = 0;
		this.field296 = 0;
		this.field288 = 0L;
		this.field293 = true;
		this.field291 = 0;
		this.field289 = new PcmStream[8];
		this.field292 = new PcmStream[8];
	}
	
	public void init() throws Exception {
	} // L: 284
	
	public void open(int var1) throws Exception {
	} // L: 285
	
	protected int position() throws Exception {
		return this.capacity; // L: 288
	}
	protected void write() throws Exception {
	} // L: 291
	
	protected void close() {
	} // L: 292
	
	protected void discard() throws Exception {
	} // L: 293
	
	public final synchronized void setStream(PcmStream var1) {
		this.stream = var1; // L: 83
	} // L: 84
	
	public final synchronized void run() {
		if (this.samples != null) { // L: 87
			long var1 = Equations.getCurrentTime(); // L: 88
			try {
				if (this.field284 != 0L) { // L: 90
					if (var1 < this.field284) { // L: 91
						return;
					}
					this.open(this.capacity); // L: 92
					this.field284 = 0L; // L: 93
					this.field293 = true; // L: 94
				}
				int var3 = this.position(); // L: 96
				if (this.field296 - var3 > this.field285) { // L: 97
					this.field285 = this.field296 - var3;
				}
				int var4 = this.field283 + this.field282; // L: 98
				if (var4 + 256 > 16384) { // L: 99
					var4 = 16128;
				}
				if (var4 + 256 > this.capacity) { // L: 100
					this.capacity += 1024; // L: 101
					if (this.capacity > 16384) { // L: 102
						this.capacity = 16384;
					}
					this.close(); // L: 103
					this.open(this.capacity); // L: 104
					var3 = 0; // L: 105
					this.field293 = true; // L: 106
					if (var4 + 256 > this.capacity) { // L: 107
						var4 = this.capacity - 256; // L: 108
						this.field283 = var4 - this.field282; // L: 109
					}
				}
				while (var3 < var4) { // L: 112
					this.fill(this.samples, 256); // L: 113
					this.write(); // L: 114
					var3 += 256; // L: 115
				}
				if (var1 > this.field288) { // L: 117
					if (!this.field293) { // L: 118
						if (this.field285 == 0 && this.field286 == 0) { // L:
																		// 119
							this.close(); // L: 120
							this.field284 = var1 + 2000L; // L: 121
							return; // L: 122
						}
						this.field283 = Math.min(this.field286, this.field285); // L:
																				// 124
						this.field286 = this.field285; // L: 125
					} else {
						this.field293 = false; // L: 127
					}
					this.field285 = 0; // L: 128
					this.field288 = var1 + 2000L; // L: 129
				}
				this.field296 = var3; // L: 131
			} catch (Exception var7) { // L: 133
				this.close(); // L: 134
				this.field284 = var1 + 2000L; // L: 135
			}
			try {
				if (var1 > 500000L + this.timeMs) { // L: 138
					var1 = this.timeMs;
				}
				while (var1 > this.timeMs + 5000L) { // L: 139
					this.skip(256); // L: 140
					this.timeMs += (long) (256000 / StaticSound.sample_rate); // L: 141
				}
			} catch (Exception var6) { // L: 144
				this.timeMs = var1; // L: 145
			}
		}
	} // L: 147
	
	public final void method715() {
		this.field293 = true; // L: 150
	} // L: 151
	
	public final synchronized void tryDiscard() {
		this.field293 = true; // L: 154
		try {
			this.discard(); // L: 156
		} catch (Exception var2) { // L: 158
			this.close(); // L: 159
			this.field284 = Equations.getCurrentTime() + 2000L; // L: 160
		}
	} // L: 162
	
	public final synchronized void shutdown() {
		if (soundSystem != null) { // L: 165
			boolean var1 = true; // L: 166
			for (int var2 = 0; var2 < 2; ++var2) { // L: 167
				if (this == soundSystem.players[var2]) {
					soundSystem.players[var2] = null; // L: 168
				}
				if (soundSystem.players[var2] != null) { // L: 169
					var1 = false;
				}
			}
			if (var1) { // L: 171
				soundSystemExecutor.shutdownNow(); // L: 172
				soundSystemExecutor = null; // L: 173
				soundSystem = null; // L: 174
			}
		}
		this.close(); // L: 177
		this.samples = null; // L: 178
	} // L: 179
	
	final void skip(int var1) {
		this.field291 -= var1; // L: 182
		if (this.field291 < 0) {
			this.field291 = 0; // L: 183
		}
		if (this.stream != null) {
			this.stream.skip(var1); // L: 184
		}
	} // L: 185
	final void fill(int[] var1, int var2) {
		int var3 = var2; // L: 189
		if (StaticSound.PcmPlayer_stereo) { // L: 190
			var3 = var2 << 1;
		}
		StaticSound.clearIntArray(var1, 0, var3); // L: 191
		this.field291 -= var2; // L: 192
		if (this.stream != null && this.field291 <= 0) { // L: 193
			this.field291 += StaticSound.sample_rate >> 4; // L: 194
			StaticSound.PcmStream_disable(this.stream); // L: 195
			this.method673(this.stream, this.stream.vmethod948()); // L: 196
			int var4 = 0; // L: 197
			int var5 = 255; // L: 198
			int var6;
			PcmStream var10;
			label108 : for (var6 = 7; var5 != 0; --var6) { // L: 199
				int var7;
				int var8;
				if (var6 < 0) { // L: 202
					var7 = var6 & 3; // L: 203
					var8 = -(var6 >> 2); // L: 204
				} else {
					var7 = var6; // L: 207
					var8 = 0; // L: 208
				}
				for (int var9 = var5 >>> var7 & 286331153; var9 != 0; var9 >>>= 4) { // L:
																						// 210
																						// 212
					if ((var9 & 1) != 0) { // L: 215
						var5 &= ~(1 << var7); // L: 218
						var10 = null; // L: 219
						PcmStream var11 = this.field289[var7]; // L: 220
						label102 : while (true) {
							while (true) {
								if (var11 == null) { // L: 221
									break label102;
								}
								AbstractSound var12 = var11.sound; // L: 222
								if (var12 != null && var12.position > var8) { // L:
																				// 223
									var5 |= 1 << var7; // L: 224
									var10 = var11; // L: 225
									var11 = var11.after; // L: 226
								} else {
									var11.active = true; // L: 229
									int var13 = var11.vmethod5437(); // L: 230
									var4 += var13; // L: 231
									if (var12 != null) {
										var12.position += var13; // L: 232
									}
									if (var4 >= this.field274) { // L: 233
										break label108;
									}
									PcmStream var14 = var11.firstSubStream(); // L:
																				// 234
									if (var14 != null) { // L: 235
										for (int var15 = var11.field346; var14 != null; var14 = var11.nextSubStream()) { // L:
											// 236
											// 237
											// 239
											this.method673(var14, var15 * var14.vmethod948() >> 8); // L:
																									// 238
										}
									}
									PcmStream var18 = var11.after; // L: 242
									var11.after = null; // L: 243
									if (var10 == null) { // L: 244
										this.field289[var7] = var18;
									} else {
										var10.after = var18; // L: 245
									}
									if (var18 == null) { // L: 246
										this.field292[var7] = var10;
									}
									var11 = var18; // L: 247
								}
							}
						}
					}
					var7 += 4; // L: 211
					++var8;
				}
			}
			for (var6 = 0; var6 < 8; ++var6) { // L: 251
				PcmStream var16 = this.field289[var6]; // L: 252
				PcmStream[] var17 = this.field289; // L: 253
				this.field292[var6] = null; // L: 255
				for (var17[var6] = null; var16 != null; var16 = var10) { // L:
																			// 256
																			// 257
																			// 260
					var10 = var16.after; // L: 258
					var16.after = null; // L: 259
				}
			}
		}
		if (this.field291 < 0) { // L: 264
			this.field291 = 0;
		}
		if (this.stream != null) { // L: 265
			this.stream.fill(var1, 0, var2);
		}
		this.timeMs = Equations.getCurrentTime(); // L: 266
	} // L: 267
	
	final void method673(PcmStream var1, int var2) {
		int var3 = var2 >> 5; // L: 276
		PcmStream var4 = this.field292[var3]; // L: 277
		if (var4 == null) { // L: 278
			this.field289[var3] = var1;
		} else {
			var4.after = var1; // L: 279
		}
		this.field292[var3] = var1; // L: 280
		var1.field346 = var2; // L: 281
	} // L: 282
}
