package com.client.graphics.loaders;

import com.client.Sprite;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferInt;
import java.awt.image.DirectColorModel;
import java.awt.image.Raster;
import java.io.*;
import java.net.URL;
import java.util.Hashtable;

/**
 * @author DeadScape
 * @social Discord: DeadScape
 * Website: www.kyros.net
 * @since 05/03/2024
 */
public final class AnimatedSprite extends Sprite {

    public AnimatedSprite(String file) {
        this(file, DUMMY_COMPONENT);
    }

    public AnimatedSprite(String file, Component component) {
        this(loadFile(file), component);
    }

    public AnimatedSprite(File file) {
        this(file, DUMMY_COMPONENT);
    }


    public AnimatedSprite(File file, Component component) {
        this(loadFile(file), component);
    }

    public AnimatedSprite(byte[] data) {
        this(data, DUMMY_COMPONENT);
    }

    public AnimatedSprite(byte[] data, Component component) {
        this(loadImage(data, component), component);
    }

    public AnimatedSprite(Image image) {
        this(image, DUMMY_COMPONENT);
    }

    public AnimatedSprite(Image image, Component component) {
        this(image, component, 0, 0);
    }

    public AnimatedSprite(String file, int width, int height) {
        this(file, DUMMY_COMPONENT, width, height);
    }

    public AnimatedSprite(String file, Component component, int width, int height) {
        this(new File(file), component, width, height);
    }

    public AnimatedSprite(File file, int width, int height) {
        this(file, DUMMY_COMPONENT, width, height);
    }

    public AnimatedSprite(File file, Component component, int width, int height) {
        this(loadFile(file), component, width, height);
    }

    public AnimatedSprite(byte[] data, int width, int height) {
        this(data, DUMMY_COMPONENT, width, height);
    }

    public AnimatedSprite(byte[] data, Component component, int width, int height) {
        this(loadImage(data, component), component, width, height);
    }

    public AnimatedSprite(Image image, int width, int height) {
        this(image, DUMMY_COMPONENT, width, height);
    }

    public AnimatedSprite(URL url) {
        this(url, DUMMY_COMPONENT);
    }

    public AnimatedSprite(URL url, Component component) {
        this(url, component, 0, 0);
    }

    public AnimatedSprite(URL url, int width, int height) {
        this(url, DUMMY_COMPONENT, width, height);
    }

    public AnimatedSprite(URL url, Component component, int width, int height) {
        this(loadImage(url, component), component, width, height);
    }

    public AnimatedSprite(Image image, Component component, int width, int height) {
        if (component == null)
            component = DUMMY_COMPONENT;

        this.image = image;
        this.component = component;
        int newWidth = 0;
        int newHeight = 0;
        if (image != null) {
            newWidth = image.getWidth(component);
            newHeight = image.getHeight(component);
            if (newWidth <= 0 || newHeight <= 0)
                newWidth = newHeight = 0;

        }
        realWidth = newWidth;
        realHeight = newHeight;
        boolean scaled = newWidth > 0 && newHeight > 0 && width > 0 && height > 0
                && (width != newWidth || height != newHeight);
        if (scaled) {
            newWidth = width;
            newHeight = height;
        }
        if (newWidth < 1)
            newWidth = 1;

        if (newHeight < 1)
            newHeight = 1;

        this.scaled = scaled;
        this.spriteWidth = newWidth;
        this.spriteHeight = newHeight;
        int pixelCount = newWidth * newHeight;
        int[] pixels = new int[pixelCount];
        this.spritePixels = pixels;
        DirectColorModel model = new DirectColorModel(32, 0xff0000, 0xff00, 0xff, 0xff000000);
        buffer = new BufferedImage(model,
                Raster.createWritableRaster(model.createCompatibleSampleModel(newWidth, newHeight),
                        new DataBufferInt(pixels, pixelCount), null),
                false, new Hashtable<Object, Object>());
        scaleDetail = 0;
        autoUpdate = true;
        update();
    }

    public AnimatedSprite(AnimatedSprite sprite, int width, int height, boolean absScale) {
        if (sprite == null)
            throw new NullPointerException();

        image = sprite.image;
        component = sprite.component;
        int newWidth = sprite.realWidth;
        int newHeight = sprite.realHeight;
        realWidth = newWidth;
        realHeight = newHeight;
        boolean scaled = newWidth > 0 && newHeight > 0 && width > 0 && height > 0
                && (width != newWidth || height != newHeight);
        if (scaled) {
            if (!absScale) {
                newWidth = newWidth * width / sprite.spriteWidth;
                newHeight = newHeight * height / sprite.spriteHeight;
            } else {
                newWidth = width;
                newHeight = height;
            }
        } else if (!absScale) {
            newWidth = sprite.spriteWidth;
            newHeight = sprite.spriteHeight;
        }
        if (newWidth < 1)
            newWidth = 1;

        if (newHeight < 1)
            newHeight = 1;

        this.scaled = scaled;
        this.spriteWidth = newWidth;
        this.spriteHeight = newHeight;
        int pixelCount = newWidth * newHeight;
        int[] pixels = new int[pixelCount];
        this.spritePixels = pixels;
        DirectColorModel model = new DirectColorModel(32, 0xff0000, 0xff00, 0xff, 0xff000000);
        buffer = new BufferedImage(model,
                Raster.createWritableRaster(model.createCompatibleSampleModel(newWidth, newHeight),
                        new DataBufferInt(pixels, pixelCount), null),
                false, new Hashtable<Object, Object>());
        scaleDetail = sprite.scaleDetail;
        autoUpdate = sprite.autoUpdate;
        update();
    }

