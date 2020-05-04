package xyz.bpteam.aperturesciences.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import xyz.bpteam.aperturesciences.init.ModItemGroup;

public class ItemPortalGun extends ItemPortalGunBase {
    public ItemPortalGun() {
        super(new Properties().group(ModItemGroup.AS_PORTALS));
    }
}
