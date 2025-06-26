package com.client.graphics.interfaces;

import com.client.Sprite;

import java.util.HashMap;

/**
 * @author DeadScape
 * @social Discord: DeadScape
 * Website: www.kyros.net
 * @since 22/03/2024
 */
public class InterfaceImage extends RSInterface {
    public int currentSpriteId = 0;

    private Sprite mainSprite;

    private HashMap<Integer, Sprite> extraSprites;

    public Sprite getCurrentSprite() {
        if (this.currentSpriteId > 0 && this.extraSprites != null)
            return this.extraSprites.get(Integer.valueOf(this.currentSpriteId));
        return this.mainSprite;
    }



    public InterfaceImage addExtraSprite(int spriteId, Sprite sprite) {
        if (this.extraSprites == null)
            this.extraSprites = new HashMap<>();
        this.extraSprites.put(Integer.valueOf(spriteId), sprite);
        return this;
    }

    private boolean isTransparent = true;

    public boolean isTransparent() {
        return this.isTransparent;
    }

    public InterfaceImage setIsTransparent(boolean isTransparent) {
        this.isTransparent = isTransparent;
        return this;
    }


    public InterfaceImage(int interfaceId, Sprite mainSprite) {
        this.id = this.parentID = interfaceId;
        this.type = 101;
        this.mainSprite = mainSprite;
        this.width = mainSprite.subWidth;
        this.height = mainSprite.subHeight;
        this.mOverInterToTrigger = -1;
        interfaceCache.put(id, this);
    }
}
