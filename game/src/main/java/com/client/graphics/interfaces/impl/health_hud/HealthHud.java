package com.client.graphics.interfaces.impl.health_hud;

import com.client.Client;
import com.client.graphics.interfaces.RSInterface;
import com.client.graphics.interfaces.builder.InterfaceBuilder;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.LinearGradientPaint;
import java.awt.Paint;

public class HealthHud extends InterfaceBuilder {
    public static int healthHudTimeoutTick = -1;  // Retaining the timeout tick variable
    public static final int WIDGET_ID = 19_000;

    public static final int VARP_TYPE = 1312;
    public static final int VARP_HEALTH = 1313;

    public static int HEADER_ID = 19003;
    public static int PROGRESS_WIDGET_ID;

    public HealthHud() {
        super(WIDGET_ID);
    }

    @Override
    public void build() {
        int x = 128 + 20;
        int y = 25;
        int width = 250 - 40;
        int height = 46;
        addBox(nextInterface(), width, height, 1, 0, 0, 250);
        child(x, y);
        addRectangle(nextInterface(), width - 1, height - 3, 0x3d3327, 0, true);
        child(x + 1, y + 1);
        addText(nextInterface(), 0, 0xff9933, true, "Boss Name");
        child(width / 2 + x, y + 5);

        RSInterface progress = addProgressBar(nextInterface(), width - 5, 20, 2221, 10400);
        progress.font = Client.getInstance().newSmallFont;

        child(x + 6, y + 20);

        PROGRESS_WIDGET_ID = progress.id;

        setHudType(HudType.REGULAR);  // Default to regular
        Client.instance.parallelWidgetList.add(getRoot());
    }

    public enum HudType {
        REGULAR(0x00ff00, 0x00ff00,  255),
        ORANGE_SHIELD(0xff8a00, 0xffd700,  150),
        CYAN_SHIELD(0x00FFFF, 0x0000ff,  150),
        PURPLE_SHIELD(0x7c0fbf, 0xff00ff,  150),
        BLUE_SHIELD(0x3434eb, 0x00ffff,  150),
        YELLOW_SHIELD(0xded712, 0xffa500,  150),
        RAINBOW(-1, -1, 255);  // Special case for gradient

        private final int startColor;
        private final int endColor;
        private final int backAlpha;

        HudType(int startColor, int endColor, int backAlpha) {
            this.startColor = startColor;
            this.endColor = endColor;
            this.backAlpha = backAlpha;
        }

        public int getStartColor() {
            return startColor;
        }

        public int getEndColor() {
            return endColor;
        }

        public int getBackAlpha() {
            return backAlpha;
        }
    }

    public static void onVarpChange(int id, int value) {
        if (id == VARP_HEALTH) {
            int currentHealth = value & 0xFFFF;
            int maxHealth = value >> 16 & 0xFFFF;

            RSInterface progress = interfaceCache.get(PROGRESS_WIDGET_ID);
            progress.message = currentHealth + "/" + maxHealth;
            if (getHudType() == HudType.RAINBOW) {
                updateGradient(progress, currentHealth, maxHealth);
            }
        } else if (id == VARP_TYPE) {
            setHudType(HudType.values()[value]);
        }
    }

    public static void updateGradient(RSInterface progress, int currentHealth, int maxHealth) {
        if (getHudType() == HudType.RAINBOW) {
            float healthPercent = (float) currentHealth / maxHealth;
            int startColor = getRainbowColor(healthPercent);
            int endColor = getRainbowColor(healthPercent - 0.1f);  // Adjust slightly for gradient effect
            progress.startColor = startColor;
            progress.endColor = endColor;
        }
    }

    public static int getRainbowColor(float percentage) {
        int red = (int) (Math.sin(percentage * Math.PI * 2) * 127 + 128);
        int green = (int) (Math.sin(percentage * Math.PI * 2 + 2 * Math.PI / 3) * 127 + 128);
        int blue = (int) (Math.sin(percentage * Math.PI * 2 + 4 * Math.PI / 3) * 127 + 128);
        return new Color(red, green, blue).getRGB();
    }

    public static void setHudType(HudType type) {
        RSInterface progress = interfaceCache.get(PROGRESS_WIDGET_ID);

        if (type == HudType.RAINBOW) {
            // Initialize the gradient with full health for the rainbow HUD
            updateGradient(progress, 100, 100);
            progress.progressBackColor = 0xff0000; // Set the background to red for all types
            progress.progressBackAlpha = type.getBackAlpha();  // The background alpha for transparency
        } else {
            // For other HUD types, set the solid fill color and background color
            progress.fillColor = type.getStartColor();  // The main color of the HUD
            progress.progressBackColor = type.getEndColor();  // The background color (or secondary color for gradients)
            progress.progressBackAlpha = type.getBackAlpha();  // The background alpha for transparency
        }

        progress.hudType = type;  // Save the selected HUD type in the RSInterface
    }

    public static HudType getHudType() {
        return interfaceCache.get(PROGRESS_WIDGET_ID).hudType;
    }

    // You would then need to override the rendering logic for the progress bar to use these colors
    public static void renderProgressBar(RSInterface progress, Graphics2D g, int x, int y, int width, int height) {
        if (progress.hudType == HudType.RAINBOW) {
            Paint originalPaint = g.getPaint();
            LinearGradientPaint gradientPaint = new LinearGradientPaint(
                    x, y, x + width, y,
                    new float[]{0.0f, 1.0f},
                    new Color[]{new Color(progress.startColor), new Color(progress.endColor)}
            );
            g.setPaint(gradientPaint);
            g.fillRect(x, y, width, height);
            g.setPaint(originalPaint);
        } else {
            // Handle other HUD types
            g.setColor(new Color(progress.startColor));
            g.fillRect(x, y, width, height);
        }
    }
}

