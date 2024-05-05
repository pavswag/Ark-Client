// 
// Decompiled by Procyon v0.5.36
// 

public class ServerPacket
{
    public static final ServerPacket field2579;
    public static final ServerPacket field2580;
    public static final ServerPacket field2581;
    public static final ServerPacket CLANCHANNEL_DELTA;
    public static final ServerPacket field2583;
    public static final ServerPacket field2584;
    public static final ServerPacket REFLECTION_CHECK;
    public static final ServerPacket field2586;
    public static final ServerPacket IF_SETTEXT;
    public static final ServerPacket field2588;
    public static final ServerPacket CHAT_FILTER_SETTINGS;
    public static final ServerPacket SPOTANIM_SPECIFIC;
    public static final ServerPacket field2591;
    public static final ServerPacket field2592;
    public static final ServerPacket field2593;
    public static final ServerPacket field2594;
    public static final ServerPacket UPDATE_ZONE_PARTIAL_FOLLOWS;
    public static final ServerPacket field2596;
    public static final ServerPacket field2597;
    public static final ServerPacket field2598;
    public static final ServerPacket field2599;
    public static final ServerPacket field2600;
    public static final ServerPacket field2601;
    public static final ServerPacket NPC_INFO_LARGE;
    static final ServerPacket field2603;
    public static final ServerPacket ENTER_FREECAM;
    public static final ServerPacket field2605;
    public static final ServerPacket IF_SETPOSITION;
    public static final ServerPacket field2607;
    public static final ServerPacket field2608;
    public static final ServerPacket field2609;
    public static final ServerPacket field2610;
    public static final ServerPacket field2611;
    public static final ServerPacket UPDATE_INV_PARTIAL;
    public static final ServerPacket field2613;
    public static final ServerPacket field2614;
    public static final ServerPacket field2615;
    public static final ServerPacket field2616;
    public static final ServerPacket IF_SETOBJECT;
    public static final ServerPacket field2618;
    public static final ServerPacket field2619;
    public static final ServerPacket field2620;
    public static final ServerPacket RESET_ANIMS;
    public static final ServerPacket field2622;
    public static final ServerPacket field2623;
    public static final ServerPacket UPDATE_INV_FULL;
    public static final ServerPacket MESSAGE_CLANCHANNEL_SYSTEM;
    public static final ServerPacket field2626;
    public static final ServerPacket field2627;
    public static final ServerPacket field2628;
    public static final ServerPacket field2629;
    public static final ServerPacket field2630;
    public static final ServerPacket field2631;
    public static final ServerPacket field2632;
    public static final ServerPacket field2633;
    public static final ServerPacket field2634;
    public static final ServerPacket MESSAGE_PRIVATE_ECHO;
    public static final ServerPacket IF_SETNPCHEAD;
    public static final ServerPacket field2637;
    public static final ServerPacket HEAT_MAP;
    public static final ServerPacket TRIGGER_ONDIALOGABORT;
    public static final ServerPacket IF_OPENSUB;
    public static final ServerPacket field2641;
    public static final ServerPacket field2642;
    public static final ServerPacket REBUILD_REGION;
    public static final ServerPacket field2644;
    public static final ServerPacket CAM_LOOKAT;
    public static final ServerPacket field2646;
    public static final ServerPacket field2647;
    public static final ServerPacket field2648;
    public static final ServerPacket field2649;
    public static final ServerPacket field2650;
    public static final ServerPacket field2651;
    public static final ServerPacket field2652;
    public static final ServerPacket GAMEFRAME_FULL;
    public static final ServerPacket NPC_INFO_SMALL;
    public static final ServerPacket MESSAGE_PRIVATE;
    public static final ServerPacket LOGOUT_TRANSFER;
    public static final ServerPacket field2657;
    public static final ServerPacket field2658;
    public static final ServerPacket field2659;
    public static final ServerPacket field2660;
    public final int length;
    public static final ServerPacket PLAYER_INFO;
    public static final ServerPacket VARCLAN;
    public static final ServerPacket field2664;
    public static final ServerPacket field2665;
    public static final ServerPacket field2666;
    public static final ServerPacket field2667;
    public static final ServerPacket field2668;
    public static final ServerPacket field2669;
    public static final ServerPacket field2670;
    public static final ServerPacket field2671;
    public static final ServerPacket field2672;
    public static final ServerPacket UPDATE_INV_CLEAR;
    public static final ServerPacket field2674;
    public static final ServerPacket TRADING_POST_RESULTS;
    public static final ServerPacket field2676;
    public static final ServerPacket field2677;
    public static final ServerPacket field2678;
    public static final ServerPacket field2679;
    public static final ServerPacket field2680;
    public static final ServerPacket field2681;
    public static final ServerPacket field2682;
    public static final ServerPacket field2683;
    public static final ServerPacket field2684;
    public static final ServerPacket field2685;
    public static final ServerPacket field2686;
    public static final ServerPacket UPDATE_UID192;
    public static final ServerPacket UPDATE_RUNENERGY;
    public static final ServerPacket field2689;
    public static final ServerPacket field2690;
    public static final ServerPacket field2691;
    public static final ServerPacket REBUILD_REGION_NORMAL;
    public static final ServerPacket field2693;
    public static final ServerPacket field2694;
    public static final ServerPacket field2695;
    public static final ServerPacket field2696;
    public static final ServerPacket field2697;
    public static final ServerPacket field2698;
    public final int id;
    
