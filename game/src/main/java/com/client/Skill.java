package com.client;

public enum Skill {
	ATTACK(0),
	DEFENCE(1),
	STRENGTH(2),
	HITPOINTS(3),
	RANGED(4),
	PRAYER(5),
	MAGIC(6),
	COOKING(7),
	WOODCUTTING(8),
	FLETCHING(9),
	FISHING(10),
	FIREMAKING(11),
	CRAFTING(12),
	SMITHING(13),
	MINING(14),
	HERBLORE(15),
	AGILITY(16),
	THIEVING(17),
	SLAYER(18),
	FARMING(19),
	RUNECRAFTING(20),
	HUNTER(21),
	DEMON_HUNTER(22),
	FORTUNE(23);

	private int id;

	private Skill(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public static int getIconId(Skill skill) {
		switch (skill) {
			case ATTACK:
				return 134;
			case STRENGTH:
				return 135;
			case DEFENCE:
				return 136;
			case RANGED:
				return 137;
			case PRAYER:
				return 138;
			case MAGIC:
				return 139;
			case RUNECRAFTING:
				return 140;
			case HITPOINTS:
				return 141;
			case AGILITY:
				return 142;
			case HERBLORE:
				return 143;
			case THIEVING:
				return 144;
			case CRAFTING:
				return 145;
			case FLETCHING:
				return 146;
			case MINING:
				return 147;
			case SMITHING:
				return 148;
			case FISHING:
				return 14;
			case COOKING:
				return 150;
			case FIREMAKING:
				return 151;
			case WOODCUTTING:
				return 152;
			case SLAYER:
				return 153;
			case FARMING:
				return 154;
			case HUNTER:
				return 155;
			case DEMON_HUNTER:
				return 156;
			case FORTUNE:
				return 157;
			default:
				return -1;
		}
	}

	public static final int MAXIMUM_SKILL_ID = 21;
}
