package xyz.bpteam.aperturesciences.init;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.bpteam.aperturesciences.ApertureSciences;
import xyz.bpteam.aperturesciences.common.blocks.PortalbleBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ApertureSciences.MODID);

    public static final RegistryObject<Block> PANEL_LIGHT_1 = BLOCKS.register("panel_light_1", new PortalbleBlock::new);
}
