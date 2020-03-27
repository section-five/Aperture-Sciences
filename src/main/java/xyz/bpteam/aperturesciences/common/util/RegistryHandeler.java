package xyz.bpteam.aperturesciences.common.util;

import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import xyz.bpteam.aperturesciences.init.ModBlocks;
import xyz.bpteam.aperturesciences.init.ModItems;

public class RegistryHandeler {
    public static void init() {
        ModItems.ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        ModBlocks.BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
 }
