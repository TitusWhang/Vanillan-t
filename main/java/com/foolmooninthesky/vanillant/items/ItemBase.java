package com.foolmooninthesky.vanillant.items;

import com.foolmooninthesky.vanillant.Vanillant;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase()
    {
        super(new Item.Properties().group(Vanillant.TAB));
    }
}
