package cn.daogecmd.coloredslimeblock;

import cn.daogecmd.coloredslimeblock.block.*;
import cn.nukkit.Server;
import cn.nukkit.block.Block;
import cn.nukkit.plugin.PluginBase;

import java.util.List;

public class Loader extends PluginBase {
    @Override
    public void onLoad() {
        registerBlocks();
    }

    @Override
    public void onEnable() {
        registerRecipes();
    }

    protected void registerBlocks() {
        Block.registerCustomBlock(List.of(
                BlockSlimeBlack.class,
                BlockSlimeBlue.class,
                BlockSlimeBrown.class,
                BlockSlimeCyan.class,
                BlockSlimeGray.class,
                BlockSlimeGreen.class,
                BlockSlimeLightBlue.class,
                BlockSlimeLightGray.class,
                BlockSlimeLime.class,
                BlockSlimeMagenta.class,
                BlockSlimeOrange.class,
                BlockSlimePink.class,
                BlockSlimePurple.class,
                BlockSlimeRed.class,
                BlockSlimeWhite.class,
                BlockSlimeYellow.class
        ));
    }

    protected void registerRecipes() {
        var recipeManager = Server.getInstance().getCraftingManager();
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeBlack()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeBlue()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeBrown()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeCyan()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeGray()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeGreen()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeLightBlue()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeLightGray()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeLime()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeMagenta()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeOrange()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimePink()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimePurple()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeRed()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeWhite()));
        recipeManager.registerRecipe(BlockSlimeColoredBase.buildRecipe(new BlockSlimeYellow()));
        recipeManager.rebuildPacket();
    }
}
