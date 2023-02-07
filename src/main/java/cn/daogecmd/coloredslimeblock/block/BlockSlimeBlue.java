package cn.daogecmd.coloredslimeblock.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDye;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;

public class BlockSlimeBlue extends BlockSlimeColoredBase {
    @Override
    public String getNamespaceId() {
        return "coloredslime:blue_slime_block";
    }

    @Override
    protected String getSlimeColorName() {
        return "Blue";
    }

    @Override
    protected ItemDye getDye() {
        return (ItemDye) Item.get(ItemID.DYE, DyeColor.BLUE.getItemDyeMeta());
    }
}
