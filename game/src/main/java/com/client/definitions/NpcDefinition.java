package com.client.definitions;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
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
import com.client.model.Npcs;
import com.client.util.BufferExt;
import net.runelite.api.HeadIcon;
import net.runelite.api.IterableHashTable;
import net.runelite.rs.api.RSIterableNodeHashTable;
import net.runelite.rs.api.RSNPCComposition;


public final class NpcDefinition extends DualNode implements RSNPCComposition {
    public static EvictingDualNodeHashTable cache = new EvictingDualNodeHashTable(64);
    public transient boolean custom;
    public static NpcDefinition lookup(int i) {
        NpcDefinition npcDefinition = (NpcDefinition) cache.get(i);
        if(npcDefinition == null) {
            npcDefinition = new NpcDefinition();
            npcDefinition.id = i;
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.NPC, i);
            npcDefinition.readValues(new Buffer(data));
        }
        /*
        if (i == Npcs.BOB_BARTER_HERBS) {
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", "Prices", "Decant", "Clean", null };
        }
        if (i == Npcs.ZAHUR) {
            entityDef.custom = true;
            entityDef.actions[0] = "Trade";
        }
        if (i == Npcs.JOSSIK) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[2] = "Trade";
        }
        if (i == 9460 || i == 1150 || i == 2912 || i == 2911 || i == 2910 || i == 6481
                || i == 3500 || i == 9459 || i == 9457 || i == 9458) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
        }
        if (i == 8679) {
            entityDef.custom = true;
            entityDef.name = "Batman";
            entityDef.combatLevel = 0;
            entityDef.models = new int[] { 49994 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Talk-to", null, "Minigame", null };
            entityDef.rotation = 64;
        }
        if (i == 8368) {
            entityDef.custom = true;
            entityDef.name = "Flying Pumpkin";
            entityDef.combatLevel = 72;
            entityDef.models = new int[] { 49469 };
            entityDef.standAnim = 5021;
            entityDef.walkAnim = 5022;
            entityDef.size = 2;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
            entityDef.heightScale = 50; //WIDTH
            entityDef.widthScale = 50; // HEIGHT
        }
        if (i == 2577) {
            entityDef.custom = true;
            entityDef.name = "lil' Nyx";
            entityDef.combatLevel = 0;
            entityDef.models = new int[] {60050};
            entityDef.standAnim = 5022;
            entityDef.walkAnim = 5022;
            entityDef.size = 1;
            entityDef.isMinimapVisible = false;
            entityDef.heightScale = 50; //WIDTH
            entityDef.widthScale = 50; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 373) {
            entityDef.custom = true;
            entityDef.name = "Pheasant";
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 2268) {
            entityDef.custom = true;
            entityDef.name = "13th Pet Goblin";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 80; //WIDTH
            entityDef.widthScale = 80; // HEIGH
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 7633) {
            entityDef.custom = true;
            entityDef.name = "Giant Flying Pumpkin";
            entityDef.combatLevel = 300;
            entityDef.models = new int[] { 60035 };
            entityDef.standAnim = 5021;
            entityDef.walkAnim = 5022;
            entityDef.size = 4;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
        }
        if (i == 7623) {
            entityDef.custom = true;
            entityDef.name = "Jack-O-Kraken";
            entityDef.combatLevel = 616;
            entityDef.models = new int[] { 60049 };
            entityDef.standAnim = 3989;
            entityDef.walkAnim = 3989;
            entityDef.size = 4;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
        }
        if (i == 4629) {
            entityDef.custom = true;
            entityDef.name = "Flying Pumpkin pet";
            entityDef.combatLevel = 0;
            entityDef.models = new int[] { 60037 };
            entityDef.standAnim = 5021;
            entityDef.walkAnim = 5022;
            entityDef.rotation = 64;
            entityDef.size = 1;
            entityDef.isMinimapVisible = false;
            entityDef.heightScale = 25; //WIDTH
            entityDef.widthScale = 25; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 4630) {
            entityDef.custom = true;
            entityDef.name = "Jack-O-Kraken pet";
            entityDef.combatLevel = 0;
            entityDef.models = new int[] { 49470 };
            entityDef.standAnim = 3989;
            entityDef.walkAnim = 3989;
            entityDef.actions = new String[5];
            entityDef.rotation = 64;
            entityDef.size = 1;
            entityDef.isMinimapVisible = false;
            entityDef.heightScale = 25; //WIDTH
            entityDef.widthScale = 25; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == Npcs.PERDU) {
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", null, "Reclaim-lost", null, null};
        }
        if (i == 34318) {
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", null, "Reclaim", null, null};
        }
        if (i == 8184) {
            entityDef.custom = true;
            entityDef.name = "Theatre Of Blood Wizard";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Teleport";
        }
        if (i == 7599) {
            entityDef.custom = true;
            entityDef.name = "ArkCane Guide";
        }
        if (i == 4305) {
            entityDef.custom = true;
            entityDef.name = "Drunken cannoneer";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Pickpocket";
        }
        if (i == 3247) {
            entityDef.custom = true;
            entityDef.name = "Wizard";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Teleport";
        }
        if (i == 6517) {
            entityDef.custom = true;
            entityDef.name = "Daily-reward wizard";
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[2] = "View rewards";
        }
        if (i == 3428 || i == 3429) {
            entityDef.custom = true;
            entityDef.name = "Elf warrior";
        }
        if (i == 3428 || i == 3429) {
            entityDef.custom = true;
            entityDef.name = "Elf warrior";
        }
        if (i == 5044) { // sanfew (decant)
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Decant-potions";
        }
        if (i == 8026) {
            entityDef.custom = true;
            entityDef.combatLevel = 392;
        }
        if (i == 7913) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Ironman shop keeper";
            entityDef.description = "A shop specifically for iron men.";
        }
        if (i == 8906) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Santa's little elf";
            entityDef.description = "A helper sent from santa himself.";
            entityDef.actions = new String[] { "Talk-To", null, "Christmas Shop", "Return-Items", null };
        }
        if (i == 954) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Crystal Seed Trader";
            entityDef.description = "Use a seed on me to get a Crystal Bow.";

        }
        if (i == 6970) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Theif";
            entityDef.actions = new String[] { null, null, "Pickpocket",  null,  null };
        }
        if (i == 8761) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Assignment", "Trade", "Rewards" };
        }
        if (i == 1531) {
            entityDef.custom = true;
            entityDef.name = "Fishing Spot";
            entityDef.actions = new String[] { "Bait", null, null, null, null };
            entityDef.description = "A fishing spot in lava ??.";
        }
        if (i == 9400) {
            entityDef.custom = true;
            entityDef.name = "Ted O'bombr";
        }
        if (i == 7677) {
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", null, "Bank", "Foundry Prices",  null, };
        }
        if (i == 8026 || i == 8027 || i == 8028) {
            entityDef.custom = true;
            entityDef.size = 9;
        }
        if (i == 7954) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Achievement Master";
            entityDef.actions = new String[] { "Trade", null, "Open Achievements", null, null, };

        }
        if (i == 5870) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Assignment", "Trade", "Rewards" };

        }
        if (i == 3400) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Giveaway Manager";
            entityDef.actions = new String[] { "Open-manager", null, null, null, null };

        }
        if (i == 1013) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Fortune Freddy";
            entityDef.description = "Have you got Freddy's luck to obtain some amazing!.";
            entityDef.actions = new String[] { "WheelOfFortune", null, "Quick-Spin", null, null };
        }
        if (i == 308) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "PKP Manager";
        }
        if (i == 13) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Referral Tutor";
            entityDef.description = "He manages referrals.";
        }
        if (i == 5293) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Elven Keeper";
        }
        if (i == 5978) {
            entityDef.custom = true;
            entityDef.name = "FlowerPoker Guard";
        }
        if(i==3218 || i ==3217){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==2897){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Trading Post Manager";
            entityDef.actions = new String[] { "Open", null, "Collect", null, null };
        }
        if(i==1306){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Make-over", null, null, null, null };
        }
        if(i==3257){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1011){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Item Gambler";
            entityDef.actions = new String[] { "Info", null, "Gamble", null, null };
        }
        if(i==3248){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = Configuration.CLIENT_TITLE + " Wizard";
            entityDef.actions = new String[] { "Teleport", null, "Previous Location", null, null };
        }
        if(i==1520){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Small Net", null, "Harpoon", null, null };
        }
        if(i==8920){
            entityDef.custom = true;
            entityDef.actions = new String[] { null, "Attack", null, null, null };
        }
        if(i==8921){
            entityDef.custom = true;
            entityDef.name = "Crystal Whirlwind";
        }
        if(i==9120){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Donator Shop";
            entityDef.actions = new String[] { "Trade", null, "Rewards", null, null };
        }
        if(i == 2662){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Tournament Manager";
            entityDef.actions = new String[] { "Open-Shop", null, null, null, null };
        }
        if(i==603){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Captain Kraken";
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if(i==7041){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Ticket Exchange";
            entityDef.actions = new String[] { "Exchange", null, null, null, null };
        }
        if(i==3894){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Sigmund The Merchant";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }

        if (i==7413) {
            entityDef.custom = true;
            entityDef.name = "Max Dummy";
            entityDef.actions[0] = null;
        }
        if(i==9011){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Vote Shop";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1933){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Mills";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==8819){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Boss point shop";
            entityDef.actions = new String[] { null, null, "Trade", null, null };
        }
        if(i==8688){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Fat Tony";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==7769){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Shop Keeper";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==6987){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Man";
            entityDef.actions = new String[] { "Talk", null, "Pickpocket", null, null };
        }
        if(i==5730){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Master Farmer";
            entityDef.actions = new String[] { "Pickpocket", null, "Trade", null, null };
        }
        if(i==1501){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Hunter Store";
            entityDef.actions = new String[] { null, null, null, null, "Trade" };
        }
        if(i==2913){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Fishing Store";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==5809){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Crafting and Tanner";
            entityDef.actions = new String[] { "Tan", null, "Trade", null, null };
        }
        if(i==555){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Sell Me Store";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==9168){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Flex";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==8208){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Pet Collector";
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if(i==8202){
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", "Pick-Up", null, null, null };
        }
        if(i==4921){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Supplies";
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if (i == 5314) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Mystical Wizard";
            entityDef.actions = new String[] { "Teleport", "Previous Location", null, null, null };
            entityDef.description = "This wizard has the power to teleport you to many locations.";
        }
        if (i == 8781) {
            entityDef.custom = true;
            entityDef.name = "@red@Queen Latsyrc";
            entityDef.combatLevel = 982;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.heightScale = 175; //WIDTH
            entityDef.widthScale = 175; // HEIGH
        }


        if (i == 655) {
            entityDef.custom = true;
            entityDef.name = "@gre@AFK Goblin";
            entityDef.combatLevel = 4012;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.heightScale = 500; //WIDTH
            entityDef.widthScale = 500; // HEIGHT
            entityDef.size = 4;
        }
        if(i==1577){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Melee Shop";
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1576){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Range Shop";
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if(i==1578){
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.name = "Mage Shop";
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Trade", null, null, null, null };
        }
        if (i == 315) {
            entityDef.custom = true;
            entityDef.name = "Steve";
        }

        if (i == 8026) {
            entityDef.custom = true;
            entityDef.name = "Vorkath";
            // entityDef.combatLevel = 732;
            entityDef.models = new int[] { 35023 };
            entityDef.standAnim = 7946;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Poke", null, null, null, null };
            entityDef.heightScale = 100;
            entityDef.widthScale = 100;
        }
        if (i == 7852 || i == 7853 || i == 7884) {//Dawn
            entityDef.custom = true;
            entityDef.standAnim = 7775;
            entityDef.walkAnim = 7775;
        }
        if (i == 5518) {
            entityDef.custom = true;
            entityDef.standAnim = 185;
        }
        if (i == 8019) {
            entityDef.custom = true;
            entityDef.standAnim = 185;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[2] = "Trade";
        }
        if (i == 308) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[2] = "Trade";
            entityDef.actions[3] = "Disable Interface";
            entityDef.actions[4] = "Skull";
        }
        if (i == 6088) {
            entityDef.custom = true;
            entityDef.standAnim = 185;
            entityDef.actions = new String[5];
            entityDef.actions[0] = "Talk-to";
            entityDef.actions[2] = "Travel";
        }
        if (i == 1434 || i == 876 || i == 1612) {//gnome fix
            entityDef.custom = true;
            entityDef.standAnim = 185;
        }
        if (i == 7674 || i == 8009 || i == 388 || i == 8010) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 8492 || i == 8493 || i == 8494 || i == 8495) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 8737 || i == 8738 || i == 8009 || i == 7674) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 326 || i == 327) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 85;
            entityDef.widthScale = 85;
            entityDef.name = "Vote Pet";
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i >= 7354 && i <=7367) {
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i >= 3169 && i <= 3183) {
            entityDef.custom = true;
            entityDef.standAnim = 6952;
        }
        if (i == 5559 || i == 5560) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 2149 || i == 2150 || i == 2151 || i == 2148) {
            entityDef.custom = true;
            entityDef.name = "Trading Clerk";
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Bank", null, "Trading Post", null, null };
        }
        if (i == 6473) { //terror dog
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 50; //WIDTH
            entityDef.widthScale = 50; // HEIGH
        }
        if (i == 3510) { //outlast shop
            entityDef.custom = true;
            entityDef.name = "Trader";
            entityDef.combatLevel = 0;
            entityDef.isMinimapVisible = true;
            entityDef.heightScale = 150; //WIDTH
            entityDef.widthScale = 150; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Open-Shop", null, null, null, null };
        }
        if (i == 488) { //rain cloud
            entityDef.custom = true;
            entityDef.combatLevel = 0;
            entityDef.size = 1;
            entityDef.isMinimapVisible = true;
            entityDef.heightScale = 150; //WIDTH
            entityDef.widthScale = 150; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 5644) { //swapcreature
            entityDef.custom = true;
            entityDef.heightScale = 300; //WIDTH
            entityDef.widthScale = 300; // HEIGH
        }
        if (i == 7668) { //voice of yama
            entityDef.custom = true;
            entityDef.name = "Kratos";
            entityDef.size = 2;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 90; //WIDTH
            entityDef.widthScale = 90; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 1377) {
            entityDef.custom = true;
            entityDef.size = 3;
            entityDef.heightScale = 300; //WIDTH
            entityDef.widthScale = 300; // HEIGH
            entityDef.actions[0] = null;
        }
        if (i == 2105) {
            entityDef.custom = true;
            entityDef.size = 4;
            entityDef.heightScale = 600; //WIDTH
            entityDef.widthScale = 600; // HEIGH
        }
        if (i == 2107) {
            entityDef.custom = true;
            entityDef.size = 4;
            entityDef.heightScale = 600; //WIDTH
            entityDef.widthScale = 600; // HEIGH
        }
        if (i == 2850) {
            entityDef.custom = true;
            entityDef.name = "GIM Tracker";
            entityDef.actions = new String[] { "Open", null, null, null, null };

        }
        if (i == 6119) { //weird monster
            entityDef.custom = true;
            entityDef.size = 1;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 30; //WIDTH
            entityDef.widthScale = 30; // HEIGH
        }
        if (i == 763) { //roc
            entityDef.custom = true;

            entityDef.size = 1;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 30; //WIDTH
            entityDef.widthScale = 30; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };


        }
        if (i == 762) { //foe small bird
            entityDef.custom = true;
            entityDef.size = 1;
            entityDef.combatLevel = 0;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", "Metamorphosis", null };
        }
        if (i == 4987 || i == 6292 || i == 6354 ) { //chronzon
            entityDef.custom = true;
            entityDef.size = 1;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 45; //WIDTH
            entityDef.widthScale = 45; // HEIGH
        }
        if (i == 8709) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.name = "Corrupt Beast";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 60; //WIDTH
            entityDef.widthScale = 60; // HEIGH
            entityDef.size = 1;
        }
        if (i == 7025) { //guard dog
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGH
        }

        if (i == 6716) {//prayer
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 65; //WIDTH
            entityDef.widthScale = 65; // HEIGH
            entityDef.combatLevel = 0;


        }

        if (i == 6723) {//healer
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 65; //WIDTH
            entityDef.widthScale = 65; // HEIGH
            entityDef.combatLevel = 0;

        }
        if (i == 1088) {
            entityDef.custom = true;
            entityDef.name = "Seren";
            entityDef.models = new int[] { 38605 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 65; //WIDTH
            entityDef.widthScale = 65; // HEIGH
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8372;
            entityDef.walkAnim = 8372;
            entityDef.models = new int[] { 38605 };

        }
        if (i == 1089) {
            entityDef.custom = true;
            entityDef.name = "Lil mimic";
            entityDef.models = new int[] { 37142 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 25; //WIDTH
            entityDef.widthScale = 25; // HEIGH
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8307;
            entityDef.walkAnim = 8306;
            entityDef.models = new int[] { 37142 };

        }
        if (i == 2120) {
            entityDef.custom = true;
            entityDef.name = "Shadow Ranger";
            entityDef.models = new int[] { 29267 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGH
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8526;
            entityDef.walkAnim = 8527;
            entityDef.models = new int[] { 29267 };

        }
        if (i == 2121) {
            entityDef.custom = true;
            entityDef.name = "Shadow Wizard";
            entityDef.models = new int[] { 29268 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGH
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8526;
            entityDef.walkAnim = 8527;
            entityDef.models = new int[] { 29268 };
        }
        if (i == 2122) {
            entityDef.custom = true;
            entityDef.name = "Shadow Warrior";
            entityDef.models = new int[] { 29266 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGH
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8526;
            entityDef.walkAnim = 8527;
            entityDef.models = new int[] { 29266 };
        }

        if (i == 7216 || i == 6473) {//green monkey and green dog
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 6723 || i == 6716 || i == 8709) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 3291) {//postie pete
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 5738) {//imp
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 5240) {//toucan
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 834) {
            entityDef.custom = true;
            entityDef.name = "King penguin";
            entityDef.actions = new String[5];
            entityDef.combatLevel = 0;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };

        }
        if (i == 1873) {//klik
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.standAnim = 3345;
            entityDef.walkAnim = 3346;

        }

        if (i == 4923) {
            entityDef.custom = true;
            entityDef.name = "Groot";
            entityDef.combatLevel = 849;
            entityDef.models = new int[] { 47110 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
            entityDef.heightScale = 250;
            entityDef.widthScale = 250;
            entityDef.size = 3;
        }

        if (i == 3472) {
            entityDef.custom = true;
            entityDef.name = "Lil' Groot";
            entityDef.models = new int[] { 47110 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.rotation = 64;
            entityDef.heightScale = 65;
            entityDef.widthScale = 65;
            entityDef.size = 1;
        }

        if (i == 7316) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Trade", null, null };
        }

        if (i == 6298) {
            entityDef.custom = true;
            entityDef.heightScale = 300; //WIDTH
            entityDef.widthScale = 300; // HEIGH
        }

        if (i == 5630) { // Giant Snail
            entityDef.custom = true;
            entityDef.headIcon = 6;
        }
        if (i == 6474) {
            entityDef.custom = true;
            entityDef.headIcon = 1;
        }
        if (i == 7804) {
            entityDef.custom = true;
            entityDef.headIcon = 0;
        }
        if (i == 2948) {
            entityDef.custom = true;
            entityDef.headIcon = 0;
        }
        if (i == 1101 || i == 7594) {
            entityDef.custom = true;
            entityDef.headIcon = 8;
        }
        if (i == 7594) {
            entityDef.custom = true;
            entityDef.combatLevel = 90;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
        }
        if (i == 8164) {
            entityDef.custom = true;
            entityDef.name = "Shadow of Araphel";
            entityDef.combatLevel = 666;
            entityDef.models = new int[] { 46831 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
            entityDef.heightScale = 180;
            entityDef.widthScale = 180;
            entityDef.size = 3;
        }
        if (i == 8172) {
            entityDef.custom = true;
            entityDef.name = "Araphel";
            entityDef.combatLevel = 666;
            entityDef.models = new int[] { 46832 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.rotation = 64;
            entityDef.heightScale = 180;
            entityDef.widthScale = 180;
            entityDef.size = 3;
        }

        // NEW PETS
        if (i == 2304) {
            entityDef.custom = true;
            entityDef.name = "mystery box";
            entityDef.models = new int[] { 47004 };//mystery box
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 5021;
            entityDef.walkAnim = 5022;
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGHT
        }



        if (i == 2308) {
            entityDef.custom = true;
            entityDef.name = "Magic Pet";
            entityDef.models = new int[] { 60003 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.heightScale = 65; //WIDTH
            entityDef.widthScale = 65; // HEIGH
            entityDef.combatLevel = 0;
            entityDef.standAnim = 1539;
            entityDef.walkAnim = 1539;
        }
        if (i == 5568 || i == 5569 || i == 5570 || i == 5571) {
            entityDef.custom = true;
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }

        if (i == 2311) {
            entityDef.custom = true;
            entityDef.name = "Mask";
            entityDef.models = new int[] { 60004 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGHT
            entityDef.size = 1;
            entityDef.standAnim = 1539;
            entityDef.walkAnim = 1539;
        }

        if (i == 2300) {
            entityDef.custom = true;
            entityDef.models = new int[1];
            entityDef.name = "Skeleton";
            entityDef.models = new int[] { 47008 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }

        if (i == 2301) {
            entityDef.custom = true;
            entityDef.name = "Beaver";
            entityDef.models = new int[] { 60001 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGHT
        }

        if (i == 2302) {
            entityDef.custom = true;
            entityDef.name = "Rock";//Mystery box
            entityDef.models = new int[] { 47003 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGHT
        }

        if (i == 2307) {
            entityDef.custom = true;
            entityDef.name = "Fish";
            entityDef.models = new int[] { 60002 };//Santa hat = 50078
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 8526;
            entityDef.walkAnim = 8527;
            entityDef.heightScale = 85; //WIDTH
            entityDef.widthScale = 85; // HEIGH
        }

        if (i == 2305) {
            entityDef.custom = true;
            entityDef.name = "Jack The Pumpkin King";
            entityDef.models = new int[] { 47011, 47013, 47015, 47017, 47019, 47021 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Teleport", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 13;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }


        if (i == 2312) {
            entityDef.custom = true;
            entityDef.name = "@gre@$$@blu@CashMoney@gre@$$";
            entityDef.models = new int[] { 47025 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.standAnim = 7939;
            entityDef.walkAnim = 7939;
            entityDef.size = 1;
            entityDef.combatLevel = 0;
        }

        if (i == 2313) {
            entityDef.custom = true;
            entityDef.name = "Charlie";
            entityDef.models = new int[] { 46779 };
            entityDef.description = "A Christmas Imp.";
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            NpcDefinition npcDefinition = NpcDefinition.lookup(3134);
            entityDef.standAnim = npcDefinition.standAnim;
            entityDef.walkAnim =  npcDefinition.walkAnim;
            entityDef.size = 1;
            entityDef.combatLevel =  npcDefinition.combatLevel;
        }

        if (i == 5371) {
            entityDef.custom = true;
            entityDef.combatLevel = 666;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
        }

        if (i == 539) {
            entityDef.custom = true;
            entityDef.description = "Elfinlocks the keeper of the seasonal shop.";
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Open-Shop", null, null };
        }

        if (i == 2306) {
            entityDef.custom = true;
            entityDef.name = "Snowy";
            entityDef.models = new int[] { 46751 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Teleport", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }

        if (i == 5169) {
            entityDef.custom = true;
            entityDef.name = "Durial321";
            entityDef.models = new int[] { 187, 214, 246, 6669, 35817, 6659, 3704, 5409, 9347, 13307, 9638, 9642 };
            entityDef.originalColors = new int[] { 926, 6798 };
            entityDef.modifiedColours = new int[] { 22464, 5186 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.combatLevel = 115;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 300; //WIDTH
            entityDef.widthScale = 300; // HEIGHT
        }

        //dark pets
        if (i == 2309) {
            entityDef.custom = true;
            entityDef.name = "Discord";
            entityDef.models = new int[] { 46747 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Sync", "Open-Shop", null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 7939;
            entityDef.walkAnim = 7939;
        }



        if (i == 2316) {
            entityDef.custom = true;
            entityDef.name = "Guardian Angel";
            entityDef.models = new int[] { 60017 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 100;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 75; //WIDTH
            entityDef.widthScale = 75; // HEIGH
            entityDef.size = 1;
        }

        if (i == 837) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
        }

        if (i == 11226) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
        }
        if (i == 8027) {
            entityDef.custom = true;
            entityDef.name = "Vorkath";
            entityDef.combatLevel = 732;
            entityDef.models = new int[] { 35023 };
            entityDef.standAnim = 7950;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, null, null, null, null };
            entityDef.heightScale = 100;
            entityDef.widthScale = 100;
        }
        if (i == 8028) {
            entityDef.custom = true;
            entityDef.name = "Vorkath";
            entityDef.combatLevel = 732;
            entityDef.models = new int[] { 35023 };
            entityDef.standAnim = 7948;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.heightScale = 100;
            entityDef.widthScale = 100;
        }
        if (i == 1257) {
            entityDef.custom = true;
            entityDef.name = "Fluffie";
            entityDef.combatLevel = 1;
            entityDef.standAnim = 4472;
            entityDef.walkAnim = 4473;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.heightScale = 400;
            entityDef.widthScale = 400;
        }
        if (i == 8054) {
            entityDef.custom = true;
            entityDef.name = "Gingerbread Man";
            entityDef.combatLevel = 75;
            entityDef.models = new int[] { 49472 };
            entityDef.standAnim = -1;
            entityDef.walkAnim = 819;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.size = 2;
        }

        if (i == 4851) {
            entityDef.custom = true;
            entityDef.name = "lil' Gingie";
            entityDef.models = new int[] { 49472 };
            entityDef.standAnim = -1;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            entityDef.size = 2;
            entityDef.heightScale = 75;
            entityDef.widthScale = 75;
        }

        if (i == 4852) {
            entityDef.custom = true;
            entityDef.name = "lil' Elf";
            entityDef.models = new int[] { 49473, 36100 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            entityDef.size = 2;
            entityDef.heightScale = 75;
            entityDef.widthScale = 75;
        }

        if (i == 4850) {
            entityDef.custom = true;
            entityDef.name = "lil' Evil Snowman";
            entityDef.models = new int[] { 46750 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] {"Talk-to", null, "Pick-Up", null, null };
            entityDef.size = 2;
            entityDef.heightScale = 50;
            entityDef.widthScale = 50;
        }

        if (i == 5507) {
            entityDef.custom = true;
            entityDef.name = "Elf";
            entityDef.combatLevel = 75;
            entityDef.models = new int[] { 49473, 36100 };
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.isMinimapVisible = true;
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.heightScale = 75;
            entityDef.widthScale = 75;
            entityDef.size = 2;
        }

        if (i == 5509) {
            entityDef.custom = true;
            entityDef.name = "Evil Nutcracker";
            entityDef.models = new int[] { 46868, 217, 246, 46842, 46848, 46839, 46849, 13307, 9642, 46852 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.combatLevel = 75;
            entityDef.standAnim = 1421;
            entityDef.walkAnim = 1422;
            entityDef.heightScale = 75; //WIDTH
            entityDef.widthScale = 75; // HEIGHT
            entityDef.size = 1;
        }

        if (i == 2310) {
            entityDef.custom = true;
            entityDef.name = "Jack Frost";
            entityDef.models = new int[] { 47023 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }

        if (i == 2314) {
            entityDef.custom = true;
            entityDef.name = "Evil Snowman Minion";
            entityDef.models = new int[] { 46749 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 126;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 25; //WIDTH
            entityDef.widthScale = 25; // HEIGH
            entityDef.size = 1;
        }

        if (i == 2317) {
            entityDef.custom = true;
            entityDef.name = "Evil Snowman";
            entityDef.models = new int[] { 46750 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { null, "Attack", null, null, null };
            entityDef.originalColors = null;
            entityDef.modifiedColours = null;
            entityDef.combatLevel = 126;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
            entityDef.heightScale = 150; //WIDTH
            entityDef.widthScale = 150; // HEIGH
            entityDef.size = 4;
        }
        if (i == 7118) {
            entityDef.custom = true;
            entityDef.name = "Maniacal Monkey";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 120; //WIDTH
            entityDef.widthScale = 120; // HEIGH
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 1467) {
            entityDef.custom = true;
            entityDef.name = "Zombie Monkey";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 120; //WIDTH
            entityDef.widthScale = 120; // HEIGH
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 2315) {
            entityDef.custom = true;
            entityDef.name = "Santa";
            entityDef.models = new int[] { 189, 217, 253, 28983, 28981, 28978, 28979, 28989 };
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, null, null, null };
            entityDef.originalColors = new int[] { 8741, 25238, 7073, 10297, 9104, 906 };
            entityDef.modifiedColours = new int[] { 5210, 7333, 7467, 5206, 7452, 8596 };
            entityDef.combatLevel = 0;
            entityDef.standAnim = 808;
            entityDef.walkAnim = 819;
        }
        if (i == 8087) {
            entityDef.custom = true;
            entityDef.name = "Baby Red dragon";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 40; //WIDTH
            entityDef.widthScale = 40; // HEIGH
            entityDef.size = 2;
            entityDef.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8081) {
            entityDef.custom = true;
            entityDef.name = "Baby Green dragon";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 40; //WIDTH
            entityDef.widthScale = 40; // HEIGH
            entityDef.size = 2;
            entityDef.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8093) {
            entityDef.custom = true;
            entityDef.name = "Baby Black dragon";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 40; //WIDTH
            entityDef.widthScale = 40; // HEIGH
            entityDef.size = 2;
            entityDef.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 8083) {
            entityDef.custom = true;
            entityDef.name = "Baby Blue dragon";
            entityDef.combatLevel = 0;
            entityDef.heightScale = 40; //WIDTH
            entityDef.widthScale = 40; // HEIGH
            entityDef.size = 2;
            entityDef.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 2592) {
            entityDef.custom = true;
            entityDef.name = "Realm Nyx";
            entityDef.combatLevel = 0;
            entityDef.models = new int[] {60048};
            entityDef.standAnim = 5022;
            entityDef.walkAnim = 5022;
            entityDef.size = 1;
            entityDef.isMinimapVisible = false;
            entityDef.heightScale = 50; //WIDTH
            entityDef.widthScale = 50; // HEIGH
            entityDef.actions = new String[5];
            entityDef.actions = new String[] { "Talk-to", null, "Pick-Up", null, null };
        }
        if (i == 12889) {
            entityDef.custom = true;
            entityDef.name = "Primio";
            entityDef.combatLevel = 0;
            entityDef.standAnim = 10947;
            entityDef.heightScale = 120; //WIDTH
            entityDef.widthScale = 120; // HEIGH
            entityDef.size = 3;
            entityDef.actions = new String[]{"Talk-to", null, "Pick-Up", null, null};
        }
        if (i == 11675) {
            entityDef.custom = true;
            entityDef.name = "SmS";
            entityDef.actions = new String[]{"Talk-to", null, null, null, null};
        }
        if(i==10532) {
            entityDef.custom = true;
            entityDef.combatLevel = 982;
            entityDef.isMinimapVisible = true;
            entityDef.heightScale = 75;
            entityDef.widthScale = 75;
        }
        if(i==10531){
            entityDef.custom = true;
            entityDef.combatLevel = 982;
            entityDef.isMinimapVisible = true;
            entityDef.heightScale = 75;
            entityDef.widthScale = 75;
        }
        if(i==7144){
            entityDef.custom = true;
            entityDef.headIcon = 0;
        }
        if(i==963){
            entityDef.custom = true;
            entityDef.headIcon = 6;
        }
        if(i==7145){
            entityDef.name = "Demonic Gorilla";
            entityDef.custom = true;
            entityDef.headIcon = 1;
        }
        if(i==7146){
            entityDef.name = "Demonic Gorilla";
            entityDef.custom = true;
            entityDef.headIcon = 2;
        }
        if (entityDef.name != null && entityDef.name.toLowerCase().contains("chinchompa") && !entityDef.name.toLowerCase().contains("baby")) {
            entityDef.custom = true;
            entityDef.actions = new String[5];
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
                entityDef.custom = true;
                entityDef.combatLevel = 75;
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
                entityDef.custom = true;
                entityDef.standAnim = 2904;
                entityDef.walkAnim = 2943;
                break;
        }
         */
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

