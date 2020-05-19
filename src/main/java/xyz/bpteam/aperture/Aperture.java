package xyz.bpteam.aperture;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.bpteam.aperture.init.ModBlocks;
import xyz.bpteam.aperture.init.ModItems;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("aperture")
public class Aperture
{
    public static final String MODID = "aperture";
    private static final Logger LOGGER = LogManager.getLogger();


    public Aperture() {

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        @SubscribeEvent
        public static void registerItems(final RegistryEvent.Register<Item> event) {
            LOGGER.info("Registering Items");

            for (Item item : ModItems.ITEMS) {
                event.getRegistry().register(item);
            }
        }

        @SubscribeEvent
        public static void registerBlocks(final RegistryEvent.Register<Block> event) {
            LOGGER.info("Registering Blocks");

            for (Block block : ModBlocks.BLOCKS) {
                event.getRegistry().register(block);
            }
        }
    }
}
