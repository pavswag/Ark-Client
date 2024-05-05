// 
// Decompiled by Procyon v0.5.36
// 

public class StudioGame implements class356
{
    public static final StudioGame oldscape;
    static final StudioGame stellardawn;
    static final StudioGame runescape;
    static final StudioGame game4;
    public static final int ai = 1;
    static final StudioGame game5;
    public final String name;
    final int id;
    static final StudioGame game3;
    
    StudioGame(final String name, final String s, final int n) {
        this.name = name;
        this.id = n * 1076537803;
    }
    
    static {
        runescape = new StudioGame("runescape", "RuneScape", 0);
        stellardawn = new StudioGame("stellardawn", "Stellar Dawn", 1);
        game3 = new StudioGame("game3", "Game 3", 2);
        game4 = new StudioGame("game4", "Game 4", 3);
        game5 = new StudioGame("game5", "Game 5", 4);
        oldscape = new StudioGame("oldscape", "RuneScape 2007", 5);
    }
    
    @Override
    public int aw() {
        return 1678259171 * this.id;
    }
    
    public static StudioGame[] al() {
        return new StudioGame[] { StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape };
    }
    
    @Override
    public int an() {
        return 1678259171 * this.id;
    }
    
    @Override
    public int ac() {
        return 1678259171 * this.id;
    }
    
    public static PlayerType[] PlayerType_values(final byte b) {
        try {
            return new PlayerType[] { PlayerType.PlayerType_ironman, PlayerType.PlayerType_normal, PlayerType.field3434, PlayerType.PlayerType_jagexModerator, PlayerType.PlayerType_ultimateIronman, PlayerType.field3440, PlayerType.field3430, PlayerType.field3433, PlayerType.field3439, PlayerType.field3444, PlayerType.field3432, PlayerType.field3437, PlayerType.PlayerType_playerModerator, PlayerType.field3436, PlayerType.PlayerType_hardcoreIronman, PlayerType.field3431, PlayerType.field3428 };
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mr.au(" + ')');
        }
    }
    
    @Override
    public int rsOrdinal(final int n) {
        try {
            return 1678259171 * this.id;
        }
        catch (RuntimeException ex) {
            throw HealthBar.get(ex, "mr.af(" + ')');
        }
    }
    
    public static StudioGame[] ab() {
        return new StudioGame[] { StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape };
    }
    
    public static StudioGame[] aq() {
        return new StudioGame[] { StudioGame.game3, StudioGame.game4, StudioGame.runescape, StudioGame.stellardawn, StudioGame.game5, StudioGame.oldscape };
    }
}