    ServerPacket(final int n, final int n2) {
        this.length = 1490038637 * n;
        this.id = n2 * 1670435019;
    }
    
    static {
        field2622 = new ServerPacket(0, -2);
        field2580 = new ServerPacket(1, 12);
        field2581 = new ServerPacket(2, 4);
        CLANCHANNEL_DELTA = new ServerPacket(3, 0);
        IF_SETTEXT = new ServerPacket(4, 1);
        field2584 = new ServerPacket(5, 8);
        REFLECTION_CHECK = new ServerPacket(6, 11);
        field2608 = new ServerPacket(7, 8);
        field2629 = new ServerPacket(8, 2);
        field2588 = new ServerPacket(9, 2);
        CHAT_FILTER_SETTINGS = new ServerPacket(10, -1);
        field2615 = new ServerPacket(11, 16);
        field2591 = new ServerPacket(12, 28);
        field2592 = new ServerPacket(13, -2);
        field2593 = new ServerPacket(14, 6);
        field2594 = new ServerPacket(15, 2);
        field2667 = new ServerPacket(16, 4);
        field2596 = new ServerPacket(17, 6);
        field2583 = new ServerPacket(18, 20);
        field2598 = new ServerPacket(19, 6);
        field2599 = new ServerPacket(20, -1);
        SPOTANIM_SPECIFIC = new ServerPacket(21, 0);
        field2601 = new ServerPacket(22, 5);
        NPC_INFO_LARGE = new ServerPacket(23, 5);
        field2666 = new ServerPacket(24, -2);
        ENTER_FREECAM = new ServerPacket(25, 2);
        field2605 = new ServerPacket(26, 2);
        IF_SETPOSITION = new ServerPacket(27, -1);
        field2607 = new ServerPacket(28, -2);
        field2603 = new ServerPacket(29, -2);
        field2609 = new ServerPacket(30, 17);
        field2610 = new ServerPacket(31, 7);
        field2683 = new ServerPacket(32, 0);
        UPDATE_INV_PARTIAL = new ServerPacket(33, 6);
        field2644 = new ServerPacket(34, -2);
        field2611 = new ServerPacket(35, -2);
        PLAYER_INFO = new ServerPacket(36, 0);
        field2616 = new ServerPacket(37, -2);
        IF_SETOBJECT = new ServerPacket(38, 7);
        field2618 = new ServerPacket(39, 14);
        field2619 = new ServerPacket(40, 6);
        field2613 = new ServerPacket(41, 6);
        RESET_ANIMS = new ServerPacket(42, -2);
        field2586 = new ServerPacket(43, -1);
        field2671 = new ServerPacket(44, 0);
        UPDATE_INV_FULL = new ServerPacket(45, 10);
        MESSAGE_CLANCHANNEL_SYSTEM = new ServerPacket(46, 0);
        field2626 = new ServerPacket(47, 1);
        field2623 = new ServerPacket(48, -1);
        field2649 = new ServerPacket(49, 8);
        field2679 = new ServerPacket(50, 8);
        field2627 = new ServerPacket(51, 6);
        UPDATE_UID192 = new ServerPacket(52, 0);
        field2632 = new ServerPacket(53, 0);
        field2633 = new ServerPacket(54, 6);
        field2634 = new ServerPacket(55, 5);
        UPDATE_ZONE_PARTIAL_FOLLOWS = new ServerPacket(56, 2);
        IF_SETNPCHEAD = new ServerPacket(57, -2);
        field2637 = new ServerPacket(58, 6);
        HEAT_MAP = new ServerPacket(59, -2);
        TRIGGER_ONDIALOGABORT = new ServerPacket(60, -2);
        IF_OPENSUB = new ServerPacket(61, -2);
        field2641 = new ServerPacket(62, -1);
        field2642 = new ServerPacket(63, -2);
        REBUILD_REGION = new ServerPacket(64, 1);
        field2677 = new ServerPacket(65, -1);
        CAM_LOOKAT = new ServerPacket(66, 6);
        field2647 = new ServerPacket(67, -2);
        field2597 = new ServerPacket(68, -1);
        field2648 = new ServerPacket(69, 1);
        field2695 = new ServerPacket(70, 0);
        field2650 = new ServerPacket(71, 4);
        field2651 = new ServerPacket(72, 2);
        field2652 = new ServerPacket(73, -2);
        GAMEFRAME_FULL = new ServerPacket(74, -2);
        VARCLAN = new ServerPacket(75, 2);
        field2620 = new ServerPacket(76, 4);
        LOGOUT_TRANSFER = new ServerPacket(77, 4);
        field2686 = new ServerPacket(78, -2);
        field2658 = new ServerPacket(79, -2);
        field2676 = new ServerPacket(80, 10);
        field2660 = new ServerPacket(81, 4);
        field2694 = new ServerPacket(82, 2);
        field2579 = new ServerPacket(83, -2);
        field2691 = new ServerPacket(84, 0);
        field2664 = new ServerPacket(85, 3);
        field2665 = new ServerPacket(86, 5);
        field2630 = new ServerPacket(87, 1);
        NPC_INFO_SMALL = new ServerPacket(88, 4);
        field2668 = new ServerPacket(89, 5);
        field2669 = new ServerPacket(90, -2);
        field2659 = new ServerPacket(91, 5);
        field2698 = new ServerPacket(92, -2);
        field2657 = new ServerPacket(93, -2);
        UPDATE_INV_CLEAR = new ServerPacket(94, -2);
        field2674 = new ServerPacket(95, 14);
        TRADING_POST_RESULTS = new ServerPacket(96, 2);
        MESSAGE_PRIVATE_ECHO = new ServerPacket(97, 6);
        field2614 = new ServerPacket(98, 6);
        field2672 = new ServerPacket(99, 8);
        field2628 = new ServerPacket(100, -1);
        field2680 = new ServerPacket(101, 9);
        field2681 = new ServerPacket(102, -2);
        field2682 = new ServerPacket(103, 6);
        field2600 = new ServerPacket(104, 4);
        field2684 = new ServerPacket(105, 2);
        field2685 = new ServerPacket(106, 8);
        field2646 = new ServerPacket(107, 8);
        UPDATE_RUNENERGY = new ServerPacket(108, 7);
        MESSAGE_PRIVATE = new ServerPacket(109, 7);
        field2689 = new ServerPacket(110, 7);
        field2690 = new ServerPacket(111, 8);
        field2631 = new ServerPacket(112, 10);
        REBUILD_REGION_NORMAL = new ServerPacket(113, 5);
        field2693 = new ServerPacket(114, 8);
        field2670 = new ServerPacket(115, 6);
        field2678 = new ServerPacket(116, 5);
        field2696 = new ServerPacket(117, 9);
        field2697 = new ServerPacket(118, 9);
    }
    
