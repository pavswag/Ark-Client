package com.client;
// Decompiled by Jad v1.5.8f. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 

final class TextInput {

	public static String method525(int i, Buffer stream) {
		int j = 0;
		for (int l = 0; l < i; l++) {
			int i1 = stream.readUnsignedByte();// recieved from server
			aCharArray631[j++] = validChars[i1];
		}

		boolean flag1 = true;
		for (int k1 = 0; k1 < j; k1++) {
			char c = aCharArray631[k1];
			if (flag1 && c >= 'a' && c <= 'z') {
				aCharArray631[k1] += '\uFFE0';
				flag1 = false;
			}
			if (c == '.' || c == '!' || c == '?')
				flag1 = true;
		}
		return new String(aCharArray631, 0, j);
	}

	public static void method526(String s, Buffer stream) {
		if (s.length() > 80)
			s = s.substring(0, 80);
		s = s.toLowerCase();
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			int k = 0;
			for (int l = 0; l < validChars.length; l++) {
				if (c != validChars[l])
					continue;
				k = l;
				break;
			}
			stream.writeUnsignedByte(k);// sending to server
		}
	}

	public static String processText(String s) {
		stream.pos = 0;
		method526(s, stream);
		int j = stream.pos;
		stream.pos = 0;
		String s1 = method525(j, stream);
		return s1;
	}

	private static final char[] aCharArray631 = new char[100];
	private static final Buffer stream = new Buffer(new byte[100]);
	/*
	 * private static char validChars[] = { ' ', 'e', 't', 'a', 'o', 'i', 'h',
	 * 'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p', 'b',
	 * 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5', '6', '7',
	 * '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')', '-', '&', '*',
	 * '\\', '\'', '@', '#', '+', '=', '\243', '$', '%', '"', '[', ']', '>',
	 * '<', '^', '/' };
	 */
	private static char validChars[] = { ' ', 'e', 't', 'a', 'o', 'i', 'h',
			'n', 's', 'r', 'd', 'l', 'u', 'm', 'w', 'c', 'y', 'f', 'g', 'p',
			'b', 'v', 'k', 'x', 'j', 'q', 'z', '0', '1', '2', '3', '4', '5',
			'6', '7', '8', '9', ' ', '!', '?', '.', ',', ':', ';', '(', ')',
			'-', '&', '*', '\\', '\'', '@', '#', '+', '=', '\243', '$', '%',
			'"', '[', ']', '>', '<', '^', '`', '~', '_', '/' };

}
