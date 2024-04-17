/*
 * Copyright (c) 2020, Jordan Zomerlei <https://github.com/JZomerlei>
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
package net.runelite.client.plugins.mining;

import com.google.common.collect.ImmutableMap;
import lombok.Getter;
import net.runelite.api.Player;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static net.runelite.api.AnimationID.*;
import static net.runelite.api.ItemID.*;

@Getter
enum Pickaxe {
    BRONZE(BRONZE_PICKAXE, MINING_BRONZE_PICKAXE, MINING_MOTHERLODE_BRONZE),
    IRON(IRON_PICKAXE, MINING_IRON_PICKAXE, MINING_MOTHERLODE_IRON),
    STEEL(STEEL_PICKAXE, MINING_STEEL_PICKAXE, MINING_MOTHERLODE_STEEL),
    BLACK(BLACK_PICKAXE, MINING_BLACK_PICKAXE, MINING_MOTHERLODE_BLACK),
    MITHRIL(MITHRIL_PICKAXE, MINING_MITHRIL_PICKAXE, MINING_MOTHERLODE_MITHRIL),
    ADAMANT(ADAMANT_PICKAXE, MINING_ADAMANT_PICKAXE, MINING_MOTHERLODE_ADAMANT),
    RUNE(RUNE_PICKAXE, MINING_RUNE_PICKAXE, MINING_MOTHERLODE_RUNE),
    GILDED(GILDED_PICKAXE, MINING_GILDED_PICKAXE, MINING_MOTHERLODE_GILDED),
    DRAGON(DRAGON_PICKAXE, MINING_DRAGON_PICKAXE, MINING_MOTHERLODE_DRAGON),
    DRAGON_OR(DRAGON_PICKAXE_OR, MINING_DRAGON_PICKAXE_OR, MINING_MOTHERLODE_DRAGON_OR),
    DRAGON_OR_TRAILBLAZER(DRAGON_PICKAXE_OR_25376, MINING_DRAGON_PICKAXE_OR_TRAILBLAZER, MINING_MOTHERLODE_DRAGON_OR_TRAILBLAZER),
    DRAGON_UPGRADED(DRAGON_PICKAXE_12797, MINING_DRAGON_PICKAXE_UPGRADED, MINING_MOTHERLODE_DRAGON_UPGRADED),
    INFERNAL(INFERNAL_PICKAXE, MINING_INFERNAL_PICKAXE, MINING_MOTHERLODE_INFERNAL),
    THIRDAGE(_3RD_AGE_PICKAXE, MINING_3A_PICKAXE, MINING_MOTHERLODE_3A),
    CRYSTAL(CRYSTAL_PICKAXE, MINING_CRYSTAL_PICKAXE, MINING_MOTHERLODE_CRYSTAL),
    TRAILBLAZER(INFERNAL_PICKAXE_OR, MINING_TRAILBLAZER_PICKAXE, MINING_TRAILBLAZER_PICKAXE_2,
            MINING_TRAILBLAZER_PICKAXE_3, MINING_MOTHERLODE_TRAILBLAZER);

    private final int itemId;
    private final int[] animIds;

    private static final Map<Integer, Pickaxe> PICKAXE_ANIM_IDS;

    static {
        ImmutableMap.Builder<Integer, Pickaxe> builder = new ImmutableMap.Builder<>();

        for (Pickaxe pickaxe : values()) {
            for (int animId : pickaxe.animIds) {
                builder.put(animId, pickaxe);
            }
        }

        PICKAXE_ANIM_IDS = builder.build();
    }

    Pickaxe(int itemId, int... animIds) {
        this.itemId = itemId;
        this.animIds = animIds;
    }

    boolean matchesMiningAnimation(final Player player) {
        return player != null && fromAnimation(player.getAnimation()) == this;
    }

    static Pickaxe fromAnimation(int animId) {
        return PICKAXE_ANIM_IDS.get(animId);
    }

    public static Set<Integer> all() {
        return Arrays.stream(values())
                .map(pickaxe -> pickaxe.itemId)
                .collect(Collectors.toSet());
    }
}
