package com.client.definitions;

import com.client.Buffer;
import com.client.EvictingDualNodeHashTable;
import com.client.cache.DualNode;
import com.client.js5.Js5List;
import com.client.js5.util.Js5ConfigType;


public class FloorDefinition extends DualNode {

    public static EvictingDualNodeHashTable underlayCache = new EvictingDualNodeHashTable(64);
    public static EvictingDualNodeHashTable overlayCache = new EvictingDualNodeHashTable(64);
    public static FloorDefinition[] underlays;

    public int primaryRgb = 0;

    public int texture = -1;

    public boolean hideUnderlay = true;

    public int secondaryRgb = -1;

    public int hue;

    public int saturation;

    public int lightness;

    public int hueMultiplier;

    public int secondaryHue;

    public int secondarySaturation;

    public int secondaryLightness;

    public static FloorDefinition lookupUnderlay(int floorID) {
        FloorDefinition floorDef = (FloorDefinition) underlayCache.get(floorID);
        if (floorDef == null) {
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.UNDERLAY, floorID);
            floorDef = new FloorDefinition();
            if (data != null) {
                floorDef.readValuesUnderlay(new Buffer(data));
            }
            floorDef.postDecodeUnderlay();
            underlayCache.put(floorDef, floorID);
        }
        return floorDef;
    }

    private void postDecodeUnderlay() {
        this.setHsl(this.primaryRgb);
    }
    public static FloorDefinition lookupOverlay(int floorID) {
        FloorDefinition floorDef = (FloorDefinition) overlayCache.get(floorID);
        if (floorDef == null) {
            byte[] data = Js5List.configs.takeFile(Js5ConfigType.OVERLAY, floorID);
            floorDef = new FloorDefinition();
            if (data != null) {
                floorDef.decode(new Buffer(data));
            }
            floorDef.postDecode();
            overlayCache.put(floorDef, floorID);
        }
        return floorDef;
    }


    private FloorDefinition() {
        texture = -1;
        hideUnderlay = true;
    }


    public int luminance;
    public int anotherHue;
    public int anotherSaturation;
    public int anotherLuminance;
    public int blendHue;
    public int blendHueMultiplier;
    public int hsl16;

    private void generateHsl(boolean isUnderlay) {
        if (secondaryRgb != -1) {
            rgbToHsl(secondaryRgb);
            anotherHue = hue;
            anotherSaturation = saturation;
            anotherLuminance = luminance;
        }
        int color = primaryRgb;
        rgbToHsl(color);
    }


    private void readValuesUnderlay(Buffer buffer) {
        for (;;) {
            int opcode = buffer.readByte();
            if (opcode == 0) {
                break;
            } else if (opcode == 1) {
                primaryRgb = ((buffer.readByte() & 0xff) << 16) + ((buffer.readByte() & 0xff) << 8) + (buffer.readByte() & 0xff);
            } else {
                System.out.println("Error unrecognised underlay code: " + opcode);
            }
        }
    }

    public void decode(Buffer buffer) {
        while(true) {
            int opcodes = buffer.readUnsignedByte();
            if (opcodes == 0) {
                return;
            }

            this.decodeNext(buffer, opcodes);
        }
    }


    void decodeNext(Buffer buffer, int opcode) {
        if (opcode == 1) {
            this.primaryRgb = buffer.readMedium();
        } else if (opcode == 2) {
            this.texture = buffer.readUnsignedByte();
        } else if (opcode == 5) {
            this.hideUnderlay = false;
        } else if (opcode == 7) {
            this.secondaryRgb = buffer.readMedium();
        }
    }

    public void postDecode() {
        if (this.secondaryRgb != -1) {
            this.setHsl(this.secondaryRgb);
            this.secondaryHue = this.hue;
            this.secondarySaturation = this.saturation;
            this.secondaryLightness = this.lightness;
        }
        this.setHsl(this.primaryRgb);
    }

    void setHsl(int rgbValue) {
        double red = (double)(rgbValue >> 16 & 255) / 256.0;
        double green = (double)(rgbValue >> 8 & 255) / 256.0;
        double blue = (double)(rgbValue & 255) / 256.0;
        double minColorValue = red;
        if (green < red) {
            minColorValue = green;
        }

        if (blue < minColorValue) {
            minColorValue = blue;
        }

        double maxColorValue = red;
        if (green > red) {
            maxColorValue = green;
        }

        if (blue > maxColorValue) {
            maxColorValue = blue;
        }

        double hueValue = 0.0;
        double saturationValue = 0.0;
        double lightnessValue = (maxColorValue + minColorValue) / 2.0;
        if (minColorValue != maxColorValue) {
            if (lightnessValue < 0.5) {
                saturationValue = (maxColorValue - minColorValue) / (minColorValue + maxColorValue);
            }

            if (lightnessValue >= 0.5) {
                saturationValue = (maxColorValue - minColorValue) / (2.0 - maxColorValue - minColorValue);
            }

            if (red == maxColorValue) {
                hueValue = (green - blue) / (maxColorValue - minColorValue);
            } else if (green == maxColorValue) {
                hueValue = 2.0 + (blue - red) / (maxColorValue - minColorValue);
            } else if (blue == maxColorValue) {
                hueValue = 4.0 + (red - green) / (maxColorValue - minColorValue);
            }
        }

        hueValue /= 6.0;
        this.saturation = (int)(256.0 * saturationValue);
        this.lightness = (int)(256.0 * lightnessValue);
        if (this.saturation < 0) {
            this.saturation = 0;
        } else if (this.saturation > 255) {
            this.saturation = 255;
        }

        if (this.lightness < 0) {
            this.lightness = 0;
        } else if (this.lightness > 255) {
            this.lightness = 255;
        }

        if (lightnessValue > 0.5) {
            this.hueMultiplier = (int)(512.0 * saturationValue * (1.0 - lightnessValue));
        } else {
            this.hueMultiplier = (int)(512.0 * lightnessValue * saturationValue);
        }

        if (this.hueMultiplier < 1) {
            this.hueMultiplier = 1;
        }

        this.hue = (int)((double)this.hueMultiplier * hueValue);
    }


    private void rgbToHsl(int rgb) {
        double r = (rgb >> 16 & 0xff) / 256.0;
        double g = (rgb >> 8 & 0xff) / 256.0;
        double b = (rgb & 0xff) / 256.0;
        double min = r;
        if (g < min) {
            min = g;
        }
        if (b < min) {
            min = b;
        }
        double max = r;
        if (g > max) {
            max = g;
        }
        if (b > max) {
            max = b;
        }
        double h = 0.0;
        double s = 0.0;
        double l = (min + max) / 2.0;
        if (min != max) {
            if (l < 0.5) {
                s = (max - min) / (max + min);
            }
            if (l >= 0.5) {
                s = (max - min) / (2.0 - max - min);
            }
            if (r == max) {
                h = (g - b) / (max - min);
            } else if (g == max) {
                h = 2.0 + (b - r) / (max - min);
            } else if (b == max) {
                h = 4.0 + (r - g) / (max - min);
            }
        }
        h /= 6.0;
        hue = (int) (h * 256.0);
        saturation = (int) (s * 256.0);
        luminance = (int) (l * 256.0);
        if (saturation < 0) {
            saturation = 0;
        } else if (saturation > 255) {
            saturation = 255;
        }
        if (luminance < 0) {
            luminance = 0;
        } else if (luminance > 255) {
            luminance = 255;
        }
        if (l > 0.5) {
            blendHueMultiplier = (int) ((1.0 - l) * s * 512.0);
        } else {
            blendHueMultiplier = (int) (l * s * 512.0);
        }
        if (blendHueMultiplier < 1) {
            blendHueMultiplier = 1;
        }
        blendHue = (int) (h * blendHueMultiplier);
        hsl16 = hsl24to16(hue, saturation, luminance);
    }

    private final static int hsl24to16(int h, int s, int l) {
        if (l > 179) {
            s /= 2;
        }
        if (l > 192) {
            s /= 2;
        }
        if (l > 217) {
            s /= 2;
        }
        if (l > 243) {
            s /= 2;
        }
        return (h / 4 << 10) + (s / 32 << 7) + l / 2;
    }
}