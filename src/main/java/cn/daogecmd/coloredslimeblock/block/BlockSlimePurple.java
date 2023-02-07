package cn.daogecmd.coloredslimeblock.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDye;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;

public class BlockSlimePurple extends BlockSlimeColoredBase {
    @Override
    public String getNamespaceId() {
        return "coloredslime:purple_slime_block";
    }

    @Override
    protected String getSlimeColorName() {
        return "Purple";
    }

    @Override
    protected ItemDye getDye() {
        return (ItemDye) Item.get(ItemID.DYE, DyeColor.PURPLE.getItemDyeMeta());
    }
}
