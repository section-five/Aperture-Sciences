package xyz.bpteam.aperturesciences.init;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.IForgeRegistry;
import xyz.bpteam.aperturesciences.ApertureSciences;

public class ModBlocks {
   public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(ForgeRegistries.BLOCKS, ApertureSciences.MODID);

   public static final RegistryObject<Block> PANEL_LIGHT_TOP = BLOCKS.register("panel_light_top", () -> new Block(Block.Properties.create(Material.IRON)));
   public static final RegistryObject<Block> PANEL_LIGHT_BOTTOM = BLOCKS.register("panel_light_bottom", () -> new Block(Block.Properties.create(Material.IRON)));

   @SubscribeEvent
   public static void registerItemBlocks(final RegistryEvent.Register<Item> event) {
      final IForgeRegistry<Item> registry = event.getRegistry();
      BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
         registry.register(new BlockItem(block, new Item.Properties().group(ModItemGroup.AS_BLOCKS)).setRegistryName(block.getRegistryName()));
      });
   }

}

