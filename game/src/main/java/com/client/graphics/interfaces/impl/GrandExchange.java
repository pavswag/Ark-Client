package com.client.graphics.interfaces.impl;

import com.client.graphics.interfaces.RSInterface;

public class GrandExchange extends RSInterface {
	
	/**
	 * Interfaces:
	 * 
	 * Main GE Interface	:	25000
	 * Buy Interface		:	25600
	 * Sell Interface		:	25650
	 * Collect Interface	:	26000
	 * 
	 * Offer status interfaces
	 * Box 0	:	25800
	 * Box 1	:	25820
	 * Box 2	:	25840
	 * Box 3	:	25860
	 * Box 4	:	25880
	 * Box 5	:	25900
	 * Box 6	:	25920
	 * Box 7	:	25940
	 * 
	 */
	
	private static int GREEN_COLOR = 0x005F00;
	
	private static int RED_COLOR = 0x8F0000;

	public static int[] grandExchangeBuyAndSellBoxIds = new int[] {
		25100, 25120, 25140, 25160,
		25180, 25200, 25220, 25240
	};
	
	public static int[] grandExchangeItemBoxIds = new int[] {
		25300, 25320, 25340, 25360,
		25380, 25400, 25420, 25440
	};
	
	public static int[] grandExchangeOfferStatusInterfaceIds = new int[] {
		25800, 25820, 25840, 25860,
		25880, 25900, 25920, 25940
	};

	private static void addGEBox(int identity, int slotType) {
		RSInterface component = addInterface(identity);
		component.id = identity;
		component.type = 22;
		component.width = 115;
		component.height = 110;
		component.grandExchangeSlot = slotType;
	}

	public static boolean isSmallItemSprite(int childId) {
		for(int index = 0; index < grandExchangeItemBoxIds.length; index++)
			if(childId == grandExchangeItemBoxIds[index] + 4)
				return true;
		return false;
	}
	
}