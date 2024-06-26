package net.max.maxmod.item;

import net.max.maxmod.TestMaxMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, TestMaxMod.MOD_ID);
//    Create item!
    public static final RegistryObject<Item> CHLORITE = ITEMS.register("chlorite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_CHLORITE = ITEMS.register("raw_chlorite",
            ()-> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
