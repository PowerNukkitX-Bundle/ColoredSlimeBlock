package cn.daogecmd.coloredslimeblock.block;

import cn.nukkit.block.Block;
import cn.nukkit.block.BlockSlime;
import cn.nukkit.block.customblock.CustomBlock;
import cn.nukkit.block.customblock.CustomBlockDefinition;
import cn.nukkit.block.customblock.data.BlockCreativeCategory;
import cn.nukkit.block.customblock.data.Materials;
import cn.nukkit.block.customblock.data.Permutation;
import cn.nukkit.inventory.Recipe;
import cn.nukkit.inventory.ShapelessRecipe;
import cn.nukkit.item.Item;
import cn.nukkit.item.ItemDye;

import java.util.List;

public abstract class BlockSlimeColoredBase extends BlockSlime implements CustomBlock {
    @Override
    public String getName() {
        return CustomBlock.super.getName();
    }

    @Override
    public int getId() {
        return CustomBlock.super.getId();
    }

    @Override
    public CustomBlockDefinition getDefinition() {
        return CustomBlockDefinition
                .builder(
                        this,
                        Materials
                                .builder()
                                .any(Materials.RenderMethod.BLEND, "ColoredSlime_" + getSlimeColorName() + "_Slime_Block"),
                        BlockCreativeCategory.NATURE)
                .creativeGroup("itemGroup.name.block")
                .build();
    }

    @Override
    public double getFrictionFactor() {
        return 0.1;
    }

    protected abstract String getSlimeColorName();

    protected abstract ItemDye getDye();


    public static Recipe buildRecipe(BlockSlimeColoredBase blockSlime) {
        return new ShapelessRecipe(
                blockSlime.toItem(),
                List.of(Block.get(Item.SLIME_BLOCK).toItem(), blockSlime.getDye())
        );
    }
}
