/*
 * Copyright (c) 2018, Adam <Adam@sigterm.info>
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
package net.runelite.client.game;

import java.awt.image.BufferedImage;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import net.runelite.api.Skill;
import net.runelite.client.RuneLiteProperties;
import net.runelite.client.util.ImageUtil;

@Singleton
@Slf4j
public class SkillIconManager
{
	// * 2 to account for the small version of each icon
	private final BufferedImage[] imgCache = new BufferedImage[Skill.values().length * 2];

	public BufferedImage getSkillImage(Skill skill, boolean small)
	{
		int skillIdx = skill.ordinal() + (small ? Skill.values().length : 0);

		if (imgCache[skillIdx] != null)
		{
			return imgCache[skillIdx];
		}

		String skillIconPath = (small ? "/skill_icons_small/" : "/skill_icons/")
			+ skill.getName().toLowerCase() + ".png";
		if (RuneLiteProperties.DEBUG_MODE)log.debug("Loading skill icon from {}", skillIconPath);
		BufferedImage skillImage = ImageUtil.loadImageResource(getClass(), skillIconPath);
		imgCache[skillIdx] = skillImage;

		return skillImage;
	}

	public BufferedImage getSkillImage(Skill skill)
	{
		return getSkillImage(skill, false);
	}

}
