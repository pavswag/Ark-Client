import java.util.concurrent.ThreadFactory;

// 
// Decompiled by Procyon v0.5.36
// 

final class class130 implements ThreadFactory
{
    static final int bl = 58;
    static final float af = 0.33333334f;
    static PcmStreamMixer pcmStreamMixer;
    static Widget field1274;
    static final int as = 2097152;
    public static String[] cacheParentPaths;
    public static final int at = 11;
    static final int by = 3;
    
    static final void method764(int min, final int n) {
        try {
            min = Math.min(Math.max(min, 0), 127);
            ClientPreferences.tw(class20.clientPreferences, min, -957604712);
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fe.mn(" + ')');
        }
    }
    
    @Override
    public Thread newThread(final Runnable target) {
        try {
            return new Thread(target, "OSRS Maya Anim Load");
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fe.newThread(" + ')');
        }
    }
    
    public static Thread ts(final class130 class130, final Runnable target) {
        if (class130 == null) {
            return class130.newThread(target);
        }
        return new Thread(target, "OSRS Maya Anim Load");
    }
    
    static int method765(final int n, final Script script, final boolean b, final byte b2) {
        try {
            if (n == 3300) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.cycle * -1886224337;
                return 1;
            }
            else if (n == 3301) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], (byte)0);
                return 1;
            }
            else if (n == 3302) {
                if (b2 == 1) {
                    throw new IllegalStateException();
                }
                Interpreter.Interpreter_intStackSize -= 854271946;
                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], 2098730562);
                return 1;
            }
            else {
                if (n == 3303) {
                    Interpreter.Interpreter_intStackSize -= 854271946;
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize], Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1], 66317544);
                    return 1;
                }
                if (3304 == n) {
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = ApproximateRouteStrategy.getInvDefinition(Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539], -1717461998).size * -2010981849;
                    return 1;
                }
                if (3305 == n) {
                    if (b2 == 1) {
                        throw new IllegalStateException();
                    }
                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.currentLevels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                    return 1;
                }
                else {
                    if (3306 == n) {
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.levels[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                        return 1;
                    }
                    if (3307 == n) {
                        if (b2 == 1) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.experience[Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539]];
                        return 1;
                    }
                    else if (n == 3308) {
                        if (b2 == 1) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 827352769 * GameObject.baseY + (-411750205 * MusicPatchNode.localPlayer.ep >> 7) + ((WorldMapData_0.baseX * -1232093375 + (1144428983 * MusicPatchNode.localPlayer.br >> 7) << 14) + (-1727408401 * GameEngine.Client_plane << 28));
                        return 1;
                    }
                    else if (n == 3309) {
                        if (b2 == 1) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 14 & 0x3FFF);
                        return 1;
                    }
                    else if (n == 3310) {
                        if (b2 == 1) {
                            throw new IllegalStateException();
                        }
                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] >> 28;
                        return 1;
                    }
                    else {
                        if (3311 == n) {
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = (Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize -= 427135973) * -964267539] & 0x3FFF);
                            return 1;
                        }
                        if (3312 == n) {
                            final int[] interpreter_intStack = Interpreter.Interpreter_intStack;
                            final int n2 = (Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1;
                            boolean b3;
                            if (Client.isMembersWorld) {
                                if (b2 == 1) {
                                    throw new IllegalStateException();
                                }
                                b3 = true;
                            }
                            else {
                                b3 = false;
                            }
                            interpreter_intStack[n2] = (b3 ? 1 : 0);
                            return 1;
                        }
                        if (n == 3313) {
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Player.read(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[-964267539 * Interpreter.Interpreter_intStackSize + 1], (byte)0);
                            return 1;
                        }
                        if (n == 3314) {
                            if (b2 == 1) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = class431.ItemContainer_getCount(32768 + Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539], Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], 2098730562);
                            return 1;
                        }
                        else if (3315 == n) {
                            if (b2 == 1) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStackSize -= 854271946;
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = BufferedNetSocket.available(Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + 32768, Interpreter.Interpreter_intStack[1 + -964267539 * Interpreter.Interpreter_intStackSize], -1375115622);
                            return 1;
                        }
                        else if (3316 == n) {
                            if (b2 == 1) {
                                throw new IllegalStateException();
                            }
                            if (Client.staffModLevel * 324465533 >= 2) {
                                if (b2 == 1) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.staffModLevel * 324465533;
                            }
                            else {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                            }
                            return 1;
                        }
                        else if (n == 3317) {
                            if (b2 == 1) {
                                throw new IllegalStateException();
                            }
                            Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.rebootTimer * -1496573241;
                            return 1;
                        }
                        else {
                            if (n == 3318) {
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -453810525 * Client.worldId;
                                return 1;
                            }
                            if (n == 3321) {
                                if (b2 == 1) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -365416549 * Client.runEnergy / 100;
                                return 1;
                            }
                            else if (3322 == n) {
                                if (b2 == 1) {
                                    throw new IllegalStateException();
                                }
                                Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.weight * -1940722149;
                                return 1;
                            }
                            else {
                                if (3323 == n) {
                                    if (Client.playerMod) {
                                        if (b2 == 1) {
                                            throw new IllegalStateException();
                                        }
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 1;
                                    }
                                    else {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = 0;
                                    }
                                    return 1;
                                }
                                if (3324 == n) {
                                    if (b2 == 1) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -205173751 * Client.worldProperties;
                                    return 1;
                                }
                                else if (3325 == n) {
                                    if (b2 == 1) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStackSize -= 1708543892;
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539] + (Interpreter.Interpreter_intStack[Interpreter.Interpreter_intStackSize * -964267539 + 1] << 14) + (Interpreter.Interpreter_intStack[2 + Interpreter.Interpreter_intStackSize * -964267539] << 28) + Interpreter.Interpreter_intStack[3 + Interpreter.Interpreter_intStackSize * -964267539];
                                    return 1;
                                }
                                else if (n == 3326) {
                                    if (b2 == 1) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = -751176573 * Client.lastMouseRecordX;
                                    return 1;
                                }
                                else if (n == 3327) {
                                    if (b2 == 1) {
                                        throw new IllegalStateException();
                                    }
                                    Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.lastMouseRecordY * -2076298705;
                                    return 1;
                                }
                                else {
                                    if (3331 == n) {
                                        Interpreter.Interpreter_intStack[(Interpreter.Interpreter_intStackSize += 427135973) * -964267539 - 1] = Client.runEnergy * -365416549;
                                        return 1;
                                    }
                                    return 2;
                                }
                            }
                        }
                    }
                }
            }
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "fe.ap(" + ')');
        }
    }
    
    public Thread af(final Runnable target) {
        return new Thread(target, "OSRS Maya Anim Load");
    }
}
