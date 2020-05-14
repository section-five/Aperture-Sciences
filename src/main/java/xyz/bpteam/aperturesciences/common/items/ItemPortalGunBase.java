package xyz.bpteam.aperturesciences.common.items;

import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;

public class ItemPortalGunBase extends ItemBase {

    public BlockPos portal_orange_loc;
    public BlockPos portal_blue_loc;

    public BlockPos getPortal_orange_loc() {
        return portal_orange_loc;
    }

    public BlockPos getPortal_blue_loc() {
        return portal_blue_loc;
    }
}
