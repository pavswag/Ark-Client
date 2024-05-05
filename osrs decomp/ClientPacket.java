// 
// Decompiled by Procyon v0.5.36
// 

public class ClientPacket implements class285
{
    final int length;
    static final ClientPacket OPPLAYER3;
    public static final ClientPacket OPNPCT;
    public static final ClientPacket field2467;
    public static final ClientPacket field2468;
    public static final ClientPacket field2469;
    public static final ClientPacket OPNPC5;
    public static final ClientPacket field2471;
    public static final ClientPacket field2472;
    public static final ClientPacket OPNPC4;
    public static final ClientPacket field2474;
    public static final ClientPacket OPLOC4;
    public static final ClientPacket field2476;
    public static final ClientPacket field2477;
    public static final ClientPacket field2478;
    public static final ClientPacket field2479;
    public static final ClientPacket field2480;
    static final ClientPacket IF_BUTTON7;
    public static final ClientPacket OPOBJT;
    public static final ClientPacket field2483;
    public static final ClientPacket IF_BUTTON6;
    public static final ClientPacket field2485;
    public static final ClientPacket OPLOC2;
    public static final ClientPacket field2487;
    public static final ClientPacket IF_BUTTON9;
    public static final ClientPacket field2489;
    public static final ClientPacket WALK;
    static final ClientPacket field2491;
    public static final ClientPacket field2492;
    public static final ClientPacket OPPLAYER1;
    static final ClientPacket field2494;
    public static final ClientPacket OPPLAYER4;
    public static final ClientPacket OPOBJ4;
    public static final ClientPacket field2497;
    public static final ClientPacket field2498;
    public static final ClientPacket OPPLAYER5;
    public static final ClientPacket field2500;
    static final ClientPacket field2501;
    public static final ClientPacket field2502;
    public static final ClientPacket IF_BUTTON3;
    static final ClientPacket OPOBJ3;
    static final ClientPacket field2505;
    public static final ClientPacket OPOBJ5;
    public static final ClientPacket OPOBJ2;
    public static final ClientPacket field2508;
    public static final ClientPacket OPLOCT;
    public static final ClientPacket field2510;
    public static final ClientPacket field2511;
    public static final ClientPacket OPNPC2;
    public static final ClientPacket field2513;
    public static final ClientPacket field2514;
    public static final ClientPacket field2515;
    public static final ClientPacket IF_BUTTON10;
    public static final ClientPacket field2517;
    public static final ClientPacket field2518;
    public static final ClientPacket field2519;
    public static final ClientPacket field2520;
    public static final ClientPacket IF_BUTTONT;
    public static final ClientPacket field2522;
    public static final ClientPacket field2523;
    public static final ClientPacket field2524;
    public static final ClientPacket field2525;
    public static final ClientPacket field2526;
    public static final ClientPacket field2527;
    public static final ClientPacket field2528;
    public static final ClientPacket field2529;
    public static final ClientPacket CLICK;
    public static final ClientPacket OPLOC3;
    public static final ClientPacket field2532;
    public static final ClientPacket OPPLAYERT;
    public static final ClientPacket OPLOC5;
    public static final ClientPacket field2535;
    public static final ClientPacket field2536;
    public static final ClientPacket OPPLAYER7;
    public static final ClientPacket field2538;
    public static final ClientPacket CONTINUE;
    public static final ClientPacket field2540;
    public static final ClientPacket field2541;
    public static final ClientPacket OPOBJ1;
    public static final ClientPacket field2543;
    public static final ClientPacket OPPLAYER6;
    public static final ClientPacket field2545;
    public static final ClientPacket field2546;
    public static final ClientPacket IF_BUTTON2;
    public static final ClientPacket field2548;
    public static final ClientPacket field2549;
    public static final ClientPacket field2550;
    public static final ClientPacket field2551;
    public static final ClientPacket field2552;
    public static final ClientPacket OPPLAYER8;
    public static final ClientPacket field2554;
    public static final ClientPacket field2555;
    public static final ClientPacket IF_BUTTON1;
    public static final ClientPacket field2557;
    public static final ClientPacket field2558;
    public static final ClientPacket field2559;
    public static final ClientPacket field2560;
    final int id;
    
    ClientPacket(final int n, final int n2) {
        this.length = 784733707 * n;
        this.id = n2 * 797159357;
    }
    
