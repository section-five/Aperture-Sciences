package xyz.bpteam.aperture.blocks;

import net.minecraft.block.Block;
import net.minecraft.item.ItemGroup;
import xyz.bpteam.aperture.items.ItemBlock;

public class BlockBase extends Block {

    private xyz.bpteam.aperture.items.ItemBlock ItemBlock;

    public BlockBase(Properties properties) {
        super(properties);
    }

    public Block setGroup(ItemGroup... groups) {
        if(ItemBlock != null) ItemBlock.setGroup(groups);
        return this;
    }

    public void setmItemBlock(ItemBlock mItemBlock) {
        this.ItemBlock = mItemBlock;
    }
}