package com.client.audio;

import com.client.Node;
import net.runelite.rs.api.RSPcmStreamMixerListener;

public abstract class PcmStreamMixerListener extends Node implements RSPcmStreamMixerListener {
	int field395;
	abstract void remove2();
	
	abstract int update();
}
