package com.client.graphics.interfaces.impl;

import com.client.*;
import com.client.definitions.ItemDefinition;
import com.client.graphics.interfaces.Configs;
import com.client.graphics.interfaces.RSInterface;

import java.util.Arrays;

import static com.client.Client.instance;
import static com.client.Configuration.CLIENT_TITLE;
import static com.client.definitions.ItemDefinition.lookup;
import static com.client.graphics.interfaces.RSInterface.AlignPolicy.CENTER;
import static java.lang.Integer.parseInt;

public class Bank extends RSInterface {

    public static final int EMPTY_CHILD = 41582;
    public static final int BANK_INTERFACE_ID = 5292;
    public static final int SEARCH_CONTAINER = 41583;
    public static final int SEARCH_BUTTON = 59000;
    public static final int TITLE_INTERFACE_ID = 58064;
    public static final int BANK_CONTAINER_HEIGHT = 130;

    /**
     * The main container for each tab and the top container in the main tab.
     */
    public static final int OLD_CONTAINER_INTERFACE_ID = 5382;

    /**
     * Displays the x/350 item count at the top of the bank.
     */
    public static final int ITEM_COUNT_INTERFACE_ID = 58061;

    /**
     * Item containers for the items. The first one is not display but used to contain the main tab items.
     */
    public static final int[] ITEM_CONTAINERS = {41573, 41574, 41575, 41576, 41577, 41578, 41579, 41580, 41581};

    /**
     * Item containers that display the first items in each tab.
     */
    public static final int[] BANK_TAB_ITEM_DISPLAYS = {58040, 58041, 58042, 58043, 58044, 58045, 58046, 58047, 58048};

    /**
     * The components that display the tab sprite.
     */
    public static final int[] TAB_INTERFACE_IDS = {58050, 58051, 58052, 58053, 58054, 58055, 58056, 58057, 58058};

    /**
     * Buttons to collapse tabs into the main tab.
     */
    public static final int[] COLLAPSE_BUTTONS = {-1, 58053, 58064, 58075, 58086, 58097, 58108, 58119, 58130};

    /**
     * Buttons to open the tabs.
     */
    public static final int[] OPEN_TAB_BUTTONS = {58042, 58054, 58065, 58076, 58087, 58098, 58109, 58120, 58131};

    /**
     * Components that display the sprite button
     */
    public static final int[] TAB_SPRITE_DISPLAYS = {58031, 58032, 58033, 58034, 58035, 58036, 58037, 58038, 58039, };

    public static final Sprite TAB_WITH_PLUS = new Sprite("BankTab/TAB 4");
    public static final Sprite TAB_WITHOUT_PLUS = new Sprite("BankTab/TAB 3");

    /**
     * The children inside the bank scrollable that are dynamically replaced with the contaienrs to
     * display the items inside other tabs. Does not include the default bank item container;
     * the main container is static so isn't tracked.
     */
    public static int[] mainTabChildren = new int[ITEM_CONTAINERS.length];

    /**
     * Scrollable that contains the item containers.
     */
    public static RSInterface bankScrollable = null;

    /**
     * String used to search the bank.
     */
    public static String searchingBankString = "";

    public static int getCurrentBankTab() {
        return Client.instance.variousSettings[Configs.BANK_TAB_CONFIG];
    }

    public static boolean isBankContainer(RSInterface rsInterface) {
        return rsInterface.id == SEARCH_CONTAINER || Arrays.stream(ITEM_CONTAINERS).anyMatch(id -> rsInterface.id == id);
    }

    private static boolean moreTabsBelow(int index) {
        return index + 1 < ITEM_CONTAINERS.length && interfaceCache.get(ITEM_CONTAINERS[index + 1]).getItemContainerRows() > 0;
    }

    public static boolean isSearchingBank() {
        return Client.inputDialogState == 9;
    }

    public static void openBankSearch() {
        bankScrollable.children[mainTabChildren[0]] = SEARCH_CONTAINER;
        Client.inputDialogState = 9;
        interfaceCache.get(SEARCH_CONTAINER).resetItems();
    }

    public static void closeBankSearch() {
        interfaceCache.get(SEARCH_CONTAINER).resetItems();
        Client.inputDialogState = 0;
        searchingBankString = "";
    }

