package xyz.bpteam.aperture.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroups {
    public static final ItemGroup AS_BLOCKS = new ItemGroup("as_blocks") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModBlocks.LIGHT_PANEL_TOP);
        }
    };

    public static final ItemGroup AS_PORTALS = new ItemGroup("as_portals") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ModItems.PORTAL_GUN);
        }
    };
}