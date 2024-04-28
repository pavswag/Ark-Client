package com.client;

import java.awt.*;
import java.awt.image.*;
import java.net.URL;
import java.util.Hashtable;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import com.client.definitions.SpriteCache;
import com.client.engine.impl.MouseHandler;
import com.client.js5.Js5List;
import com.client.js5.disk.Js5Archive;
import com.client.sign.Signlink;
import com.client.utilities.FileUtils;
import lombok.SneakyThrows;
import net.runelite.rs.api.RSSpritePixels;

public class Sprite extends Rasterizer2D implements RSSpritePixels {
	public static String location = null;

	public int xPosition, yPosition;

	public Sprite(int i, int j) {
		pixels = new int[i * j];
		subWidth = width = i;
		subHeight = height = j;
		xOffset = yOffset = 0;
	}
	private static final ColorModel COLOR_MODEL = new DirectColorModel(32, 16711680, 65280, 255);

	public static Graphics2D createGraphics(int[] pixels, int width, int height) {
		return (new BufferedImage(COLOR_MODEL,

				Raster.createWritableRaster(COLOR_MODEL.createCompatibleSampleModel(width, height), new DataBufferInt(pixels, width * height), null), false, new Hashtable<>()))

				.createGraphics();
	}
	public Sprite(int width, int height, int offsetX, int offsetY, int[] pixels) {
		this.subWidth = width;
		this.subHeight = height;
		this.xOffset = offsetX;
		this.yOffset = offsetY;
		this.pixels = pixels;

		Color color = Color.MAGENTA;
		setTransparency(color.getRed(), color.getGreen(), color.getBlue());
	}

	@SneakyThrows
	public Sprite(int width, int height, int offsetX, int offsetY, byte[] pixels) {
		Image image = Toolkit.getDefaultToolkit().createImage(pixels);
		this.subWidth = width;
		this.subHeight = height;
		this.height = height;
		this.width = width;
		this.xOffset = offsetX;
		this.yOffset = offsetY;
		this.pixels = new int[width * height];


		PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, width, height, this.pixels, 0, width);
		pixelgrabber.grabPixels();

