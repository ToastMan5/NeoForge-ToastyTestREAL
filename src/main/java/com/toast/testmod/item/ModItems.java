package com.toast.testmod.item;

import com.toast.testmod.TestMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {

    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(TestMod.MODID);

    public static final DeferredItem<Item> DIRTY = ITEMS.register("DIRTY", //register one item called "DIRTY"
            () -> new Item(new Item.Properties())); //supply this with its item properties


    public static void register(IEventBus eventBus) { //register method for items
        ITEMS.register(eventBus);

    }
    //public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(TestMod.MODID);
}
