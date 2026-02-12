/*
 * Copyright (c) 2018, Lotto <https://github.com/devLotto>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 * list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 * this list of conditions and the following disclaimer in the documentation
 * and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 * FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 * CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.DynamicEntityHider;

import net.runelite.client.config.Config;
import net.runelite.client.config.ConfigGroup;
import net.runelite.client.config.ConfigItem;
import net.runelite.client.config.ConfigSection;
import net.runelite.client.config.Range;
import net.runelite.client.config.Units;

@ConfigGroup(DynamicEntityHiderConfig.GROUP)
public interface DynamicEntityHiderConfig extends Config
{
	String GROUP = "entityhider";

	@ConfigSection(
			name = "Players",
			description = "Settings for hiding players",
			position = 0
	)
	String playerSection = "playerSection";

	@ConfigItem(
			position = 1,
			keyName = "hidePlayers",
			name = "Hide others",
			description = "Configures whether or not other players are hidden.",
			section = playerSection
	)
	default boolean hideOthers() { return false; }

	@ConfigItem(
			position = 2,
			keyName = "hidePlayers2D",
			name = "Hide others' 2D",
			description = "Configures whether or not other players' 2D elements are hidden.",
			section = playerSection
	)
	default boolean hideOthers2D() { return false; }

	@ConfigItem(
			position = 3,
			keyName = "hidePartyMembers",
			name = "Hide party members",
			description = "Configures whether or not party members are hidden.",
			section = playerSection
	)
	default boolean hidePartyMembers() { return false; }

	@ConfigItem(
			position = 4,
			keyName = "hideFriends",
			name = "Hide friends",
			description = "Configures whether or not friends are hidden.",
			section = playerSection
	)
	default boolean hideFriends() { return false; }

	@ConfigItem(
			position = 5,
			keyName = "hideClanMates",
			name = "Hide friends chat members",
			description = "Configures whether or not friends chat members are hidden.",
			section = playerSection
	)
	default boolean hideFriendsChatMembers() { return false; }

	@ConfigItem(
			position = 6,
			keyName = "hideClanChatMembers",
			name = "Hide clan chat members",
			description = "Configures whether or not clan chat members are hidden.",
			section = playerSection
	)
	default boolean hideClanChatMembers() { return false; }

	@ConfigItem(
			position = 7,
			keyName = "hideIgnores",
			name = "Hide ignores",
			description = "Configures whether or not ignored players are hidden.",
			section = playerSection
	)
	default boolean hideIgnores() { return false; }

	@ConfigItem(
			position = 8,
			keyName = "hideLocalPlayer",
			name = "Hide local player",
			description = "Configures whether or not the local player is hidden.",
			section = playerSection
	)
	default boolean hideLocalPlayer() { return false; }

	@ConfigItem(
			position = 9,
			keyName = "hideLocalPlayer2D",
			name = "Hide local player 2D",
			description = "Configures whether or not the local player's 2D elements are hidden.",
			section = playerSection
	)
	default boolean hideLocalPlayer2D() { return false; }

	@ConfigSection(
			name = "NPCs",
			description = "Settings for hiding NPCs",
			position = 10
	)
	String npcSection = "npcSection";

	@ConfigItem(
			position = 11,
			keyName = "hideNPCs",
			name = "Hide NPCs",
			description = "Configures whether or not NPCs are hidden.",
			section = npcSection
	)
	default boolean hideNPCs() { return false; }

	@ConfigItem(
			position = 12,
			keyName = "hideNPCs2D",
			name = "Hide NPCs 2D",
			description = "Configures whether or not NPCs 2D elements are hidden.",
			section = npcSection
	)
	default boolean hideNPCs2D() { return false; }

	@ConfigItem(
			position = 13,
			keyName = "hidePets",
			name = "Hide others' pets",
			description = "Configures whether or not other players' pets are hidden.",
			section = npcSection
	)
	default boolean hidePets() { return false; }

	@ConfigItem(
			position = 14,
			keyName = "hideDeadNpcs",
			name = "Hide dead NPCs",
			description = "Hides NPCs when their health reaches 0.",
			section = npcSection
	)
	default boolean hideDeadNpcs() { return false; }

	@ConfigItem(
			position = 15,
			keyName = "hideThralls",
			name = "Hide thralls",
			description = "Configures whether or not thralls are hidden.",
			section = npcSection
	)
	default boolean hideThralls() { return false; }

	@ConfigItem(
			position = 16,
			keyName = "hideRandomEvents",
			name = "Hide others' random events",
			description = "Configures whether or not other players' random events are hidden.",
			section = npcSection
	)
	default boolean hideRandomEvents() { return false; }

	@ConfigSection(
			name = "Global & Interactions",
			description = "Projectiles, boats, and smart hiding logic",
			position = 20
	)
	String globalSection = "globalSection";

	@ConfigItem(
			position = 21,
			keyName = "hideWorldEntities",
			name = "Hide boats",
			description = "Configures whether boats are hidden.",
			section = globalSection
	)
	default boolean hideWorldEntities() { return false; }

	@ConfigItem(
			position = 22,
			keyName = "hideProjectiles",
			name = "Hide projectiles",
			description = "Configures whether or not projectiles are hidden.",
			section = globalSection
	)
	default boolean hideProjectiles() { return false; }

	@ConfigItem(
			position = 23,
			keyName = "hideInteracting",
			name = "Hide interacting",
			description = "Configures whether or not NPCs/players you are interacting with are hidden.",
			section = globalSection
	)
	default boolean hideInteracting() { return false; }

	@Range(min = 0, max = 300)
	@Units(Units.SECONDS)
	@ConfigItem(
			position = 24,
			keyName = "interactionTimeout",
			name = "Interaction memory",
			description = "How long an entity remains visible after the interaction ends.",
			section = globalSection
	)
	default int interactionTimeout() { return 30; }
}