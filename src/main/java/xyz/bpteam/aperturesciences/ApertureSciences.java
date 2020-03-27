package xyz.bpteam.aperturesciences;

import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import xyz.bpteam.aperturesciences.common.util.RegistryHandeler;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("aperturesciences")
public final class ApertureSciences
{
    public static final String MODID = "aperturesciences";

    public static final Logger LOGGER = LogManager.getLogger(MODID);

    public ApertureSciences() {
        LOGGER.debug("Hello from the other side");

        RegistryHandeler.init();
    }

}
