package motherlode.core.registry;

import motherlode.core.Motherlode;
import motherlode.core.block.*;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.registry.Registry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;

public class MotherlodeBlocks {
    public static final ArrayList<Block> defaultStateList = new ArrayList<>();
    public static final ArrayList<Block> defaultModelList = new ArrayList<>();
    public static final ArrayList<Block> defaultItemModelList = new ArrayList<>();
    public static final ArrayList<Block> defaultLootTableList = new ArrayList<>();
    public static final Map<StairsBlock, Boolean> usesStairModel = new LinkedHashMap<>();
    public static final Map<SlabBlock, Boolean> usesSlabModel = new LinkedHashMap<>();
    public static final ArrayList<Block> usesPillarModel = new ArrayList<>();

    public static final Block COPPER_ORE = register("copper_ore", new DefaultOreBlock(true, 3, 7, 12, 3, 11, 64, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block SILVER_ORE = register("silver_ore", new DefaultOreBlock(true, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block CHARITE_ORE = register("charite_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block ECHERITE_ORE = register("echerite_ore", new DefaultOreBlock(true, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 4)));
    public static final Block TITANIUM_ORE = register("titanium_ore", new DefaultOreBlock(true, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 5)));
    public static final Block ADAMANTITE_ORE = register("adamantite_ore", new DefaultOreBlock(true, FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 6)));
    public static final Block AMETHYST_ORE = register("amethyst_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block HOWLITE_ORE = register("howlite_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block RUBY_ORE = register("ruby_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block SAPPHIRE_ORE = register("sapphire_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block TOPAZ_ORE = register("topaz_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block ONYX_ORE = register("onyx_ore", new DefaultOreBlock(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).breakByTool(FabricToolTags.PICKAXES, 2)));

    public static final Block COPPER_BLOCK = register("copper_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 1)));
    public static final Block SILVER_BLOCK = register("silver_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block CHARITE_BLOCK = register("charite_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 3)));
    public static final Block ECHERITE_BLOCK = register("echerite_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 4)));
    public static final Block TITANIUM_BLOCK = register("titanium_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 5)));
    public static final Block ADAMANTITE_BLOCK = register("adamantite_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 6)));
    public static final Block AMETHYST_BLOCK = register("amethyst_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block HOWLITE_BLOCK = register("howlite_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block RUBY_BLOCK = register("ruby_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block SAPPHIRE_BLOCK = register("sapphire_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block TOPAZ_BLOCK = register("topaz_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));
    public static final Block ONYX_BLOCK = register("onyx_block", new DefaultBlock(FabricBlockSettings.of(Material.METAL).requiresTool().strength(5.0F, 6.0F).breakByTool(FabricToolTags.PICKAXES, 2)));

    public static final StoneBlocks LIMESTONE = StoneBlocks.newStone("limestone",false);
    public static final StoneBlocks GRAVESTONE = StoneBlocks.newStone("gravestone",true);
    public static final StoneBlocks JASPER = StoneBlocks.newStone("jasper",false);
    public static final StoneBlocks MARBLE = StoneBlocks.newStone("marble",false);
    public static final StoneBlocks SLATE = StoneBlocks.newStone("slate",false);

    public static final StoneBlocks BRICK = StoneBlocks.fromBlock("brick", Blocks.BRICKS);
    public static final StoneBlocks MAGMA = StoneBlocks.fromBlock("magma", Blocks.MAGMA_BLOCK);
    public static final StoneBlocks OBSIDIAN = StoneBlocks.fromBlock("obsidian", null);
    public static final StoneBlocks CRYING_OBSIDIAN = StoneBlocks.fromBlock("crying_obsidian", null);
    public static final StoneBlocks GOLD = StoneBlocks.fromBlock("gold", Blocks.GOLD_BLOCK);
    public static final StoneBlocks ICE = StoneBlocks.fromBlock("ice", null);

    public static final StoneBlocks STONE = StoneBlocks.fromStone("stone", Blocks.STONE_BRICKS, Blocks.SMOOTH_STONE);
    public static final StoneBlocks GRANTITE = StoneBlocks.fromStone("granite", null, Blocks.POLISHED_GRANITE);
    public static final StoneBlocks DIORITE = StoneBlocks.fromStone("diorite", null, Blocks.POLISHED_DIORITE);
    public static final StoneBlocks ANDESITE = StoneBlocks.fromStone("andesite", null, Blocks.POLISHED_ANDESITE);
    public static final StoneBlocks BLACK_STONE = StoneBlocks.fromStone("blackstone", null, Blocks.POLISHED_BLACKSTONE);
    public static final StoneBlocks BASALT = StoneBlocks.fromStone("basalt", null, Blocks.POLISHED_BASALT);
    public static final StoneBlocks SANDSTONE = StoneBlocks.fromStone("sandstone", null, Blocks.SMOOTH_SANDSTONE);

    public static final Block REDSTONE_TRANSMITTER = register("redstone_transmitter", new RedstoneTransmitterBlock(true, false, true, true, AbstractBlock.Settings.of(Material.METAL).requiresTool().strength(3.0F, 3.0F)));

    public static final Block POT = register("pot", new PotBlock(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.GLASS).strength(2.0F, 2.0F)), (BlockItem) null);
    public static final Item POT_ITEM = Registry.register(Registry.ITEM, Motherlode.id("pot"), new BlockItem(POT, new Item.Settings().group(Motherlode.ITEMS)));

    public static final Block ROPE_BLOCK = register("rope", new RopeBlock(AbstractBlock.Settings.of(Material.PLANT)), (BlockItem) null);
    public static final Item ROPE_ITEM = Registry.register(Registry.ITEM, Motherlode.id("rope"), new BlockItem(ROPE_BLOCK, new Item.Settings().group(Motherlode.ITEMS)));

    public static void init() {
        // CALLED TO MAINTAIN REGISTRY ORDER
    }

    static <T extends Block> T register(String name, T block, Item.Settings settings) {
        return register(name, block, new BlockItem(block, settings));
    }

    public static <T extends Block> T register(String name, T block) {
        return register(name, block, new Item.Settings().group(Motherlode.BLOCKS));
    }

    static <T extends Block> T register(String name, T block, Function<T, BlockItem> itemFactory) {
        return register(name, block, itemFactory.apply(block));
    }

    static <T extends Block, J extends DefaultBlock> T register(String name, T block, BlockItem item) {
        T b = Registry.register(Registry.BLOCK, Motherlode.id(name), block);
        if (item != null) {
            MotherlodeItems.register(name, item);
        }
        if (block instanceof DefaultBlock){
            DefaultBlock defaultBlock = (DefaultBlock)block;
            if (defaultBlock.hasDefaultState()){
                defaultStateList.add(defaultBlock);
            }
            if (defaultBlock.hasDefaultModel()){
                defaultModelList.add(defaultBlock);
            }
            if (defaultBlock.hasDefaultItemModel()) {
                defaultItemModelList.add(defaultBlock);
            }
            if (defaultBlock.hasDefaultLootTable()) {
                defaultLootTableList.add(defaultBlock);
            }
        }
        return b;
    }
}
