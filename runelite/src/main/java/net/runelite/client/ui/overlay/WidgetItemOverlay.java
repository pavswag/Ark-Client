/*
 * Copyright (c) 2019, Adam <Adam@sigterm.info>
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR
 * ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
 * LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 * (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package net.runelite.client.ui.overlay;

import lombok.AccessLevel;
import lombok.Setter;
import net.runelite.api.widgets.Widget;
import net.runelite.api.widgets.WidgetInfo;
import net.runelite.api.widgets.WidgetItem;

import static net.runelite.api.widgets.WidgetID.BANK_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.DEPOSIT_BOX_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.DUEL_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.DUEL_INVENTORY_OTHER_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.EQUIPMENT_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.EQUIPMENT_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.GRAND_EXCHANGE_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.GUIDE_PRICES_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.PLAYER_TRADE_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.PLAYER_TRADE_SCREEN_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.POH_TREASURE_CHEST_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.SEED_VAULT_INVENTORY_GROUP_ID;
import static net.runelite.api.widgets.WidgetID.SHOP_INVENTORY_GROUP_ID;

import java.awt.*;
import java.util.Arrays;
import java.util.Collection;

public abstract class WidgetItemOverlay extends Overlay
{
	@Setter(AccessLevel.PACKAGE)
	private OverlayManager overlayManager;

	protected WidgetItemOverlay()
	{
		super.setPosition(OverlayPosition.DYNAMIC);
		super.setPriority(PRIORITY_LOW);
		super.setLayer(OverlayLayer.MANUAL);
	}

	public abstract void renderItemOverlay(Graphics2D graphics, int itemId, WidgetItem widgetItem);

	@Override
	public Dimension render(Graphics2D graphics)
	{
		final Collection<WidgetItem> widgetItems = overlayManager.getWidgetItems();
		final Rectangle originalClipBounds = graphics.getClipBounds();
		Widget curClipParent = null;
		for (WidgetItem widgetItem : widgetItems)
		{
			Widget widget = widgetItem.getWidget();
			Widget parent = widget.getParent();
			Rectangle parentBounds = parent.getBounds();
			Rectangle itemCanvasBounds = widgetItem.getCanvasBounds();
			boolean dragging = widgetItem.getDraggingCanvasBounds() != null;

			boolean shouldClip;
			if (dragging)
			{
				// If dragging, clip if the dragged item is outside of the parent bounds
				shouldClip = itemCanvasBounds.x < parentBounds.x;
				shouldClip |= itemCanvasBounds.x + itemCanvasBounds.width >= parentBounds.x + parentBounds.width;
				shouldClip |= itemCanvasBounds.y < parentBounds.y;
				shouldClip |= itemCanvasBounds.y + itemCanvasBounds.height >= parentBounds.y + parentBounds.height;
			}
			else
			{
				// Otherwise, we only need to clip the overlay if it intersects the parent bounds,
				// since items completely outside of the parent bounds are not drawn
				shouldClip = itemCanvasBounds.y < parentBounds.y && itemCanvasBounds.y + itemCanvasBounds.height >= parentBounds.y;
				shouldClip |= itemCanvasBounds.y < parentBounds.y + parentBounds.height && itemCanvasBounds.y + itemCanvasBounds.height >= parentBounds.y + parentBounds.height;
				shouldClip |= itemCanvasBounds.x < parentBounds.x && itemCanvasBounds.x + itemCanvasBounds.width >= parentBounds.x;
				shouldClip |= itemCanvasBounds.x < parentBounds.x + parentBounds.width && itemCanvasBounds.x + itemCanvasBounds.width >= parentBounds.x + parentBounds.width;
			}
			if (shouldClip)
			{
				if (curClipParent != parent)
				{
					graphics.setClip(parentBounds);
					curClipParent = parent;
				}
			}
			else if (curClipParent != null && curClipParent != parent)
			{
				graphics.setClip(originalClipBounds);
				curClipParent = null;
			}

			renderItemOverlay(graphics, widgetItem.getId(), widgetItem);
		}
		return null;
	}

	protected void showOnInventory()
	{
		showOnInterfaces(
				DEPOSIT_BOX_GROUP_ID,
				BANK_INVENTORY_GROUP_ID,
				SHOP_INVENTORY_GROUP_ID,
				GRAND_EXCHANGE_INVENTORY_GROUP_ID,
				GUIDE_PRICES_INVENTORY_GROUP_ID,
				EQUIPMENT_INVENTORY_GROUP_ID,
				INVENTORY_GROUP_ID,
				3213,
				SEED_VAULT_INVENTORY_GROUP_ID,
				DUEL_INVENTORY_GROUP_ID,
				DUEL_INVENTORY_OTHER_GROUP_ID,
				PLAYER_TRADE_SCREEN_GROUP_ID,
				PLAYER_TRADE_INVENTORY_GROUP_ID,
				POH_TREASURE_CHEST_INVENTORY_GROUP_ID);
	}

	protected void showOnBank()
	{
		drawAfterLayer(WidgetInfo.BANK_ITEM_CONTAINER);
		drawAfterLayer(WidgetInfo.GROUP_STORAGE_ITEM_CONTAINER);
	}

	protected void showOnEquipment()
	{
		showOnInterfaces(EQUIPMENT_GROUP_ID);
	}

	protected void showOnInterfaces(int... ids)
	{
		Arrays.stream(ids).forEach(this::drawAfterInterface);
	}

	// Don't allow setting position, priority, or layer

	@Override
	public void setPosition(OverlayPosition position)
	{
		throw new IllegalStateException();
	}

	@Override
	public void setPriority(float priority)
	{
		throw new IllegalStateException();
	}

	@Override
	public void setPriority(OverlayPriority priority)
	{
		throw new IllegalStateException();
	}

	@Override
	public void setLayer(OverlayLayer layer)
	{
		throw new IllegalStateException();
	}
}