    public AnimatedSprite getInstance(int width, int height) {
        return getInstance(width, height, false);
    }

    public AnimatedSprite getInstance(int width, int height, boolean absScale) {
        return new AnimatedSprite(this, width, height, absScale);
    }

    private static int blend(int dst, int src) {
        int alpha = src >>> 24;
        if (alpha == 0)
            return dst;

        if (alpha == 255)
            return src;

        int delta = 255 - alpha;
        return ((src & 0xff000000 | ((src & 0xff00ff) * alpha + (dst & 0xff00ff) * delta & 0xff00ff00
                | (src & 0xff00) * alpha + (dst & 0xff00) * delta & 0xff0000) >>> 8)) & 0xffffff;
    }

    private static int blend(int dst, int src, int alpha) {
        alpha = (src >>> 24) * alpha / 255;
        if (alpha <= 0)
            return dst;

        if (alpha >= 255)
            return src;

        int delta = 255 - alpha;
        return ((src & 0xff000000 | ((src & 0xff00ff) * alpha + (dst & 0xff00ff) * delta & 0xff00ff00
                | (src & 0xff00) * alpha + (dst & 0xff00) * delta & 0xff0000) >>> 8)) & 0xffffff;
    }

/*    @Override
    public void block_copy_mask(int[] src, int scanSize, int[] dir, int height, int dst[], int tmp, int dstOff,
                                int dstPtr, int srcOff, int srcPtr) {
        int scanSizeHigh = -(scanSize >> 2);
        scanSize = -(scanSize & 3);
        int i;
        for (int y = -height; y != 0; y++) {
            for (i = scanSizeHigh; i != 0; ++i) {
                if (dir[dstPtr] == 0)
                    dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                else
                    dstPtr++;

                if (dir[dstPtr] == 0)
                    dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                else
                    dstPtr++;

                if (dir[dstPtr] == 0)
                    dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                else
                    dstPtr++;

                if (dir[dstPtr] == 0)
                    dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                else
                    dstPtr++;

            }

            for (i = scanSize; i != 0; ++i) {
                if (dir[dstPtr] == 0)
                    dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                else
                    dstPtr++;

            }

            dstPtr += dstOff;
            srcPtr += srcOff;
        }

    }

    @Override
    public void block_copy_alpha(int srcPtr, int scanSize, int[] dst, int[] src, int srcOff, int height, int dstOff,
                                 int alpha, int dstPtr) {
        int scanSizeHigh = -(scanSize >> 2);
        scanSize = -(scanSize & 3);
        int i;
        for (int y = -height; y != 0; ++y) {
            for (i = scanSizeHigh; i != 0; ++i) {
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++], alpha);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++], alpha);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++], alpha);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++], alpha);
            }

            for (i = scanSize; i != 0; ++i)
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++], alpha);

            dstPtr += dstOff;
            srcPtr += srcOff;
        }

    }

    @Override
    public void block_copy(int dstPtr, int scanSize, int height, int srcOff, int srcPtr, int dstOff, int[] src,
                           int[] dst) {
        int scanSizeHigh = -(scanSize >> 2);
        scanSize = -(scanSize & 3);
        int i;
        for (int y = -height; y != 0; y++) {
            for (i = scanSizeHigh; i != 0; ++i) {
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
            }

            for (i = scanSize; i != 0; ++i)
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);

            dstPtr += dstOff;
            srcPtr += srcOff;
        }

    }

    @Override
    public void block_copy_trans(int[] dst, int[] src, int srcPtr, int dstPtr, int scanSize, int height, int dstOff,
                                 int srcOff) {
        int scanSizeHigh = -(scanSize >> 2);
        scanSize = -(scanSize & 3);
        int i;
        for (int y = -height; y != 0; ++y) {
            for (i = scanSizeHigh; i != 0; ++i) {
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);
            }

            for (i = scanSize; i != 0; ++i)
                dst[dstPtr] = blend(dst[dstPtr++], src[srcPtr++]);

            dstPtr += dstOff;
            srcPtr += srcOff;
        }

    }*/

