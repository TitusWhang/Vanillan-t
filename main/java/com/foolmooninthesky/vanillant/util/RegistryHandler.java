package com.foolmooninthesky.vanillant.util;

import com.foolmooninthesky.vanillant.Vanillant;
import com.foolmooninthesky.vanillant.items.ItemBase;
import javafx.scene.paint.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler
{
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Vanillant.MOD_ID);

    public static void init()
    {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    //items
    public static final RegistryObject<Item> TEST = ITEMS.register("test", ItemBase::new);

    //tools
    public static final RegistryObject<SwordItem> VANILLANT_DSWORD = ITEMS.register("vanillant_dsword",() -> new SwordItem(ItemTier.DIAMOND, 3, -2.4f, new Item.Properties().group(Vanillant.TAB)));
    public static final RegistryObject<PickaxeItem> VANILLANT_DPICKAXE = ITEMS.register("vanillant_dpickaxe",() -> new PickaxeItem(ItemTier.DIAMOND, 1, -2.8f, new Item.Properties().group(Vanillant.TAB)));
    public static final RegistryObject<AxeItem> VANILLANT_DAXE = ITEMS.register("vanillant_daxe",() -> new AxeItem(ItemTier.DIAMOND, 5, -3, new Item.Properties().group(Vanillant.TAB)));
    public static final RegistryObject<ShovelItem> VANILLANT_DSHOVEL = ITEMS.register("vanillant_dshovel",() -> new ShovelItem(ItemTier.DIAMOND, 0.5f, -3, new Item.Properties().group(Vanillant.TAB)));
    public static final RegistryObject<HoeItem> VANILLANT_DHOE = ITEMS.register("vanillant_dhoe",() -> new HoeItem(ItemTier.DIAMOND, 0, new Item.Properties().group(Vanillant.TAB)));

    //armor
    public static final RegistryObject<ArmorItem> WATER_DBOOTS = ITEMS.register("water_dboots", () -> new ArmorItem(ArmorMaterial.DIAMOND, EquipmentSlotType.FEET, new Item.Properties().group(Vanillant.TAB)));
}
