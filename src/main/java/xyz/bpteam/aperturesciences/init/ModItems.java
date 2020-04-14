package xyz.bpteam.aperturesciences.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.bpteam.aperturesciences.ApertureSciences;
import xyz.bpteam.aperturesciences.common.items.ItemBase;
import xyz.bpteam.aperturesciences.common.items.ItemPortalGun;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, ApertureSciences.MODID);

    public static final RegistryObject<Item> PORTAL_GUN = ITEMS.register("portal_gun", ItemPortalGun::new);
    //public static final RegistryObject<BlockItem> PANEL_LIGHT_1 = ITEMS.register();

}