    static {
        field2471 = new ClientPacket(0, -1);
        OPPLAYER3 = new ClientPacket(1, -1);
        IF_BUTTON2 = new ClientPacket(2, 0);
        field2467 = new ClientPacket(3, 0);
        field2468 = new ClientPacket(4, 13);
        field2469 = new ClientPacket(5, -2);
        field2522 = new ClientPacket(6, -2);
        OPOBJT = new ClientPacket(7, 3);
        field2472 = new ClientPacket(8, 3);
        field2508 = new ClientPacket(9, -1);
        field2474 = new ClientPacket(10, 7);
        OPLOC4 = new ClientPacket(11, 4);
        field2476 = new ClientPacket(12, -1);
        field2477 = new ClientPacket(13, 6);
        field2478 = new ClientPacket(14, -1);
        field2479 = new ClientPacket(15, 15);
        field2480 = new ClientPacket(16, 5);
        IF_BUTTON7 = new ClientPacket(17, 2);
        field2560 = new ClientPacket(18, -1);
        field2483 = new ClientPacket(19, 7);
        OPNPC2 = new ClientPacket(20, 8);
        field2485 = new ClientPacket(21, -1);
        OPLOC2 = new ClientPacket(22, 3);
        IF_BUTTON6 = new ClientPacket(23, 16);
        IF_BUTTON9 = new ClientPacket(24, 15);
        field2489 = new ClientPacket(25, 15);
        field2554 = new ClientPacket(26, 0);
        field2491 = new ClientPacket(27, -1);
        field2492 = new ClientPacket(28, 7);
        field2528 = new ClientPacket(29, 3);
        field2494 = new ClientPacket(30, 7);
        OPPLAYER4 = new ClientPacket(31, 11);
        OPOBJ4 = new ClientPacket(32, 3);
        field2498 = new ClientPacket(33, 7);
        WALK = new ClientPacket(34, 8);
        OPPLAYER5 = new ClientPacket(35, 3);
        field2500 = new ClientPacket(36, 4);
        field2501 = new ClientPacket(37, -1);
        field2558 = new ClientPacket(38, 8);
        field2513 = new ClientPacket(39, 7);
        OPOBJ3 = new ClientPacket(40, 2);
        field2505 = new ClientPacket(41, -1);
        OPOBJ5 = new ClientPacket(42, -2);
        OPOBJ2 = new ClientPacket(43, 15);
        OPLOCT = new ClientPacket(44, 7);
        field2517 = new ClientPacket(45, -1);
        field2510 = new ClientPacket(46, 4);
        field2511 = new ClientPacket(47, 11);
        OPNPCT = new ClientPacket(48, 7);
        OPPLAYER8 = new ClientPacket(49, 3);
        field2514 = new ClientPacket(50, -1);
        field2515 = new ClientPacket(51, 16);
        IF_BUTTON10 = new ClientPacket(52, 11);
        field2497 = new ClientPacket(53, 4);
        field2502 = new ClientPacket(54, 3);
        field2524 = new ClientPacket(55, 2);
        field2532 = new ClientPacket(56, 0);
        IF_BUTTONT = new ClientPacket(57, 3);
        field2529 = new ClientPacket(58, -1);
        field2523 = new ClientPacket(59, -1);
        field2545 = new ClientPacket(60, 9);
        field2525 = new ClientPacket(61, 2);
        field2526 = new ClientPacket(62, 3);
        field2527 = new ClientPacket(63, 8);
        IF_BUTTON1 = new ClientPacket(64, 8);
        field2518 = new ClientPacket(65, -1);
        field2520 = new ClientPacket(66, 1);
        OPLOC3 = new ClientPacket(67, 10);
        OPNPC4 = new ClientPacket(68, 2);
        OPPLAYERT = new ClientPacket(69, 8);
        OPLOC5 = new ClientPacket(70, 8);
        field2535 = new ClientPacket(71, 8);
        field2536 = new ClientPacket(72, 7);
        OPPLAYER7 = new ClientPacket(73, -1);
        field2538 = new ClientPacket(74, 0);
        IF_BUTTON3 = new ClientPacket(75, 22);
        CONTINUE = new ClientPacket(76, 6);
        field2541 = new ClientPacket(77, 4);
        OPOBJ1 = new ClientPacket(78, 6);
        field2540 = new ClientPacket(79, 8);
        OPPLAYER6 = new ClientPacket(80, 3);
        field2548 = new ClientPacket(81, 7);
        field2546 = new ClientPacket(82, -1);
        CLICK = new ClientPacket(83, 3);
        field2519 = new ClientPacket(84, -1);
        field2549 = new ClientPacket(85, -1);
        field2550 = new ClientPacket(86, -1);
        field2551 = new ClientPacket(87, -1);
        field2552 = new ClientPacket(88, -1);
        field2543 = new ClientPacket(89, -1);
        OPPLAYER1 = new ClientPacket(90, 3);
        field2555 = new ClientPacket(91, 3);
        OPNPC5 = new ClientPacket(92, 8);
        field2557 = new ClientPacket(93, 11);
        field2487 = new ClientPacket(94, 7);
        field2559 = new ClientPacket(95, -1);
    }
    
    static void process(final byte b) {
        try {
            for (InterfaceParent interfaceParent = (InterfaceParent)Client.interfaceParents.first(); null != interfaceParent; interfaceParent = (InterfaceParent)Client.interfaceParents.next()) {
                if (b != 2) {
                    throw new IllegalStateException();
                }
                final int n = interfaceParent.group * 944864121;
                if (SoundSystem.loadInterface(n, 1376777516)) {
                    boolean modelOrthog = true;
                    final Widget[] array = VerticalAlignment.Widget_interfaceComponents[n];
                    for (int i = 0; i < array.length; ++i) {
                        if (array[i] != null) {
                            modelOrthog = array[i].modelOrthog;
                            break;
                        }
                    }
                    if (!modelOrthog) {
                        if (b != 2) {
                            throw new IllegalStateException();
                        }
                        final Widget vmethod3380 = class165.vmethod3380((int)interfaceParent.hr, (byte)5);
                        if (vmethod3380 != null) {
                            if (b != 2) {
                                return;
                            }
                            class144.invalidateWidget(vmethod3380, -1912771452);
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "lv.mp(" + ')');
        }
    }
}
