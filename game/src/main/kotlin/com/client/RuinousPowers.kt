package com.client

enum class RuinousPowers(val level: Int, val displayName: String, val effect: String, val drainRate: Double) {
    REJUVENATION(4, "Rejuvenation", "3x Restore rate for Hitpoints", 1.0 / 9),
    ANCIENT_STRENGTH(61, "Ancient Strength", "+20% Attack and Strength", 1.0 / 2),
    ANCIENT_SIGHT(62, "Ancient Sight", "+20% Ranged Attack & Strength", 1.0 / 2),
    ANCIENT_WILL(63, "Ancient Will", "+20% Magic Attack", 1.0 / 2),
    PROTECT_ITEM(65, "Protect Item", "Keep one extra item upon death", 1.0 / 2),
    RUINOUS_GRACE(66, "Ruinous Grace", "Prayer points are drained in place of run energy whilst running", 1.0 / 36),
    DAMPEN_MAGIC(67, "Dampen Magic", "100% protection from magic attacks (40% in PvP), but increases damage taken by 10%", 1.0 / 2.5),
    DAMPEN_RANGED(69, "Dampen Ranged", "100% protection from ranged attacks (40% in PvP), but increases damage taken by 10%", 1.0 / 2.5),
    DAMPEN_MELEE(71, "Dampen Melee", "100% protection from melee attacks (40% in PvP), but increases damage taken by 10%", 1.0 / 2.5),
    TRINITAS(72, "Trinitas", "+15% Melee Attack and Strength, +15% Ranged Attack and Strength, and +15% Magic Attack", 1.0 / 1.63),
    BERSERKER(74, "Berserker", "Boosted combat stats last 50% longer", 1.0 / 18),
    PURGE(75, "Purge", "Reduces the player's and opponent's prayer points by 33% of damage dealt", 1.0 / 2),
    METABOLISE(77, "Metabolise", "Allows players to attack 1 tick earlier after eating a piece of food", 1.0 / 3),
    REBUKE(78, "Rebuke", "Increases recoil damage by 50%", 1.0 / 3),
    VINDICATION(80, "Vindication", "Heals the player by 25% of their base Prayer level if they fall below 10% health, draining their prayer points fully", 1.0 / 4),
    DECIMATE(82, "Decimate", "+25% Attack, +27% Strength", 1.0 / 1.3),
    ANNIHILATE(84, "Annihilate", "+25% Ranged Attack, +27% Ranged Strength", 1.0 / 1.3),
    VAPORISE(86, "Vaporise", "+25% Magic Attack, +4% Magic Damage", 1.0 / 1.3),
    FUMUS_VOW(87, "Fumus' Vow", "Attacks that inflict poison will deal poison damage instantly", 1.0 / 2.5),
    UMBRA_VOW(88, "Umbra's Vow", "Attacks drain 5% of the opponent's Defence, up to 15% of their base level", 1.0 / 2.5),
    CRUOR_VOW(89, "Cruor's Vow", "Heals 3 Hitpoints and drains 3 Prayer points upon killing a target", 1.0 / 2.5),
    GLACIES_VOW(90, "Glacies' Vow", "Attacks drain 5% of the opponent's Magic, up to 15% of their base level", 1.0 / 2.5),
    WRATH(91, "Wrath", "Upon death, deals damage up to 25% of the player's base Prayer level to targets in a 5x5 radius", 1.0 / 12),
    INTENSIFY(92, "Intensify", "+40% accuracy in all attack styles", 1.0 / 1.3),
    CCENTUIN_VOW(92, "Centuion Vow", "Does some good stuff", 1.0 / 1.3),
    ;

    companion object {
        fun getByLevel(level: Int): List<RuinousPowers> {
            return values().filter { it.level <= level }
        }

        fun getByName(name: String): RuinousPowers? {
            return values().find { it.displayName.equals(name, ignoreCase = true) }
        }
    }
}