    public static void handleButton(int buttonId) {
        for (int index = 1; index < COLLAPSE_BUTTONS.length; index++) {
            if (buttonId == COLLAPSE_BUTTONS[index]) {
                RSInterface tab = interfaceCache.get(ITEM_CONTAINERS[index]);
                RSInterface main = interfaceCache.get(ITEM_CONTAINERS[0]);
                if (main.getInventoryContainerFreeSlots() >= tab.inventoryItemId.length - tab.getInventoryContainerFreeSlots()) {
                    addAllItems(tab, main);
                    shiftTabs();
                    openBankTab(0);
                }
            }
        }

        for (int buttonIndex = 0; buttonIndex < OPEN_TAB_BUTTONS.length; buttonIndex++) {
            if (buttonId == OPEN_TAB_BUTTONS[buttonIndex]) {
                openBankTab(buttonIndex);
            }
        }

        if (buttonId == SEARCH_BUTTON) {
            if (bankScrollable.children[mainTabChildren[0]] == SEARCH_CONTAINER) {
                closeBankSearch();
                openBankTab(getCurrentBankTab());
            } else {
                openBankSearch();
            }
        }
    }

    /**
     * Shift items in each tab and shift the tabs left if needed.
     */
    public static void shiftTabs() {
        for (int tabIndex = 1; tabIndex < ITEM_CONTAINERS.length; tabIndex++) {
            RSInterface container = interfaceCache.get(ITEM_CONTAINERS[tabIndex]);
            // Shift items left
            container.shiftItems();

            // Shift tabs left
            if (container.getItemContainerRows() == 0) {
                for (int shiftTabIndex = tabIndex; shiftTabIndex < ITEM_CONTAINERS.length; shiftTabIndex++) {
                    // shift from shiftTabIndex + 1 to shiftTabIndex
                    if (shiftTabIndex + 1 < ITEM_CONTAINERS.length) {
                        container = interfaceCache.get(ITEM_CONTAINERS[shiftTabIndex]);
                        RSInterface shiftLeft = interfaceCache.get(ITEM_CONTAINERS[shiftTabIndex + 1]);
                        container.inventoryItemId = shiftLeft.inventoryItemId.clone();
                        container.inventoryAmounts = shiftLeft.inventoryAmounts.clone();
                    }
                }
            }
        }
    }

    public static void bankUpdates() {
        // Shift tabs and items left
        shiftTabs();

        // Show/hide tabs based on whether they have items in them
        boolean newTabDisplayed = false;
        for (int tabIndex = 1; tabIndex < TAB_INTERFACE_IDS.length; tabIndex++) {
            if (interfaceCache.get(ITEM_CONTAINERS[tabIndex]).getInventoryContainerFreeSlots() != interfaceCache.get(ITEM_CONTAINERS[tabIndex]).inventoryItemId.length) {
                interfaceCache.get(TAB_INTERFACE_IDS[tabIndex]).isMouseoverTriggered = false;
                interfaceCache.get(TAB_SPRITE_DISPLAYS[tabIndex]).sprite1 = TAB_WITHOUT_PLUS;
                interfaceCache.get(TAB_SPRITE_DISPLAYS[tabIndex]).sprite1.spriteName = "3-banktab/tab";
            } else if (!newTabDisplayed) {
                interfaceCache.get(TAB_INTERFACE_IDS[tabIndex]).isMouseoverTriggered = false;
                interfaceCache.get(TAB_SPRITE_DISPLAYS[tabIndex]).sprite1 = TAB_WITH_PLUS;
                newTabDisplayed = true;
            } else {
                interfaceCache.get(TAB_INTERFACE_IDS[tabIndex]).isMouseoverTriggered = true;
            }
        }

        // Update the items displayed at the top of the bank
        for (int index = 1; index < BANK_TAB_ITEM_DISPLAYS.length; index++) {
            interfaceCache.get(BANK_TAB_ITEM_DISPLAYS[index]).inventoryItemId[0] = interfaceCache.get(ITEM_CONTAINERS[index]).inventoryItemId[0];
            interfaceCache.get(BANK_TAB_ITEM_DISPLAYS[index]).inventoryAmounts[0] = interfaceCache.get(ITEM_CONTAINERS[index]).inventoryAmounts[0];
        }
    }

    public static void drawOnBank(RSInterface rsInterface, int x, int y) {
        if (rsInterface.id == BANK_INTERFACE_ID) {
            Rasterizer2D.drawPixels(1, 20, 29, 0xE68A00, 16);
        }
    }

