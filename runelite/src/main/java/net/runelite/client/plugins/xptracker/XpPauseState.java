/*
 * Copyright (c) 2018, Levi <me@levischuck.com>
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
package net.runelite.client.plugins.xptracker;

import net.runelite.api.Skill;

import java.util.EnumMap;
import java.util.Map;

class XpPauseState
{
	// Internal state
	private final Map<Skill, XpPauseStateSingle> skillPauses = new EnumMap<>(Skill.class);
	private boolean cachedIsLoggedIn = false;

	boolean pauseSkill(Skill skill)
	{
		return findPauseState(skill).manualPause();
	}

	boolean unpauseSkill(Skill skill)
	{
		return findPauseState(skill).unpause();
	}

	boolean isPaused(Skill skill)
	{
		return findPauseState(skill).isPaused();
	}

	void tickXp(Skill skill, long currentXp, int pauseAfterMinutes)
	{
		final XpPauseStateSingle state = findPauseState(skill);

		if (state.getXp() != currentXp)
		{
			state.xpChanged(currentXp);
		}
		else if (pauseAfterMinutes > 0)
		{
			final long now = System.currentTimeMillis();
			final int pauseAfterMillis = pauseAfterMinutes * 60 * 1000;
			final long lastChangeMillis = state.getLastChangeMillis();
			// When config.pauseSkillAfter is 0, it is effectively disabled
			if (lastChangeMillis != 0 && (now - lastChangeMillis) >= pauseAfterMillis)
			{
				state.timeout();
			}
		}
	}

	void tickLogout(boolean pauseOnLogout, boolean loggedIn)
	{
		// Deduplicated login and logout calls
		if (!cachedIsLoggedIn && loggedIn)
		{
			cachedIsLoggedIn = true;

			for (Skill skill : Skill.values())
			{
				findPauseState(skill).login();
			}
		}
		else if (cachedIsLoggedIn && !loggedIn)
		{
			cachedIsLoggedIn = false;

			// If configured, then let the pause state know to pause with reason: logout
			if (pauseOnLogout)
			{
				for (Skill skill : Skill.values())
				{
					findPauseState(skill).logout();
				}
			}
		}
	}

	private XpPauseStateSingle findPauseState(Skill skill)
	{
		return skillPauses.computeIfAbsent(skill, XpPauseStateSingle::new);
	}
}
