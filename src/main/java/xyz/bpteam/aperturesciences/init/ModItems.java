package xyz.bpteam.aperturesciences.init;

import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import xyz.bpteam.aperturesciences.ApertureSciences;
import xyz.bpteam.aperturesciences.common.items.ItemPortalGun;
import xyz.bpteam.aperturesciences.common.items.ItemPortalGunBase;

import java.util.ArrayList;
import java.util.List;


@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems {
    public static final List<Item> ITEMS = new ArrayList<>();

    //resources
    public static final Item PORTAL_GUN = registerItem(new ItemPortalGunBase(), "portal_gun").setGroup(ModItemGroups.AS_PORTALS);

    public static <T extends Item> T registerItem(T item, String name) {
        item.setRegistryName(name);
        ITEMS.add(item);

        return item;
    }
}
