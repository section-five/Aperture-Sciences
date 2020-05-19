package xyz.bpteam.aperture.init;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import xyz.bpteam.aperture.items.ItemPortalGunBase;

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