    public static ServerPacket[] aw() {
        return new ServerPacket[] { ServerPacket.field2622, ServerPacket.field2580, ServerPacket.field2581, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.IF_SETTEXT, ServerPacket.field2584, ServerPacket.REFLECTION_CHECK, ServerPacket.field2608, ServerPacket.field2629, ServerPacket.field2588, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field2615, ServerPacket.field2591, ServerPacket.field2592, ServerPacket.field2593, ServerPacket.field2594, ServerPacket.field2667, ServerPacket.field2596, ServerPacket.field2583, ServerPacket.field2598, ServerPacket.field2599, ServerPacket.SPOTANIM_SPECIFIC, ServerPacket.field2601, ServerPacket.NPC_INFO_LARGE, ServerPacket.field2666, ServerPacket.ENTER_FREECAM, ServerPacket.field2605, ServerPacket.IF_SETPOSITION, ServerPacket.field2607, ServerPacket.field2603, ServerPacket.field2609, ServerPacket.field2610, ServerPacket.field2683, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field2644, ServerPacket.field2611, ServerPacket.PLAYER_INFO, ServerPacket.field2616, ServerPacket.IF_SETOBJECT, ServerPacket.field2618, ServerPacket.field2619, ServerPacket.field2613, ServerPacket.RESET_ANIMS, ServerPacket.field2586, ServerPacket.field2671, ServerPacket.UPDATE_INV_FULL, ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket.field2626, ServerPacket.field2623, ServerPacket.field2649, ServerPacket.field2679, ServerPacket.field2627, ServerPacket.UPDATE_UID192, ServerPacket.field2632, ServerPacket.field2633, ServerPacket.field2634, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.IF_SETNPCHEAD, ServerPacket.field2637, ServerPacket.HEAT_MAP, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.IF_OPENSUB, ServerPacket.field2641, ServerPacket.field2642, ServerPacket.REBUILD_REGION, ServerPacket.field2677, ServerPacket.CAM_LOOKAT, ServerPacket.field2647, ServerPacket.field2597, ServerPacket.field2648, ServerPacket.field2695, ServerPacket.field2650, ServerPacket.field2651, ServerPacket.field2652, ServerPacket.GAMEFRAME_FULL, ServerPacket.VARCLAN, ServerPacket.field2620, ServerPacket.LOGOUT_TRANSFER, ServerPacket.field2686, ServerPacket.field2658, ServerPacket.field2676, ServerPacket.field2660, ServerPacket.field2694, ServerPacket.field2579, ServerPacket.field2691, ServerPacket.field2664, ServerPacket.field2665, ServerPacket.field2630, ServerPacket.NPC_INFO_SMALL, ServerPacket.field2668, ServerPacket.field2669, ServerPacket.field2659, ServerPacket.field2698, ServerPacket.field2657, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field2674, ServerPacket.TRADING_POST_RESULTS, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field2614, ServerPacket.field2672, ServerPacket.field2628, ServerPacket.field2680, ServerPacket.field2681, ServerPacket.field2682, ServerPacket.field2600, ServerPacket.field2684, ServerPacket.field2685, ServerPacket.field2646, ServerPacket.UPDATE_RUNENERGY, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field2689, ServerPacket.field2690, ServerPacket.field2631, ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.field2693, ServerPacket.field2670, ServerPacket.field2678, ServerPacket.field2696, ServerPacket.field2697 };
    }
    
