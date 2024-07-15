package com.client.definitions;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.Arrays;
//
//import org.apache.commons.io.FileUtils;

import com.client.*;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;
import com.client.util.BufferExt;
import lombok.ToString;
import net.runelite.api.HeadIcon;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSNPCComposition;

@ToString
public final class NpcDefinition extends DualNode implements RSNPCComposition {
    public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
    public transient boolean custom;
    public static NpcDefinition lookup(int i) {
        NpcDefinition npcDefinition = (NpcDefinition) cache.get(i);
        if(npcDefinition == null) {
            npcDefinition = new NpcDefinition();
            npcDefinition.id = i;
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.NPC, i);
            try {
                npcDefinition.readValues(new Buffer(data));
            } catch (Exception e) {
                System.out.println("Error decoding NPC [" + i + "], previous opcode[" + npcDefinition.previousOpcode + "]");
                e.printStackTrace();
            }
        }
        if (i==13003) {
            npcDefinition.custom = true;
            npcDefinition.name = "@red@Bald eagle";
            npcDefinition.combatLevel = 982;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.size = 4;
            npcDefinition.heightScale = 200; //WIDTH
            npcDefinition.widthScale = 200; // HEIGH
        }

        if (i == 7649) {
            npcDefinition.size = 4;
            npcDefinition.heightScale = 200; //WIDTH
            npcDefinition.widthScale = 200; // HEIGH
        }

