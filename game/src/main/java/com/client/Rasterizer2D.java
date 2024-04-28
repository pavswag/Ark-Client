package com.client;


import com.client.cache.DualNode;
import net.runelite.rs.api.RSRasterizer2D;

import java.awt.*;
import java.awt.geom.Arc2D;

import static com.client.MathUtils.map;

public class Rasterizer2D extends DualNode implements RSRasterizer2D {

    public static void drawTransparentBoxOutline(int leftX, int topY, int width, int height, int rgbColour, int opacity) {
        drawTransparentHorizontalLine(leftX, topY, width, rgbColour, opacity);
        drawTransparentHorizontalLine(leftX, topY + height - 1, width, rgbColour, opacity);
        if(height >= 3) {
            drawTransparentVerticalLine(leftX, topY + 1, height - 2, rgbColour, opacity);
            drawTransparentVerticalLine(leftX + width - 1, topY + 1, height - 2, rgbColour, opacity);
        }
    }
    public static void Rasterizer2D_setClip(int var0, int var1, int var2, int var3) {
        if (var0 < 0) {
            var0 = 0;
        }

        if (var1 < 0) {
            var1 = 0;
        }

        if (var2 > Rasterizer2D_width) {
            var2 = Rasterizer2D_width;
        }

        if (var3 > Rasterizer2D_height) {
            var3 = Rasterizer2D_height;
        }

        Rasterizer2D_xClipStart = var0;
        Rasterizer2D_yClipStart = var1;
        Rasterizer2D_xClipEnd = var2;
        Rasterizer2D_yClipEnd = var3;
    }
    public static void Rasterizer2D_expandClip(int xStart, int yStart, int xEnd, int yEnd) {
        if (Rasterizer2D_xClipStart < xStart) {
            Rasterizer2D_xClipStart = xStart;
        }

        if (Rasterizer2D_yClipStart < yStart) {
            Rasterizer2D_yClipStart = yStart;
        }

        if (Rasterizer2D_xClipEnd > xEnd) {
            Rasterizer2D_xClipEnd = xEnd;
        }

        if (Rasterizer2D_yClipEnd > yEnd) {
            Rasterizer2D_yClipEnd = yEnd;
        }
        System.out.println("xStart[" + xStart + "]  yStart[" + yStart + "]  xEnd[" + xEnd + "]  yEnd[" + yEnd + "]");
        System.out.println("Rasterizer2D_xClipStart[" + Rasterizer2D_xClipStart + "]  Rasterizer2D_yClipStart[" + Rasterizer2D_yClipStart + "]  Rasterizer2D_xClipEnd[" + Rasterizer2D_xClipEnd + "]  Rasterizer2D_yClipEnd[" + Rasterizer2D_yClipEnd + "]");
    }
    public static void drawArc(int x, int y, int width, int height, int stroke, int start, int sweep, int color, int alpha, int closure, boolean fill) {
        Graphics2D graphics = Sprite.createGraphics(Rasterizer2D.Rasterizer2D_pixels, Rasterizer2D.Rasterizer2D_width, Rasterizer2D.Rasterizer2D_height);
        graphics.setColor(new Color(color >> 16 & 0xFF, color >> 8 & 0xFF, color & 0xFF, (alpha >= 256 || alpha < 0) ? 255 : alpha));
        RenderingHints render = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        render.put(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
        graphics.setRenderingHints(render);
        graphics.setComposite(AlphaComposite.getInstance(3, 1.0F));
        if (!fill)
            graphics.setStroke(new BasicStroke(((stroke < 1) ? 0 : stroke)));

        Arc2D.Double arc = new Arc2D.Double((x + stroke), (y + stroke), width, height, start, sweep, closure);
        if (fill) {
            graphics.fill(arc);
        } else {
            graphics.draw(arc);
        }
    }
    /**
     * Draws a transparent coloured horizontal line in the drawingArea.
     * @param xPosition The start X-Position of the line.
     * @param yPosition The Y-Position of the line.
     * @param width The width of the line.
     * @param rgbColour The colour of the line.
     * @param opacity The opacity value ranging from 0 to 256.
     */
    public static void drawTransparentHorizontalLine(int xPosition, int yPosition, int width, int rgbColour, int opacity) {
        if(yPosition < Rasterizer2D_yClipStart || yPosition >= Rasterizer2D_yClipEnd) {
            return;
        }
        if(xPosition < Rasterizer2D_xClipStart) {
            width -= Rasterizer2D_xClipStart - xPosition;
            xPosition = Rasterizer2D_xClipStart;
        }
        if(xPosition + width > Rasterizer2D_xClipEnd) {
            width = Rasterizer2D_xClipEnd - xPosition;
        }
        final int transparency = 256 - opacity;
        final int red = (rgbColour >> 16 & 0xff) * opacity;
        final int green = (rgbColour >> 8 & 0xff) * opacity;
        final int blue = (rgbColour & 0xff) * opacity;
        int pixelIndex = xPosition + yPosition * Rasterizer2D.Rasterizer2D_width;
        for(int i = 0; i < width; i++) {
            final int otherRed = (Rasterizer2D_pixels[pixelIndex] >> 16 & 0xff) * transparency;
            final int otherGreen = (Rasterizer2D_pixels[pixelIndex] >> 8 & 0xff) * transparency;
            final int otherBlue = (Rasterizer2D_pixels[pixelIndex] & 0xff) * transparency;
            final int transparentColour = (red + otherRed >> 8 << 16) + (green + otherGreen >> 8 << 8) + (blue + otherBlue >> 8);
            drawAlpha(Rasterizer2D_pixels, pixelIndex, transparentColour, opacity);
        }
    }

    /**
     * Draws a transparent coloured vertical line in the drawingArea.
     * @param xPosition The X-Position of the line.
     * @param yPosition The start Y-Position of the line.
     * @param height The height of the line.
     * @param rgbColour The colour of the line.
     * @param opacity The opacity value ranging from 0 to 256.
     */
    public static void drawTransparentVerticalLine(int xPosition, int yPosition, int height, int rgbColour, int opacity) {
        if(xPosition < Rasterizer2D_xClipStart || xPosition >= Rasterizer2D_xClipEnd) {
            return;
        }
        if(yPosition < Rasterizer2D_yClipStart) {
            height -= Rasterizer2D_yClipStart - yPosition;
            yPosition = Rasterizer2D_yClipStart;
        }
        if(yPosition + height > Rasterizer2D_yClipEnd) {
            height = Rasterizer2D_yClipEnd - yPosition;
        }
        final int transparency = 256 - opacity;
        final int red = (rgbColour >> 16 & 0xff) * opacity;
        final int green = (rgbColour >> 8 & 0xff) * opacity;
        final int blue = (rgbColour & 0xff) * opacity;
        int pixelIndex = xPosition + yPosition * Rasterizer2D_width;
        for(int i = 0; i < height; i++) {
            final int otherRed = (Rasterizer2D_pixels[pixelIndex] >> 16 & 0xff) * transparency;
            final int otherGreen = (Rasterizer2D_pixels[pixelIndex] >> 8 & 0xff) * transparency;
            final int otherBlue = (Rasterizer2D_pixels[pixelIndex] & 0xff) * transparency;
            final int transparentColour = (red + otherRed >> 8 << 16) + (green + otherGreen >> 8 << 8) + (blue + otherBlue >> 8);
            drawAlpha(Rasterizer2D_pixels, pixelIndex, transparentColour, opacity);
            pixelIndex += Rasterizer2D_width;
        }
    }

    public static void drawItemBox(int leftX, int topY, int width, int height, int rgbColour) {
        if (leftX < Rasterizer2D.Rasterizer2D_xClipStart) {
            width -= Rasterizer2D.Rasterizer2D_xClipStart - leftX;
            leftX = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (topY < Rasterizer2D.Rasterizer2D_yClipStart) {
            height -= Rasterizer2D.Rasterizer2D_yClipStart - topY;
            topY = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (leftX + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - leftX;
        if (topY + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - topY;
        int leftOver = Rasterizer2D.Rasterizer2D_width - width;
        int pixelIndex = leftX + topY * Rasterizer2D.Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++) {
            for (int columnIndex = 0; columnIndex < width; columnIndex++)
                drawAlpha(Rasterizer2D_pixels, pixelIndex++, rgbColour, 0);
            pixelIndex += leftOver;
        }
    }

    public static void initDrawingArea(int i, int j, int[] ai) {
        Rasterizer2D_pixels = ai;
        Rasterizer2D_width = j;
        Rasterizer2D_height = i;
        setDrawingArea(i, 0, j, 0);
    }

    public static void drawBubble(int x, int y, int radius, int colour, int initialAlpha) {
        fillCircleAlpha(x, y, radius, colour, initialAlpha);
        fillCircleAlpha(x, y, radius + 2, colour, 8);
        fillCircleAlpha(x, y, radius + 4, colour, 6);
        fillCircleAlpha(x, y, radius + 6, colour, 4);
        fillCircleAlpha(x, y, radius + 8, colour, 2);
    }

    public static void fillCircleAlpha(int posX, int posY, int radius, int colour, int alpha) {
        int dest_intensity = 256 - alpha;
        int src_red = (colour >> 16 & 0xff) * alpha;
        int src_green = (colour >> 8 & 0xff) * alpha;
        int src_blue = (colour & 0xff) * alpha;
        int i3 = posY - radius;
        if (i3 < 0)
            i3 = 0;
        int j3 = posY + radius;
        if (j3 >= Rasterizer2D_height)
            j3 = Rasterizer2D_height - 1;
        for (int y = i3; y <= j3; y++) {
            int l3 = y - posY;
            int i4 = (int) Math.sqrt(radius * radius - l3 * l3);
            int x = posX - i4;
            if (x < 0)
                x = 0;
            int k4 = posX + i4;
            if (k4 >= Rasterizer2D_width)
                k4 = Rasterizer2D_width - 1;
            int pixel_offset = x + y * Rasterizer2D_width;
            for (int i5 = x; i5 <= k4; i5++) {
                int dest_red = (Rasterizer2D_pixels[pixel_offset] >> 16 & 0xff) * dest_intensity;
                int dest_green = (Rasterizer2D_pixels[pixel_offset] >> 8 & 0xff) * dest_intensity;
                int dest_blue = (Rasterizer2D_pixels[pixel_offset] & 0xff) * dest_intensity;
                int result_rgb = ((src_red + dest_red >> 8) << 16) + ((src_green + dest_green >> 8) << 8) + (src_blue + dest_blue >> 8);

                drawAlpha(Rasterizer2D_pixels, pixel_offset++, result_rgb, 255);
            }
        }
    }

    public static void drawAlpha(int[] pixels, int index, int value, int alpha) {
        if (! Client.instance.isGpu() || pixels != Client.instance.getBufferProvider().getPixels())
        {
            pixels[index] = value;
            return;
        }

        // (int) x * 0x8081 >>> 23 is equivalent to (short) x / 255
        int outAlpha = alpha + ((pixels[index] >>> 24) * (255 - alpha) * 0x8081 >>> 23);
        pixels[index] = value & 0x00FFFFFF | outAlpha << 24;
    }

    public static void drawRectangle(int x, int y, int width, int height, int color) {
        drawHorizontalLine2(x, y, width, color);
        drawHorizontalLine2(x, (y + height) - 1, width, color);
        drawVerticalLine2(x, y, height, color);
        drawVerticalLine2((x + width) - 1, y, height, color);
    }


    protected static void drawHorizontalLineNew(int i, int j, int k, int l, int i1) {
        if (k < Rasterizer2D_yClipStart || k >= Rasterizer2D_yClipEnd)
            return;
        if (i1 < Rasterizer2D_xClipStart) {
            j -= Rasterizer2D_xClipStart - i1;
            i1 = Rasterizer2D_xClipStart;
        }
        if (i1 + j > Rasterizer2D_xClipEnd)
            j = Rasterizer2D_xClipEnd - i1;
        int j1 = 256 - l;
        int k1 = (i >> 16 & 0xff) * l;
        int l1 = (i >> 8 & 0xff) * l;
        int i2 = (i & 0xff) * l;
        int i3 = i1 + k * Rasterizer2D_width;
        for (int j3 = 0; j3 < j; j3++) {
            int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels, i3++, k3, 255);
        }
    }

    public static void drawVerticalLineNew(int i, int j, int k, int l) {
        if (l < Rasterizer2D_xClipStart || l >= Rasterizer2D_xClipEnd)
            return;
        if (i < Rasterizer2D_yClipStart) {
            k -= Rasterizer2D_yClipStart - i;
            i = Rasterizer2D_yClipStart;
        }
        if (i + k > Rasterizer2D_yClipEnd)
            k = Rasterizer2D_yClipEnd - i;
        int j1 = l + i * Rasterizer2D_width;
        for (int k1 = 0; k1 < k; k1++)
            drawAlpha(Rasterizer2D_pixels, j1 + k1 * Rasterizer2D_width, j, 255);

    }

    protected static void drawVerticleLineNew(int i, int j, int k, int l, int i1) {
        if (j < Rasterizer2D_xClipStart || j >= Rasterizer2D_xClipEnd)
            return;
        if (l < Rasterizer2D_yClipStart) {
            i1 -= Rasterizer2D_yClipStart - l;
            l = Rasterizer2D_yClipStart;
        }
        if (l + i1 > Rasterizer2D_yClipEnd)
            i1 = Rasterizer2D_yClipEnd - l;
        int j1 = 256 - k;
        int k1 = (i >> 16 & 0xff) * k;
        int l1 = (i >> 8 & 0xff) * k;
        int i2 = (i & 0xff) * k;
        int i3 = j + l * Rasterizer2D_width;
        for (int j3 = 0; j3 < i1; j3++) {
            int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels, i3, k3, 255);
            i3 += Rasterizer2D_width;
        }
    }

    public static void renderGlow(int drawX, int drawY, int glowColor, int r) {
        // center
        drawX += r / 2;
        drawY += r / 2;

        int startX = drawX - r;
        int endX = drawX + r;
        int startY = drawY - r;
        int endY = drawY + r;

        // clipping
        if (startX < Rasterizer2D_xClipStart) {
            startX = Rasterizer2D_xClipStart;
        }

        if (endX > Rasterizer2D_xClipEnd) {
            endX = Rasterizer2D_xClipEnd;
        }

        if (startY < Rasterizer2D_yClipStart) {
            startY = Rasterizer2D_yClipStart;
        }

        if (endY > Rasterizer2D_yClipEnd) {
            endY = Rasterizer2D_yClipEnd;
        }

        float edge0 = -(r / 2f);
        float edge1 = map((float) Math.sin(Client.cycle / 20f), -1, 1, edge0 + (r / 1.35f), r);
        for (int x = startX; x < endX; x++) {
            for (int y = startY; y < endY; y++) { // what did i have to get working again, texture animation? Yeah uhh, new boxes textures 96>100 not aniamting
                int index = x + y * Rasterizer2D_width;
                float d = MathUtils.dist(x, y, drawX, drawY);
                float dist = MathUtils.smoothstep(edge0, edge1, d);
                int oldColor = Rasterizer2D_pixels[index];
                int newColor = blend(oldColor, glowColor, 1f - dist);
                drawAlpha(Rasterizer2D_pixels, index, newColor, r);
            }
        }
    }

    public static int blend(int rgb1, int rgb2, float factor) {
        if (factor >= 1f) {
            return rgb2;
        }
        if (factor <= 0f) {
            return rgb1;
        }

        int r1 = (rgb1 >> 16) & 0xff;
        int g1 = (rgb1 >> 8) & 0xff;
        int b1 = (rgb1) & 0xff;

        int r2 = (rgb2 >> 16) & 0xff;
        int g2 = (rgb2 >> 8) & 0xff;
        int b2 = (rgb2) & 0xff;

        int r3 = r2 - r1;
        int g3 = g2 - g1;
        int b3 = b2 - b1;

        int r = (int) (r1 + (r3 * factor));
        int g = (int) (g1 + (g3 * factor));
        int b = (int) (b1 + (b3 * factor));

        return (r << 16) + (g << 8) + b;
    }

    public static void drawTransparentBox(int leftX, int topY, int width, int height, int rgbColour, int opacity) {
        if (leftX < Rasterizer2D.Rasterizer2D_xClipStart) {
            width -= Rasterizer2D.Rasterizer2D_xClipStart - leftX;
            leftX = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (topY < Rasterizer2D.Rasterizer2D_yClipStart) {
            height -= Rasterizer2D.Rasterizer2D_yClipStart - topY;
            topY = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (leftX + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - leftX;
        if (topY + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - topY;
        int transparency = 256 - opacity;
        int red = (rgbColour >> 16 & 0xff) * opacity;
        int green = (rgbColour >> 8 & 0xff) * opacity;
        int blue = (rgbColour & 0xff) * opacity;
        int leftOver = Rasterizer2D.Rasterizer2D_width - width;
        int pixelIndex = leftX + topY * Rasterizer2D.Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++) {
            for (int columnIndex = 0; columnIndex < width; columnIndex++) {
                int otherRed = (Rasterizer2D_pixels[pixelIndex] >> 16 & 0xff) * transparency;
                int otherGreen = (Rasterizer2D_pixels[pixelIndex] >> 8 & 0xff) * transparency;
                int otherBlue = (Rasterizer2D_pixels[pixelIndex] & 0xff) * transparency;
                int transparentColour = ((red + otherRed >> 8) << 16) + ((green + otherGreen >> 8) << 8) + (blue + otherBlue >> 8);
                drawAlpha(Rasterizer2D_pixels, pixelIndex++, transparentColour, opacity);
            }
            pixelIndex += leftOver;
        }
    }

    public static void clear(int color) {
        int length = Rasterizer2D_width * Rasterizer2D_height;
        int mod = length - (length & 0x7);
        int offset = 0;
        while (offset < mod) {
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
            Rasterizer2D_pixels[(offset++)] = color;
        }
        while (offset < length) {
            Rasterizer2D_pixels[(offset++)] = color;
        }
    }

    public static void method336(int i, int j, int k, int l, int i1) {
        if (k < Rasterizer2D_xClipStart) {
            i1 -= Rasterizer2D_xClipStart - k;
            k = Rasterizer2D_xClipStart;
        }
        if (j < Rasterizer2D_yClipStart) {
            i -= Rasterizer2D_yClipStart - j;
            j = Rasterizer2D_yClipStart;
        }
        if (k + i1 > Rasterizer2D_xClipEnd)
            i1 = Rasterizer2D_xClipEnd - k;
        if (j + i > Rasterizer2D_yClipEnd)
            i = Rasterizer2D_yClipEnd - j;
        int k1 = Rasterizer2D_width - i1;
        int l1 = k + j * Rasterizer2D_width;
        for (int i2 = -i; i2 < 0; i2++) {
            for (int j2 = -i1; j2 < 0; j2++)
                drawAlpha(Rasterizer2D_pixels, l1++, l, 255);
            l1 += k1;
        }

    }

    public static void drawRoundedRectangle(int x, int y, int width, int height, int color,
                                            int alpha, boolean filled, boolean shadowed) {
        if (shadowed)
            drawRoundedRectangle(x + 1, y + 1, width, height, 0, alpha, filled,
                    false);
        if (alpha == -1) {
            if (filled) {
                drawHorizontalLine(y + 1, color, width - 4, x + 2);// method339
                drawHorizontalLine(y + height - 2, color, width - 4, x + 2);// method339
                drawPixels(height - 4, y + 2, x + 1, color, width - 2);// method336
            }
            drawHorizontalLine(y, color, width - 4, x + 2);// method339
            drawHorizontalLine(y + height - 1, color, width - 4, x + 2);// method339
            method341(y + 2, color, height - 4, x);// method341
            method341(y + 2, color, height - 4, x + width - 1);// method341
            drawPixels(1, y + 1, x + 1, color, 1);// method336
            drawPixels(1, y + 1, x + width - 2, color, 1);// method336
            drawPixels(1, y + height - 2, x + width - 2, color, 1);// method336
            drawPixels(1, y + height - 2, x + 1, color, 1);// method336
        } else if (alpha != -1) {
            if (filled) {
                method340(color, width - 4, y + 1, alpha, x + 2);// method340
                method340(color, width - 4, y + height - 2, alpha, x + 2);// method340
                method335(color, y + 2, width - 2, height - 4, alpha, x + 1);// method335
            }
            method340(color, width - 4, y, alpha, x + 2);// method340
            method340(color, width - 4, y + height - 1, alpha, x + 2);// method340
            method342(color, x, alpha, y + 2, height - 4);// method342
            method342(color, x + width - 1, alpha, y + 2, height - 4);// method342
            method335(color, y + 1, 1, 1, alpha, x + 1);// method335
            method335(color, y + 1, 1, 1, alpha, x + width - 2);// method335
            method335(color, y + height - 2, 1, 1, alpha, x + 1);// method335
            method335(color, y + height - 2, 1, 1, alpha, x + width - 2);// method335
        }
    }

    public static void drawAlphaGradient(int x, int y, int gradientWidth, int gradientHeight, int startColor, int endColor, int alpha) {
        int k1 = 0;
        int l1 = 0x10000 / gradientHeight;
        if (x < Rasterizer2D_xClipStart) {
            gradientWidth -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (y < Rasterizer2D_yClipStart) {
            k1 += (Rasterizer2D_yClipStart - y) * l1;
            gradientHeight -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if (x + gradientWidth > Rasterizer2D_xClipEnd)
            gradientWidth = Rasterizer2D_xClipEnd - x;
        if (y + gradientHeight > Rasterizer2D_yClipEnd)
            gradientHeight = Rasterizer2D_yClipEnd - y;
        int i2 = Rasterizer2D_width - gradientWidth;
        int result_alpha = 256 - alpha;
        int total_pixels = x + y * Rasterizer2D_width;
        for (int k2 = -gradientHeight; k2 < 0; k2++) {
            int gradient1 = 0x10000 - k1 >> 8;
            int gradient2 = k1 >> 8;
            int gradient_color = ((startColor & 0xff00ff) * gradient1 + (endColor & 0xff00ff) * gradient2 & 0xff00ff00) + ((startColor & 0xff00) * gradient1 + (endColor & 0xff00) * gradient2 & 0xff0000) >>> 8;
            int color = ((gradient_color & 0xff00ff) * alpha >> 8 & 0xff00ff) + ((gradient_color & 0xff00) * alpha >> 8 & 0xff00);
            for (int k3 = -gradientWidth; k3 < 0; k3++) {
                int colored_pixel = Rasterizer2D_pixels[total_pixels];
                colored_pixel = ((colored_pixel & 0xff00ff) * result_alpha >> 8 & 0xff00ff) + ((colored_pixel & 0xff00) * result_alpha >> 8 & 0xff00);
                drawAlpha(Rasterizer2D_pixels, total_pixels++, color + colored_pixel, alpha);
            }
            total_pixels += i2;
            k1 += l1;
        }
    }

    public static void drawPixelsWithOpacity2(int xPos, int yPos, int pixelWidth, int pixelHeight, int color, int opacityLevel) {
        drawPixelsWithOpacity(color, yPos, pixelWidth, pixelHeight, opacityLevel, xPos);
    }

    public static void drawPixelsWithOpacity(int color, int yPos, int pixelWidth, int pixelHeight, int opacityLevel,
                                             int xPos) {
        if (xPos < Rasterizer2D_xClipStart) {
            pixelWidth -= Rasterizer2D_xClipStart - xPos;
            xPos = Rasterizer2D_xClipStart;
        }
        if (yPos < Rasterizer2D_yClipStart) {
            pixelHeight -= Rasterizer2D_yClipStart - yPos;
            yPos = Rasterizer2D_yClipStart;
        }
        if (xPos + pixelWidth > Rasterizer2D_xClipEnd) {
            pixelWidth = Rasterizer2D_xClipEnd - xPos;
        }
        if (yPos + pixelHeight > Rasterizer2D_yClipEnd) {
            pixelHeight = Rasterizer2D_yClipEnd - yPos;
        }
        int l1 = 256 - opacityLevel;
        int i2 = (color >> 16 & 0xFF) * opacityLevel;
        int j2 = (color >> 8 & 0xFF) * opacityLevel;
        int k2 = (color & 0xFF) * opacityLevel;
        int k3 = Rasterizer2D_width - pixelWidth;
        int l3 = xPos + yPos * Rasterizer2D_width;
        if (l3 > Rasterizer2D_pixels.length - 1) {
            l3 = Rasterizer2D_pixels.length - 1;
        }
        for (int i4 = 0; i4 < pixelHeight; i4++) {
            for (int j4 = -pixelWidth; j4 < 0; j4++) {
                int l2 = (Rasterizer2D_pixels[l3] >> 16 & 0xFF) * l1;
                int i3 = (Rasterizer2D_pixels[l3] >> 8 & 0xFF) * l1;
                int j3 = (Rasterizer2D_pixels[l3] & 0xFF) * l1;
                int k4 = (i2 + l2 >> 8 << 16) + (j2 + i3 >> 8 << 8) + (k2 + j3 >> 8);
                drawAlpha(Rasterizer2D_pixels, l3++, k4, opacityLevel);
            }
            l3 += k3;
        }
    }

    public static void method338(int i, int j, int k, int l, int i1, int j1) {
        method340(l, i1, i, k, j1);
        method340(l, i1, (i + j) - 1, k, j1);
        if (j >= 3) {
            method342(l, j1, k, i + 1, j - 2);
            method342(l, (j1 + i1) - 1, k, i + 1, j - 2);
        }
    }

    public static void method339(int i, int j, int k, int l) {
        if (i < Rasterizer2D_yClipStart || i >= Rasterizer2D_yClipEnd)
            return;
        if (l < Rasterizer2D_xClipStart) {
            k -= Rasterizer2D_xClipStart - l;
            l = Rasterizer2D_xClipStart;
        }
        if (l + k > Rasterizer2D_xClipEnd)
            k = Rasterizer2D_xClipEnd - l;
        int i1 = l + i * Rasterizer2D_width;
        for (int j1 = 0; j1 < k; j1++)
            drawAlpha(Rasterizer2D_pixels, i1 + j1, j, 255);

    }

    private static void method340(int i, int j, int k, int l, int i1) {
        if (k < Rasterizer2D_yClipStart || k >= Rasterizer2D_yClipEnd)
            return;
        if (i1 < Rasterizer2D_xClipStart) {
            j -= Rasterizer2D_xClipStart - i1;
            i1 = Rasterizer2D_xClipStart;
        }
        if (i1 + j > Rasterizer2D_xClipEnd)
            j = Rasterizer2D_xClipEnd - i1;
        int j1 = 256 - l;
        int k1 = (i >> 16 & 0xff) * l;
        int l1 = (i >> 8 & 0xff) * l;
        int i2 = (i & 0xff) * l;
        int i3 = i1 + k * Rasterizer2D_width;
        for (int j3 = 0; j3 < j; j3++) {
            int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels, i3++, k3, 255);
        }

    }

    public static void method341(int i, int j, int k, int l) {
        if (l < Rasterizer2D_xClipStart || l >= Rasterizer2D_xClipEnd)
            return;
        if (i < Rasterizer2D_yClipStart) {
            k -= Rasterizer2D_yClipStart - i;
            i = Rasterizer2D_yClipStart;
        }
        if (i + k > Rasterizer2D_yClipEnd)
            k = Rasterizer2D_yClipEnd - i;
        int j1 = l + i * Rasterizer2D_width;
        for (int k1 = 0; k1 < k; k1++)
            drawAlpha(Rasterizer2D_pixels, j1 + k1 * Rasterizer2D_width, j, 255);

    }

    private static void method342(int i, int j, int k, int l, int i1) {
        if (j < Rasterizer2D_xClipStart || j >= Rasterizer2D_xClipEnd)
            return;
        if (l < Rasterizer2D_yClipStart) {
            i1 -= Rasterizer2D_yClipStart - l;
            l = Rasterizer2D_yClipStart;
        }
        if (l + i1 > Rasterizer2D_yClipEnd)
            i1 = Rasterizer2D_yClipEnd - l;
        int j1 = 256 - k;
        int k1 = (i >> 16 & 0xff) * k;
        int l1 = (i >> 8 & 0xff) * k;
        int i2 = (i & 0xff) * k;
        int i3 = j + l * Rasterizer2D_width;
        for (int j3 = 0; j3 < i1; j3++) {
            int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels, i3, k3, 255);
            i3 += Rasterizer2D_width;
        }
    }

    public static void drawBox(int x, int y, int width, int height, int border, int borderColor, int color, int alpha) {
        drawHorizontalLine(x + 1, y, width, color, alpha);
        drawHorizontalLine(x, y + height - 2, width, color, alpha);

        drawVerticalLine(x, y, height - 2, color, alpha);
        drawVerticalLine(x + width, y + 1, height - 2, color, alpha);

        for (int i = 1; i < border; i++) {
            drawHorizontalLine(x + 1, y + i, width - 1, borderColor, alpha);
            drawHorizontalLine(x + border, y + height - i - 2, width - border * 2 + 1, borderColor, alpha);

            drawVerticalLine(x + i, y + border, height - border - 2, borderColor, alpha);
            drawVerticalLine(x + width - border + i, y + border, height - border - 2, borderColor, alpha);
        }
    }
    public static void drawBox(int leftX, int topY, int width, int height, int rgbColour) {
        if (leftX < Rasterizer2D.Rasterizer2D_xClipStart) {
            width -= Rasterizer2D.Rasterizer2D_xClipStart - leftX;
            leftX = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (topY < Rasterizer2D.Rasterizer2D_yClipStart) {
            height -= Rasterizer2D.Rasterizer2D_yClipStart - topY;
            topY = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (leftX + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - leftX;
        if (topY + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - topY;
        int leftOver = Rasterizer2D.Rasterizer2D_width - width;
        int pixelIndex = leftX + topY * Rasterizer2D.Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++) {
            for (int columnIndex = 0; columnIndex < width; columnIndex++)
                drawAlpha(Rasterizer2D_pixels, pixelIndex++, rgbColour, 255);

            pixelIndex += leftOver;
        }
    }

    public static void drawVerticalLine2(int xPosition, int yPosition, int height, int rgbColour) {
        if (xPosition < Rasterizer2D_xClipStart || xPosition >= Rasterizer2D_xClipEnd)
            return;
        if (yPosition < Rasterizer2D_yClipStart) {
            height -= Rasterizer2D_yClipStart - yPosition;
            yPosition = Rasterizer2D_yClipStart;
        }
        if (yPosition + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - yPosition;
        int pixelIndex = xPosition + yPosition * Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++)
            drawAlpha(Rasterizer2D_pixels, pixelIndex + rowIndex * Rasterizer2D_width, rgbColour, 255);
    }

    public static void drawHorizontalLine2(int xPosition, int yPosition, int width, int rgbColour) {
        if (yPosition < Rasterizer2D_yClipStart || yPosition >= Rasterizer2D_yClipEnd)
            return;
        if (xPosition < Rasterizer2D_xClipStart) {
            width -= Rasterizer2D_xClipStart - xPosition;
            xPosition = Rasterizer2D_xClipStart;
        }
        if (xPosition + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - xPosition;
        int pixelIndex = xPosition + yPosition * Rasterizer2D.Rasterizer2D_width;
        for (int i = 0; i < width; i++)
            drawAlpha(Rasterizer2D_pixels, pixelIndex + i, rgbColour, 255);

    }

    public static void drawBoxOutline(int leftX, int topY, int width, int height, int rgbColour) {
        drawHorizontalLine2(leftX, topY, width, rgbColour);
        drawHorizontalLine2(leftX, (topY + height) - 1, width, rgbColour);
        drawVerticalLine2(leftX, topY, height, rgbColour);
        drawVerticalLine2((leftX + width) - 1, topY, height, rgbColour);
    }

    public static void drawVerticalLine(int xPosition, int yPosition, int height, int rgbColour) {
        if (xPosition < Rasterizer2D_xClipStart || xPosition >= Rasterizer2D_xClipEnd)
            return;
        if (yPosition < Rasterizer2D_yClipStart) {
            height -= Rasterizer2D_yClipStart - yPosition;
            yPosition = Rasterizer2D_yClipStart;
        }
        if (yPosition + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - yPosition;
        int pixelIndex = xPosition + yPosition * Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++)
            drawAlpha(Rasterizer2D_pixels, pixelIndex + rowIndex * Rasterizer2D_width, rgbColour, 255);
    }

    public static void drawAlphaBox(int x, int y, int lineWidth, int lineHeight, int color, int alpha) {// drawAlphaHorizontalLine
        if (y < Rasterizer2D_yClipStart) {
            if (y > (Rasterizer2D_yClipStart - lineHeight)) {
                lineHeight -= (Rasterizer2D_yClipStart - y);
                y += (Rasterizer2D_yClipStart - y);
            } else {
                return;
            }
        }
        if (y + lineHeight > Rasterizer2D_yClipEnd) {
            lineHeight -= y + lineHeight - Rasterizer2D_yClipEnd;
        }
        //if (y >= bottomY - lineHeight)
        //return;
        if (x < Rasterizer2D_xClipStart) {
            lineWidth -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (x + lineWidth > Rasterizer2D_xClipEnd)
            lineWidth = Rasterizer2D_xClipEnd - x;
        for (int yOff = 0; yOff < lineHeight; yOff++) {
            int i3 = x + (y + (yOff)) * Rasterizer2D_width;
            for (int j3 = 0; j3 < lineWidth; j3++) {
                //int alpha2 = (lineWidth-j3) / (lineWidth/alpha);
                int j1 = 256 - alpha;//alpha2 is for gradient
                int k1 = (color >> 16 & 0xff) * alpha;
                int l1 = (color >> 8 & 0xff) * alpha;
                int i2 = (color & 0xff) * alpha;
                int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
                int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
                int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
                int k3 = ((k1 + j2 >> 8) << 16) + ((l1 + k2 >> 8) << 8)
                        + (i2 + l2 >> 8);
                drawAlpha(Rasterizer2D_pixels, i3++, k3, alpha);
            }
        }
    }

    public static void defaultDrawingAreaSize() {
        Rasterizer2D_xClipStart = 0;
        Rasterizer2D_yClipStart = 0;
        Rasterizer2D_xClipEnd = Rasterizer2D_width;
        Rasterizer2D_yClipEnd = Rasterizer2D_height;
        lastX = Rasterizer2D_xClipEnd;
        viewportCenterX = Rasterizer2D_xClipEnd / 2;
    }
    public static void drawHorizontalLine(int x, int y, int length, int color, int alpha) {
        if (y < Rasterizer2D_yClipStart || y >= Rasterizer2D_yClipEnd) {
            return;
        }
        if (x < Rasterizer2D_xClipStart) {
            length -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (x + length > Rasterizer2D_xClipEnd) {
            length = Rasterizer2D_xClipEnd - x;
        }
        final int j1 = 256 - alpha;
        final int k1 = (color >> 16 & 0xff) * alpha;
        final int l1 = (color >> 8 & 0xff) * alpha;
        final int i2 = (color & 0xff) * alpha;
        int i3 = x + y * Rasterizer2D_width;
        for (int j3 = 0; j3 < length; j3++) {
            final int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            final int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            final int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            final int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels,i3++,k3,255);
        }
    }

    public static void drawRectangle(int x, int y, int width, int height, int color, int alpha) {
        drawHorizontalLine(x, y, width, color, alpha);
        drawHorizontalLine(x, y + height - 1, width, color, alpha);
        if(height >= 3) {
            drawVerticalLine(x, y + 1, height - 2, color, alpha);
            drawVerticalLine(x + width - 1, y + 1, height - 2, color, alpha);
        }
    }
    public static void drawVerticalLine(int x, int y, int length, int color, int alpha) {
        if(x < Rasterizer2D_xClipStart || x >= Rasterizer2D_xClipEnd) {
            return;
        }
        if(y < Rasterizer2D_yClipStart) {
            length -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if(y + length > Rasterizer2D_yClipEnd) {
            length = Rasterizer2D_yClipEnd - y;
        }
        final int j1 = 256 - alpha;
        final int k1 = (color >> 16 & 0xff) * alpha;
        final int l1 = (color >> 8 & 0xff) * alpha;
        final int i2 = (color & 0xff) * alpha;
        int i3 = x + y * Rasterizer2D_width;
        for(int j3 = 0; j3 < length; j3++) {
            final int j2 = (Rasterizer2D_pixels[i3] >> 16 & 0xff) * j1;
            final int k2 = (Rasterizer2D_pixels[i3] >> 8 & 0xff) * j1;
            final int l2 = (Rasterizer2D_pixels[i3] & 0xff) * j1;
            final int k3 = (k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8);
            drawAlpha(Rasterizer2D_pixels,i3,(k1 + j2 >> 8 << 16) + (l1 + k2 >> 8 << 8) + (i2 + l2 >> 8),255);
            i3 += Rasterizer2D_width;
        }
    }

    /**
     * Draws a transparent box.
     * @param leftX The left edge X-Coordinate of the box.
     * @param topY The top edge Y-Coordinate of the box.
     * @param width The box width.
     * @param height The box height.
     * @param rgbColour The box colour.
     * @param opacity The opacity value ranging from 0 to 256.
     */
    public static void draw_filled_rect(int leftX, int topY, int width, int height, int rgbColour, int opacity) {
        if (leftX < Rasterizer2D.Rasterizer2D_xClipStart) {
            width -= Rasterizer2D.Rasterizer2D_xClipStart - leftX;
            leftX = Rasterizer2D.Rasterizer2D_xClipStart;
        }
        if (topY < Rasterizer2D.Rasterizer2D_yClipStart) {
            height -= Rasterizer2D.Rasterizer2D_yClipStart - topY;
            topY = Rasterizer2D.Rasterizer2D_yClipStart;
        }
        if (leftX + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - leftX;
        if (topY + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - topY;
        int transparency = 256 - opacity;
        int red = (rgbColour >> 16 & 0xff) * opacity;
        int green = (rgbColour >> 8 & 0xff) * opacity;
        int blue = (rgbColour & 0xff) * opacity;
        int leftOver = Rasterizer2D.Rasterizer2D_width - width;
        int pixelIndex = leftX + topY * Rasterizer2D.Rasterizer2D_width;
        for (int rowIndex = 0; rowIndex < height; rowIndex++) {
            for (int columnIndex = 0; columnIndex < width; columnIndex++) {
                int otherRed = (Rasterizer2D_pixels[pixelIndex] >> 16 & 0xff) * transparency;
                int otherGreen = (Rasterizer2D_pixels[pixelIndex] >> 8 & 0xff) * transparency;
                int otherBlue = (Rasterizer2D_pixels[pixelIndex] & 0xff) * transparency;
                int transparentColour = ((red + otherRed >> 8) << 16) + ((green + otherGreen >> 8) << 8) + (blue + otherBlue >> 8);
                drawAlpha(Rasterizer2D_pixels,pixelIndex++,transparentColour,opacity);
            }
            pixelIndex += leftOver;
        }
    }


    public static void fill_Rectangle(int x, int y, int w, int h, int color, int alpha) {
        if (x < Rasterizer2D_xClipStart) {
            w -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (y < Rasterizer2D_yClipStart) {
            h -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if (x + w > Rasterizer2D_xClipEnd) {
            w = Rasterizer2D_xClipEnd - x;
        }
        if (y + h > Rasterizer2D_yClipEnd) {
            h = Rasterizer2D_yClipEnd - y;
        }
        int a2 = 256 - alpha;
        int r1 = (color >> 16 & 0xff) * alpha;
        int g1 = (color >> 8 & 0xff) * alpha;
        int b1 = (color & 0xff) * alpha;
        int k3 = Rasterizer2D_width - w;
        int pixel = x + y * Rasterizer2D_width;
        for (int i4 = 0; i4 < h; i4++) {
            for (int j4 = -w; j4 < 0; j4++) {
                int r2 = (Rasterizer2D_pixels[pixel] >> 16 & 0xff) * a2;
                int g2 = (Rasterizer2D_pixels[pixel] >> 8 & 0xff) * a2;
                int b2 = (Rasterizer2D_pixels[pixel] & 0xff) * a2;
                int rgb = ((r1 + r2 >> 8) << 16) + ((g1 + g2 >> 8) << 8) + (b1 + b2 >> 8);
                drawAlpha(Rasterizer2D_pixels,pixel++,rgb,255);
            }
            pixel += k3;
        }
    }

    public static void Rasterizer2D_fillRectangle(int var0, int var1, int var2, int var3, int var4) {
        if (var0 < Rasterizer2D_xClipStart) {
            var2 -= Rasterizer2D_xClipStart - var0;
            var0 = Rasterizer2D_xClipStart;
        }

        if (var1 < Rasterizer2D_yClipStart) {
            var3 -= Rasterizer2D_yClipStart - var1;
            var1 = Rasterizer2D_yClipStart;
        }

        if (var0 + var2 > Rasterizer2D_xClipEnd) {
            var2 = Rasterizer2D_xClipEnd - var0;
        }

        if (var3 + var1 > Rasterizer2D_yClipEnd) {
            var3 = Rasterizer2D_yClipEnd - var1;
        }

        int var5 = Rasterizer2D_width - var2;
        int var6 = var0 + Rasterizer2D_width * var1;

        for (int var7 = -var3; var7 < 0; ++var7) {
            for (int var8 = -var2; var8 < 0; ++var8) {
                Rasterizer2D_pixels[var6++] = var4;
            }

            var6 += var5;
        }

    }

    public void drawAlphaGradientOnSprite(Sprite sprite, int x, int y, int gradientWidth,
                                          int gradientHeight, int startColor, int endColor, int alpha) {
        int k1 = 0;
        int l1 = 0x10000 / gradientHeight;
        if (x < Rasterizer2D_xClipStart) {
            gradientWidth -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (y < Rasterizer2D_yClipStart) {
            k1 += (Rasterizer2D_yClipStart - y) * l1;
            gradientHeight -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if (x + gradientWidth > Rasterizer2D_xClipEnd)
            gradientWidth = Rasterizer2D_xClipEnd - x;
        if (y + gradientHeight > Rasterizer2D_yClipEnd)
            gradientHeight = Rasterizer2D_yClipEnd - y;
        int i2 = Rasterizer2D_width - gradientWidth;
        int result_alpha = 256 - alpha;
        int total_pixels = x + y * Rasterizer2D_width;
        for (int k2 = -gradientHeight; k2 < 0; k2++) {
            int gradient1 = 0x10000 - k1 >> 8;
            int gradient2 = k1 >> 8;
            int gradient_color = ((startColor & 0xff00ff) * gradient1
                    + (endColor & 0xff00ff) * gradient2 & 0xff00ff00)
                    + ((startColor & 0xff00) * gradient1 + (endColor & 0xff00)
                    * gradient2 & 0xff0000) >>> 8;
            int color = ((gradient_color & 0xff00ff) * alpha >> 8 & 0xff00ff)
                    + ((gradient_color & 0xff00) * alpha >> 8 & 0xff00);
            for (int k3 = -gradientWidth; k3 < 0; k3++) {
                int colored_pixel = Rasterizer2D_pixels[total_pixels];
                colored_pixel = ((colored_pixel & 0xff00ff) * result_alpha >> 8 & 0xff00ff)
                        + ((colored_pixel & 0xff00) * result_alpha >> 8 & 0xff00);
                drawAlpha(Rasterizer2D_pixels, total_pixels++, colored_pixel, alpha);
            }
            total_pixels += i2;
            k1 += l1;
        }
    }


    public static void setDrawingArea(int x, int y, int width, int height) {
        if (y < 0)
            y = 0;
        if (height < 0)
            height = 0;
        if (width > Rasterizer2D.Rasterizer2D_width)
            width = Rasterizer2D.Rasterizer2D_width;
        if (x > Rasterizer2D.Rasterizer2D_height)
            x = Rasterizer2D.Rasterizer2D_height;
        Rasterizer2D_xClipStart = y;
        Rasterizer2D_yClipStart = height;
        Rasterizer2D_xClipEnd = width;
        Rasterizer2D.Rasterizer2D_yClipEnd = x;
        lastX = Rasterizer2D_xClipEnd;
        viewportCenterX = Rasterizer2D_xClipEnd / 2;
        viewportCenterY = Rasterizer2D.Rasterizer2D_yClipEnd / 2;
    }

    public static void setAllPixelsToZero() {
        int i = Rasterizer2D_width * Rasterizer2D_height;
        for (int j = 0; j < i; j++)
            Rasterizer2D_pixels[j] = 0;
    }

    public static boolean drawHorizontalLine(int yPos, int lineColor, int lineWidth, int xPos) {// method339
        if (yPos < Rasterizer2D_yClipStart || yPos >= Rasterizer2D_yClipEnd) {
            return false;
        }
        if (xPos < Rasterizer2D_xClipStart) {
            lineWidth -= Rasterizer2D_xClipStart - xPos;
            xPos = Rasterizer2D_xClipStart;
        }
        if (xPos + lineWidth > Rasterizer2D_xClipEnd)
            lineWidth = Rasterizer2D_xClipEnd - xPos;
        int i1 = xPos + yPos * Rasterizer2D_width;
        for (int j1 = 0; j1 < lineWidth; j1++)
            drawAlpha(Rasterizer2D_pixels, i1 + j1, lineColor, 255);
        return true;
    }

    public static void method335(int i, int j, int k, int l, int i1, int k1) {
        if (k1 < Rasterizer2D_xClipStart) {
            k -= Rasterizer2D_xClipStart - k1;
            k1 = Rasterizer2D_xClipStart;
        }
        if (j < Rasterizer2D_yClipStart) {
            l -= Rasterizer2D_yClipStart - j;
            j = Rasterizer2D_yClipStart;
        }
        if (k1 + k > Rasterizer2D_xClipEnd)
            k = Rasterizer2D_xClipEnd - k1;
        if (j + l > Rasterizer2D_yClipEnd)
            l = Rasterizer2D_yClipEnd - j;
        int l1 = 256 - i1;
        int i2 = (i >> 16 & 0xff) * i1;
        int j2 = (i >> 8 & 0xff) * i1;
        int k2 = (i & 0xff) * i1;
        int k3 = Rasterizer2D_width - k;
        int l3 = k1 + j * Rasterizer2D_width;
        for (int i4 = 0; i4 < l; i4++) {
            for (int j4 = -k; j4 < 0; j4++) {
                int l2 = (Rasterizer2D_pixels[l3] >> 16 & 0xff) * l1;
                int i3 = (Rasterizer2D_pixels[l3] >> 8 & 0xff) * l1;
                int j3 = (Rasterizer2D_pixels[l3] & 0xff) * l1;
                int k4 = ((i2 + l2 >> 8) << 16) + ((j2 + i3 >> 8) << 8)
                        + (k2 + j3 >> 8);
                drawAlpha(Rasterizer2D_pixels, l3, k4, 255);
            }

            l3 += k3;
        }
    }

    public static void drawBorder(int x, int y, int width, int height, int color) {
        Rasterizer2D.drawPixels(1, y, x, color, width);
        Rasterizer2D.drawPixels(height, y, x, color, 1);
        Rasterizer2D.drawPixels(1, y + height, x, color, width + 1);
        Rasterizer2D.drawPixels(height, y, x + width, color, 1);
    }

    public static void drawPixels(int drawHeight, int yPosition, int xPositon, int color, int drawWidth) {
        if (xPositon < Rasterizer2D_xClipStart) {
            drawWidth -= Rasterizer2D_xClipStart - xPositon;
            xPositon = Rasterizer2D_xClipStart;
        }
        if (yPosition < Rasterizer2D_yClipStart) {
            drawHeight -= Rasterizer2D_yClipStart - yPosition;
            yPosition = Rasterizer2D_yClipStart;
        }
        if (xPositon + drawWidth > Rasterizer2D_xClipEnd)
            drawWidth = Rasterizer2D_xClipEnd - xPositon;
        if (yPosition + drawHeight > Rasterizer2D_yClipEnd)
            drawHeight = Rasterizer2D_yClipEnd - yPosition;
        int k1 = Rasterizer2D_width - drawWidth;
        int l1 = xPositon + yPosition * Rasterizer2D_width;
        for (int i2 = -drawHeight; i2 < 0; i2++) {
            for (int j2 = -drawWidth; j2 < 0; j2++)
                drawAlpha(Rasterizer2D_pixels, l1++, color, 255);
            l1 += k1;
        }

    }


    public static void fillRectangle(int x, int y, int width, int height, int colour) {
        if (x < Rasterizer2D_xClipStart) {
            width -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (y < Rasterizer2D_yClipStart) {
            height -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if (x + width > Rasterizer2D_xClipEnd)
            width = Rasterizer2D_xClipEnd - x;
        if (y + height > Rasterizer2D_yClipEnd)
            height = Rasterizer2D_yClipEnd - y;
        int k1 = Rasterizer2D.Rasterizer2D_width - width;
        int l1 = x + y * Rasterizer2D.Rasterizer2D_width;
        if (l1 > Rasterizer2D_pixels.length - 1) {
            l1 = Rasterizer2D_pixels.length - 1;
        }
        for (int i2 = -height; i2 < 0; i2++) {
            for (int j2 = -width; j2 < 0; j2++)
            drawAlpha(Rasterizer2D_pixels, l1++, colour, 255);
            l1 += k1;
        }

    }
    public static void fillRectangle(int x, int y, int w, int h, int color, int alpha) {
        if (x < Rasterizer2D_xClipStart) {
            w -= Rasterizer2D_xClipStart - x;
            x = Rasterizer2D_xClipStart;
        }
        if (y < Rasterizer2D_yClipStart) {
            h -= Rasterizer2D_yClipStart - y;
            y = Rasterizer2D_yClipStart;
        }
        if (x + w > Rasterizer2D_xClipEnd) {
            w = Rasterizer2D_xClipEnd - x;
        }
        if (y + h > Rasterizer2D_yClipEnd) {
            h = Rasterizer2D_yClipEnd - y;
        }
        int a2 = 256 - alpha;
        int r1 = (color >> 16 & 0xff) * alpha;
        int g1 = (color >> 8 & 0xff) * alpha;
        int b1 = (color & 0xff) * alpha;
        int k3 = Rasterizer2D_width - w;
        int pixel = x + y * Rasterizer2D_width;
        for (int i4 = 0; i4 < h; i4++) {
            for (int j4 = -w; j4 < 0; j4++) {
                int r2 = (Rasterizer2D_pixels[pixel] >> 16 & 0xff) * a2;
                int g2 = (Rasterizer2D_pixels[pixel] >> 8 & 0xff) * a2;
                int b2 = (Rasterizer2D_pixels[pixel] & 0xff) * a2;
                int rgb = ((r1 + r2 >> 8) << 16) + ((g1 + g2 >> 8) << 8) + (b1 + b2 >> 8);
                Rasterizer2D_pixels[pixel++] = rgb;
            }
            pixel += k3;
        }
    }

    public static void fillPixels(int i, int j, int k, int l, int i1) {
        method339(i1, l, j, i);
        method339((i1 + k) - 1, l, j, i);
        method341(i1, l, k, i);
        method341(i1, l, k, (i + j) - 1);
    }

    public static void clear()	{
        int i = Rasterizer2D_width * Rasterizer2D_height;
        for(int j = 0; j < i; j++) {
            Rasterizer2D_pixels[j] = 0;
        }
    }

    Rasterizer2D() {
    }

    public static int Rasterizer2D_pixels[];
    public static int Rasterizer2D_width;
    public static int Rasterizer2D_height;
    public static int Rasterizer2D_yClipStart;
    public static int Rasterizer2D_yClipEnd;
    public static int Rasterizer2D_xClipStart;
    public static int Rasterizer2D_xClipEnd;
    public static int lastX;
    public static int viewportCenterX;
    public static int viewportCenterY;

}