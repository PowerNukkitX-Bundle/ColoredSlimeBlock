package cn.daogecmd.coloredslimeblock.block;

import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDye;
import cn.nukkit.item.ItemID;
import cn.nukkit.utils.DyeColor;
import lombok.NonNull;

public class BlockSlimePink extends BlockSlimeColoredBase {
    @Override
    public @NonNull String getNamespaceId() {
        return "coloredslime:pink_slime_block";
    }

    @Override
    protected String getSlimeColorName() {
        return "Pink";
    }

    @Override
    protected ItemDye getDye() {
        return (ItemDye) Item.get(ItemID.DYE, DyeColor.PINK.getItemDyeMeta());
    }
}