       /* if (i == Npcs.BOB_BARTER_HERBS) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", "Prices", "Decant", "Clean", null };
        }
        if (i == Npcs.ZAHUR) {
            npcDefinition.custom = true;
            npcDefinition.actions[0] = "Trade";
        }
        if (i == Npcs.JOSSIK) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Talk-to";
            npcDefinition.actions[2] = "Trade";
        }
        if (i == 9460 || i == 1150 || i == 2912 || i == 2911 || i == 2910 || i == 6481
                || i == 3500 || i == 9459 || i == 9457 || i == 9458) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
        }
        if (i == 8679) {
            npcDefinition.custom = true;
            npcDefinition.name = "Batman";
            npcDefinition.combatLevel = 0;
            npcDefinition.models = new int[] { 49994 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Talk-to", null, "Minigame", null };
            npcDefinition.rotation = 64;
        }
        if (i == 8368) {
            npcDefinition.custom = true;
            npcDefinition.name = "Flying Pumpkin";
            npcDefinition.combatLevel = 72;
            npcDefinition.models = new int[] { 49469 };
            npcDefinition.standAnim = 5021;
            npcDefinition.walkAnim = 5022;
            npcDefinition.size = 2;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
            npcDefinition.heightScale = 50; //WIDTH
            npcDefinition.widthScale = 50; // HEIGHT
        }
        if (i == 2577) {
            npcDefinition.custom = true;
            npcDefinition.name = "lil' Nyx";
            npcDefinition.combatLevel = 0;
            npcDefinition.models = new int[] {60050};
            npcDefinition.standAnim = 5022;
            npcDefinition.walkAnim = 5022;
            npcDefinition.size = 1;
            npcDefinition.isMinimapVisible = false;
            npcDefinition.heightScale = 50; //WIDTH
            npcDefinition.widthScale = 50; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 373) {
            npcDefinition.custom = true;
            npcDefinition.name = "Pheasant";
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 2268) {
            npcDefinition.custom = true;
            npcDefinition.name = "13th Pet Goblin";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 80; //WIDTH
            npcDefinition.widthScale = 80; // HEIGH
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 7633) {
            npcDefinition.custom = true;
            npcDefinition.name = "Giant Flying Pumpkin";
            npcDefinition.combatLevel = 300;
            npcDefinition.models = new int[] { 60035 };
            npcDefinition.standAnim = 5021;
            npcDefinition.walkAnim = 5022;
            npcDefinition.size = 4;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
        }
        if (i == 7623) {
            npcDefinition.custom = true;
            npcDefinition.name = "Jack-O-Kraken";
            npcDefinition.combatLevel = 616;
            npcDefinition.models = new int[] { 60049 };
            npcDefinition.standAnim = 3989;
            npcDefinition.walkAnim = 3989;
            npcDefinition.size = 4;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
        }
        if (i == 4629) {
            npcDefinition.custom = true;
            npcDefinition.name = "Flying Pumpkin pet";
            npcDefinition.combatLevel = 0;
            npcDefinition.models = new int[] { 60037 };
            npcDefinition.standAnim = 5021;
            npcDefinition.walkAnim = 5022;
            npcDefinition.rotation = 64;
            npcDefinition.size = 1;
            npcDefinition.isMinimapVisible = false;
            npcDefinition.heightScale = 25; //WIDTH
            npcDefinition.widthScale = 25; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 4630) {
            npcDefinition.custom = true;
            npcDefinition.name = "Jack-O-Kraken pet";
            npcDefinition.combatLevel = 0;
            npcDefinition.models = new int[] { 49470 };
            npcDefinition.standAnim = 3989;
            npcDefinition.walkAnim = 3989;
            npcDefinition.actions = new String[5];
            npcDefinition.rotation = 64;
            npcDefinition.size = 1;
            npcDefinition.isMinimapVisible = false;
            npcDefinition.heightScale = 25; //WIDTH
            npcDefinition.widthScale = 25; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == Npcs.PERDU) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", null, "Reclaim-lost", null, null};
        }
        if (i == 34318) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", null, "Reclaim", null, null};
        }
        if (i == 8184) {
            npcDefinition.custom = true;
            npcDefinition.name = "Theatre Of Blood Wizard";
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Teleport";
        }
        if (i == 7599) {
            npcDefinition.custom = true;
            npcDefinition.name = "Kyros Guide";
        }
        if (i == 4305) {
            npcDefinition.custom = true;
            npcDefinition.name = "Drunken cannoneer";
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Pickpocket";
        }
        if (i == 3247) {
            npcDefinition.custom = true;
            npcDefinition.name = "Wizard";
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Teleport";
        }
        if (i == 6517) {
            npcDefinition.custom = true;
            npcDefinition.name = "Daily-reward wizard";
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Talk-to";
            npcDefinition.actions[2] = "View rewards";
        }
        if (i == 3428 || i == 3429) {
            npcDefinition.custom = true;
            npcDefinition.name = "Elf warrior";
        }
        if (i == 3428 || i == 3429) {
            npcDefinition.custom = true;
            npcDefinition.name = "Elf warrior";
        }
        if (i == 5044) { // sanfew (decant)
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Decant-potions";
        }
        if (i == 8026) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 392;
        }
        if (i == 7913) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Ironman shop keeper";
            npcDefinition.description = "A shop specifically for iron men.";
        }
        if (i == 8906) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Santa's little elf";
            npcDefinition.description = "A helper sent from santa himself.";
            npcDefinition.actions = new String[] { "Talk-To", null, "Christmas Shop", "Return-Items", null };
        }
        if (i == 954) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Crystal Seed Trader";
            npcDefinition.description = "Use a seed on me to get a Crystal Bow.";

        }
        if (i == 6970) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Theif";
            npcDefinition.actions = new String[] { null, null, "Pickpocket",  null,  null };
        }
        if (i == 8761) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Assignment", "Trade", "Rewards" };
        }
        if (i == 1531) {
            npcDefinition.custom = true;
            npcDefinition.name = "Fishing Spot";
            npcDefinition.actions = new String[] { "Bait", null, null, null, null };
            npcDefinition.description = "A fishing spot in lava ??.";
        }
        if (i == 9400) {
            npcDefinition.custom = true;
            npcDefinition.name = "Ted O'bombr";
        }
        if (i == 7677) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", null, "Bank", "Foundry Prices",  null, };
        }
        if (i == 8026 || i == 8027 || i == 8028) {
            npcDefinition.custom = true;
            npcDefinition.size = 9;
        }
        if (i == 7954) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Achievement Master";
            npcDefinition.actions = new String[] { "Trade", null, "Open Achievements", null, null, };

        }
        if (i == 5870) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Assignment", "Trade", "Rewards" };

        }
        if (i == 3400) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Giveaway Manager";
            npcDefinition.actions = new String[] { "Open-manager", null, null, null, null };

        }
        if (i == 1013) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Fortune Freddy";
            npcDefinition.description = "Have you got Freddy's luck to obtain some amazing!.";
            npcDefinition.actions = new String[] { "WheelOfFortune", null, "Quick-Spin", null, null };
        }
        if (i == 308) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "PKP Manager";
        }
        if (i == 13) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Referral Tutor";
            npcDefinition.description = "He manages referrals.";
        }
        if (i == 5293) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Elven Keeper";
        }
        if (i == 5978) {
            npcDefinition.custom = true;
            npcDefinition.name = "FlowerPoker Guard";
        }
        if(i==3218 || i ==3217){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==2897){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Trading Post Manager";
            npcDefinition.actions = new String[] { "Open", null, "Collect", null, null };
        }
        if(i==1306){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Make-over", null, null, null, null };
        }
        if(i==3257){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1011){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Item Gambler";
            npcDefinition.actions = new String[] { "Info", null, "Gamble", null, null };
        }
        if(i==3248){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = Configuration.CLIENT_TITLE + " Wizard";
            npcDefinition.actions = new String[] { "Teleport", null, "Previous Location", null, null };
        }
        if(i==1520){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Small Net", null, "Harpoon", null, null };
        }
        if(i==8920){
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
        }
        if(i==8921){
            npcDefinition.custom = true;
            npcDefinition.name = "Crystal Whirlwind";
        }
        if(i==9120){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Donator Shop";
            npcDefinition.actions = new String[] { "Trade", null, "Rewards", null, null };
        }
        if(i == 2662){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Tournament Manager";
            npcDefinition.actions = new String[] { "Open-Shop", null, null, null, null };
        }
        if(i==603){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Captain Kraken";
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if(i==7041){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Ticket Exchange";
            npcDefinition.actions = new String[] { "Exchange", null, null, null, null };
        }
        if(i==3894){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Sigmund The Merchant";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }

        if (i==7413) {
            npcDefinition.custom = true;
            npcDefinition.name = "Max Dummy";
            npcDefinition.actions[0] = null;
        }
        if(i==9011){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Vote Shop";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1933){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Mills";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==8819){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Boss point shop";
            npcDefinition.actions = new String[] { null, null, "Trade", null, null };
        }
        if(i==8688){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Fat Tony";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==7769){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Shop Keeper";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==6987){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Man";
            npcDefinition.actions = new String[] { "Talk", null, "Pickpocket", null, null };
        }
        if(i==5730){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Master Farmer";
            npcDefinition.actions = new String[] { "Pickpocket", null, "Trade", null, null };
        }
        if(i==1501){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Hunter Store";
            npcDefinition.actions = new String[] { null, null, null, null, "Trade" };
        }
        if(i==2913){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Fishing Store";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==5809){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Crafting and Tanner";
            npcDefinition.actions = new String[] { "Tan", null, "Trade", null, null };
        }
        if(i==555){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Sell Me Store";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==9168){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Flex";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==8208){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Pet Collector";
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if(i==8202){
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", "Pick-Up", null, null, null };
        }
        if(i==4921){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Supplies";
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if (i == 5314) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Mystical Wizard";
            npcDefinition.actions = new String[] { "Teleport", "Previous Location", null, null, null };
            npcDefinition.description = "This wizard has the power to teleport you to many locations.";
        }
        if (i == 8781) {
            npcDefinition.custom = true;
            npcDefinition.name = "@red@Queen Latsyrc";
            npcDefinition.combatLevel = 982;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.heightScale = 175; //WIDTH
            npcDefinition.widthScale = 175; // HEIGH
        }


        if (i == 655) {
            npcDefinition.custom = true;
            npcDefinition.name = "@gre@AFK Goblin";
            npcDefinition.combatLevel = 4012;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.heightScale = 500; //WIDTH
            npcDefinition.widthScale = 500; // HEIGHT
            npcDefinition.size = 4;
        }
        if(i==1577){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Melee Shop";
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1576){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Range Shop";
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1578){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.name = "Mage Shop";
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Trade", null, null, null, null };
        }
        if (i == 315) {
            npcDefinition.custom = true;
            npcDefinition.name = "Steve";
        }

        if (i == 8026) {
            npcDefinition.custom = true;
            npcDefinition.name = "Vorkath";
            // npcDefinition.combatLevel = 732;
            npcDefinition.models = new int[] { 35023 };
            npcDefinition.standAnim = 7946;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Poke", null, null, null, null };
            npcDefinition.heightScale = 100;
            npcDefinition.widthScale = 100;
        }
        if (i == 7852 || i == 7853 || i == 7884) {//Dawn
            npcDefinition.custom = true;
            npcDefinition.standAnim = 7775;
            npcDefinition.walkAnim = 7775;
        }
        if (i == 5518) {
            npcDefinition.custom = true;
            npcDefinition.standAnim = 185;
        }
        if (i == 8019) {
            npcDefinition.custom = true;
            npcDefinition.standAnim = 185;
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Talk-to";
            npcDefinition.actions[2] = "Trade";
        }
        if (i == 308) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Talk-to";
            npcDefinition.actions[2] = "Trade";
            npcDefinition.actions[3] = "Disable Interface";
            npcDefinition.actions[4] = "Skull";
        }
        if (i == 6088) {
            npcDefinition.custom = true;
            npcDefinition.standAnim = 185;
            npcDefinition.actions = new String[5];
            npcDefinition.actions[0] = "Talk-to";
            npcDefinition.actions[2] = "Travel";
        }
        if (i == 1434 || i == 876 || i == 1612) {//gnome fix
            npcDefinition.custom = true;
            npcDefinition.standAnim = 185;
        }
        if (i == 7674 || i == 8009 || i == 388 || i == 8010) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 8492 || i == 8493 || i == 8494 || i == 8495) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 8737 || i == 8738 || i == 8009 || i == 7674) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 326 || i == 327) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 85;
            npcDefinition.widthScale = 85;
            npcDefinition.name = "Vote Pet";
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i >= 7354 && i <=7367) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i >= 3169 && i <= 3183) {
            npcDefinition.custom = true;
            npcDefinition.standAnim = 6952;
        }
        if (i == 5559 || i == 5560) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 2149 || i == 2150 || i == 2151 || i == 2148) {
            npcDefinition.custom = true;
            npcDefinition.name = "Trading Clerk";
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Bank", null, "Trading Post", null, null };
        }
        if (i == 6473) { //terror dog
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 50; //WIDTH
            npcDefinition.widthScale = 50; // HEIGH
        }
        if (i == 3510) { //outlast shop
            npcDefinition.custom = true;
            npcDefinition.name = "Trader";
            npcDefinition.combatLevel = 0;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.heightScale = 150; //WIDTH
            npcDefinition.widthScale = 150; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Open-Shop", null, null, null, null };
        }
        if (i == 488) { //rain cloud
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 0;
            npcDefinition.size = 1;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.heightScale = 150; //WIDTH
            npcDefinition.widthScale = 150; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 5644) { //swapcreature
            npcDefinition.custom = true;
            npcDefinition.heightScale = 300; //WIDTH
            npcDefinition.widthScale = 300; // HEIGH
        }
        if (i == 7668) { //voice of yama
            npcDefinition.custom = true;
            npcDefinition.name = "Kratos";
            npcDefinition.size = 2;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 90; //WIDTH
            npcDefinition.widthScale = 90; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 1377) {
            npcDefinition.custom = true;
            npcDefinition.size = 3;
            npcDefinition.heightScale = 300; //WIDTH
            npcDefinition.widthScale = 300; // HEIGH
            npcDefinition.actions[0] = null;
        }
        if (i == 2105) {
            npcDefinition.custom = true;
            npcDefinition.size = 4;
            npcDefinition.heightScale = 600; //WIDTH
            npcDefinition.widthScale = 600; // HEIGH
        }
        if (i == 2107) {
            npcDefinition.custom = true;
            npcDefinition.size = 4;
            npcDefinition.heightScale = 600; //WIDTH
            npcDefinition.widthScale = 600; // HEIGH
        }
        if (i == 2850) {
            npcDefinition.custom = true;
            npcDefinition.name = "GIM Tracker";
            npcDefinition.actions = new String[] { "Open", null, null, null, null };

        }
        if (i == 6119) { //weird monster
            npcDefinition.custom = true;
            npcDefinition.size = 1;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 30; //WIDTH
            npcDefinition.widthScale = 30; // HEIGH
        }
        if (i == 763) { //roc
            npcDefinition.custom = true;

            npcDefinition.size = 1;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 30; //WIDTH
            npcDefinition.widthScale = 30; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };


        }
        if (i == 762) { //foe small bird
            npcDefinition.custom = true;
            npcDefinition.size = 1;
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 4987 || i == 6292 || i == 6354 ) { //chronzon
            npcDefinition.custom = true;
            npcDefinition.size = 1;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 45; //WIDTH
            npcDefinition.widthScale = 45; // HEIGH
        }
        if (i == 8709) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.name = "Corrupt Beast";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 60; //WIDTH
            npcDefinition.widthScale = 60; // HEIGH
            npcDefinition.size = 1;
        }
        if (i == 7025) { //guard dog
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGH
        }

        if (i == 6716) {//prayer
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 65; //WIDTH
            npcDefinition.widthScale = 65; // HEIGH
            npcDefinition.combatLevel = 0;


        }

        if (i == 6723) {//healer
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 65; //WIDTH
            npcDefinition.widthScale = 65; // HEIGH
            npcDefinition.combatLevel = 0;

        }
        if (i == 1088) {
            npcDefinition.custom = true;
            npcDefinition.name = "Seren";
            npcDefinition.models = new int[] { 38605 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 65; //WIDTH
            npcDefinition.widthScale = 65; // HEIGH
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8372;
            npcDefinition.walkAnim = 8372;
            npcDefinition.models = new int[] { 38605 };

        }
        if (i == 1089) {
            npcDefinition.custom = true;
            npcDefinition.name = "Lil mimic";
            npcDefinition.models = new int[] { 37142 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 25; //WIDTH
            npcDefinition.widthScale = 25; // HEIGH
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8307;
            npcDefinition.walkAnim = 8306;
            npcDefinition.models = new int[] { 37142 };

        }
        if (i == 2120) {
            npcDefinition.custom = true;
            npcDefinition.name = "Shadow Ranger";
            npcDefinition.models = new int[] { 29267 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGH
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8526;
            npcDefinition.walkAnim = 8527;
            npcDefinition.models = new int[] { 29267 };

        }
        if (i == 2121) {
            npcDefinition.custom = true;
            npcDefinition.name = "Shadow Wizard";
            npcDefinition.models = new int[] { 29268 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGH
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8526;
            npcDefinition.walkAnim = 8527;
            npcDefinition.models = new int[] { 29268 };
        }
        if (i == 2122) {
            npcDefinition.custom = true;
            npcDefinition.name = "Shadow Warrior";
            npcDefinition.models = new int[] { 29266 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGH
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8526;
            npcDefinition.walkAnim = 8527;
            npcDefinition.models = new int[] { 29266 };
        }

        if (i == 7216 || i == 6473) {//green monkey and green dog
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 6723 || i == 6716 || i == 8709) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 3291) {//postie pete
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 5738) {//imp
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 5240) {//toucan
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 834) {
            npcDefinition.custom = true;
            npcDefinition.name = "King penguin";
            npcDefinition.actions = new String[5];
            npcDefinition.combatLevel = 0;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 1873) {//klik
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.standAnim = 3345;
            npcDefinition.walkAnim = 3346;

        }

        if (i == 4923) {
            npcDefinition.custom = true;
            npcDefinition.name = "Groot";
            npcDefinition.combatLevel = 849;
            npcDefinition.models = new int[] { 47110 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
            npcDefinition.heightScale = 250;
            npcDefinition.widthScale = 250;
            npcDefinition.size = 3;
        }

        if (i == 3472) {
            npcDefinition.custom = true;
            npcDefinition.name = "Lil' Groot";
            npcDefinition.models = new int[] { 47110 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.rotation = 64;
            npcDefinition.heightScale = 65;
            npcDefinition.widthScale = 65;
            npcDefinition.size = 1;
        }

        if (i == 7316) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Trade", null, null };
        }

        if (i == 6298) {
            npcDefinition.custom = true;
            npcDefinition.heightScale = 300; //WIDTH
            npcDefinition.widthScale = 300; // HEIGH
        }

        if (i == 5630) { // Giant Snail
            npcDefinition.custom = true;
            npcDefinition.headIcon = 6;
        }
        if (i == 6474) {
            npcDefinition.custom = true;
            npcDefinition.headIcon = 1;
        }
        if (i == 7804) {
            npcDefinition.custom = true;
            npcDefinition.headIcon = 0;
        }
        if (i == 2948) {
            npcDefinition.custom = true;
            npcDefinition.headIcon = 0;
        }
        if (i == 1101 || i == 7594) {
            npcDefinition.custom = true;
            npcDefinition.headIcon = 8;
        }
        if (i == 7594) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 90;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
        }
        if (i == 8164) {
            npcDefinition.custom = true;
            npcDefinition.name = "Shadow of Araphel";
            npcDefinition.combatLevel = 666;
            npcDefinition.models = new int[] { 46831 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
            npcDefinition.heightScale = 180;
            npcDefinition.widthScale = 180;
            npcDefinition.size = 3;
        }
        if (i == 8172) {
            npcDefinition.custom = true;
            npcDefinition.name = "Araphel";
            npcDefinition.combatLevel = 666;
            npcDefinition.models = new int[] { 46832 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.rotation = 64;
            npcDefinition.heightScale = 180;
            npcDefinition.widthScale = 180;
            npcDefinition.size = 3;
        }

        // NEW PETS
        if (i == 2304) {
            npcDefinition.custom = true;
            npcDefinition.name = "mystery box";
            npcDefinition.models = new int[] { 47004 };//mystery box
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 5021;
            npcDefinition.walkAnim = 5022;
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGHT
        }



        if (i == 2308) {
            npcDefinition.custom = true;
            npcDefinition.name = "Magic Pet";
            npcDefinition.models = new int[] { 60003 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.heightScale = 65; //WIDTH
            npcDefinition.widthScale = 65; // HEIGH
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 1539;
            npcDefinition.walkAnim = 1539;
        }
        if (i == 5568 || i == 5569 || i == 5570 || i == 5571) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }

        if (i == 2311) {
            npcDefinition.custom = true;
            npcDefinition.name = "Mask";
            npcDefinition.models = new int[] { 60004 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGHT
            npcDefinition.size = 1;
            npcDefinition.standAnim = 1539;
            npcDefinition.walkAnim = 1539;
        }

        if (i == 2300) {
            npcDefinition.custom = true;
            npcDefinition.models = new int[1];
            npcDefinition.name = "Skeleton";
            npcDefinition.models = new int[] { 47008 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
        }

        if (i == 2301) {
            npcDefinition.custom = true;
            npcDefinition.name = "Beaver";
            npcDefinition.models = new int[] { 60001 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGHT
        }

        if (i == 2302) {
            npcDefinition.custom = true;
            npcDefinition.name = "Rock";//Mystery box
            npcDefinition.models = new int[] { 47003 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGHT
        }

        if (i == 2307) {
            npcDefinition.custom = true;
            npcDefinition.name = "Fish";
            npcDefinition.models = new int[] { 60002 };//Santa hat = 50078
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 8526;
            npcDefinition.walkAnim = 8527;
            npcDefinition.heightScale = 85; //WIDTH
            npcDefinition.widthScale = 85; // HEIGH
        }

        if (i == 2305) {
            npcDefinition.custom = true;
            npcDefinition.name = "Jack The Pumpkin King";
            npcDefinition.models = new int[] { 47011, 47013, 47015, 47017, 47019, 47021 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Teleport", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 13;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
        }


        if (i == 2312) {
            npcDefinition.custom = true;
            npcDefinition.name = "@gre@$$@blu@CashMoney@gre@$$";
            npcDefinition.models = new int[] { 47025 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.standAnim = 7939;
            npcDefinition.walkAnim = 7939;
            npcDefinition.size = 1;
            npcDefinition.combatLevel = 0;
        }

        if (i == 2313) {
            npcDefinition.custom = true;
            npcDefinition.name = "Charlie";
            npcDefinition.models = new int[] { 46779 };
            npcDefinition.description = "A Christmas Imp.";
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            NpcDefinition npcDef = NpcDefinition.lookup(3134);
            npcDefinition.standAnim = npcDef.standAnim;
            npcDefinition.walkAnim =  npcDef.walkAnim;
            npcDefinition.size = 1;
            npcDefinition.combatLevel =  npcDef.combatLevel;
        }

        if (i == 5371) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 666;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
        }

        if (i == 539) {
            npcDefinition.custom = true;
            npcDefinition.description = "Elfinlocks the keeper of the seasonal shop.";
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Open-Shop", null, null };
        }

        if (i == 2306) {
            npcDefinition.custom = true;
            npcDefinition.name = "Snowy";
            npcDefinition.models = new int[] { 46751 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Teleport", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
        }

        if (i == 5169) {
            npcDefinition.custom = true;
            npcDefinition.name = "Durial321";
            npcDefinition.models = new int[] { 187, 214, 246, 6669, 35817, 6659, 3704, 5409, 9347, 13307, 9638, 9642 };
            npcDefinition.originalColors = new int[] { 926, 6798 };
            npcDefinition.modifiedColours = new int[] { 22464, 5186 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.combatLevel = 115;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 300; //WIDTH
            npcDefinition.widthScale = 300; // HEIGHT
        }

        //dark pets
        if (i == 2309) {
            npcDefinition.custom = true;
            npcDefinition.name = "Discord";
            npcDefinition.models = new int[] { 46747 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Sync", "Open-Shop", null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 7939;
            npcDefinition.walkAnim = 7939;
        }



        if (i == 2316) {
            npcDefinition.custom = true;
            npcDefinition.name = "Guardian Angel";
            npcDefinition.models = new int[] { 60017 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 100;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 75; //WIDTH
            npcDefinition.widthScale = 75; // HEIGH
            npcDefinition.size = 1;
        }

        if (i == 837) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
        }

        if (i == 11226) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if (i == 8027) {
            npcDefinition.custom = true;
            npcDefinition.name = "Vorkath";
            npcDefinition.combatLevel = 732;
            npcDefinition.models = new int[] { 35023 };
            npcDefinition.standAnim = 7950;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, null, null, null, null };
            npcDefinition.heightScale = 100;
            npcDefinition.widthScale = 100;
        }
        if (i == 8028) {
            npcDefinition.custom = true;
            npcDefinition.name = "Vorkath";
            npcDefinition.combatLevel = 732;
            npcDefinition.models = new int[] { 35023 };
            npcDefinition.standAnim = 7948;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.heightScale = 100;
            npcDefinition.widthScale = 100;
        }
        if (i == 1257) {
            npcDefinition.custom = true;
            npcDefinition.name = "Fluffie";
            npcDefinition.combatLevel = 1;
            npcDefinition.standAnim = 4472;
            npcDefinition.walkAnim = 4473;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.heightScale = 400;
            npcDefinition.widthScale = 400;
        }
        if (i == 8054) {
            npcDefinition.custom = true;
            npcDefinition.name = "Gingerbread Man";
            npcDefinition.combatLevel = 75;
            npcDefinition.models = new int[] { 49472 };
            npcDefinition.standAnim = -1;
            npcDefinition.walkAnim = 819;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.size = 2;
        }

        if (i == 4851) {
            npcDefinition.custom = true;
            npcDefinition.name = "lil' Gingie";
            npcDefinition.models = new int[] { 49472 };
            npcDefinition.standAnim = -1;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            npcDefinition.size = 2;
            npcDefinition.heightScale = 75;
            npcDefinition.widthScale = 75;
        }

        if (i == 4852) {
            npcDefinition.custom = true;
            npcDefinition.name = "lil' Elf";
            npcDefinition.models = new int[] { 49473, 36100 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            npcDefinition.size = 2;
            npcDefinition.heightScale = 75;
            npcDefinition.widthScale = 75;
        }

        if (i == 4850) {
            npcDefinition.custom = true;
            npcDefinition.name = "lil' Evil Snowman";
            npcDefinition.models = new int[] { 46750 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            npcDefinition.size = 2;
            npcDefinition.heightScale = 50;
            npcDefinition.widthScale = 50;
        }

        if (i == 5507) {
            npcDefinition.custom = true;
            npcDefinition.name = "Elf";
            npcDefinition.combatLevel = 75;
            npcDefinition.models = new int[] { 49473, 36100 };
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.heightScale = 75;
            npcDefinition.widthScale = 75;
            npcDefinition.size = 2;
        }

        if (i == 5509) {
            npcDefinition.custom = true;
            npcDefinition.name = "Evil Nutcracker";
            npcDefinition.models = new int[] { 46868, 217, 246, 46842, 46848, 46839, 46849, 13307, 9642, 46852 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.combatLevel = 75;
            npcDefinition.standAnim = 1421;
            npcDefinition.walkAnim = 1422;
            npcDefinition.heightScale = 75; //WIDTH
            npcDefinition.widthScale = 75; // HEIGHT
            npcDefinition.size = 1;
        }

        if (i == 2310) {
            npcDefinition.custom = true;
            npcDefinition.name = "Jack Frost";
            npcDefinition.models = new int[] { 47023 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
        }

        if (i == 2314) {
            npcDefinition.custom = true;
            npcDefinition.name = "Evil Snowman Minion";
            npcDefinition.models = new int[] { 46749 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 126;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 25; //WIDTH
            npcDefinition.widthScale = 25; // HEIGH
            npcDefinition.size = 1;
        }

        if (i == 2317) {
            npcDefinition.custom = true;
            npcDefinition.name = "Evil Snowman";
            npcDefinition.models = new int[] { 46750 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { null, "Attack", null, null, null };
            npcDefinition.originalColors = null;
            npcDefinition.modifiedColours = null;
            npcDefinition.combatLevel = 126;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
            npcDefinition.heightScale = 150; //WIDTH
            npcDefinition.widthScale = 150; // HEIGH
            npcDefinition.size = 4;
        }
        if (i == 7118) {
            npcDefinition.custom = true;
            npcDefinition.name = "Maniacal Monkey";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 120; //WIDTH
            npcDefinition.widthScale = 120; // HEIGH
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 1467) {
            npcDefinition.custom = true;
            npcDefinition.name = "Zombie Monkey";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 120; //WIDTH
            npcDefinition.widthScale = 120; // HEIGH
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 2315) {
            npcDefinition.custom = true;
            npcDefinition.name = "Santa";
            npcDefinition.models = new int[] { 189, 217, 253, 28983, 28981, 28978, 28979, 28989 };
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, null, null, null };
            npcDefinition.originalColors = new int[] { 8741, 25238, 7073, 10297, 9104, 906 };
            npcDefinition.modifiedColours = new int[] { 5210, 7333, 7467, 5206, 7452, 8596 };
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 808;
            npcDefinition.walkAnim = 819;
        }
        if (i == 8087) {
            npcDefinition.custom = true;
            npcDefinition.name = "Baby Red dragon";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 40; //WIDTH
            npcDefinition.widthScale = 40; // HEIGH
            npcDefinition.size = 2;
            npcDefinition.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8081) {
            npcDefinition.custom = true;
            npcDefinition.name = "Baby Green dragon";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 40; //WIDTH
            npcDefinition.widthScale = 40; // HEIGH
            npcDefinition.size = 2;
            npcDefinition.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8093) {
            npcDefinition.custom = true;
            npcDefinition.name = "Baby Black dragon";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 40; //WIDTH
            npcDefinition.widthScale = 40; // HEIGH
            npcDefinition.size = 2;
            npcDefinition.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8083) {
            npcDefinition.custom = true;
            npcDefinition.name = "Baby Blue dragon";
            npcDefinition.combatLevel = 0;
            npcDefinition.heightScale = 40; //WIDTH
            npcDefinition.widthScale = 40; // HEIGH
            npcDefinition.size = 2;
            npcDefinition.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 2592) {
            npcDefinition.custom = true;
            npcDefinition.name = "Realm Nyx";
            npcDefinition.combatLevel = 0;
            npcDefinition.models = new int[] {60048};
            npcDefinition.standAnim = 5022;
            npcDefinition.walkAnim = 5022;
            npcDefinition.size = 1;
            npcDefinition.isMinimapVisible = false;
            npcDefinition.heightScale = 50; //WIDTH
            npcDefinition.widthScale = 50; // HEIGH
            npcDefinition.actions = new String[5];
            npcDefinition.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 12889) {
            npcDefinition.custom = true;
            npcDefinition.name = "Primio";
            npcDefinition.combatLevel = 0;
            npcDefinition.standAnim = 10947;
            npcDefinition.heightScale = 120; //WIDTH
            npcDefinition.widthScale = 120; // HEIGH
            npcDefinition.size = 3;
            npcDefinition.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 11675) {
            npcDefinition.custom = true;
            npcDefinition.name = "SmS";
            npcDefinition.actions = new String[]{"Talk-to", null, null, null, null};
        }
        if(i==10532) {
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 982;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.heightScale = 75;
            npcDefinition.widthScale = 75;
        }
        if(i==10531){
            npcDefinition.custom = true;
            npcDefinition.combatLevel = 982;
            npcDefinition.isMinimapVisible = true;
            npcDefinition.heightScale = 75;
            npcDefinition.widthScale = 75;
        }
        if(i==7144){
            npcDefinition.custom = true;
            npcDefinition.headIcon = 0;
        }
        if(i==963){
            npcDefinition.custom = true;
            npcDefinition.headIcon = 6;
        }
        if(i==7145){
            npcDefinition.name = "Demonic Gorilla";
            npcDefinition.custom = true;
            npcDefinition.headIcon = 1;
        }
        if(i==7146){
            npcDefinition.name = "Demonic Gorilla";
            npcDefinition.custom = true;
            npcDefinition.headIcon = 2;
        }
        if (npcDefinition.name != null && npcDefinition.name.toLowerCase().contains("chinchompa") && !npcDefinition.name.toLowerCase().contains("baby")) {
            npcDefinition.custom = true;
            npcDefinition.actions = new String[5];
        }

        switch (i) {
            case 1233:
            case 1234:
            case 1235:
            case 1230:
            case 1231:
            case 1232:
            case 1227:
            case 1228:
            case 1229:
                npcDefinition.custom = true;
                npcDefinition.combatLevel = 75;
                break;


            case 9786:
            case 9787:
            case 9788:
            case 9789:
            case 9790:
            case 9791:
            case 9792:
            case 9793:
            case 9794:
            case 9795:
            case 9796:
            case 9797:
            case 9798:
            case 9799:
                npcDefinition.custom = true;
                npcDefinition.standAnim = 2904;
                npcDefinition.walkAnim = 2943;
                break;
        }*/
        cache.put(npcDefinition, i);
        return npcDefinition;
    }

    public static int totalAmount;

    public static void dump() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("./npc_defs.txt"))) {
            for (int i = 0; i < 70_000; i++) {
                try {
                    NpcDefinition def = NpcDefinition.lookup(i);
                    if (def != null) {
                        writer.write("Npc=" + i);
                        writer.newLine();
                        writer.write("Stand animation=" + def.standAnim);
                        writer.newLine();
                        writer.write("Walk animation=" + def.walkAnim);
                        writer.newLine();
                        writer.newLine();
                    }
                } catch (Exception e) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static int defaultHeadIconArchive = -1;


    static boolean clientRev = false;

    public static void init(int headIconArchive) {
        totalAmount = Js5List.configs.getGroupFileCount(Js5ConfigType.NPC) + 2_500;
        defaultHeadIconArchive = headIconArchive;
    }
    public int category;

    private int previousOpcode = -1;

    private void readValues(Buffer buffer) {
        while (true) {
            int opcode = buffer.readUnsignedByte();
            if (opcode == 0)
                return;
            if (opcode == 1) {
                int j = buffer.readUnsignedByte();
                models = new int[j];
                for (int j1 = 0; j1 < j; j1++)
                    models[j1] = buffer.readUShort();

            } else if (opcode == 2)
                name = buffer.readNullTerminatedString();
            else if (opcode == 12)
                size = buffer.readSignedByte();
            else if (opcode == 13)
                standAnim = buffer.readUShort();
            else if (opcode == 14)
                walkAnim = buffer.readUShort();
            else if (opcode == 15)
                buffer.readUShort();
            else if (opcode == 16)
                buffer.readUShort();
            else if (opcode == 17) {
                walkAnim = buffer.readUShort();
                rotateBackAnim = buffer.readUShort();
                walkLeftAnim = buffer.readUShort();
                walkRightAnim = buffer.readUShort();
                if (rotateBackAnim == 65535) {
                    rotateBackAnim = -1;
                }
                if (walkLeftAnim == 65535) {
                    walkLeftAnim = -1;
                }
                if (walkRightAnim == 65535) {
                    walkRightAnim = -1;
                }
            } else if (opcode == 18) {
                category = buffer.readUShort();
            } else if (opcode >= 30 && opcode <= 35) {
                if (actions == null)
                    actions = new String[10];
                actions[opcode - 30] = buffer.readNullTerminatedString();
                if (actions[opcode - 30] != null && actions[opcode - 30].equalsIgnoreCase("hidden"))
                    actions[opcode - 30] = null;
            } else if (opcode == 40) {
                int k = buffer.readUnsignedByte();
                originalColors = new int[k];
                modifiedColours = new int[k];
                for (int k1 = 0; k1 < k; k1++) {
                    originalColors[k1] = buffer.readUShort();
                    modifiedColours[k1] = buffer.readUShort();
                }
            } else if (opcode == 41) {
                int k = buffer.readUnsignedByte();
                originalTextureColours = new short[k];
                modifiedTextureColours = new short[k];
                for (int k1 = 0; k1 < k; k1++) {
                    originalTextureColours[k1] = (short) buffer.readUShort();
                    modifiedTextureColours[k1] = (short) buffer.readUShort();
                }

            } else if (opcode == 60) {
                int l = buffer.readUnsignedByte();
                chatheadModels = new int[l];
                for (int l1 = 0; l1 < l; l1++)
                    chatheadModels[l1] = buffer.readUShort();
            } else if(opcode >= 74 && opcode <= 79) {
                if(stats == null)
                    stats = new int[6];
                int index = opcode - 74;
                int stat = buffer.readUShort();
                stats[index] = stat;
                System.out.println("ID [" + id + "]  index [" + index + "] stat = " + stat);
            } else if (opcode == 93)
                isMinimapVisible = false;
            else if (opcode == 95)
                combatLevel = buffer.readUShort();
            else if (opcode == 97)
                widthScale = buffer.readUShort();
            else if (opcode == 98)
                heightScale = buffer.readUShort();
            else if (opcode == 99)
                hasRenderPriority = true;
            else if (opcode == 100)
                ambient = buffer.readSignedByte();
            else if (opcode == 101)
                contrast = buffer.readSignedByte();
            else if (opcode == 102) {
                int var3 = buffer.readUnsignedByte();
                int var4 = 0;

                for(int var5 = var3; var5 != 0; var5 >>= 1) {
                    ++var4;
                }

                headIconArchiveIds = new int[var4];
                headIconSpriteIndex = new short[var4];

                for(int var6 = 0; var6 < var4; ++var6) {
                    if ((var3 & 1 << var6) == 0) {
                        headIconArchiveIds[var6] = -1;
                        headIconSpriteIndex[var6] = -1;
                    } else {
                        headIconArchiveIds[var6] = buffer.readNullableLargeSmart();
                        headIconSpriteIndex[var6] = (short)buffer.readShortSmartSub();
                    }
                }
            } else if (opcode == 103)
                rotation = buffer.readUShort();
            else if (opcode == 107) {
                isInteractable = false;
            } else if(opcode == 109) {
                boolean isClipped = false;
            } else if(opcode == 114) {
                buffer.readShort();
            } else if(opcode == 115) {
                buffer.readShort();
                buffer.readShort();
                buffer.readShort();
                buffer.readShort();
            } else if(opcode == 116) {
                buffer.readShort();
            } else if(opcode == 117) {
                buffer.readShort();
                buffer.readShort();
                buffer.readShort();
                buffer.readShort();
            } else if(opcode == 122) {
                buffer.readByte();
            } else if(opcode == 123) {
                buffer.readByte();
            } else if(opcode == 124) {
                defaultHeight = buffer.readUShort();//npc height
            } else if (opcode == 249) {
                BufferExt.readStringIntParameters(buffer);
            } else if (opcode == 106 || opcode == 118) {
                varbit = buffer.readUShort();
                if (varbit == 65535) {
                    varbit = -1;
                }

                varp = buffer.readUShort();
                if (varp == 65535) {
                    varp = -1;
                }
                int index;
                index = -1;
                int var4, var5;
                if (opcode == 118) {
                    index = buffer.readUShort();
                    if (index == 65535) {
                        index = -1;
                    }
                }

                var4 = buffer.readUnsignedByte();
                transforms = new int[var4 + 2];

                for(var5 = 0; var5 <= var4; ++var5) {
                    transforms[var5] = buffer.readUShort();
                    if (transforms[var5] == 65535) {
                        transforms[var5] = -1;
                    }
                }

                transforms[var4 + 1] = index;
            } else {
                System.out.println("Not found opcode = " + opcode + ", previous = " + previousOpcode);
            }
            previousOpcode = opcode;
        }
    }

    public Model method160() {
        if (transforms != null) {
            NpcDefinition entityDef = method161();
            if (entityDef == null)
                return null;
            else
                return entityDef.method160();
        }
        if (chatheadModels == null) {
            return null;
        }
        boolean flag1 = false;
        for (int i = 0; i < chatheadModels.length; i++)
            if (!Model.isCached(chatheadModels[i]))
                flag1 = true;

        if (flag1)
            return null;
        Model aclass30_sub2_sub4_sub6s[] = new Model[chatheadModels.length];
        for (int j = 0; j < chatheadModels.length; j++)
            aclass30_sub2_sub4_sub6s[j] = Model.getModel(chatheadModels[j]);

        Model model;
        if (aclass30_sub2_sub4_sub6s.length == 1)
            model = aclass30_sub2_sub4_sub6s[0];
        else
            model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);

        if (originalColors != null)
            for (int k = 0; k < originalColors.length; k++)
                model.recolor(originalColors[k], modifiedColours[k]);


        if (originalTextureColours != null)
            for (int k = 0; k < originalTextureColours.length; k++)
                model.retexture(originalTextureColours[k], modifiedTextureColours[k]);

        return model;
    }

    public NpcDefinition method161() {
        int j = -1;
        if (varbit != -1) {
            VariableBits varBit = VariableBits.lookup(varbit);
            int k = varBit.baseVar;
            int l = varBit.startBit;
            int i1 = varBit.endBit;
            int j1 = Client.anIntArray1232[i1 - l];
            j = clientInstance.variousSettings[k] >> l & j1;
        } else if (varp != -1)
            j = clientInstance.variousSettings[varp];
        int var3;
        if (j >= 0 && j < transforms.length)
            var3 = transforms[j];
        else
            var3 = transforms[transforms.length - 1];
        return var3 == -1 ? null : lookup(var3);
    }

    public Model getAnimatedModel(int j, int k, int ai[]) {
        if (transforms != null) {
            NpcDefinition entityDef = method161();
            if (entityDef == null)
                return null;
            else
                return entityDef.getAnimatedModel(j, k, ai);
        }
        Model model = (Model) mruNodes.get(id);
        if (model == null) {
            boolean flag = false;
            for (int i1 = 0; i1 < models.length; i1++)
                if (!Model.isCached(models[i1]))
                    flag = true;

            if (flag)
                return null;
            Model aclass30_sub2_sub4_sub6s[] = new Model[models.length];
            for (int j1 = 0; j1 < models.length; j1++)
                aclass30_sub2_sub4_sub6s[j1] = Model.getModel(models[j1]);

            if (aclass30_sub2_sub4_sub6s.length == 1)
                model = aclass30_sub2_sub4_sub6s[0];
            else
                model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
            if (originalColors != null) {
                for (int k1 = 0; k1 < originalColors.length; k1++)
                    model.recolor(originalColors[k1], modifiedColours[k1]);

            }
            if (originalTextureColours != null) {
                for (int i1 = 0; i1 < originalTextureColours.length; i1++)
                    model.retexture(originalTextureColours[i1], modifiedTextureColours[i1]);
            }
            model.prepareSkeleton();
            model.light(64 + ambient, 850 + contrast, -30, -50, -30, true);
            // model.method479(84 + anInt85, 1000 + anInt92, -90, -580, -90, true);
            mruNodes.put(model, id);
        }
        Model model_1 = Model.emptyModel;
        model_1.buildSharedSequenceModel(model, SeqFrame.noAnimationInProgress(k) & SeqFrame.noAnimationInProgress(j));
        if (k != -1 && j != -1)
            model_1.mix(ai, j, k);
        else if (k != -1)
            model_1.interpolate(k);
        if (widthScale != 128 || heightScale != 128)
            model_1.scale(widthScale, widthScale, heightScale);
        model_1.calculateBoundsCylinder();
        model_1.groupedTriangleLabels = null;
        model_1.groupedVertexLabels = null;
        if (size == 1)
            model_1.singleTile = true;
        return model_1;
    }

    public Model getAnimatedModelSkeletal(SequenceDefinition primary, SequenceDefinition secondary, int primaryTick, int secondaryTick) {
        if (transforms != null) {
            NpcDefinition entityDef = method161();
            if (entityDef == null)
                return null;
            else
                return entityDef.getAnimatedModelSkeletal(primary, secondary, primaryTick, secondaryTick);
        }
        Model model = (Model) mruNodes.get(id);
        if (model == null) {
            boolean flag = false;
            for (int i1 = 0; i1 < models.length; i1++)
                if (!Model.isCached(models[i1]))
                    flag = true;

            if (flag)
                return null;
            Model aclass30_sub2_sub4_sub6s[] = new Model[models.length];
            for (int j1 = 0; j1 < models.length; j1++)
                aclass30_sub2_sub4_sub6s[j1] = Model.getModel(models[j1]);

            if (aclass30_sub2_sub4_sub6s.length == 1)
                model = aclass30_sub2_sub4_sub6s[0];
            else
                model = new Model(aclass30_sub2_sub4_sub6s.length, aclass30_sub2_sub4_sub6s);
            if (originalColors != null) {
                for (int k1 = 0; k1 < originalColors.length; k1++)
                    model.recolor(originalColors[k1], modifiedColours[k1]);

            }
            if (originalTextureColours != null) {
                for (int i1 = 0; i1 < originalTextureColours.length; i1++)
                    model.retexture(originalTextureColours[i1], modifiedTextureColours[i1]);
            }
            model.prepareSkeleton();
            model.light(64 + ambient, 850 + contrast, -30, -50, -30, true);
            // model.method479(84 + anInt85, 1000 + anInt92, -90, -580, -90, true);
            mruNodes.put(model, id);
        }
        Model model_1 = Model.emptyModel;
        model_1.buildSharedSequenceModel(model, false);
        if (primary != null && secondary != null) {
            model_1.playSkeletalDouble(primary, secondary, primaryTick, secondaryTick);
        } else {
            if (primary != null) {
                model_1.playSkeletal(primary, primaryTick);
            } else if (secondary != null) {
                model_1.playSkeletal(secondary, secondaryTick);
            }
        }
        if (widthScale != 128 || heightScale != 128)
            model_1.scale(widthScale, widthScale, heightScale);
        model_1.calculateBoundsCylinder();
        model_1.groupedTriangleLabels = null;
        model_1.groupedVertexLabels = null;
        if (size == 1)
            model_1.singleTile = true;
        return model_1;
    }

    private NpcDefinition() {
        custom = false;
        walkRightAnim = -1;
        varbit = walkAnim;
        rotateBackAnim = walkAnim;
        varp = walkAnim;
        combatLevel = -1;
        anInt64 = 1834;
        walkAnim = -1;
        size = 1;
        headIcon = -1;
        standAnim = -1;
        id = -1;
        rotation = 32;
        walkLeftAnim = -1;
        isInteractable = true;
        heightScale = 128;
        isMinimapVisible = true;
        widthScale = 128;
        hasRenderPriority = false;
        defaultHeight = -1;
    }



    public static void nullLoader() {
        mruNodes = null;
        streamIndices = null;
        cache = null;
        stream = null;
    }

    public static void dumpList() {
        try {
            File file = new File("./temp/npc_list.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < totalAmount; i++) {
                    NpcDefinition definition = lookup(i);
                    if (definition != null) {
                        writer.write("npc = " + i + "\t" + definition.name + "\t" + definition.combatLevel + "\t"
                                + definition.standAnim + "\t" + definition.walkAnim + "\t");
                        writer.newLine();
                    }
                }
            }

            System.out.println("Finished dumping npc definitions.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void dumpSizes() {
        try {
            File file = new File(System.getProperty("user.home") + "/Desktop/npcSizes 143.txt");

            if (!file.exists()) {
                file.createNewFile();
            }

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
                for (int i = 0; i < totalAmount; i++) {
                    NpcDefinition definition = lookup(i);
                    if (definition != null) {
                        writer.write(i + "	" + definition.size);
                        writer.newLine();
                    }
                }
            }

            System.out.println("Finished dumping npc definitions.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int walkRightAnim;
    public static int anInt56;
    public int varbit;
    public int rotateBackAnim;
    public int varp;
    public static Buffer stream;
    public int combatLevel;
    public final int anInt64;
    public String name;
    public String actions[];
    public int walkAnim;
    public byte size;
    public int[] modifiedColours;
    public static int[] streamIndices;
    public int[] chatheadModels;
    public int[] headIconArchiveIds;
    public short[] headIconSpriteIndex;
    public transient int headIcon;
    public int[] originalColors;
    public short[] originalTextureColours, modifiedTextureColours;
    public int standAnim;
    public int id;
    public int rotation;
    public static Client clientInstance;
    public int walkLeftAnim;
    public boolean isInteractable;
    public int ambient;
    public int heightScale;
    public int defaultHeight;
    public boolean isMinimapVisible;
    public int transforms[];
    public String description;
    public int widthScale;
    public int contrast;
    public boolean hasRenderPriority;
    public int[] models;
    public static EvictingDualNodeHashTable mruNodes = new EvictingDualNodeHashTable(70);
    public int[] anIntArray76;
    public int stats[];

    @Override
    public HeadIcon getOverheadIcon() {
        return HeadIcon.values()[headIcon];
    }

    @Override
    public int getIntValue(int paramID) {
        return 0;
    }

    @Override
    public void setValue(int paramID, int value) {

    }

    @Override
    public String getStringValue(int paramID) {
        return null;
    }

    @Override
    public void setValue(int paramID, String value) {

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int[] getModels() {
        return models;
    }

    @Override
    public String[] getActions() {
        return actions;
    }

    @Override
    public boolean isClickable() {
        return false;
    }

    @Override
    public boolean isFollower() {
        if (this.actions == null) {
            return false;
        }
        for (String action : this.actions) {
            if (action != null && action.contains("Pick-Up")) {
                return true;
            }
        }
        return false;
    }

    public int[] getHeadIconArchiveIds() {
        return headIconArchiveIds;
    }

    public short[] getHeadIconSpriteIndex() {
        return headIconSpriteIndex;
    }

    @Override
    public boolean isInteractible() {
        return isInteractable;
    }

    @Override
    public boolean isMinimapVisible() {
        return isMinimapVisible;
    }

    @Override
    public boolean isVisible() {
        return false;
    }

    @Override
    public int getId() {
        return (int) id;
    }

    @Override
    public int getCombatLevel() {
        return combatLevel;
    }

    @Override
    public int[] getConfigs() {
        return new int[0];
    }

    @Override
    public RSNPCComposition transform() {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getRsOverheadIcon() {
        return headIcon;
    }

    @Override
    public RSIterableNodeHashTable getParams() {
        return null;
    }

    @Override
    public void setParams(IterableHashTable params) {

    }

    @Override
    public void setParams(RSIterableNodeHashTable params) {

    }

    public int getDefaultHeadIconArchive() {
        return defaultHeadIconArchive;
    }
}