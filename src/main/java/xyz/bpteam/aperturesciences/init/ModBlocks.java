package xyz.bpteam.aperturesciences.init;


import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
   public static final List<Item> ITEMS = new ArrayList<>();

   //resources
   //public static final Item DURANIUM_INGOT = registerItem(new ItemBase(), "duranium_ingot").setGroup(ModItemGroups.MITREK_ITEMS);

   public static <T extends Item> T registerItem(T item, String name) {
      item.setRegistryName(name);
      ITEMS.add(item);

      return item;
   }
}

