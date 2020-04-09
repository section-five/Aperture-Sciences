package xyz.bpteam.aperturesciences;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.bpteam.aperturesciences.init.ModBlocks;
import xyz.bpteam.aperturesciences.init.ModItems;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("aperturesciences")
public final class ApertureSciences
{
    public static final String MODID = "aperturesciences";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public ApertureSciences() {
        final IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModBlocks.BLOCKS.register(eventBus);
        ModItems.ITEMS.register(eventBus);
        LOGGER.debug("Hello from the other side");

    }

}
