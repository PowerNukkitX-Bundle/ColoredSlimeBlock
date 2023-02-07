package cn.daogecmd.coloredslimeblock.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDye;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;

public class BlockSlimeLightGray extends BlockSlimeColoredBase {
    @Override
    public String getNamespaceId() {
        return "coloredslime:light_gray_slime_block";
    }

    @Override
    protected String getSlimeColorName() {
        return "Light_Gray";
    }

    @Override
    protected ItemDye getDye() {
        return (ItemDye) Item.get(ItemID.DYE, DyeColor.LIGHT_GRAY.getItemDyeMeta());
    }
}