    public static void setupMainTab(RSInterface rsInterface, int x, int y) {
        if (rsInterface.id == SEARCH_CONTAINER) {
            bankUpdates();

            // Hide other bank container
            for (int child : mainTabChildren) {
                bankScrollable.children[child] = EMPTY_CHILD;
            }

            // Set the search container inside the bank
            bankScrollable.children[mainTabChildren[0]] = SEARCH_CONTAINER;

            // Update title
            interfaceCache.get(TITLE_INTERFACE_ID).message = "Results for '" + searchingBankString + "'";

            // Update search container items
            RSInterface searchContainer = interfaceCache.get(SEARCH_CONTAINER);
            searchContainer.resetItems();
            if (searchingBankString.length() > 0) {
                for (int index = 0; index < ITEM_CONTAINERS.length; index++) {
                    RSInterface container = interfaceCache.get(ITEM_CONTAINERS[index]);
                    for (int itemIndex = 0; itemIndex < container.inventoryItemId.length; itemIndex++) {
                        if (container.inventoryItemId[itemIndex] > 0) {
                            ItemDefinition definition = lookup(container.inventoryItemId[itemIndex] - 1);
                            if (definition != null && definition.name != null && definition.name.toLowerCase().contains(searchingBankString.toLowerCase())) {
                                searchContainer.addItem(container.inventoryItemId[itemIndex], container.inventoryAmounts[itemIndex]);
                            }
                        }
                    }
                }
            }
        } else if (rsInterface.id == ITEM_CONTAINERS[getCurrentBankTab()]) {
            bankUpdates();

            // Reset title
            interfaceCache.get(TITLE_INTERFACE_ID).message = "";

            if (getCurrentBankTab() == 0) {
                // Init the main tab view
                for (int index = 0; index < mainTabChildren.length; index++)
                    bankScrollable.children[mainTabChildren[index]] = EMPTY_CHILD;
                int itemContainerIndex = 0;
                for (int index = 0; index < mainTabChildren.length; index++) {
                    RSInterface container = interfaceCache.get(ITEM_CONTAINERS[index]);
                    if (index == 0 || container.getInventoryContainerFreeSlots() != container.inventoryItemId.length) {
                        bankScrollable.children[mainTabChildren[itemContainerIndex++]] = ITEM_CONTAINERS[index];
                    }
                }
            } else if (interfaceCache.get(ITEM_CONTAINERS[getCurrentBankTab()]).getInventoryContainerFreeSlots() ==
                    interfaceCache.get(ITEM_CONTAINERS[getCurrentBankTab()]).inventoryItemId.length) {
                openBankTab(0);
            }

            // Update the item count
            int size = 0;
            for (int container : ITEM_CONTAINERS) {
                size += interfaceCache.get(container).inventoryItemId.length - interfaceCache.get(container).getInventoryContainerFreeSlots();
            }
            interfaceCache.get(ITEM_COUNT_INTERFACE_ID).message = "<ul>" + size + "</ul>";

            // Hide/display the main tab containers
            if (getCurrentBankTab() == 0) {
                int height = 4;
                for (int index = 0; index < ITEM_CONTAINERS.length; index++) {
                    RSInterface container = interfaceCache.get(ITEM_CONTAINERS[index]);
                    if (index != 0 && moreTabsBelow(index - 1)) {
                        instance.bankDivider.drawSprite(x, height + y);
                        height += 10; // buffer for tab separator
                    }
                    bankScrollable.childY[mainTabChildren[index]] = height;
                    height += container.getItemContainerHeight();
                }
                bankScrollable.scrollMax = height > bankScrollable.height + 1 ? height : bankScrollable.height + 1;
            } else {
                int height = rsInterface.getItemContainerHeight();
                bankScrollable.scrollMax = height > bankScrollable.height + 1 ? height : bankScrollable.height + 1;
            }
        }
    }

    public static void openBankTab(int tab) {
        // Don't open if tab is empty.
        if (interfaceCache.get(ITEM_CONTAINERS[tab]).getInventoryContainerFreeSlots() == interfaceCache.get(ITEM_CONTAINERS[tab]).inventoryItemId.length && tab != 0) {
            return;
        }

        closeBankSearch();

        Client.instance.variousSettings[Configs.BANK_TAB_CONFIG] = tab;

        // Reset the lines sprites that show the tab as closed
        for (int tabIndex = 0; tabIndex < ITEM_CONTAINERS.length; tabIndex++) {
            if (tabIndex == 0) {
                Client.instance.variousSettings[34 + tabIndex] = 1;
            } else {
                Client.instance.variousSettings[34 + tabIndex] = 0;
            }
        }

        // Set the sprite to show the current tab as open
        if (tab == 0) {
            Client.instance.variousSettings[34 + tab] = 0;
        } else {
            Client.instance.variousSettings[34 + tab] = 1;
        }

        // Reset scroll position
        bankScrollable.scrollPosition = 0;

        if (tab != 0) {
            // Hide the main tab view
            for (int child : mainTabChildren) {
                bankScrollable.children[child] = EMPTY_CHILD;
            }
        }

        // Set the tab container
        bankScrollable.children[mainTabChildren[0]] = ITEM_CONTAINERS[tab];
    }

