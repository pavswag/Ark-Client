package com.client.graphics.interfaces.impl;

import com.client.Client;
import com.client.Rasterizer3D;
import com.client.Sprite;
import com.client.audio.StaticSound;
import com.client.features.settings.Preferences;
import com.client.graphics.interfaces.RSInterface;

import static com.client.Client.tabAreaAltered;
import static com.client.features.settings.Preferences.setSliderValue;
import static com.client.graphics.interfaces.RSInterface.interfaceCache;
import static com.client.graphics.interfaces.impl.SettingsTabWidget.*;

public class Slider {

	private int position = 86;

	private double value;

	private int x, y;

	private final double minValue, maxValue, length;

	private final Sprite[] images = new Sprite[2];

	public Slider(Sprite icon, Sprite background, double minimumValue, double maximumValue) {
		this.images[0] = icon;
		this.images[1] = background;
		this.minValue = this.value = minimumValue;
		this.maxValue = maximumValue;
		this.length = this.images[1].subWidth;
	}

	public void draw(int x, int y, int alpha) {
		this.x = x;
		this.y = y;
		images[1].drawSprite(x, y);
		images[0].drawTransparentSprite(x + position - (int) (position / length * images[0].subWidth), y - images[0].subHeight / 2 + images[1].subHeight / 2, alpha);
	}

	public void handleClick(int mouseX, int mouseY, int offsetX, int offsetY, int contentType) {
		int mX = Client.instance.getMouseX();
		int mY = Client.instance.getMouseY();
		if (mX - offsetX >= x && mX - offsetX <= x + length
			&& mY - offsetY >= y + (images[1].subHeight / 2) - (images[0].subHeight / 2)
			&& mY - offsetY <= y + (images[1].subHeight / 2) + (images[0].subHeight / 2))
		{
			position = mouseX - x - offsetX;
			if (position >= length) {
				position = (int) length;
			}
			if (position <= 0) {
				position = 0;
			}
			value = minValue + ((mouseX - x - offsetX) / length) * (maxValue - minValue);
			if (value < minValue) {
				value = minValue;
			}
			if (value > maxValue) {
				value = maxValue;
			}
			int xxx = 525;

			//System.out.println("mX: " + (mouseX - xxx));
			//System.out.println("spriteX: " + images[0].xPosition);
			handleContent(contentType);
		}
	}

	public void handleClickSlide(int mouseX, int mouseY, int offsetX, int offsetY, int contentType) {
		int mX = Client.instance.getMouseX();
		int mY = Client.instance.getMouseY();
		if (mX - offsetX >= x && mX - offsetX <= x + length
			&& mY - offsetY >= y + images[1].subHeight / 2 - images[0].subHeight / 2
			&& mY - offsetY <= y + images[1].subHeight / 2 + images[0].subHeight / 2)
		{
			position = mouseX - x - offsetX;
			if (position >= length) {
				position = (int) length;
			}
			if (position <= 0) {
				position = 0;
			}
			value = minValue + ((mouseX - x - offsetX) / length) * (maxValue - minValue);
			if (value < minValue) {
				value = minValue;
			}
			if (value > maxValue) {
				value = maxValue;
			}
			handleContent(contentType);
		} else {
			return;
		}
	}

	public final static int ZOOM = 1;
	public final static int BRIGHTNESS = 2;
	public final static int MUSIC = 3;
	public final static int SOUND = 4;
	public final static int AREA_SOUND = 5;

	public void handleContent(int contentType) {
		switch(contentType) {
			case ZOOM:
				Client.cameraZoom = (int) (minValue + maxValue - value);
				if (Client.cameraZoom <= 145) {
					Client.cameraZoom = 145;
				}
				break;
			case BRIGHTNESS:
				Preferences.getPreferences().brightness = minValue + maxValue - value;
				Rasterizer3D.setBrightness(Preferences.getPreferences().brightness);
				break;
			case MUSIC:
				Preferences.getPreferences().musicVolume = (int) value;
				Client.setVolumeMusic((int) value);
				StaticSound.updateMusicVolume((int) value);

				if (value >= 10) {
					Client.instance.setConfigButton(1088, true);
					Preferences.getPreferences().musicEnabled = true;
				} else {
					Client.instance.setConfigButton(1088, false);
					Preferences.getPreferences().musicEnabled = false;
				}
				break;
			case SOUND:
				Preferences.getPreferences().soundVolume = (int) value;
				StaticSound.updateSoundEffectVolume((int) value);
				if (value >= 10) {
					Client.instance.setConfigButton(1086, true);
				} else {
					Client.instance.setConfigButton(1086, false);
				}
				break;
			case AREA_SOUND:
				Preferences.getPreferences().areaSoundVolume = (int) value;
				StaticSound.updateAreaVolume((int) value);
				if (value >= 10) {
					Client.instance.setConfigButton(1087, true);
				} else {
					Client.instance.setConfigButton(1087, false);
				}
				break;
		}
	}

	public double getPercentage() {
		return ((position / length) * 100);
	}

	public static void handleSlider(int mX, int mY) {

		try {
			int tabInterfaceId = Client.tabInterfaceIDs[Client.tabID];

			if (tabInterfaceId != -1) {

                if (tabInterfaceId == 42500) {
                    tabInterfaceId = interfaceCache.get(42500).children[9];
                } // Settings tab adjustment
                RSInterface widget = interfaceCache.get(tabInterfaceId);

                if (widget == null ||
                        widget.children == null) {
                    return;
                }

                for (int childId : widget.children) {
                    RSInterface child = interfaceCache.get(childId);
                    if (child == null || child.slider == null)
                        continue;
                    child.slider.handleClick(mX, mY, 0, 0, child.contentType);
                }
                tabAreaAltered = true;
            }

			int interfaceId = Client.instance.openInterfaceID;
			if (interfaceId != -1) {
                RSInterface widget = interfaceCache.get(interfaceId);
                if (widget == null ||
                        widget.children == null) {
                    return;
                }
                for (int childId : widget.children) {
                    RSInterface child = interfaceCache.get(childId);
                    if (child == null || child.slider == null)
                        continue;
                    child.slider.handleClick(mX, mY, 4, 4, child.contentType);
                }
            }
		}catch (Exception e) {

		}
	}

	public void setValue(double value) {

		if (value < minValue) {
			value = minValue;
		}
		else if (value > maxValue) {
			value = maxValue;
		}

		this.value = value;
		double shift = 1 - ((value - minValue) / (maxValue - minValue));

		position = (int) (length * shift);
	}
}