    public static ServerPacket[] an() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: anewarray       LServerPacket;
        //     5: dup            
        //     6: iconst_0       
        //     7: getstatic       ServerPacket.field2622:LServerPacket;
        //    10: aastore        
        //    11: dup            
        //    12: iconst_1       
        //    13: getstatic       ServerPacket.field2580:LServerPacket;
        //    16: aastore        
        //    17: dup            
        //    18: iconst_2       
        //    19: getstatic       ServerPacket.field2581:LServerPacket;
        //    22: aastore        
        //    23: dup            
        //    24: iconst_3       
        //    25: getstatic       ServerPacket.CLANCHANNEL_DELTA:LServerPacket;
        //    28: aastore        
        //    29: dup            
        //    30: iconst_4       
        //    31: getstatic       ServerPacket.IF_SETTEXT:LServerPacket;
        //    34: aastore        
        //    35: dup            
        //    36: iconst_5       
        //    37: getstatic       ServerPacket.field2584:LServerPacket;
        //    40: aastore        
        //    41: dup            
        //    42: bipush          6
        //    44: getstatic       ServerPacket.REFLECTION_CHECK:LServerPacket;
        //    47: aastore        
        //    48: dup            
        //    49: bipush          7
        //    51: getstatic       ServerPacket.field2608:LServerPacket;
        //    54: aastore        
        //    55: dup            
        //    56: bipush          8
        //    58: getstatic       ServerPacket.field2629:LServerPacket;
        //    61: aastore        
        //    62: dup            
        //    63: bipush          9
        //    65: getstatic       ServerPacket.field2588:LServerPacket;
        //    68: aastore        
        //    69: dup            
        //    70: bipush          10
        //    72: getstatic       ServerPacket.CHAT_FILTER_SETTINGS:LServerPacket;
        //    75: aastore        
        //    76: dup            
        //    77: bipush          11
        //    79: getstatic       ServerPacket.field2615:LServerPacket;
        //    82: aastore        
        //    83: dup            
        //    84: bipush          12
        //    86: getstatic       ServerPacket.field2591:LServerPacket;
        //    89: aastore        
        //    90: dup            
        //    91: bipush          13
        //    93: getstatic       ServerPacket.field2592:LServerPacket;
        //    96: aastore        
        //    97: dup            
        //    98: bipush          14
        //   100: getstatic       ServerPacket.field2593:LServerPacket;
        //   103: aastore        
        //   104: dup            
        //   105: bipush          15
        //   107: getstatic       ServerPacket.field2594:LServerPacket;
        //   110: aastore        
        //   111: dup            
        //   112: bipush          16
        //   114: getstatic       ServerPacket.field2667:LServerPacket;
        //   117: aastore        
        //   118: dup            
        //   119: bipush          17
        //   121: getstatic       ServerPacket.field2596:LServerPacket;
        //   124: aastore        
        //   125: dup            
        //   126: bipush          18
        //   128: getstatic       ServerPacket.field2583:LServerPacket;
        //   131: aastore        
        //   132: dup            
        //   133: bipush          19
        //   135: getstatic       ServerPacket.field2598:LServerPacket;
        //   138: aastore        
        //   139: dup            
        //   140: bipush          20
        //   142: getstatic       ServerPacket.field2599:LServerPacket;
        //   145: aastore        
        //   146: dup            
        //   147: bipush          21
        //   149: getstatic       ServerPacket.SPOTANIM_SPECIFIC:LServerPacket;
        //   152: aastore        
        //   153: dup            
        //   154: bipush          22
        //   156: getstatic       ServerPacket.field2601:LServerPacket;
        //   159: aastore        
        //   160: dup            
        //   161: bipush          23
        //   163: getstatic       ServerPacket.NPC_INFO_LARGE:LServerPacket;
        //   166: aastore        
        //   167: dup            
        //   168: bipush          24
        //   170: getstatic       ServerPacket.field2666:LServerPacket;
        //   173: aastore        
        //   174: dup            
        //   175: bipush          25
        //   177: getstatic       ServerPacket.ENTER_FREECAM:LServerPacket;
        //   180: aastore        
        //   181: dup            
        //   182: bipush          26
        //   184: getstatic       ServerPacket.field2605:LServerPacket;
        //   187: aastore        
        //   188: dup            
        //   189: bipush          27
        //   191: getstatic       ServerPacket.IF_SETPOSITION:LServerPacket;
        //   194: aastore        
        //   195: dup            
        //   196: bipush          28
        //   198: getstatic       ServerPacket.field2607:LServerPacket;
        //   201: aastore        
        //   202: dup            
        //   203: bipush          29
        //   205: getstatic       ServerPacket.field2603:LServerPacket;
        //   208: aastore        
        //   209: dup            
        //   210: bipush          30
        //   212: getstatic       ServerPacket.field2609:LServerPacket;
        //   215: aastore        
        //   216: dup            
        //   217: ldc             1672617587
        //   219: getstatic       ServerPacket.field2610:LServerPacket;
        //   222: aastore        
        //   223: dup            
        //   224: ldc             183345869
        //   226: getstatic       ServerPacket.field2683:LServerPacket;
        //   229: aastore        
        //   230: dup            
        //   231: ldc             12939682
        //   233: getstatic       ServerPacket.UPDATE_INV_PARTIAL:LServerPacket;
        //   236: aastore        
        //   237: dup            
        //   238: ldc             691934091
        //   240: getstatic       ServerPacket.field2644:LServerPacket;
        //   243: aastore        
        //   244: dup            
        //   245: ldc             102591832
        //   247: getstatic       ServerPacket.field2611:LServerPacket;
        //   250: aastore        
        //   251: dup            
        //   252: ldc             244054325
        //   254: getstatic       ServerPacket.PLAYER_INFO:LServerPacket;
        //   257: aastore        
        //   258: dup            
        //   259: ldc             -1798541089
        //   261: getstatic       ServerPacket.field2616:LServerPacket;
        //   264: aastore        
        //   265: dup            
        //   266: ldc             -789392098
        //   268: getstatic       ServerPacket.IF_SETOBJECT:LServerPacket;
        //   271: aastore        
        //   272: dup            
        //   273: ldc             -1101185302
        //   275: getstatic       ServerPacket.field2618:LServerPacket;
        //   278: aastore        
        //   279: dup            
        //   280: ldc             1877541083
        //   282: getstatic       ServerPacket.field2619:LServerPacket;
        //   285: aastore        
        //   286: dup            
        //   287: bipush          41
        //   289: getstatic       ServerPacket.field2613:LServerPacket;
        //   292: aastore        
        //   293: dup            
        //   294: ldc             -87497546
        //   296: getstatic       ServerPacket.RESET_ANIMS:LServerPacket;
        //   299: aastore        
        //   300: dup            
        //   301: ldc             1937235784
        //   303: getstatic       ServerPacket.field2586:LServerPacket;
        //   306: aastore        
        //   307: dup            
        //   308: ldc             1326042449
        //   310: getstatic       ServerPacket.field2671:LServerPacket;
        //   313: aastore        
        //   314: dup            
        //   315: ldc             868016454
        //   317: getstatic       ServerPacket.UPDATE_INV_FULL:LServerPacket;
        //   320: aastore        
        //   321: dup            
        //   322: ldc             -323451213
        //   324: getstatic       ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM:LServerPacket;
        //   327: aastore        
        //   328: dup            
        //   329: ldc             -858059952
        //   331: getstatic       ServerPacket.field2626:LServerPacket;
        //   334: aastore        
        //   335: dup            
        //   336: ldc             -1365597629
        //   338: getstatic       ServerPacket.field2623:LServerPacket;
        //   341: aastore        
        //   342: dup            
        //   343: bipush          49
        //   345: getstatic       ServerPacket.field2649:LServerPacket;
        //   348: aastore        
        //   349: dup            
        //   350: bipush          50
        //   352: getstatic       ServerPacket.field2679:LServerPacket;
        //   355: aastore        
        //   356: dup            
        //   357: ldc             -320178801
        //   359: getstatic       ServerPacket.field2627:LServerPacket;
        //   362: aastore        
        //   363: dup            
        //   364: bipush          52
        //   366: getstatic       ServerPacket.UPDATE_UID192:LServerPacket;
        //   369: aastore        
        //   370: dup            
        //   371: ldc             -2098564119
        //   373: getstatic       ServerPacket.field2632:LServerPacket;
        //   376: aastore        
        //   377: dup            
        //   378: bipush          54
        //   380: getstatic       ServerPacket.field2633:LServerPacket;
        //   383: aastore        
        //   384: dup            
        //   385: ldc             -2130499964
        //   387: getstatic       ServerPacket.field2634:LServerPacket;
        //   390: aastore        
        //   391: dup            
        //   392: ldc             674554053
        //   394: getstatic       ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS:LServerPacket;
        //   397: aastore        
        //   398: dup            
        //   399: bipush          57
        //   401: getstatic       ServerPacket.IF_SETNPCHEAD:LServerPacket;
        //   404: aastore        
        //   405: dup            
        //   406: bipush          58
        //   408: getstatic       ServerPacket.field2637:LServerPacket;
        //   411: aastore        
        //   412: dup            
        //   413: ldc             -844851806
        //   415: getstatic       ServerPacket.HEAT_MAP:LServerPacket;
        //   418: aastore        
        //   419: dup            
        //   420: ldc             239666675
        //   422: getstatic       ServerPacket.TRIGGER_ONDIALOGABORT:LServerPacket;
        //   425: aastore        
        //   426: dup            
        //   427: ldc             -1307218235
        //   429: getstatic       ServerPacket.IF_OPENSUB:LServerPacket;
        //   432: aastore        
        //   433: dup            
        //   434: bipush          62
        //   436: getstatic       ServerPacket.field2641:LServerPacket;
        //   439: aastore        
        //   440: dup            
        //   441: ldc             1229107775
        //   443: getstatic       ServerPacket.field2642:LServerPacket;
        //   446: aastore        
        //   447: dup            
        //   448: ldc             -1015546065
        //   450: getstatic       ServerPacket.REBUILD_REGION:LServerPacket;
        //   453: aastore        
        //   454: dup            
        //   455: ldc             -548915976
        //   457: getstatic       ServerPacket.field2677:LServerPacket;
        //   460: aastore        
        //   461: dup            
        //   462: bipush          66
        //   464: getstatic       ServerPacket.CAM_LOOKAT:LServerPacket;
        //   467: aastore        
        //   468: dup            
        //   469: bipush          67
        //   471: getstatic       ServerPacket.field2647:LServerPacket;
        //   474: aastore        
        //   475: dup            
        //   476: bipush          68
        //   478: getstatic       ServerPacket.field2597:LServerPacket;
        //   481: aastore        
        //   482: dup            
        //   483: bipush          69
        //   485: getstatic       ServerPacket.field2648:LServerPacket;
        //   488: aastore        
        //   489: dup            
        //   490: ldc             -1694892815
        //   492: getstatic       ServerPacket.field2695:LServerPacket;
        //   495: aastore        
        //   496: dup            
        //   497: ldc             1527636330
        //   499: getstatic       ServerPacket.field2650:LServerPacket;
        //   502: aastore        
        //   503: dup            
        //   504: bipush          72
        //   506: getstatic       ServerPacket.field2651:LServerPacket;
        //   509: aastore        
        //   510: dup            
        //   511: ldc             -1977961054
        //   513: getstatic       ServerPacket.field2652:LServerPacket;
        //   516: aastore        
        //   517: dup            
        //   518: bipush          74
        //   520: getstatic       ServerPacket.GAMEFRAME_FULL:LServerPacket;
        //   523: aastore        
        //   524: dup            
        //   525: ldc             1731391438
        //   527: getstatic       ServerPacket.VARCLAN:LServerPacket;
        //   530: aastore        
        //   531: dup            
        //   532: ldc             -92894016
        //   534: getstatic       ServerPacket.field2620:LServerPacket;
        //   537: aastore        
        //   538: dup            
        //   539: bipush          77
        //   541: getstatic       ServerPacket.LOGOUT_TRANSFER:LServerPacket;
        //   544: aastore        
        //   545: dup            
        //   546: ldc             -157820705
        //   548: getstatic       ServerPacket.field2686:LServerPacket;
        //   551: aastore        
        //   552: dup            
        //   553: ldc             -1093390838
        //   555: getstatic       ServerPacket.field2658:LServerPacket;
        //   558: aastore        
        //   559: dup            
        //   560: bipush          80
        //   562: getstatic       ServerPacket.field2676:LServerPacket;
        //   565: aastore        
        //   566: dup            
        //   567: bipush          81
        //   569: getstatic       ServerPacket.field2660:LServerPacket;
        //   572: aastore        
        //   573: dup            
        //   574: bipush          82
        //   576: getstatic       ServerPacket.field2694:LServerPacket;
        //   579: aastore        
        //   580: dup            
        //   581: ldc             205856125
        //   583: getstatic       ServerPacket.field2579:LServerPacket;
        //   586: aastore        
        //   587: dup            
        //   588: ldc             1525552003
        //   590: getstatic       ServerPacket.field2691:LServerPacket;
        //   593: aastore        
        //   594: dup            
        //   595: ldc             1631592455
        //   597: getstatic       ServerPacket.field2664:LServerPacket;
        //   600: aastore        
        //   601: dup            
        //   602: bipush          86
        //   604: getstatic       ServerPacket.field2665:LServerPacket;
        //   607: aastore        
        //   608: dup            
        //   609: ldc             -1617088061
        //   611: getstatic       ServerPacket.field2630:LServerPacket;
        //   614: aastore        
        //   615: dup            
        //   616: bipush          88
        //   618: getstatic       ServerPacket.NPC_INFO_SMALL:LServerPacket;
        //   621: aastore        
        //   622: dup            
        //   623: bipush          89
        //   625: getstatic       ServerPacket.field2668:LServerPacket;
        //   628: aastore        
        //   629: dup            
        //   630: bipush          90
        //   632: getstatic       ServerPacket.field2669:LServerPacket;
        //   635: aastore        
        //   636: dup            
        //   637: ldc             56378581
        //   639: getstatic       ServerPacket.field2659:LServerPacket;
        //   642: aastore        
        //   643: dup            
        //   644: bipush          92
        //   646: getstatic       ServerPacket.field2698:LServerPacket;
        //   649: aastore        
        //   650: dup            
        //   651: ldc             -599128032
        //   653: getstatic       ServerPacket.field2657:LServerPacket;
        //   656: aastore        
        //   657: dup            
        //   658: ldc             -260911138
        //   660: getstatic       ServerPacket.UPDATE_INV_CLEAR:LServerPacket;
        //   663: aastore        
        //   664: dup            
        //   665: ldc             -290157632
        //   667: getstatic       ServerPacket.field2674:LServerPacket;
        //   670: aastore        
        //   671: dup            
        //   672: ldc             -285870420
        //   674: getstatic       ServerPacket.TRADING_POST_RESULTS:LServerPacket;
        //   677: aastore        
        //   678: dup            
        //   679: bipush          97
        //   681: getstatic       ServerPacket.MESSAGE_PRIVATE_ECHO:LServerPacket;
        //   684: aastore        
        //   685: dup            
        //   686: ldc             -1206193240
        //   688: getstatic       ServerPacket.field2614:LServerPacket;
        //   691: aastore        
        //   692: dup            
        //   693: ldc             1703007286
        //   695: getstatic       ServerPacket.field2672:LServerPacket;
        //   698: aastore        
        //   699: dup            
        //   700: bipush          100
        //   702: getstatic       ServerPacket.field2628:LServerPacket;
        //   705: aastore        
        //   706: dup            
        //   707: ldc             1237930082
        //   709: getstatic       ServerPacket.field2680:LServerPacket;
        //   712: aastore        
        //   713: dup            
        //   714: bipush          102
        //   716: getstatic       ServerPacket.field2681:LServerPacket;
        //   719: aastore        
        //   720: dup            
        //   721: ldc             -200508468
        //   723: getstatic       ServerPacket.field2682:LServerPacket;
        //   726: aastore        
        //   727: dup            
        //   728: ldc             1805161420
        //   730: getstatic       ServerPacket.field2600:LServerPacket;
        //   733: aastore        
        //   734: dup            
        //   735: bipush          105
        //   737: getstatic       ServerPacket.field2684:LServerPacket;
        //   740: aastore        
        //   741: dup            
        //   742: ldc             1066617667
        //   744: getstatic       ServerPacket.field2685:LServerPacket;
        //   747: aastore        
        //   748: dup            
        //   749: bipush          107
        //   751: getstatic       ServerPacket.field2646:LServerPacket;
        //   754: aastore        
        //   755: dup            
        //   756: bipush          108
        //   758: getstatic       ServerPacket.UPDATE_RUNENERGY:LServerPacket;
        //   761: aastore        
        //   762: dup            
        //   763: ldc             370093630
        //   765: getstatic       ServerPacket.MESSAGE_PRIVATE:LServerPacket;
        //   768: aastore        
        //   769: dup            
        //   770: ldc             -2023158365
        //   772: getstatic       ServerPacket.field2689:LServerPacket;
        //   775: aastore        
        //   776: dup            
        //   777: bipush          111
        //   779: getstatic       ServerPacket.field2690:LServerPacket;
        //   782: aastore        
        //   783: dup            
        //   784: ldc             1201873908
        //   786: getstatic       ServerPacket.field2631:LServerPacket;
        //   789: aastore        
        //   790: dup            
        //   791: bipush          113
        //   793: getstatic       ServerPacket.REBUILD_REGION_NORMAL:LServerPacket;
        //   796: aastore        
        //   797: dup            
        //   798: ldc             -661577284
        //   800: getstatic       ServerPacket.field2693:LServerPacket;
        //   803: aastore        
        //   804: dup            
        //   805: bipush          115
        //   807: getstatic       ServerPacket.field2670:LServerPacket;
        //   810: aastore        
        //   811: dup            
        //   812: ldc             1352699175
        //   814: getstatic       ServerPacket.field2678:LServerPacket;
        //   817: aastore        
        //   818: dup            
        //   819: ldc             -797541589
        //   821: getstatic       ServerPacket.field2696:LServerPacket;
        //   824: aastore        
        //   825: dup            
        //   826: bipush          118
        //   828: getstatic       ServerPacket.field2697:LServerPacket;
        //   831: aastore        
        //   832: areturn        
        // 
        // The error that occurred was:
        // 
        // java.lang.OutOfMemoryError: Java heap space
        //     at com.strobel.decompiler.ast.AstOptimizer$TransformArrayInitializersOptimization.run(AstOptimizer.java:2739)
        //     at com.strobel.decompiler.ast.AstOptimizer.runOptimization(AstOptimizer.java:3876)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:193)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    public static ServerPacket[] ac() {
        return new ServerPacket[] { ServerPacket.field2622, ServerPacket.field2580, ServerPacket.field2581, ServerPacket.CLANCHANNEL_DELTA, ServerPacket.IF_SETTEXT, ServerPacket.field2584, ServerPacket.REFLECTION_CHECK, ServerPacket.field2608, ServerPacket.field2629, ServerPacket.field2588, ServerPacket.CHAT_FILTER_SETTINGS, ServerPacket.field2615, ServerPacket.field2591, ServerPacket.field2592, ServerPacket.field2593, ServerPacket.field2594, ServerPacket.field2667, ServerPacket.field2596, ServerPacket.field2583, ServerPacket.field2598, ServerPacket.field2599, ServerPacket.SPOTANIM_SPECIFIC, ServerPacket.field2601, ServerPacket.NPC_INFO_LARGE, ServerPacket.field2666, ServerPacket.ENTER_FREECAM, ServerPacket.field2605, ServerPacket.IF_SETPOSITION, ServerPacket.field2607, ServerPacket.field2603, ServerPacket.field2609, ServerPacket.field2610, ServerPacket.field2683, ServerPacket.UPDATE_INV_PARTIAL, ServerPacket.field2644, ServerPacket.field2611, ServerPacket.PLAYER_INFO, ServerPacket.field2616, ServerPacket.IF_SETOBJECT, ServerPacket.field2618, ServerPacket.field2619, ServerPacket.field2613, ServerPacket.RESET_ANIMS, ServerPacket.field2586, ServerPacket.field2671, ServerPacket.UPDATE_INV_FULL, ServerPacket.MESSAGE_CLANCHANNEL_SYSTEM, ServerPacket.field2626, ServerPacket.field2623, ServerPacket.field2649, ServerPacket.field2679, ServerPacket.field2627, ServerPacket.UPDATE_UID192, ServerPacket.field2632, ServerPacket.field2633, ServerPacket.field2634, ServerPacket.UPDATE_ZONE_PARTIAL_FOLLOWS, ServerPacket.IF_SETNPCHEAD, ServerPacket.field2637, ServerPacket.HEAT_MAP, ServerPacket.TRIGGER_ONDIALOGABORT, ServerPacket.IF_OPENSUB, ServerPacket.field2641, ServerPacket.field2642, ServerPacket.REBUILD_REGION, ServerPacket.field2677, ServerPacket.CAM_LOOKAT, ServerPacket.field2647, ServerPacket.field2597, ServerPacket.field2648, ServerPacket.field2695, ServerPacket.field2650, ServerPacket.field2651, ServerPacket.field2652, ServerPacket.GAMEFRAME_FULL, ServerPacket.VARCLAN, ServerPacket.field2620, ServerPacket.LOGOUT_TRANSFER, ServerPacket.field2686, ServerPacket.field2658, ServerPacket.field2676, ServerPacket.field2660, ServerPacket.field2694, ServerPacket.field2579, ServerPacket.field2691, ServerPacket.field2664, ServerPacket.field2665, ServerPacket.field2630, ServerPacket.NPC_INFO_SMALL, ServerPacket.field2668, ServerPacket.field2669, ServerPacket.field2659, ServerPacket.field2698, ServerPacket.field2657, ServerPacket.UPDATE_INV_CLEAR, ServerPacket.field2674, ServerPacket.TRADING_POST_RESULTS, ServerPacket.MESSAGE_PRIVATE_ECHO, ServerPacket.field2614, ServerPacket.field2672, ServerPacket.field2628, ServerPacket.field2680, ServerPacket.field2681, ServerPacket.field2682, ServerPacket.field2600, ServerPacket.field2684, ServerPacket.field2685, ServerPacket.field2646, ServerPacket.UPDATE_RUNENERGY, ServerPacket.MESSAGE_PRIVATE, ServerPacket.field2689, ServerPacket.field2690, ServerPacket.field2631, ServerPacket.REBUILD_REGION_NORMAL, ServerPacket.field2693, ServerPacket.field2670, ServerPacket.field2678, ServerPacket.field2696, ServerPacket.field2697 };
    }
    
    public static int qy(final class314 class314) {
        return class314.field2849 * 1819360320;
    }
}
