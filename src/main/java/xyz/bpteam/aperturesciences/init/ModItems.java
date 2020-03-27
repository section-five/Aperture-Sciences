package xyz.bpteam.aperturesciences.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.bpteam.aperturesciences.ApertureSciences;
import xyz.bpteam.aperturesciences.common.items.ItemBase;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ApertureSciences.MODID);

    public static final RegistryObject<Item> TESTITEM = ITEMS.register("testitem", ItemBase::new);

}
