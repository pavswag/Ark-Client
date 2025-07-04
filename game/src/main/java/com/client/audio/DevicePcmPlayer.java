package com.client.audio;


import com.client.util.Equations;
import net.runelite.rs.api.RSDevicePcmPlayer;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine.Info;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
public class DevicePcmPlayer extends PcmPlayer implements RSDevicePcmPlayer {
	AudioFormat format;
	SourceDataLine line;
	
	int capacity2;
	byte[] byteSamples;
	DevicePcmPlayer() {
	} // L: 18
	
	public void init() {
		this.format = new AudioFormat((float) StaticSound.sample_rate, 16, StaticSound.PcmPlayer_stereo ? 2 : 1, true, false); // L:
																																	// 22
		this.byteSamples = new byte[256 << (StaticSound.PcmPlayer_stereo ? 2 : 1)]; // L:
																							// 23
	} // L: 24
	
	public void open(int var1) throws LineUnavailableException {
		try {
			Info var2 = new Info(SourceDataLine.class, this.format, var1 << (StaticSound.PcmPlayer_stereo ? 2 : 1)); // L:// 29
			this.line = (SourceDataLine) AudioSystem.getLine(var2); // L: 30
			this.line.open(); // L: 31
			this.line.start(); // L: 32
			this.capacity2 = var1; // L: 33
		} catch (LineUnavailableException var3) { // L: 35
			if (Equations.numberOfBits(var1) != 1) { // L: 36
				this.open(Equations.farthestBitValue(var1)); // L: 37
			} else {
				this.line = null; // L: 40
				throw var3; // L: 41
			}
		}
	} // L: 38 43
	
	protected int position() {
		return this.capacity2 - (this.line.available() >> (StaticSound.PcmPlayer_stereo ? 2 : 1)); // L:
																											// 47
	}
	protected void write() {
		int var1 = 256; // L: 53
		if (StaticSound.PcmPlayer_stereo) { // L: 54
			var1 <<= 1;
		}
		for (int var2 = 0; var2 < var1; ++var2) { // L: 55
			int var3 = super.samples[var2]; // L: 56
			if ((var3 + 8388608 & -16777216) != 0) { // L: 57
				var3 = 8388607 ^ var3 >> 31; // L: 58
			}
			this.byteSamples[var2 * 2] = (byte) (var3 >> 8); // L: 60
			this.byteSamples[var2 * 2 + 1] = (byte) (var3 >> 16); // L: 61
		}
		this.line.write(this.byteSamples, 0, var1 << 1); // L: 63
	} // L: 64
	
	protected void close() {
		if (this.line != null) { // L: 68
			this.line.close(); // L: 69
			this.line = null; // L: 70
		}
	} // L: 72
	
	protected void discard() {
		this.line.flush(); // L: 76
	} // L: 77
}
