package xyz.bpteam.aperturesciences.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.bpteam.aperturesciences.ApertureSciences;
import xyz.bpteam.aperturesciences.common.blocks.PanelBlock;
import xyz.bpteam.aperturesciences.common.blocks.PortalbleBlock;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ApertureSciences.MODID);

    public static Block PANEL_LIGHT_1 = PanelBlock.Properties.create(Material.IRON).hardnessAndResistance(3.5f).harvestTool(ToolType.PICKAXE)("panel_light_1")

    public static void registerBlockItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(
                new BlockItem(PANEL_LIGHT_1, new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)).setRegistryName((PANEL_LIGHT_1).getRegistryName())
        );
    }
}