    private static Object getScaleDetail(int scaleDetail) {
        if (scaleDetail == SCALE_DETAIL_QUALITY)
            return RenderingHints.VALUE_RENDER_SPEED;

        if (scaleDetail == SCALE_DETAIL_SPEED)
            return RenderingHints.VALUE_RENDER_QUALITY;

        return RenderingHints.VALUE_RENDER_DEFAULT;
    }

    public void update() {
        clearPixels();
        try {
            Graphics g = buffer.getGraphics();
            if (g != null)
                try {
                    if (!scaled) {
                        g.drawImage(image, 0, 0, component);
                    } else {
                        if (g instanceof Graphics2D) {
                            ((Graphics2D) g).setRenderingHint(RenderingHints.KEY_RENDERING, getScaleDetail(scaleDetail));
                        }
                        g.drawImage(image, 0, 0, spriteWidth, spriteHeight, component);
                    }
                } finally {
                    g.dispose();
                }

        } catch (Exception x) {
        }
        overwritePixels();
    }

    //overwrites the pixels to the rasterizer
    public void overwritePixels() {
        xOffset = yOffset = 0;
        subWidth = spriteWidth;
        subHeight = spriteHeight;
        height = spriteHeight;
        width = spriteWidth;
        pixels = spritePixels;
    }

    public void clearPixels() {
        for (int i = 0; i < spritePixels.length; i++)
            spritePixels[i] = 0;
    }

    private static byte[] loadFile(String resourcePath) {
        URL resourceUrl = AnimatedSprite.class.getResource(resourcePath);
        if (resourceUrl == null) {
            System.err.println("Resource not found: " + resourcePath);
            return null;
        }

        try (InputStream input = resourceUrl.openStream();
             ByteArrayOutputStream buffer = new ByteArrayOutputStream()) {

            byte[] data = new byte[16384];
            int bytesRead;

            while ((bytesRead = input.read(data, 0, data.length)) != -1) {
                buffer.write(data, 0, bytesRead);
            }

            return buffer.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] loadFile(File file) {
        if (file == null || !file.exists() || !file.isFile() || !file.canRead()) {
            System.out.println(
                    "Can find: " + file.exists() + " Is a file: " + file.isFile() + " Can read: " + file.canRead()+", "+file.getAbsolutePath());
            return null;
        }

        long size = file.length();
        if (size < 0L || size > 2147483647L)
            return null;

        int count = (int) size;
        byte[] data = null;
        try {
            FileInputStream input = new FileInputStream(file);
            try {
                data = new byte[count];
                int offset = 0;
                for (int read; count != 0; count -= read) {
                    read = input.read(data, offset, count);
                    if (read < 0)
                        break;

                    if (read > count)
                        read = count;

                    offset += read;
                }

            } finally {
                input.close();
            }
            input.close();
        } catch (Exception x) {
        }
        return count == 0 ? data : null;
    }

    private static Image loadImage(byte[] data, Component component) {
        if (data != null)
            try {
                Toolkit toolkit = null;
                if (component == null)
                    component = DUMMY_COMPONENT;

                try {
                    toolkit = component.getToolkit();
                } catch (Exception x) {
                }
                if (toolkit == null)
                    toolkit = Toolkit.getDefaultToolkit();

                if (toolkit != null) {
                    Image image = toolkit.createImage(data);
                    if (image != null) {
                        MediaTracker tracker = new MediaTracker(component);
                        tracker.addImage(image, 0);
                        tracker.waitForAll();
                        if (!tracker.isErrorAny() && image.getWidth(component) >= 0 && image.getHeight(component) >= 0)
                            return image;

                    }
                }
                toolkit = null;
            } catch (Exception x) {
            }

        return null;
    }

    private static Image loadImage(URL url, Component component) {
        if (url != null)
            try {
                Toolkit toolkit = null;
                if (component == null)
                    component = DUMMY_COMPONENT;

                try {
                    toolkit = component.getToolkit();
                } catch (Exception x) {
                }
                if (toolkit == null)
                    toolkit = Toolkit.getDefaultToolkit();

                if (toolkit != null) {
                    Image image = toolkit.createImage(url);
                    if (image != null) {
                        MediaTracker tracker = new MediaTracker(component);
                        tracker.addImage(image, 0);
                        tracker.waitForAll();
                        if (!tracker.isErrorAny() && image.getWidth(component) >= 0 && image.getHeight(component) >= 0)
                            return image;

                    }
                }
            } catch (Exception x) {
            }

        return null;
    }


    public boolean isValid() {
        return realWidth > 0 && realHeight > 0;
    }

    public static final int SCALE_DETAIL_QUALITY = 1;
    public static final int SCALE_DETAIL_SPEED = 2;
    private int scaleDetail;
    private boolean autoUpdate;
    public final int realWidth;
    public final int realHeight;
    public final boolean scaled;
    public final Image image;
    public final Component component;
    public int spriteWidth;
    public final int spriteHeight;
    public final int[] spritePixels;
    public BufferedImage buffer;
    public static final Component DUMMY_COMPONENT = new Canvas();
}