    public static void onConfigChanged(int config, int value) {
        if (config == Configs.BANK_TAB_CONFIG) {
            closeBankSearch();
            openBankTab(value);
        }
    }

    private void editBank(TextDrawingArea[] tda) {
        // Store the bank scrollable
        bankScrollable = interfaceCache.get(5385);

        // Fixing container placement on interface
        bankScrollable.height -= 2;
        RSInterface bank = interfaceCache.get(BANK_INTERFACE_ID);
        for (int index = 0; index < bank.children.length; index++) {
            if (bank.children[index] == bankScrollable.id) {
                bank.childY[index] += 2;
            }
        }

        // Remove old container
        if (!deleteChild(OLD_CONTAINER_INTERFACE_ID, bankScrollable)) {
//            System.out.println("Skipping bank reload.");
            return;
        }

        // Empty text to hide other containers while not in main tab
        addText(EMPTY_CHILD, "", tda, 1, 0xE68A00, true, true);

        // Adding new container for main tab
        int newContainersStartIndex = expandChildren(ITEM_CONTAINERS.length, bankScrollable);
        for (int index = 0; index < ITEM_CONTAINERS.length; index++) {
            RSInterface container = addInventoryContainer(ITEM_CONTAINERS[index], 9, BANK_CONTAINER_HEIGHT, 14, 2, true);
            container.actions = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw All but one"};
            container.contentType = 206;
            mainTabChildren[index] = newContainersStartIndex;
            bankScrollable.child(newContainersStartIndex++, ITEM_CONTAINERS[index], 38, 0);
        }

        // Turn on dragging to other item containers
        for (int container : ITEM_CONTAINERS) {
            interfaceCache.get(container).allowInvDraggingToOtherContainers = true;
        }

        RSInterface container = addInventoryContainer(SEARCH_CONTAINER, 9, BANK_CONTAINER_HEIGHT, 14, 2, true);
        container.actions = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw All but one"};


    }