		Color color = Color.MAGENTA;
		setTransparency(color.getRed(), color.getGreen(), color.getBlue());
	}

	public Sprite(int[] pixels,int width, int height) {
		this.subWidth = width;
		this.subHeight = height;
		this.xOffset = 0;
		this.yOffset = 0;
		this.pixels = pixels;

		Color color = Color.MAGENTA;
		setTransparency(color.getRed(), color.getGreen(), color.getBlue());
	}

	public Sprite(URL url) {
		try {
			if(url == null) {
				return;
			}
			BufferedImage image = ImageIO.read(url.openStream());

			subWidth = image.getWidth();
			subHeight = image.getHeight();
			width = subWidth;
			height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth, subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
			setTransparency(255, 0, 255);
		} catch(Exception exception) {
			System.out.println(exception);
		}
	}

	public static final Sprite EMPTY_SPRITE = new Sprite();

	public Sprite(){}

	public static Sprite SpriteBuffer_getSprite(Js5Archive sprites, int id, int index) {
		Sprite sprite = (Sprite) cachedSprites.get(id);
		if (sprite != null) {
			return sprite;
		}

		byte[] spriteData = Js5List.sprites.takeFile(id, index);
		boolean decoded;
		if (spriteData == null) {
			decoded = false;
		} else {
			SpriteData.decode(spriteData);
			decoded = true;
		}
		if (!decoded) {
			return null;
		} else {
			Sprite image = generateImage();
			cachedSprites.put(image, id);
			return image;
		}
	}

	public void highlight(int color) {
		if (this == EMPTY_SPRITE) {
			return;
		}
		int[] raster = new int[subWidth * subHeight];
		int start = 0;
		for (int y = 0; y < subHeight; y++) {
			for (int x = 0; x < subWidth; x++) {
				int outline = pixels[start];
				if (outline == 0) {
					if (x > 0 && pixels[start - 1] != 0) {
						outline = color;
					} else if (y > 0 && pixels[start - subWidth] != 0) {
						outline = color;
					} else if (x < subWidth - 1 && pixels[start + 1] != 0) {
						outline = color;
					} else if (y < subHeight - 1 && pixels[start + subWidth] != 0) {
						outline = color;
					}
				}
				raster[start++] = outline;
			}
		}
		pixels = raster;
	}

	public void outline(int color) {
		if (this == EMPTY_SPRITE) {
			return;
		}
		int[] raster = new int[subWidth * subHeight];
		int start = 0;
		for (int y = 0; y < subHeight; y++) {
			for (int x = 0; x < subWidth; x++) {
				int outline = pixels[start];
				if (outline == 0) {
					if (x > 0 && pixels[start - 1] != 0) {
						outline = color;
					} else if (y > 0 && pixels[start - subWidth] != 0) {
						outline = color;
					} else if (x < subWidth - 1 && pixels[start + 1] != 0) {
						outline = color;
					} else if (y < subHeight - 1 && pixels[start + subWidth] != 0) {
						outline = color;
					}
				}
				raster[start++] = outline;
			}
		}
		pixels = raster;
	}

	public void shadow(int color) {
		if (this == EMPTY_SPRITE) {
			return;
		}
		for (int y = subHeight - 1; y > 0; y--) {
			int pos = y * subWidth;
			for (int x = subWidth - 1; x > 0; x--) {
				if (pixels[x + pos] == 0 && pixels[x + pos - 1 - subWidth] != 0) {
					pixels[x + pos] = color;
				}
			}
		}
	}


	public Sprite(byte data[], Component component) {
		try {
			Image image =  Toolkit.getDefaultToolkit().createImage(data);
			MediaTracker mediatracker = new MediaTracker(component);
			mediatracker.addImage(image, 0);
			mediatracker.waitForAll();
			subWidth = image.getWidth(component);
			subHeight = image.getHeight(component);
			width = subWidth;
			height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth, subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
		} catch (Exception _ex) {
			System.out.println("Error converting jpg");
		}
	}

	public boolean isMousedOver(int spriteX, int spriteY, int mouseX, int mouseY) {
		return mouseX >= spriteX && mouseY >= spriteY && mouseX <= spriteX + subWidth && mouseY <= spriteY + subHeight;
	}


	public Sprite(String img, int width, int height) {
		try {
			Image image =  Toolkit.getDefaultToolkit().createImage(FileUtils.readFile(img));
			subWidth = width;
			subHeight = height;
			this.width = subWidth;
			this.height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth, subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
			image = null;
		} catch (Exception _ex) {
			System.out.println(_ex);
		}
	}

	public Sprite(Sprite sprite, int width, int height) {
		this.subWidth = width;
		this.subHeight = height;
		this.width = width;
		this.height = height;
		xOffset = 0;
		yOffset = 0;

		pixels = new int[width * height];

		System.arraycopy(sprite.pixels, 0, this.pixels, 0, this.pixels.length);

	}

	public Sprite(int id, boolean OSRS) {
		try {
			Image image =  OSRS ? Toolkit.getDefaultToolkit().getImage(Signlink.getCacheDirectory() + "sprites/osrs/" + id + ".png") : Toolkit.getDefaultToolkit().getImage(Signlink.getCacheDirectory() + "sprites/" + id + ".png");
			ImageIcon sprite = new ImageIcon(image);
			subWidth = sprite.getIconWidth();
			subHeight = sprite.getIconHeight();
			width = subWidth;
			height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth, subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
			image = null;
			setTransparency(255, 0, 255);
		} catch (Exception _ex) {
			System.out.println(_ex);
		}
	}
	public static Sprite getSprite(String img) {
		return SpriteCache.lookupWidgetSprite(img);
	}
	public Sprite(String img) {
		Sprite sprite = getSprite(img);
		if(sprite == null) {
			pixels = null;
			return;
		}
		width = sprite.width;
		subWidth = sprite.subWidth;
		height = sprite.height;
		subHeight = sprite.subHeight;
		xOffset = sprite.xOffset;
		yOffset = sprite.yOffset;
		pixels = sprite.pixels;
		advancedSprite = sprite.advancedSprite;
	}

	public Sprite(Image image) {
		ImageIcon imageicon = new ImageIcon(image);
		imageicon.getIconHeight();
		imageicon.getIconWidth();
		try {
			subWidth = imageicon.getIconWidth();
			subHeight = imageicon.getIconHeight();
			width = subWidth;
			height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth,
					subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
		} catch (Exception _ex) {
			System.out.println(_ex);
		}
	}

	public void drawHoverSprite(int x, int y, int offsetX, int offsetY, Sprite hover) {
		this.drawSprite(x, y);
		if (MouseHandler.mouseX >= offsetX + x && MouseHandler.mouseX <= offsetX + x + this.subWidth
				&& MouseHandler.mouseY >= offsetY + y && MouseHandler.mouseY <= offsetY + y + this.subHeight) {
			hover.drawSprite(x, y);
		}
	}
	public Sprite resizeSprite(int desiredWidth, int desiredHeight) {
		BufferedImage image = new BufferedImage(subWidth, subHeight, BufferedImage.TYPE_INT_RGB);

		int count = 0;
		for(int y = 0; y < subHeight; y++) {
			for(int x = 0; x < subWidth; x++) {
				image.setRGB(x, y, this.pixels[count]);
				count++;
			}
		}

		return new Sprite(scaleImage(makeColorTransparent(image, new Color(0, 0, 0)), desiredWidth, desiredHeight));
	}
	private static Image scaleImage(Image image, int desiredWidth, int desiredHeight) {
		return image.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_SMOOTH);
	}
	public static Image makeColorTransparent(BufferedImage im, final Color color) {
		RGBImageFilter filter = new RGBImageFilter() {
			public int markerRGB = color.getRGB() | 0xFF000000;
			@Override
			public final int filterRGB(int x, int y, int rgb) {
				if ((rgb | 0xFF000000) == markerRGB) {
					return 0x00FFFFFF & rgb;
				} else {
					return rgb;
				}
			}
		};
		ImageProducer ip = new FilteredImageSource(im.getSource(), filter);
		return Toolkit.getDefaultToolkit().createImage(ip);
	}
	public void draw24BitSprite(int x, int y) {
		int alpha = 256;
		x += this.xOffset;// offsetX
		y += this.yOffset;// offsetY
		int destOffset = x + y * Rasterizer2D.Rasterizer2D_width;
		int srcOffset = 0;
		int height = this.subHeight;
		int width = this.subWidth;
		int destStep = Rasterizer2D.Rasterizer2D_width - width;
		int srcStep = 0;
		if (y < Rasterizer2D.Rasterizer2D_yClipStart) {
			int trimHeight = Rasterizer2D.Rasterizer2D_yClipStart - y;
			height -= trimHeight;
			y = Rasterizer2D.Rasterizer2D_yClipStart;
			srcOffset += trimHeight * width;
			destOffset += trimHeight * Rasterizer2D.Rasterizer2D_width;
		}
		if (y + height > Rasterizer2D.Rasterizer2D_yClipEnd) {
			height -= (y + height) - Rasterizer2D.Rasterizer2D_yClipEnd;
		}
		if (x < Rasterizer2D.Rasterizer2D_xClipStart) {
			int trimLeft = Rasterizer2D.Rasterizer2D_xClipStart - x;
			width -= trimLeft;
			x = Rasterizer2D.Rasterizer2D_xClipStart;
			srcOffset += trimLeft;
			destOffset += trimLeft;
			srcStep += trimLeft;
			destStep += trimLeft;
		}
		if (x + width > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int trimRight = (x + width) - Rasterizer2D.Rasterizer2D_xClipEnd;
			width -= trimRight;
			srcStep += trimRight;
			destStep += trimRight;
		}
		if (!((width <= 0) || (height <= 0))) {
			set24BitPixels(width, height, Rasterizer2D.Rasterizer2D_pixels, this.pixels, alpha, destOffset, srcOffset, destStep, srcStep);
		}
	}

	public void drawTransparentSprite(int x, int y, int opacity) {
		int k = opacity;// was parameter
		x += xOffset;
		y += yOffset;
		int i1 = x + y * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int k1 = subHeight;
		int l1 = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - l1;
		int j2 = 0;
		if (y < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - y;
			k1 -= k2;
			y = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * l1;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (y + k1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			k1 -= (y + k1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (x < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - x;
			l1 -= l2;
			x = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (x + l1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (x + l1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(l1 <= 0 || k1 <= 0)) {
			method351(j1, l1, Rasterizer2D.Rasterizer2D_pixels, this.pixels, j2, k1, i2, k, i1);
		}
	}

	private void set24BitPixels(int width, int height, int destPixels[], int srcPixels[], int srcAlpha, int destOffset, int srcOffset, int destStep, int srcStep) {
		int srcColor;
		int destAlpha;
		for (int loop = -height; loop < 0; loop++) {
			for (int loop2 = -width; loop2 < 0; loop2++) {
				srcAlpha = ((this.pixels[srcOffset] >> 24) & 255);
				destAlpha = 256 - srcAlpha;
				srcColor = srcPixels[srcOffset++];
				if (srcColor != 0 && srcColor != 0xffffff) {
					int destColor = destPixels[destOffset];
					destPixels[destOffset++] = ((srcColor & 0xff00ff) * srcAlpha + (destColor & 0xff00ff) * destAlpha & 0xff00ff00) + ((srcColor & 0xff00) * srcAlpha + (destColor & 0xff00) * destAlpha & 0xff0000) >> 8;
				} else {
					destOffset++;
				}
			}
			destOffset += destStep;
			srcOffset += srcStep;
		}
	}

	public void setTransparency(int transRed, int transGreen, int transBlue) {
		for (int index = 0; index < pixels.length; index++)
			if (((pixels[index] >> 16) & 255) == transRed && ((pixels[index] >> 8) & 255) == transGreen && (pixels[index] & 255) == transBlue)
				pixels[index] = 0;
	}
	public String spriteName;
	public boolean advancedSprite = false;
	public Sprite(FileArchive archive, String name, int i) {
		Buffer dataBuffer = new Buffer(archive.readFile(name + ".dat"));
		Buffer indexBuffer = new Buffer(archive.readFile("index.dat"));

		indexBuffer.pos = dataBuffer.readUShort();

		width = indexBuffer.readUShort();
		height = indexBuffer.readUShort();
		int pixelCount = indexBuffer.readUnsignedByte();
		int raster[] = new int[pixelCount];

		for (int pixel = 0; pixel < pixelCount - 1; pixel++) {
			raster[pixel + 1] = indexBuffer.readTriByte();
			if (raster[pixel + 1] == 0)
				raster[pixel + 1] = 1;
		}

		for (int index = 0; index < i; index++) {
			indexBuffer.pos += 2;
			dataBuffer.pos += indexBuffer.readUShort() * indexBuffer.readUShort();
			indexBuffer.pos++;
		}

		xOffset = indexBuffer.readUnsignedByte();
		yOffset = indexBuffer.readUnsignedByte();
		subWidth = indexBuffer.readUShort();
		subHeight = indexBuffer.readUShort();

		int type = indexBuffer.readUnsignedByte();

		int spriteSize = subWidth * subHeight;

		pixels = new int[spriteSize];
		if (type == 0) {
			for (int pixel = 0; pixel < spriteSize; pixel++) {
				pixels[pixel] = raster[dataBuffer.readUnsignedByte()];
			}
			setTransparency(255, 0, 255);
			return;
		}
		if (type == 1) {
			for (int x = 0; x < subWidth; x++) {
				for (int y = 0; y < subHeight; y++) {
					pixels[x + y * subWidth] = raster[dataBuffer.readUnsignedByte()];
				}
			}

		}
		setTransparency(255, 0, 255);
		this.spriteName = i + "-" + name;
	}

	public void init() {
		Rasterizer2D.initDrawingArea(subHeight, subWidth, this.pixels);
	}

	public static void start() {
//		if (Configuration.developerMode && new File("./sprites/").exists()) {
//			location = "./sprites/";
//		} else {
		location = Signlink.getCacheDirectory() + "sprites/";
		//}
	}


	public void method344(int i, int j, int k) {
		for (int i1 = 0; i1 < pixels.length; i1++) {
			int j1 = pixels[i1];
			if (j1 != 0) {
				int k1 = j1 >> 16 & 0xff;
				k1 += i;
				if (k1 < 1)
					k1 = 1;
				else if (k1 > 255)
					k1 = 255;
				int l1 = j1 >> 8 & 0xff;
				l1 += j;
				if (l1 < 1)
					l1 = 1;
				else if (l1 > 255)
					l1 = 255;
				int i2 = j1 & 0xff;
				i2 += k;
				if (i2 < 1)
					i2 = 1;
				else if (i2 > 255)
					i2 = 255;
				pixels[i1] = (k1 << 16) + (l1 << 8) + i2;
			}
		}

	}

	public void method345() {
		int ai[] = new int[width * height];
		for (int j = 0; j < subHeight; j++) {
			System.arraycopy(pixels, j * subWidth, ai, j + yOffset * width + xOffset, subWidth);
		}

		pixels = ai;
		subWidth = width;
		subHeight = height;
		xOffset = 0;
		yOffset = 0;
	}

	public void method346(int x, int y) {
		x += xOffset;
		y += yOffset;
		int l = x + y * Rasterizer2D.Rasterizer2D_width;
		int i1 = 0;
		int height = subHeight;
		int width = subWidth;
		int l1 = Rasterizer2D.Rasterizer2D_width - width;
		int i2 = 0;
		if (y < Rasterizer2D.Rasterizer2D_yClipStart) {
			int j2 = Rasterizer2D.Rasterizer2D_yClipStart - y;
			height -= j2;
			y = Rasterizer2D.Rasterizer2D_yClipStart;
			i1 += j2 * width;
			l += j2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (y + height > Rasterizer2D.Rasterizer2D_yClipEnd)
			height -= (y + height) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (x < Rasterizer2D.Rasterizer2D_xClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_xClipStart - x;
			width -= k2;
			x = Rasterizer2D.Rasterizer2D_xClipStart;
			i1 += k2;
			l += k2;
			i2 += k2;
			l1 += k2;
		}
		if (x + width > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int l2 = (x + width) - Rasterizer2D.Rasterizer2D_xClipEnd;
			width -= l2;
			i2 += l2;
			l1 += l2;
		}
		if (width <= 0 || height <= 0) {
		} else {
			method347(l, width, height, i2, i1, l1, this.pixels, Rasterizer2D.Rasterizer2D_pixels);
		}
	}

	private void method347(int i, int j, int k, int l, int i1, int k1, int ai[], int ai1[]) {
		int l1 = -(j >> 2);
		j = -(j & 3);
		for (int i2 = -k; i2 < 0; i2++) {
			for (int j2 = l1; j2 < 0; j2++) {
				int val = ai[i1++];
				drawAlpha(ai1, i++, val, 255);
				val = ai[i1++];
				drawAlpha(ai1, i++, val, 255);
				val = ai[i1++];
				drawAlpha(ai1, i++, val, 255);
				val = ai[i1++];
				drawAlpha(ai1, i++, val, 255);
			}

			for (int k2 = j; k2 < 0; k2++) {
				int val = ai[i1++];
				drawAlpha(ai1, i++, val, 255);
			}

			i += k1;
			i1 += l;
		}
	}

	public void drawSprite1(int i, int j) {
		drawSprite1(i, j, 128);
	}

	public void drawSprite1(int i, int j, int k, boolean overrideCanvas) {
		i += xOffset;
		j += yOffset;
		int i1 = i + j * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int k1 = subHeight;
		int l1 = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - l1;
		int j2 = 0;
		if (!(overrideCanvas && j > 0) && j < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - j;
			k1 -= k2;
			j = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * l1;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (j + k1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			k1 -= (j + k1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (!overrideCanvas && i < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - i;
			l1 -= l2;
			i = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (i + l1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (i + l1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(l1 <= 0 || k1 <= 0)) {
			method351(j1, l1, Rasterizer2D.Rasterizer2D_pixels, this.pixels, j2, k1, i2, k, i1);
		}
	}

	public void drawSprite1(int i, int j, int k) {
		i += xOffset;
		j += yOffset;
		int i1 = i + j * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int k1 = subHeight;
		int l1 = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - l1;
		int j2 = 0;
		if (j < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - j;
			k1 -= k2;
			j = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * l1;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (j + k1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			k1 -= (j + k1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - i;
			l1 -= l2;
			i = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (i + l1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (i + l1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(l1 <= 0 || k1 <= 0)) {
			method351(j1, l1, Rasterizer2D.Rasterizer2D_pixels, this.pixels, j2, k1, i2, k, i1);
		}
	}

	public void drawCenteredSprite(int x, int y) {
		drawSprite(x - subWidth / 2, y - subHeight / 2);
	}

	public void drawAdvancedSpriteCentered(int i, int j) {
		drawAdvancedSprite(i - (subWidth / 2), j - (subHeight / 2));
	}

	public void drawSprite(int x, int y)
	{
		x += xOffset;
		y += yOffset;
		int rasterClip = x + y * Rasterizer2D.Rasterizer2D_width;
		int imageClip = 0;
		int height = subHeight;
		int width = subWidth;
		int rasterOffset = Rasterizer2D.Rasterizer2D_width - width;
		int imageOffset = 0;
		if(y < Rasterizer2D.Rasterizer2D_yClipStart)
		{
			int dy = Rasterizer2D.Rasterizer2D_yClipStart - y;
			height -= dy;
			y = Rasterizer2D.Rasterizer2D_yClipStart;
			imageClip += dy * width;
			rasterClip += dy * Rasterizer2D.Rasterizer2D_width;
		}
		if(y + height > Rasterizer2D.Rasterizer2D_yClipEnd)
			height -= (y + height) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if(x < Rasterizer2D.Rasterizer2D_xClipStart)
		{
			int dx = Rasterizer2D.Rasterizer2D_xClipStart - x;
			width -= dx;
			x = Rasterizer2D.Rasterizer2D_xClipStart;
			imageClip += dx;
			rasterClip += dx;
			imageOffset += dx;
			rasterOffset += dx;
		}
		if(x + width > Rasterizer2D.Rasterizer2D_xClipEnd)
		{
			int dx = (x + width) - Rasterizer2D.Rasterizer2D_xClipEnd;
			width -= dx;
			imageOffset += dx;
			rasterOffset += dx;
		}
		if(!(width <= 0 || height <= 0))
		{
			method349(Rasterizer2D.Rasterizer2D_pixels, this.pixels, imageClip, rasterClip, width, height, rasterOffset, imageOffset);
		}
	}

	public void flashSprite(int i, int j, int k) {
		i += xOffset;
		j += yOffset;
		int i1 = i + j * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int k1 = subHeight;
		int l1 = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - l1;
		int j2 = 0;
		if (j < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - j;
			k1 -= k2;
			j = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * l1;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (j + k1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			k1 -= (j + k1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - i;
			l1 -= l2;
			i = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (i + l1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (i + l1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(l1 <= 0 || k1 <= 0)) {
			method351(j1, l1, Rasterizer2D.Rasterizer2D_pixels, this.pixels, j2, k1, i2, k, i1);
		}
	}

	public void drawSprite(int i, int k, int color) {
		int tempWidth = subWidth + 2;
		int tempHeight = subHeight + 2;
		int[] tempArray = new int[tempWidth * tempHeight];
		for (int x = 0; x < subWidth; x++) {
			for (int y = 0; y < subHeight; y++) {
				if (pixels[x + y * subWidth] != 0)
					tempArray[(x + 1) + (y + 1) * tempWidth] = pixels[x + y * subWidth];
			}
		}
		for (int x = 0; x < tempWidth; x++) {
			for (int y = 0; y < tempHeight; y++) {
				if (tempArray[(x) + (y) * tempWidth] == 0) {
					if (x < tempWidth - 1 && tempArray[(x + 1) + ((y) * tempWidth)] != 0 && tempArray[(x + 1) + ((y) * tempWidth)] != 0xffffff) {
						drawAlpha(tempArray, (x) + (y) * tempWidth, color, 255);
					}
					if (x > 0 && tempArray[(x - 1) + ((y) * tempWidth)] != 0 && tempArray[(x - 1) + ((y) * tempWidth)] != 0xffffff) {
						drawAlpha(tempArray, (x) + (y) * tempWidth, color, 255);
					}
					if (y < tempHeight - 1 && tempArray[(x) + ((y + 1) * tempWidth)] != 0 && tempArray[(x) + ((y + 1) * tempWidth)] != 0xffffff) {
						drawAlpha(tempArray, (x) + (y) * tempWidth, color, 255);
					}
					if (y > 0 && tempArray[(x) + ((y - 1) * tempWidth)] != 0 && tempArray[(x) + ((y - 1) * tempWidth)] != 0xffffff) {
						drawAlpha(tempArray, (x) + (y) * tempWidth, color, 255);
					}
				}
			}
		}
		i--;
		k--;
		i += xOffset;
		k += yOffset;
		int l = i + k * Rasterizer2D.Rasterizer2D_width;
		int i1 = 0;
		int j1 = tempHeight;
		int k1 = tempWidth;
		int l1 = Rasterizer2D.Rasterizer2D_width - k1;
		int i2 = 0;
		if (k < Rasterizer2D.Rasterizer2D_yClipStart) {
			int j2 = Rasterizer2D.Rasterizer2D_yClipStart - k;
			j1 -= j2;
			k = Rasterizer2D.Rasterizer2D_yClipStart;
			i1 += j2 * k1;
			l += j2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (k + j1 > Rasterizer2D.Rasterizer2D_yClipEnd) {
			j1 -= (k + j1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		}
		if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_xClipStart - i;
			k1 -= k2;
			i = Rasterizer2D.Rasterizer2D_xClipStart;
			i1 += k2;
			l += k2;
			i2 += k2;
			l1 += k2;
		}
		if (i + k1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int l2 = (i + k1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			k1 -= l2;
			i2 += l2;
			l1 += l2;
		}
		if (!(k1 <= 0 || j1 <= 0)) {
			method349(Rasterizer2D.Rasterizer2D_pixels, tempArray, i1, l, k1, j1, l1, i2);
		}
	}

	public void drawSprite2(int i, int j) {
		int k = 225;// was parameter
		i += xOffset;
		j += yOffset;
		int i1 = i + j * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int k1 = subHeight;
		int l1 = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - l1;
		int j2 = 0;
		if (j < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - j;
			k1 -= k2;
			j = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * l1;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (j + k1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			k1 -= (j + k1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (i < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - i;
			l1 -= l2;
			i = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (i + l1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (i + l1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			l1 -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(l1 <= 0 || k1 <= 0)) {
			method351(j1, l1, Rasterizer2D.Rasterizer2D_pixels, this.pixels, j2, k1, i2, k, i1);
		}
	}

	private void method349(int ai[], int ai1[], int j, int k, int l, int i1, int j1, int k1) {
		int i;// was parameter
		int l1 = -(l >> 2);
		l = -(l & 3);
		for (int i2 = -i1; i2 < 0; i2++) {
			for (int j2 = l1; j2 < 0; j2++) {
				i = ai1[j++];
				if (i != 0 && i != -1) {
					drawAlpha(ai, k++, i, 255);
				} else {
					k++;
				}
				i = ai1[j++];
				if (i != 0 && i != -1) {
					drawAlpha(ai, k++, i, 255);
				} else {
					k++;
				}
				i = ai1[j++];
				if (i != 0 && i != -1) {
					drawAlpha(ai, k++, i, 255);
				} else {
					k++;
				}
				i = ai1[j++];
				if (i != 0 && i != -1) {
					drawAlpha(ai, k++, i, 255);
				} else {
					k++;
				}
			}

			for (int k2 = l; k2 < 0; k2++) {
				i = ai1[j++];
				if (i != 0 && i != -1) {
					drawAlpha(ai, k++, i, 255);
				} else {
					k++;
				}
			}
			k += j1;
			j += k1;
		}
	}

	private void method351(int i, int j, int ai[], int ai1[], int l, int i1, int j1, int k1, int l1) {
		int k;// was parameter
		int j2 = 256 - k1;
		for (int k2 = -i1; k2 < 0; k2++) {
			for (int l2 = -j; l2 < 0; l2++) {
				k = ai1[i++];
				if (k != 0) {
					int i3 = ai[l1];
					drawAlpha(ai, l1++, ((k & 0xff00ff) * k1 + (i3 & 0xff00ff) * j2 & 0xff00ff00) + ((k & 0xff00) * k1 + (i3 & 0xff00) * j2 & 0xff0000) >> 8, k1);
				} else {
					l1++;
				}
			}

			l1 += j1;
			i += l;
		}
	}


	public void rotate(int height, int angle, int xOffs[], int zoom, int yOffs[], int yOff, int drawY, int drawX, int width, int xOff) {
		try {
			int j2 = -width / 2;
			int k2 = -height / 2;
			int l2 = (int) (Math.sin((double) angle / 326.11000000000001D) * 65536D);
			int i3 = (int) (Math.cos((double) angle / 326.11000000000001D) * 65536D);
			l2 = l2 * zoom >> 8;
			i3 = i3 * zoom >> 8;
			int j3 = (xOff << 16) + (k2 * l2 + j2 * i3);
			int k3 = (yOff << 16) + (k2 * i3 - j2 * l2);
			int l3 = drawX + drawY * Rasterizer2D.Rasterizer2D_width;
			for (drawY = 0; drawY < height; drawY++) {
				int i4 = yOffs[drawY];
				int j4 = l3 + i4;
				int k4 = j3 + i3 * i4;
				int l4 = k3 - l2 * i4;
				for (drawX = -xOffs[drawY]; drawX < 0; drawX++) {
					int x1 = k4 >> 16;
					int y1 = l4 >> 16;
					int x2 = x1 + 1;
					int y2 = y1 + 1;
					int c1 = pixels[x1 + y1 * subWidth];
					int c2 = pixels[x2 + y1 * subWidth];
					int c3 = pixels[x1 + y2 * subWidth];
					int c4 = pixels[x2 + y2 * subWidth];
					int u1 = (k4 >> 8) - (x1 << 8);
					int v1 = (l4 >> 8) - (y1 << 8);
					int u2 = (x2 << 8) - (k4 >> 8);
					int v2 = (y2 << 8) - (l4 >> 8);
					int a1 = u2 * v2;
					int a2 = u1 * v2;
					int a3 = u2 * v1;
					int a4 = u1 * v1;
					int r = (c1 >> 16 & 0xff) * a1 + (c2 >> 16 & 0xff) * a2 + (c3 >> 16 & 0xff) * a3 + (c4 >> 16 & 0xff) * a4 & 0xff0000;
					int g = (c1 >> 8 & 0xff) * a1 + (c2 >> 8 & 0xff) * a2 + (c3 >> 8 & 0xff) * a3 + (c4 >> 8 & 0xff) * a4 >> 8 & 0xff00;
					int b = (c1 & 0xff) * a1 + (c2 & 0xff) * a2 + (c3 & 0xff) * a3 + (c4 & 0xff) * a4 >> 16;
					drawAlpha(Rasterizer2D.Rasterizer2D_pixels, j4++, r | g | b, 255);
					k4 += i3;
					l4 -= l2;
				}

				j3 += l2;
				k3 += i3;
				l3 += Rasterizer2D.Rasterizer2D_width;
			}

		} catch (Exception _ex) {
		}
	}

	public void method353(int i, double d, int l1) {
		// all of the following were parameters
		int j = 15;
		int k = 20;
		int l = 15;
		int j1 = 256;
		int k1 = 20;
		// all of the previous were parameters
		try {
			int i2 = -k / 2;
			int j2 = -k1 / 2;
			int k2 = (int) (Math.sin(d) * 65536D);
			int l2 = (int) (Math.cos(d) * 65536D);
			k2 = k2 * j1 >> 8;
			l2 = l2 * j1 >> 8;
			int i3 = (l << 16) + (j2 * k2 + i2 * l2);
			int j3 = (j << 16) + (j2 * l2 - i2 * k2);
			int k3 = l1 + i * Rasterizer2D.Rasterizer2D_width;
			for (i = 0; i < k1; i++) {
				int l3 = k3;
				int i4 = i3;
				int j4 = j3;
				for (l1 = -k; l1 < 0; l1++) {
					int k4 = pixels[(i4 >> 16) + (j4 >> 16) * subWidth];
					if (k4 != 0)
						drawAlpha(Rasterizer2D.Rasterizer2D_pixels, l3++, k4, 255);
					else
						l3++;
					i4 += l2;
					j4 -= k2;
				}

				i3 += k2;
				j3 += l2;
				k3 += Rasterizer2D.Rasterizer2D_width;
			}

		} catch (Exception _ex) {
		}
	}

	public Sprite(byte spriteData[]) {
		try {
			Image image =  Toolkit.getDefaultToolkit().createImage(spriteData);
			ImageIcon sprite = new ImageIcon(image);
			subWidth = sprite.getIconWidth();
			subHeight = sprite.getIconHeight();
			width = subWidth;
			height = subHeight;
			xOffset = 0;
			yOffset = 0;
			pixels = new int[subWidth * subHeight];
			PixelGrabber pixelgrabber = new PixelGrabber(image, 0, 0, subWidth, subHeight, this.pixels, 0, subWidth);
			pixelgrabber.grabPixels();
			image = null;
			setTransparency(255, 0, 255);
		} catch (Exception _ex) {
			System.out.println(_ex);
		}
	}

	public static Image create(byte spriteData[]) {
		return Toolkit.getDefaultToolkit().createImage(spriteData);
	}

	public void method354(IndexedImage background, int i, int j) {
		j += xOffset;
		i += yOffset;
		int k = j + i * Rasterizer2D.Rasterizer2D_width;
		int l = 0;
		int i1 = subHeight;
		int j1 = subWidth;
		int k1 = Rasterizer2D.Rasterizer2D_width - j1;
		int l1 = 0;
		if (i < Rasterizer2D.Rasterizer2D_yClipStart) {
			int i2 = Rasterizer2D.Rasterizer2D_yClipStart - i;
			i1 -= i2;
			i = Rasterizer2D.Rasterizer2D_yClipStart;
			l += i2 * j1;
			k += i2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (i + i1 > Rasterizer2D.Rasterizer2D_yClipEnd)
			i1 -= (i + i1) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (j < Rasterizer2D.Rasterizer2D_xClipStart) {
			int j2 = Rasterizer2D.Rasterizer2D_xClipStart - j;
			j1 -= j2;
			j = Rasterizer2D.Rasterizer2D_xClipStart;
			l += j2;
			k += j2;
			l1 += j2;
			k1 += j2;
		}
		if (j + j1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int k2 = (j + j1) - Rasterizer2D.Rasterizer2D_xClipEnd;
			j1 -= k2;
			l1 += k2;
			k1 += k2;
		}
		if (!(j1 <= 0 || i1 <= 0)) {
			method355(pixels, j1, background.palettePixels, i1, Rasterizer2D.Rasterizer2D_pixels, 0, k1, k, l1, l);
		}
	}


	public void drawAdvancedSprite(int xPos, int yPos) {
		drawAdvancedSprite(xPos, yPos, 256);
	}
	public void drawSpriteTransparent(int var1, int var2, int var3) {
		var1 += this.xOffset;
		var2 += this.yOffset;
		int var4 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
		int var5 = 0;
		int var6 = this.subHeight;
		int var7 = this.subWidth;
		int var8 = Rasterizer2D.Rasterizer2D_width - var7;
		int var9 = 0;
		int var10;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
			var10 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
			var6 -= var10;
			var2 = Rasterizer2D.Rasterizer2D_yClipStart;
			var5 += var10 * var7;
			var4 += var10 * Rasterizer2D.Rasterizer2D_width;
		}

		if (var6 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
			var6 -= var6 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
			var10 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
			var7 -= var10;
			var1 = Rasterizer2D.Rasterizer2D_xClipStart;
			var5 += var10;
			var4 += var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			var10 = var7 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
			var7 -= var10;
			var9 += var10;
			var8 += var10;
		}

		if (var7 > 0 && var6 > 0) {
			Sprite_drawTransparent(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var5, var4, var7, var6, var8, var9, var3);
		}
	}
	static void Sprite_drawTransparent(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
		int var10 = 256 - var9;

		for (int var11 = -var6; var11 < 0; ++var11) {
			for (int var12 = -var5; var12 < 0; ++var12) {
				var2 = var1[var3++];
				if (var2 != 0) {
					int var13 = var0[var4];
					var0[var4++] = ((var13 & 16711935) * var10 + var9 * (var2 & 16711935) & -16711936) + ((var2 & 65280) * var9 + var10 * (var13 & 65280) & 16711680) >> 8;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}
	public void drawAdvancedSprite(int xPos, int yPos, int alpha) {
		int alphaValue = alpha;
		xPos += xOffset;
		yPos += yOffset;
		int i1 = xPos + yPos * Rasterizer2D.Rasterizer2D_width;
		int j1 = 0;
		int spriteHeight = subHeight;
		int spriteWidth = subWidth;
		int i2 = Rasterizer2D.Rasterizer2D_width - spriteWidth;
		int j2 = 0;
		if (yPos < Rasterizer2D.Rasterizer2D_yClipStart) {
			int k2 = Rasterizer2D.Rasterizer2D_yClipStart - yPos;
			spriteHeight -= k2;
			yPos = Rasterizer2D.Rasterizer2D_yClipStart;
			j1 += k2 * spriteWidth;
			i1 += k2 * Rasterizer2D.Rasterizer2D_width;
		}
		if (yPos + spriteHeight > Rasterizer2D.Rasterizer2D_yClipEnd)
			spriteHeight -= (yPos + spriteHeight) - Rasterizer2D.Rasterizer2D_yClipEnd;
		if (xPos < Rasterizer2D.Rasterizer2D_xClipStart) {
			int l2 = Rasterizer2D.Rasterizer2D_xClipStart - xPos;
			spriteWidth -= l2;
			xPos = Rasterizer2D.Rasterizer2D_xClipStart;
			j1 += l2;
			i1 += l2;
			j2 += l2;
			i2 += l2;
		}
		if (xPos + spriteWidth > Rasterizer2D.Rasterizer2D_xClipEnd) {
			int i3 = (xPos + spriteWidth) - Rasterizer2D.Rasterizer2D_xClipEnd;
			spriteWidth -= i3;
			j2 += i3;
			i2 += i3;
		}
		if (!(spriteWidth <= 0 || spriteHeight <= 0)) {
			renderARGBPixels(spriteWidth, spriteHeight, this.pixels, Rasterizer2D.Rasterizer2D_pixels, i1, alphaValue, j1, j2, i2);
		}
	}

	static void Sprite_drawTransBg(int[] var0, int[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
		int var9 = -(var5 >> 2);
		var5 = -(var5 & 3);

		for (int var10 = -var6; var10 < 0; ++var10) {
			int var11;
			for (var11 = var9; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}

				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			for (var11 = var5; var11 < 0; ++var11) {
				var2 = var1[var3++];
				if (var2 != 0) {
					var0[var4++] = var2;
				} else {
					++var4;
				}
			}

			var4 += var7;
			var3 += var8;
		}

	}

	private void renderARGBPixels(int spriteWidth, int spriteHeight, int spritePixels[], int renderAreaPixels[], int pixel, int alphaValue, int i, int l, int j1) {
		int pixelColor;
		int alphaLevel;
		int alpha = alphaValue;
		for (int height = -spriteHeight; height < 0; height++) {
			for (int width = -spriteWidth; width < 0; width++) {
				alphaValue = ((pixels[i] >> 24) & (alpha - 1));
				alphaLevel = 256 - alphaValue;
				if (alphaLevel > 256) {
					alphaValue = 0;
				}
				if (alpha == 0) {
					alphaLevel = 256;
					alphaValue = 0;
				}
				pixelColor = spritePixels[i++];
				if (pixelColor != 0) {
					int pixelValue = renderAreaPixels[pixel];
					drawAlpha(renderAreaPixels, pixel++, ((pixelColor & 0xff00ff) * alphaValue
							+ (pixelValue & 0xff00ff) * alphaLevel & 0xff00ff00)
							+ ((pixelColor & 0xff00) * alphaValue + (pixelValue & 0xff00) * alphaLevel
							& 0xff0000) >> 8, alphaValue);
				} else {
					pixel++;
				}
			}
			pixel += j1;
			i += l;
		}
	}

	private void method355(int ai[], int i, byte abyte0[], int j, int ai1[], int k, int l, int i1, int j1, int k1) {
		int l1 = -(i >> 2);
		i = -(i & 3);
		for (int j2 = -j; j2 < 0; j2++) {
			for (int k2 = l1; k2 < 0; k2++) {
				k = ai[k1++];
				if (k != 0 && abyte0[i1] == 0)
					drawAlpha(ai1, i1++, k, 255);
				else
					i1++;
				k = ai[k1++];
				if (k != 0 && abyte0[i1] == 0)
					drawAlpha(ai1, i1++, k, 255);
				else
					i1++;
				k = ai[k1++];
				if (k != 0 && abyte0[i1] == 0)
					drawAlpha(ai1, i1++, k, 255);
				else
					i1++;
				k = ai[k1++];
				if (k != 0 && abyte0[i1] == 0)
					drawAlpha(ai1, i1++, k, 255);
				else
					i1++;
			}

			for (int l2 = i; l2 < 0; l2++) {
				k = ai[k1++];
				if (k != 0 && abyte0[i1] == 0)
					drawAlpha(ai1, i1++, k, 255);
				else
					i1++;
			}

			i1 += l;
			k1 += j1;
		}

	}

	public void cutR(int neww) {

		for(int k = 0; k < subHeight; k++) {
			if(subWidth *(k+1) < pixels.length)
				for(int dd = 0; dd < neww; dd++) {
					if((subWidth *(k+1))-dd >= 0)
						pixels[(subWidth *(k+1))-dd] = 0;
				}
			else
				for(int dd = 1; dd < neww; dd++) {
					if((subWidth *(k+1))-dd >= 0)
						pixels[(subWidth *(k+1))-dd] = 0;
				}

		}


	}
	public void cutL(int neww) {

		for(int k = 0; k < subHeight; k++) {
			if((k*(subHeight * subWidth))+neww < pixels.length)
				for(int dd = 0; dd < neww; dd++) {
					if((k* subWidth)+dd >= 0)
						pixels[(k* subWidth)+dd] = 0;
				}

			else
				for(int dd = 0; dd < neww-1; dd++)  {
					if((k* subWidth)+dd >= 0)
						pixels[(k* subWidth)+dd] = 0;
				}

		}
	}

	public int pixels[];
	public int subWidth;
	public int subHeight;
	public int xOffset;
	public int yOffset;
	public int width;
	public int height;

	@Override
	public void drawAt(int x, int y) {
		drawSprite(x, y);
	}

	@Override
	public int getWidth() {
		return subWidth;
	}

	@Override
	public int getHeight() {
		return subHeight;
	}

	@Override
	public int getMaxWidth() {
		return width;
	}

	@Override
	public int getMaxHeight() {
		return height;
	}

	@Override
	public int getOffsetX() {
		return xOffset;
	}

	@Override
	public int getOffsetY() {
		return yOffset;
	}

	@Override
	public void setMaxWidth(int maxWidth) {
		this.width = maxWidth;
	}

	@Override
	public void setMaxHeight(int maxHeight) {
		this.height = maxHeight;
	}

	@Override
	public void setOffsetX(int offsetX) {
		xOffset = offsetX;
	}

	@Override
	public void setOffsetY(int offsetY) {
		yOffset = offsetY;
	}

	@Override
	public int[] getPixels() {
		return pixels;
	}

	@Override
	public void setRaster() {
		init();
	}

	@Override
	public BufferedImage toBufferedImage() {
		BufferedImage image = new BufferedImage(this.subWidth, this.subHeight, 2);
		toBufferedImage(image);
		return image;
	}

	@Override
	public void toBufferedImage(BufferedImage img) throws IllegalArgumentException {
		int width = getWidth();
		int height = getHeight();
		int[] pixels = getPixels();
		int[] palette = new int[pixels.length];
		for (int pixel = 0; pixel < pixels.length; pixel++) {
			if (pixels[pixel] != 0) {
				palette[pixel] = pixels[pixel] | 0xFF000000;
			}
		}
		img.setRGB(0, 0, width, height, palette, 0, width);
	}

	@Override
	public BufferedImage toBufferedOutline(Color color)
	{
		BufferedImage img = new BufferedImage(getWidth(), getHeight(), BufferedImage.TYPE_INT_ARGB);
		toBufferedOutline(img, color.getRGB());
		return img;
	}


	@Override
	public void toBufferedOutline(BufferedImage img, int color)
	{
		int width = getWidth();
		int height = getHeight();

		if (img.getWidth() != width || img.getHeight() != height)
		{
			throw new IllegalArgumentException("Image bounds do not match Sprite");
		}

		int[] pixels = getPixels();
		int[] newPixels = new int[width * height];
		int pixelIndex = 0;

		for (int y = 0; y < height; ++y)
		{
			for (int x = 0; x < width; ++x)
			{
				int pixel = pixels[pixelIndex];
				if (pixel == 16777215 || pixel == 0)
				{
					// W
					if (x > 0 && pixels[pixelIndex - 1] != 0)
					{
						pixel = color;
					}
					// N
					else if (y > 0 && pixels[pixelIndex - width] != 0)
					{
						pixel = color;
					}
					// E
					else if (x < width - 1 && pixels[pixelIndex + 1] != 0)
					{
						pixel = color;
					}
					// S
					else if (y < height - 1 && pixels[pixelIndex + width] != 0)
					{
						pixel = color;
					}
					newPixels[pixelIndex] = pixel;
				}

				pixelIndex++;
			}
		}

		img.setRGB(0, 0, width, height, newPixels, 0, width);
	}


	public static EvictingDualNodeHashTable cachedSprites = new EvictingDualNodeHashTable(256);

	public static Sprite getSprite(int id, int index) {

		Sprite sprite = (Sprite) cachedSprites.get(id);
		if (sprite != null) {
			return sprite;
		}

		byte[] spriteData = Js5List.sprites.takeFile(id, index);
		boolean decoded;
		if (spriteData == null) {
			decoded = false;
		} else {
			SpriteData.decode(spriteData);
			decoded = true;
		}
		if (!decoded) {
			return Sprite.EMPTY_SPRITE;
		} else {
			Sprite image = generateImage();
			cachedSprites.put(image, id);
			return image;
		}
	}
	static Sprite generateImage() {
		Sprite sprite = new Sprite();
		sprite.width = SpriteData.spriteWidth;
		sprite.height = SpriteData.spriteHeight;
		sprite.xOffset = SpriteData.xOffsets[0];
		sprite.yOffset = SpriteData.yOffsets[0];
		sprite.subWidth = SpriteData.spriteWidths[0];
		sprite.subHeight = SpriteData.spriteHeights[0];
		int totalPixels = sprite.subWidth * sprite.subHeight;
		byte[] pixels = SpriteData.pixels[0];
		sprite.pixels = new int[totalPixels];

		for(int currentPixel = 0; currentPixel < totalPixels; ++currentPixel) {
			sprite.pixels[currentPixel] = SpriteData.spritePalette[pixels[currentPixel] & 255];
		}

		SpriteData.xOffsets = null;
		SpriteData.yOffsets = null;
		SpriteData.spriteWidths = null;
		SpriteData.spriteHeights = null;
		SpriteData.spritePalette = null;
		SpriteData.pixels = null;
		return sprite;
	}

	public void drawTransBgAt(int var1, int var2) {
		var1 += this.xOffset;
		var2 += this.yOffset;
		int var3 = var1 + var2 * Rasterizer2D.Rasterizer2D_width;
		int var4 = 0;
		int var5 = this.subHeight;
		int var6 = this.subWidth;
		int var7 = Rasterizer2D.Rasterizer2D_width - var6;
		int var8 = 0;
		int var9;
		if (var2 < Rasterizer2D.Rasterizer2D_yClipStart) {
			var9 = Rasterizer2D.Rasterizer2D_yClipStart - var2;
			var5 -= var9;
			var2 = Rasterizer2D.Rasterizer2D_yClipStart;
			var4 += var9 * var6;
			var3 += var9 * Rasterizer2D.Rasterizer2D_width;
		}

		if (var5 + var2 > Rasterizer2D.Rasterizer2D_yClipEnd) {
			var5 -= var5 + var2 - Rasterizer2D.Rasterizer2D_yClipEnd;
		}

		if (var1 < Rasterizer2D.Rasterizer2D_xClipStart) {
			var9 = Rasterizer2D.Rasterizer2D_xClipStart - var1;
			var6 -= var9;
			var1 = Rasterizer2D.Rasterizer2D_xClipStart;
			var4 += var9;
			var3 += var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 + var1 > Rasterizer2D.Rasterizer2D_xClipEnd) {
			var9 = var6 + var1 - Rasterizer2D.Rasterizer2D_xClipEnd;
			var6 -= var9;
			var8 += var9;
			var7 += var9;
		}

		if (var6 > 0 && var5 > 0) {
			Sprite_drawTransBg(Rasterizer2D.Rasterizer2D_pixels, this.pixels, 0, var4, var3, var6, var5, var7, var8);
		}
	}
}