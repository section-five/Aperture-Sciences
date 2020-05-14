package xyz.bpteam.aperturesciences.init;


import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.common.Mod;
import xyz.bpteam.aperturesciences.common.blocks.BlockBase;
import xyz.bpteam.aperturesciences.common.items.MItemBlock;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModBlocks {

   public static final List<Block> BLOCKS = new ArrayList<>();
   public static final Block LIGHT_PANEL_TOP = registerBlock(new BlockBase(Block.Properties.create(Material.IRON)), "light_panel_top").setGroup(ModItemGroups.AS_BLOCKS);



   public static BlockBase registerBlock(BlockBase base, String name) {
      base.setRegistryName(name);
      BLOCKS.add(base);

      MItemBlock itemBlock = (MItemBlock) new MItemBlock(base).setRegistryName(name);
      base.setmItemBlock(itemBlock);
      ModItems.ITEMS.add(itemBlock);

      return base;
   }
}

