import java.util.Arrays;

// 
// Decompiled by Procyon v0.5.36
// 

public class DevicePcmPlayerProvider implements class50
{
    static final int cj = 91;
    static final int aj = 200;
    static final int my = 8;
    static Archive field67;
    static int field68;
    static IndexedSprite[] worldSelectArrows;
    
    DevicePcmPlayerProvider() {
    }
    
    static void load(final int n) {
        try {
            if (-627796577 * Client.titleLoadingStage == 0) {
                if (n <= 1084046795) {
                    throw new IllegalStateException();
                }
                class31.scene = new Scene(4, 104, 104, Tiles.Tiles_heights);
                for (int i = 0; i < 4; ++i) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    Client.collisionMaps[i] = new CollisionMap(104, 104);
                }
                UrlRequester.sceneMinimapSprite = new SpritePixels(512, 512);
                Login.Login_loadingText = Strings.ag;
                Login.Login_loadingPercent = 1084032613;
                Client.titleLoadingStage = 1602846572;
            }
            else {
                if (20 == Client.titleLoadingStage * -627796577) {
                    Login.Login_loadingText = Strings.ah;
                    Login.Login_loadingPercent = -2126902070;
                    Client.titleLoadingStage = -1890697438;
                    return;
                }
                if (Client.titleLoadingStage * -627796577 == 30) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    DevicePcmPlayerProvider.field67 = WorldMapLabelSize.newArchive(0, false, true, true, false, 2134354855);
                    GameBuild.archive7 = WorldMapLabelSize.newArchive(1, false, true, true, false, 2049040193);
                    class85.archive2 = WorldMapLabelSize.newArchive(2, true, false, true, false, 2064610125);
                    class85.archive4 = WorldMapLabelSize.newArchive(3, false, true, true, false, 2086817112);
                    class426.field3811 = WorldMapLabelSize.newArchive(4, false, true, true, false, 2142668806);
                    GrandExchangeOfferTotalQuantityComparator.archive9 = WorldMapLabelSize.newArchive(5, true, true, true, false, 2100631140);
                    class399.archive6 = WorldMapLabelSize.newArchive(6, true, true, true, false, 2081538446);
                    FloorUnderlayDefinition.archive11 = WorldMapLabelSize.newArchive(7, false, true, true, false, 2047712487);
                    class452.archive8 = WorldMapLabelSize.newArchive(8, false, true, true, false, 2129540087);
                    WorldMapLabelSize.field2285 = WorldMapLabelSize.newArchive(9, false, true, true, false, 2090413023);
                    NetFileRequest.archive10 = WorldMapLabelSize.newArchive(10, false, true, true, false, 2081260761);
                    class195.field1645 = WorldMapLabelSize.newArchive(11, false, true, true, false, 2073494782);
                    class126.archive12 = WorldMapLabelSize.newArchive(12, false, true, true, false, 2132542361);
                    class128.archive13 = WorldMapLabelSize.newArchive(13, true, false, true, false, 2037938818);
                    class230.archive14 = WorldMapLabelSize.newArchive(14, false, true, true, false, 2141469799);
                    class126.archive15 = WorldMapLabelSize.newArchive(15, false, true, true, false, 2057751547);
                    class168.archive17 = WorldMapLabelSize.newArchive(17, true, true, true, false, 2084229724);
                    GrandExchangeOfferUnitPriceComparator.archive18 = WorldMapLabelSize.newArchive(18, false, true, true, false, 2058445249);
                    class28.archive19 = WorldMapLabelSize.newArchive(19, false, true, true, false, 2089153832);
                    class205.archive20 = WorldMapLabelSize.newArchive(20, false, true, true, false, 2102395454);
                    PcmPlayer.field211 = WorldMapLabelSize.newArchive(21, false, true, true, true, 2083465163);
                    Login.Login_loadingText = Strings.av;
                    Login.Login_loadingPercent = 41163156;
                    Client.titleLoadingStage = -1089274152;
                }
                else if (40 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    final int n2 = 0 + DevicePcmPlayerProvider.field67.percentage((byte)0) * 4 / 100 + GameBuild.archive7.percentage((byte)0) * 4 / 100 + class85.archive2.percentage((byte)0) * 2 / 100 + class85.archive4.percentage((byte)0) * 2 / 100 + class426.field3811.percentage((byte)0) * 6 / 100 + GrandExchangeOfferTotalQuantityComparator.archive9.percentage((byte)0) * 4 / 100 + class399.archive6.percentage((byte)0) * 2 / 100 + FloorUnderlayDefinition.archive11.percentage((byte)0) * 55 / 100 + class452.archive8.percentage((byte)0) * 2 / 100 + WorldMapLabelSize.field2285.percentage((byte)0) * 2 / 100 + NetFileRequest.archive10.percentage((byte)0) * 2 / 100 + class195.field1645.percentage((byte)0) * 2 / 100 + class126.archive12.percentage((byte)0) * 2 / 100 + class128.archive13.percentage((byte)0) * 2 / 100 + class230.archive14.percentage((byte)0) * 2 / 100 + class126.archive15.percentage((byte)0) * 2 / 100 + class28.archive19.percentage((byte)0) * 1 / 100 + GrandExchangeOfferUnitPriceComparator.archive18.percentage((byte)0) * 1 / 100 + class205.archive20.percentage((byte)0) * 1 / 100 + PcmPlayer.field211.percentage((byte)0) * 1 / 100;
                    int n3 = 0;
                    Label_1244: {
                        if (class168.archive17.method1862((byte)(-28))) {
                            if (n <= 1084046795) {
                                throw new IllegalStateException();
                            }
                            if (class168.archive17.cc((short)128)) {
                                if (n <= 1084046795) {
                                    throw new IllegalStateException();
                                }
                                n3 = 1;
                                break Label_1244;
                            }
                        }
                        n3 = 0;
                    }
                    final int j = n2 + n3;
                    if (100 == j) {
                        UserComparator5.method696(DevicePcmPlayerProvider.field67, "Animations", 967968354);
                        UserComparator5.method696(GameBuild.archive7, "Skeletons", 1673426128);
                        UserComparator5.method696(class426.field3811, "Sound FX", 1309535473);
                        UserComparator5.method696(GrandExchangeOfferTotalQuantityComparator.archive9, "Maps", 1710852974);
                        UserComparator5.method696(class399.archive6, "Music Tracks", 1055606887);
                        UserComparator5.method696(FloorUnderlayDefinition.archive11, "Models", 1157975460);
                        UserComparator5.method696(class452.archive8, "Sprites", 1387362070);
                        UserComparator5.method696(class195.field1645, "Music Jingles", 1254988410);
                        UserComparator5.method696(class230.archive14, "Music Samples", 1201918992);
                        UserComparator5.method696(class126.archive15, "Music Patches", 1104509821);
                        UserComparator5.method696(class28.archive19, "World Map", 1808738089);
                        UserComparator5.method696(GrandExchangeOfferUnitPriceComparator.archive18, "World Map Geography", 1010255131);
                        UserComparator5.method696(class205.archive20, "World Map Ground", 2058681842);
                        (Varcs.spriteIds = new GraphicsDefaults()).decode(class168.archive17, -1761039075);
                        Login.Login_loadingText = Strings.am;
                        Login.Login_loadingPercent = -2085738914;
                        Client.titleLoadingStage = 1458921139;
                        return;
                    }
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    if (j != 0) {
                        Login.Login_loadingText = Strings.ar + j + "%";
                    }
                    Login.Login_loadingPercent = -2085738914;
                }
                else if (-627796577 * Client.titleLoadingStage == 45) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    boolean b;
                    if (!Client.isLowDetail) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        b = true;
                    }
                    else {
                        b = false;
                    }
                    final boolean pcmPlayer_stereo = b;
                    PcmPlayer.field201 = -1500814902;
                    PcmPlayer.PcmPlayer_stereo = pcmPlayer_stereo;
                    UrlRequest.field1154 = 754987022;
                    final MidiPcmStream midiPcmStream = new MidiPcmStream();
                    midiPcmStream.method1618(9, 128, (byte)(-114));
                    (class28.pcmPlayer0 = class148.method843(Client.af, 0, 22050, 1831095645)).setStream(midiPcmStream, -412033085);
                    ParamComposition.method1060(class126.archive15, class230.archive14, class426.field3811, midiPcmStream, -1821221274);
                    HorizontalAlignment.pcmPlayer1 = class148.method843(Client.af, 1, 2048, 1831095645);
                    class130.pcmStreamMixer = new PcmStreamMixer();
                    HorizontalAlignment.pcmPlayer1.setStream(class130.pcmStreamMixer, -947213020);
                    WorldMapSectionType.decimator = new Decimator(22050, PcmPlayer.field201 * -1359271235);
                    Login.Login_loadingText = Strings.as;
                    Login.Login_loadingPercent = -1001706301;
                    Client.titleLoadingStage = -287850866;
                    class357.WorldMapElement_fonts = new Fonts(class452.archive8, class128.archive13);
                }
                else if (50 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    final int length = FontName.method2388((byte)75).length;
                    Client.fontsMap = class357.WorldMapElement_fonts.createMap(FontName.method2388((byte)121), (byte)54);
                    if (Client.fontsMap.size() >= length) {
                        Language.fontPlain11 = Client.fontsMap.get(FontName.FontName_plain11);
                        WallDecoration.fontPlain12 = Client.fontsMap.get(FontName.FontName_plain12);
                        class137.fontBold12 = Client.fontsMap.get(FontName.FontName_bold12);
                        UserComparator10.platformInfo = Client.platformInfoProvider.get(1351664737);
                        Login.Login_loadingText = Strings.ak;
                        Login.Login_loadingPercent = 82326312;
                        Client.titleLoadingStage = 513572420;
                        return;
                    }
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    Login.Login_loadingText = Strings.aj + Client.fontsMap.size() * 100 / length + "%";
                    Login.Login_loadingPercent = 82326312;
                }
                else if (60 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        return;
                    }
                    final Archive archive10 = NetFileRequest.archive10;
                    final Archive archive11 = class452.archive8;
                    int n4 = 0;
                    final String[] field760 = Login.field760;
                    for (int k = 0; k < field760.length; ++k) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        if (archive10.tryLoadFileByNames(field760[k], "", 842451065)) {
                            if (n <= 1084046795) {
                                throw new IllegalStateException();
                            }
                            ++n4;
                        }
                    }
                    final String[] field761 = Login.field761;
                    for (int l = 0; l < field761.length; ++l) {
                        if (archive11.tryLoadFileByNames(field761[l], "", 842451065)) {
                            if (n <= 1084046795) {
                                throw new IllegalStateException();
                            }
                            ++n4;
                        }
                    }
                    final String[] field762 = Login.field762;
                    for (int n5 = 0; n5 < field762.length; ++n5) {
                        if (n <= 1084046795) {
                            return;
                        }
                        final String s = field762[n5];
                        if (AbstractArchive.getFileFlat(archive11, s, 1034841595) != -1) {
                            if (n <= 1084046795) {
                                throw new IllegalStateException();
                            }
                            if (archive11.tryLoadFileByNames(s, "", 842451065)) {
                                if (n <= 1084046795) {
                                    throw new IllegalStateException();
                                }
                                ++n4;
                            }
                        }
                    }
                    final int n6 = n4;
                    final int compare_bridged = GrandExchangeOfferOwnWorldComparator.compare_bridged(class452.archive8, -1584507403);
                    if (n6 >= compare_bridged) {
                        Login.Login_loadingText = Strings.ad;
                        Login.Login_loadingPercent = -2044575758;
                        class138.updateGameState(5, 468091997);
                        Client.titleLoadingStage = 1314995706;
                        return;
                    }
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    Login.Login_loadingText = Strings.az + 100 * n6 / compare_bridged + "%";
                    Login.Login_loadingPercent = -2044575758;
                }
                else if (70 == -627796577 * Client.titleLoadingStage) {
                    if (!class85.archive2.cc((short)128)) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        Login.Login_loadingText = Strings.ae + class85.archive2.loadPercent((byte)4) + "%";
                        Login.Login_loadingPercent = 123489468;
                    }
                    else {
                        if (!PcmPlayer.field211.cc((short)128)) {
                            Login.Login_loadingText = Strings.ae + (80 + class126.archive12.loadPercent((byte)4) / 6) + "%";
                            Login.Login_loadingPercent = 123489468;
                            return;
                        }
                        EnumComposition.method1010(class85.archive2, (byte)42);
                        World.method409(class85.archive2, (short)941);
                        Client.method398(class85.archive2, FloorUnderlayDefinition.archive11, (byte)(-10));
                        Interpreter.method427(class85.archive2, FloorUnderlayDefinition.archive11, Client.isLowDetail, (byte)3);
                        MenuAction.method439(class85.archive2, FloorUnderlayDefinition.archive11, 1515081265);
                        class85.rsOrdinal(class85.archive2, 579263121);
                        final Archive archive12 = class85.archive2;
                        final Archive archive13 = FloorUnderlayDefinition.archive11;
                        final boolean isMembersWorld = Client.isMembersWorld;
                        final Font fontPlain11 = Language.fontPlain11;
                        class355.ItemDefinition_archive = archive12;
                        ItemComposition.ItemDefinition_modelArchive = archive13;
                        FileSystem.ItemDefinition_inMembersWorld = isMembersWorld;
                        MouseRecorder.ItemDefinition_fileCount = class355.ItemDefinition_archive.getGroupFileCount(10, (byte)65) * -1255946235;
                        class124.ItemDefinition_fontPlain11 = fontPlain11;
                        class152.vmethod3238(class85.archive2, DevicePcmPlayerProvider.field67, GameBuild.archive7, 1755632957);
                        BuddyRankComparator.compareBuddy(class85.archive2, FloorUnderlayDefinition.archive11, 893030532);
                        MenuAction.method439(class85.archive2, -1939733213);
                        VarpDefinition.VarpDefinition_archive = class85.archive2;
                        VarpDefinition.field1475 = VarpDefinition.VarpDefinition_archive.getGroupFileCount(16, (byte)88) * -805125715;
                        class4.method7(class85.archive4, FloorUnderlayDefinition.archive11, class452.archive8, class128.archive13, 220568265);
                        NPC.method592(class85.archive2, (byte)(-54));
                        MidiPcmStream.setPcmStreamVolume(class85.archive2, -2144469370);
                        class294.VarcInt_archive = class85.archive2;
                        final Archive archive14 = class85.archive2;
                        class195.method1052(class85.archive2, -1754928363);
                        ReflectionCheck.method200(class85.archive2, -1333163047);
                        class327.method1842(class85.archive2, (byte)6);
                        class160.HitSplatDefinition_cachedSprites = new class473(Client.field358, 54, ClanSettings.clientLanguage, class85.archive2);
                        MenuAction.HitSplatDefinition_cached = new class473(Client.field358, 47, ClanSettings.clientLanguage, class85.archive2);
                        class373.varcs = new Varcs();
                        final Archive archive15 = class85.archive2;
                        final Archive archive16 = class452.archive8;
                        final Archive archive17 = class128.archive13;
                        HitSplatDefinition.HitSplatDefinition_archive = archive15;
                        HitSplatDefinition.field1664 = archive16;
                        HitSplatDefinition.HitSplatDefinition_fontsArchive = archive17;
                        UserComparator10.platformInfo.field3857 = (Arrays.hashCode(ScriptFrame.client.wu.getClass().getSigners()) >> 2) * 1015823968 - 239932888;
                        final Archive archive18 = class85.archive2;
                        final Archive archive19 = class452.archive8;
                        HealthBarDefinition.HealthBarDefinition_archive = archive18;
                        HealthBarDefinition.field1522 = archive19;
                        class33.method142(class85.archive2, class452.archive8, 2112098628);
                        Login.Login_loadingText = Strings.ap;
                        Login.Login_loadingPercent = 123489468;
                        Client.titleLoadingStage = 2116418992;
                    }
                }
                else if (Client.titleLoadingStage * -627796577 == 80) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    int n7 = 0;
                    if (ChatChannel.compass == null) {
                        ChatChannel.compass = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.compass * -25531251, 0, -1572989467);
                    }
                    else {
                        ++n7;
                    }
                    if (LoginScreenAnimation.redHintArrowSprite == null) {
                        if (n <= 1084046795) {
                            return;
                        }
                        LoginScreenAnimation.redHintArrowSprite = class484.SpriteBuffer_getSprite(class452.archive8, Varcs.spriteIds.field3767 * -740583791, 0, 1731928117);
                    }
                    else {
                        ++n7;
                    }
                    if (null == class333.mapSceneSprites) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        class333.mapSceneSprites = class68.method434(class452.archive8, -506869823 * Varcs.spriteIds.mapScenes, 0, -973800610);
                    }
                    else {
                        ++n7;
                    }
                    if (class36.headIconPkSprites == null) {
                        if (n <= 1084046795) {
                            return;
                        }
                        class36.headIconPkSprites = UserComparator3.method699(class452.archive8, Varcs.spriteIds.headIconsPk * 84664645, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (null == class425.headIconPrayerSprites) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        class425.headIconPrayerSprites = UserComparator3.method699(class452.archive8, Varcs.spriteIds.field3775 * 842447949, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (KitDefinition.headIconHintSprites == null) {
                        KitDefinition.headIconHintSprites = UserComparator3.method699(class452.archive8, Varcs.spriteIds.field3772 * -1721152621, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (null == Players.mapMarkerSprites) {
                        Players.mapMarkerSprites = UserComparator3.method699(class452.archive8, -1343036557 * Varcs.spriteIds.field3773, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (class173.crossSprites == null) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        class173.crossSprites = UserComparator3.method699(class452.archive8, Varcs.spriteIds.field3771 * 1146186045, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (class477.mapDotSprites == null) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        class477.mapDotSprites = UserComparator3.method699(class452.archive8, Varcs.spriteIds.field3774 * 130583873, 0, 1271520368);
                    }
                    else {
                        ++n7;
                    }
                    if (null == HealthBar.scrollBarSprites) {
                        if (n <= 1084046795) {
                            return;
                        }
                        HealthBar.scrollBarSprites = class68.method434(class452.archive8, Varcs.spriteIds.field3776 * 233709739, 0, -1034979318);
                    }
                    else {
                        ++n7;
                    }
                    if (null == class31.modIconSprites) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        class31.modIconSprites = class68.method434(class452.archive8, Varcs.spriteIds.field3768 * -2142254499, 0, 664259717);
                    }
                    else {
                        ++n7;
                    }
                    if (n7 < 11) {
                        Login.Login_loadingText = Strings.by + n7 * 100 / 12 + "%";
                        Login.Login_loadingPercent = -2003412602;
                        return;
                    }
                    AbstractFont.AbstractFont_modIconSprites = class31.modIconSprites;
                    LoginScreenAnimation.redHintArrowSprite.normalize();
                    final int n8 = (int)(Math.random() * 21.0) - 10;
                    final int n9 = (int)(Math.random() * 21.0) - 10;
                    final int n10 = (int)(Math.random() * 21.0) - 10;
                    final int n11 = (int)(Math.random() * 41.0) - 20;
                    IndexedSprite.ik(class333.mapSceneSprites[0], n11 + n8, n11 + n9, n10 + n11);
                    Login.Login_loadingText = Strings.bb;
                    Login.Login_loadingPercent = -2003412602;
                    Client.titleLoadingStage = -1377125018;
                }
                else if (90 == Client.titleLoadingStage * -627796577) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    if (!WorldMapLabelSize.field2285.cc((short)128)) {
                        Login.Login_loadingText = Strings.bi + "0%";
                        Login.Login_loadingPercent = -1962249446;
                        return;
                    }
                    final Archive field763 = WorldMapLabelSize.field2285;
                    final Archive archive20 = class452.archive8;
                    final int n12 = 20;
                    final double brightness = class20.clientPreferences.getBrightness(1864449029);
                    int n13;
                    if (Client.isLowDetail) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        n13 = 64;
                    }
                    else {
                        n13 = 128;
                    }
                    class7.textureProvider = new TextureProvider(field763, archive20, n12, brightness, n13);
                    Rasterizer3D.clips.Rasterizer3D_textureLoader = class7.textureProvider;
                    class18.method65(class20.clientPreferences.getBrightness(1838318322));
                    Client.titleLoadingStage = -575701732;
                }
                else if (100 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    final int loadedPercentage = class7.textureProvider.getLoadedPercentage(1658187175);
                    if (loadedPercentage < 100) {
                        Login.Login_loadingText = Strings.bi + loadedPercentage + "%";
                        Login.Login_loadingPercent = -1962249446;
                        return;
                    }
                    Login.Login_loadingText = Strings.be;
                    Login.Login_loadingPercent = -1962249446;
                    Client.titleLoadingStage = 225721554;
                }
                else if (Client.titleLoadingStage * -627796577 == 110) {
                    if (n <= 1084046795) {
                        return;
                    }
                    UserComparator6.mouseRecorder = new MouseRecorder();
                    Client.af.newThreadTask(UserComparator6.mouseRecorder, 10, (byte)0);
                    Login.Login_loadingText = Strings.bk;
                    Login.Login_loadingPercent = 1907337436;
                    Client.titleLoadingStage = 1027144840;
                }
                else if (120 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    if (NetFileRequest.archive10.co("huffman", "", 842451065)) {
                        class154.vmethod3254(new Huffman(AbstractArchive.ui(NetFileRequest.archive10, "huffman", "", 1648560407)), -1214282669);
                        Login.Login_loadingText = Strings.bo;
                        Login.Login_loadingPercent = 1481957022;
                        Client.titleLoadingStage = 1828568126;
                        return;
                    }
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    Login.Login_loadingText = Strings.bx + 0 + "%";
                    Login.Login_loadingPercent = 1481957022;
                }
                else if (-627796577 * Client.titleLoadingStage == 130) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    if (!class85.archive4.cc((short)128)) {
                        Login.Login_loadingText = Strings.bz + class85.archive4.loadPercent((byte)4) * 4 / 5 + "%";
                        Login.Login_loadingPercent = 1056576608;
                        return;
                    }
                    if (!class126.archive12.cc((short)128)) {
                        if (n <= 1084046795) {
                            return;
                        }
                        Login.Login_loadingText = Strings.bz + (80 + class126.archive12.loadPercent((byte)4) / 6) + "%";
                        Login.Login_loadingPercent = 1056576608;
                    }
                    else {
                        if (class128.archive13.cc((short)128)) {
                            Login.Login_loadingText = Strings.bm;
                            Login.Login_loadingPercent = 631196194;
                            if (AbstractArchive.sh(class126.archive12, "version.dat", "", -1313069490)) {
                                if (n <= 1084046795) {
                                    throw new IllegalStateException();
                                }
                                new Buffer(AbstractArchive.ui(class126.archive12, "version.dat", "", 1648560407)).readUnsignedShort(-962785741);
                            }
                            Client.titleLoadingStage = -1664975884;
                            return;
                        }
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        Login.Login_loadingText = Strings.bz + (96 + class128.archive13.loadPercent((byte)4) / 50) + "%";
                        Login.Login_loadingPercent = 1056576608;
                    }
                }
                else if (140 == -627796577 * Client.titleLoadingStage) {
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    Login.Login_loadingPercent = 205815780;
                    if (class28.archive19.cm(-1154371114) > 0) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        if (!class28.archive19.cz(WorldMapCacheName.field2435.name, 1583460139)) {
                            if (n <= 1084046795) {
                                return;
                            }
                            Login.Login_loadingText = Strings.bd + AbstractArchive.qk(class28.archive19, WorldMapCacheName.field2435.name, 1956692579) / 10 + "%";
                            return;
                        }
                    }
                    if (class126.worldMap == null) {
                        if (n <= 1084046795) {
                            throw new IllegalStateException();
                        }
                        WorldMap.uh(class126.worldMap = new WorldMap(), class28.archive19, GrandExchangeOfferUnitPriceComparator.archive18, class205.archive20, class137.fontBold12, Client.fontsMap, class333.mapSceneSprites, 87285163);
                    }
                    Login.Login_loadingText = Strings.bt;
                    Client.titleLoadingStage = -863552598;
                }
                else {
                    if (150 != Client.titleLoadingStage * -627796577) {
                        return;
                    }
                    if (n <= 1084046795) {
                        throw new IllegalStateException();
                    }
                    class138.updateGameState(10, 2069942039);
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "az.hs(" + ')');
        }
    }
    
    @Override
    public PcmPlayer aw() {
        return new DevicePcmPlayer();
    }
    
    @Override
    public PcmPlayer an() {
        return new DevicePcmPlayer();
    }
    
    static void method89(final int n, final int n2, final int n3, final int n4, final int n5, final int n6, final float n7, final float n8, final float n9, final int n10, final int n11, final int n12, final int n13, final int n14, final int n15, final int n16, final int n17, final int n18, final int n19, final int n20, final int n21, final int n22, final short n23) {
        try {
            Rasterizer3D.field1999.vmethod1378(n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, n22);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "az.ar(" + ')');
        }
    }
    
    @Override
    public PcmPlayer player(final int n) {
        try {
            return new DevicePcmPlayer();
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "az.af(" + ')');
        }
    }
    
    static void method90(final int n, final int n2) {
        try {
            final SequenceDefinition spotAnimationDefinition_get = ItemContainer.SpotAnimationDefinition_get(n, (byte)13);
            if (spotAnimationDefinition_get.isCachedModelIdSet(-1944241705)) {
                if (class20.method82(1238147375 * spotAnimationDefinition_get.SequenceDefinition_cachedModelId, 854271946) == 2) {
                    if (n2 != 329326313) {
                        throw new IllegalStateException();
                    }
                    Client.field649.add(1238147375 * spotAnimationDefinition_get.SequenceDefinition_cachedModelId);
                }
                return;
            }
            if (n2 != 329326313) {
                throw new IllegalStateException();
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "az.oz(" + ')');
        }
    }
}