    public static void unpackConfig() {
        totalAmount = Js5List.configs.getGroupFileCount(Js5ConfigType.NPC) + 2_500;
    }
    public int category;

    private void readValues(Buffer buffer) {
        int previousOpcode = -1;
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
            } else if (opcode >= 30 && opcode < 40) {
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
                int index = buffer.readUnsignedByte();
                int var4 = 0;
                int var5;
                for(var5 = index; var5 != 0; var5 >>= 1) {
                    ++var4;
                }

                headIconArchiveIds = new int[var4];
                headIconSpriteIndex = new short[var4];

                for(int var6 = 0; var6 < var4; ++var6) {
                    if ((index & 1 << var6) == 0) {
                        headIconArchiveIds[var6] = -1;
                        headIconSpriteIndex[var6] = -1;
                    } else {
                        headIconArchiveIds[var6] = buffer.readShort();
                        headIconSpriteIndex[var6] = (short)buffer.readShort();
                    }
                }
            } else if (opcode == 103)
                rotation = buffer.readUShort();
            else if (opcode == 107) {
                isInteractable = false;
            } else if(opcode == 109) {
                buffer.readByte();
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
        if (varbit != -1 && varbit <= 2113) {
            VarBit varBit = VarBit.cache[varbit];
            int k = varBit.anInt648;
            int l = varBit.anInt649;
            int i1 = varBit.anInt650;
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
            model.generateBones();
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
            model.generateBones();
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
    }

    @Override
    public String toString() {
        return "NpcDefinition{" +
                "npcId=" + id +
                ", combatLevel=" + combatLevel +
                ", name='" + name + '\'' +
                ", actions=" + Arrays.toString(actions) +
                ", walkAnim=" + walkAnim +
                ", size=" + size +
                ", standAnim=" + standAnim +
                ", childrenIDs=" + Arrays.toString(transforms) +
                ", models=" + Arrays.toString(models) +
                '}';
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
    public boolean isMinimapVisible;
    public int transforms[];
    public String description;
    public int widthScale;
    public int contrast;
    public boolean hasRenderPriority;
    public int[] models;
    public static EvictingDualNodeHashTable mruNodes = new EvictingDualNodeHashTable(70);
    public int[] anIntArray76;

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
}