    public void bank(TextDrawingArea[] tda) {
        RSInterface rs = addInterface(5292);
        rs.message = "";
        rs.textChangeListener = ((w, s) -> {
            for (int i = 0; i < 9; i++)
                interfaceCache.get(58031 + i).active = false;
            int tabId = parseInt(s);
            interfaceCache.get(58031 + tabId).active = true;
        });
        rs.alignmentPolicy = CENTER;
        addSprite(58001, 0, "banktab/07/bank");
//        addSprite(59003, 0, "banktab/07/BREAKER");

//        configHoverButton(59000, "Search", "banktab/07/bank", 13, 14, 13, 14, false, 59004);
        addInputField(59000, 25, 0xFF981F, "Search...", 125, 22, false, true, "[A-Za-z0-9 ]");
        addHoveredButton(59004, "banktab/07/bank", 14, 36, 36, 59005);
        addHoverButton(5384, "BankTab/updated/SPRITE", 24, 21, 21, "Close Window", 250, 5380, 3);
        addHoveredButton(5380, "BankTab/updated/SPRITE", 25, 21, 21, 5379);
/*        addHoverButton(5294, "banktab/07/bank", 7, 37, 29, "Set/edit your bank pin", 250, 5295, 4);
        addHoveredButton(5295, "banktab/bank", 4, 100, 33, 5296);*/

        //Item Movement
//        configHoverButton1(58002, "Swap Item Movement Mode", "BankTab/updated/SPRITE", 217, 218, 218, 218, false, new int[] {58002});
        addClickableSprites(58002, "Swap Item Movement Mode", "BankTab/updated/SPRITE",
                217, 218, 218);
        //Noted
//        configHoverButton1(58010, "Enable/Disable Noted Withdrawal", "BankTab/updated/SPRITE", 219, 220, 220, 220, false, new int[] {58010});
        addClickableSprites(58010, "Enable/Disable Noted Withdrawal", "BankTab/updated/SPRITE",
                219, 220, 220);

        addButton(59116, 236, "BankTab/updated/SPRITE", 23, 25, new String[]{"Incinerate Bank"});

        addClickableSprites(58014, "Enable/disable placeholders", "BankTab/updated/SPRITE",
                232, 233, 232);

        configHoverButton(58018, "Deposit carried items", "BankTab/updated/SPRITE",
                221, 222, 221, 222, false, 58018);
        configHoverButton(58026, "Deposit worn items", "BankTab/updated/SPRITE",
                223, 224, 223, 224, false, 58026);

        for (int i = 0; i < 9; i++) {
            addInterface(58050 + i);
            if (i == 0) {
                addConfigButton(58031, 5292, 0, 1, "banktab/tab",
                        48, 38, new String[]{"Price Check", "View"}, 1, 1111);
                interfaceCache.get(58031).disabledHover = imageLoader(1, "banktab/tab");
            } else {
                addConfigButton(58031 + i, 5292, 4, 3, "banktab/tab",
                        48, 38, new String[]{"Price check", "Collapse", "View"}, 1, 1111 + i);
                interfaceCache.get(58031 + i).disabledHover = imageLoader(2, "banktab/tab");
            }
            addToItemGroup(58040 + i, 1, 1, 0, 0, false, "", "", "");
        }
        configHoverButton(58060, "Open Presets", "BankTab/updated/SPRITE",
                234, 235, 234, 235, false, 58060);
        addText(58061, "-", tda, 0, 15108608, true, true);
        addText(58062, "-", tda, 0, 15108608, true, true);
        addInputField(58063, 50, 15108608, "", 100, 23, false, true);
        addText(58064, "Bank Of " + CLIENT_TITLE, tda, 2, 15108608, true, true);

/*        addBankHover(18929, 4, 18930, 0, 1, "BankTab/updated/FLOW",
                50, 22, 305, 1, "Swap Item Movement Mode", 18931, 7, 6,
                "BankTab/BANK", 18932, "Switch to insert items \nmode",
                "Switch to swap items \nmode.", 12, 20); //7*/

/*        addBankHover(18933, 4, 18934, 0, 1, "BankTab/updated/FLOW",
                50, 22, 117, 1, "Enable/Disable Noted Withdrawal", 18935,
                10, 12, "BankTab/BANK", 18936,
                "Switch to note withdrawal \nmode", "Switch to item withdrawal \nmode",
                12, 20); //9*/

//        addText(59018, "Rearrange mode:", tda, 1, 16750623, false, true);
//        addText(59019, "Withdraw as:", tda, 1, 16750623, false, true);
//        addText(59114, "Swap", tda, 1, 16750623, true, true);
//        addText(59115, "Insert", tda, 1, 16750623, true, true);
//        addText(59116, "Item", tda, 1, 16750623, true, true);
//        addText(59117, "Note", tda, 1, 16750623, true, true);
        addText(59117, "Bank value: 0", tda, 0, 0xFF981F, false, true);

        addText(58065, "Quantity:", tda, 1, 16750623, false, true);
        addConfigButton(58066, 5292, 0, 1, "Interfaces/Bank X/SPRITE", 25, 2, "", 0, 0, 222);
        addTextButton(58067, "1", "Default quantity: 1", 16750623, 16777215, true, true, tda, 1, 25, 22, 0, 3);
        addConfigButton(58068, 5292, 0, 1, "Interfaces/Bank X/SPRITE", 25, 2, "", 1, 0, 222);
        addTextButton(58069, "5", "Default quantity: 5", 16750623, 16777215, true, true, tda, 1, 25, 22, 0, 3);
        addConfigButton(58070, 5292, 0, 1, "Interfaces/Bank X/SPRITE", 25, 2, "", 2, 0, 222);
        addTextButton(58071, "10", "Default quantity: 10", 16750623, 16777215, true, true, tda, 1, 25, 22, 0, 3);
        addConfigButton(58072, 5292, 0, 1, "Interfaces/Bank X/SPRITE", 25, 2, "", 3, 0, 222);
        addTextButton(58073, "X", "Default quantity: X", 16750623, 16777215, true, true, tda, 1, 25, 22, 0, 3);
        addConfigButton(58074, 5292, 0, 1, "Interfaces/Bank X/SPRITE", 25, 2, "", 4, 0, 222);
        addTextButton(58075, "All", "Default quantity: All", 16750623, 16777215, true, true, tda, 1, 25, 22, 0, 3);
        RSInterface Interface = interfaceCache.get(5385);
        Interface.width += 21;
        Interface.height -= 15;
        Interface.scrollMax = 1444;
        Interface = interfaceCache.get(5382);
        Interface.contentType = 206;
        Interface.inventoryItemId = new int[800];
        Interface.inventoryAmounts = new int[800];
        Interface.actions = new String[]{"Withdraw 1", "Withdraw 5", "Withdraw 10", "Withdraw All", "Withdraw X", "Withdraw All-but-1"};
        setChildren(48, rs);
        setBounds(58001, 12, 2, 0, rs);
        int close_x = 476;
        int close_y = 12;
        setBounds(5384, close_x, close_y, 1, rs);
        setBounds(5380, close_x, close_y, 2, rs);
//        setBounds(59018, 22, 288, 3, rs);
//        setBounds(59019, 122, 288, 4, rs);
        int spacer_x = 4;
        setBounds(59000, 318, 301, 5, rs);
        setBounds(59004, 382 + spacer_x, 290, 6, rs);
        setBounds(58018, 20, 153, 7, rs);
        setBounds(58026, 20, 187, 8, rs);
        setBounds(58014, 20, 51, 9, rs);
        setBounds(5385, 30, 80, 10, rs);
        int x = 55;
        for (int j = 0; j < 9; j++) {
            setBounds(58050 + j, 0, 0, 11 + j, rs);
            RSInterface rsi = interfaceCache.get(58050 + j);
            setChildren(2, rsi);
            setBounds(58031 + j, x, 37, 0, rsi);
            setBounds(58040 + j, x + 5, 40, 1, rsi);
            x += 41;
        }
        int quantity_y = 305;
/*        setBounds(59014, 22, quantity_y, 20, rs);
        setBounds(59015, 72, quantity_y, 21, rs);
        setBounds(59016, 122, quantity_y, 22, rs);
        setBounds(59017, 172, quantity_y, 23, rs);*/
        setBounds(58060, 20, 224, 24, rs);
//        setBounds(59003, 53, 24, 25, rs);
        setBounds(58061, 472, 299, 26, rs);
        setBounds(58062, 472, 313, 27, rs);
        setBounds(58064, 325, 12, 28, rs);
        setBounds(58065, 75, 290, 29, rs);
//        setBounds(18929, 70, 306, 40, rs); // Swap items
//        setBounds(18930, 70, 306, 41, rs);
//        setBounds(18933, 170, 306, 42, rs); // Noting
//        setBounds(18934, 170, 306, 43, rs);
        int subtract_x = 210;
        setBounds(58066, 242 - subtract_x, quantity_y, 30, rs);
        setBounds(58067, 242 - subtract_x, quantity_y + 3, 31, rs);
        setBounds(58068, 267 - subtract_x + 2, quantity_y, 32, rs);
        setBounds(58069, 267 - subtract_x + 2, quantity_y + 3, 33, rs);
        setBounds(58070, 292 - subtract_x + 4, quantity_y, 34, rs);
        setBounds(58071, 292 - subtract_x + 4, quantity_y + 3, 35, rs);
        setBounds(58072, 317 - subtract_x + 6, quantity_y, 36, rs);
        setBounds(58073, 317 - subtract_x + 6, quantity_y + 3, 37, rs);
        setBounds(58074, 342 - subtract_x + 8, quantity_y, 38, rs);
        setBounds(58075, 342 - subtract_x + 8, quantity_y + 3, 39, rs);
        setBounds(58002, 20, 85, 20, rs); // Rearrange mode
//        setBounds(58003, 20, 306, 21, rs);
        setBounds(58010, 20, 119, 22, rs); // Noting
//        setBounds(58011, 120, 306, 23, rs);
//        setBounds(59114, 45, quantity_y + 3, 44, rs);
//        setBounds(59115, 95, quantity_y + 3, 45, rs);
        setBounds(59116, 20, 260, 46, rs);
        setBounds(59117, 40, 14, 47, rs);
        editBank(tda);
    }

    public static void update(String message) {
        searchingBankString = message;
        try {
            Bank.setupMainTab(RSInterface.get(SEARCH_CONTAINER), RSInterface.get(SEARCH_CONTAINER).width, RSInterface.get(SEARCH_CONTAINER).height);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
