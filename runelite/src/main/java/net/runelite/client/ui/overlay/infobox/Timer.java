/*
 * Copyright (c) 2017, Adam <Adam@sigterm.info>
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
package net.runelite.client.ui.overlay.infobox;

import com.google.common.base.Preconditions;
import lombok.Getter;
import lombok.ToString;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.time.Duration;
import net.runelite.client.plugins.Plugin;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

@Getter
@ToString
public class Timer extends InfoBox
{
	private final Instant startTime;
	private Instant endTime;
	private Duration duration;

	public Timer(long period, ChronoUnit unit, BufferedImage image, Plugin plugin)
	{
		super(image, plugin);

		Preconditions.checkArgument(period > 0, "negative period!");

		startTime = Instant.now();
		duration = Duration.of(period, unit);
		endTime = startTime.plus(duration);
	}

	@Override
	public String getText()
	{
		Duration timeLeft = Duration.between(Instant.now(), endTime);

		int seconds = (int) (timeLeft.toMillis() / 1000L);

		int hours = (seconds / 3600);
		int minutes = (seconds % 3600) / 60;
		int secs = seconds % 60;
		String time = String.format("%d:%02d", minutes, secs);
		if(hours > 0) {
			time = String.format("%d:%d:%02d", hours, minutes, secs);
		}
		return time;
	}

	@Override
	public Color getTextColor()
	{
		Duration timeLeft = Duration.between(Instant.now(), endTime);

		//check if timer has 10% of time left
		if (timeLeft.getSeconds() < (duration.getSeconds() * .10))
		{
			return Color.RED.brighter();
		}

		return Color.WHITE;
	}

	@Override
	public boolean render()
	{
		Duration timeLeft = Duration.between(Instant.now(), endTime);
		return !timeLeft.isNegative();
	}

	@Override
	public boolean cull()
	{
		Duration timeLeft = Duration.between(Instant.now(), endTime);
		return timeLeft.isZero() || timeLeft.isNegative();
	}

	/**
	 * Update the timer duration *relative to the start time*
	 * @param duration
	 */
	public void setDuration(Duration duration)
	{
		Preconditions.checkArgument(!duration.isNegative(), "negative duration");
		this.duration = duration;
		endTime = startTime.plus(duration);
	}

	/**
	 * Update the timer duration relative to now
	 * @param duration
	 */
	public void updateDuration(Duration duration)
	{
		Preconditions.checkArgument(!duration.isNegative(), "negative duration");
		endTime = Instant.now().plus(duration);
		this.duration = Duration.between(startTime, endTime);
	}
	public void addDuration(Duration duration)
	{
		Preconditions.checkArgument(!duration.isNegative(), "negative duration");
		endTime = endTime.plus(duration);
		this.duration = Duration.between(startTime, endTime);
	}
}
