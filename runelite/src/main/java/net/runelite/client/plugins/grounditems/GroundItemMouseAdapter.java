/*
 * Copyright (c) 2018, Seth <https://github.com/sethtroll>
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
package net.runelite.client.plugins.grounditems;

import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.inject.Inject;
import javax.swing.SwingUtilities;
import net.runelite.client.input.MouseAdapter;

class GroundItemMouseAdapter extends MouseAdapter
{
    @Inject
    private GroundItemsPlugin plugin;

    @Override
    public MouseEvent mousePressed(MouseEvent e)
    {
        final Point mousePos = e.getPoint();

        if (plugin.isHotKeyPressed())
        {
            if (SwingUtilities.isLeftMouseButton(e))
            {
                // Process both click boxes for hidden and highlighted items
                if (plugin.getHiddenBoxBounds() != null && plugin.getHiddenBoxBounds().getKey().contains(mousePos))
                {
                    plugin.updateList(plugin.getHiddenBoxBounds().getValue().getName(), true);
                    e.consume();
                    return e;
                }

                if (plugin.getHighlightBoxBounds() != null && plugin.getHighlightBoxBounds().getKey().contains(mousePos))
                {
                    plugin.updateList(plugin.getHighlightBoxBounds().getValue().getName(), false);
                    e.consume();
                    return e;
                }

                // There is one name click box for left click and one for right click
                if (plugin.getTextBoxBounds() != null && plugin.getTextBoxBounds().getKey().contains(mousePos))
                {
                    plugin.updateList(plugin.getTextBoxBounds().getValue().getName(), false);
                    e.consume();
                    return e;
                }
            }
            else if (SwingUtilities.isRightMouseButton(e))
            {
                if (plugin.getTextBoxBounds() != null && plugin.getTextBoxBounds().getKey().contains(mousePos))
                {
                    plugin.updateList(plugin.getTextBoxBounds().getValue().getName(), true);
                    e.consume();
                    return e;
                }
            }
        }

        return e;
    }
}