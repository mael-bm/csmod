
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mbm.csmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import mbm.csmod.CsmodMod;

public class CsmodModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, CsmodMod.MODID);
	public static final RegistryObject<Item> MISTIK_WOOD = block(CsmodModBlocks.MISTIK_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISTIK_LOG = block(CsmodModBlocks.MISTIK_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISTIK_PLANKS = block(CsmodModBlocks.MISTIK_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISTIK_LEAVES = block(CsmodModBlocks.MISTIK_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MISTIK_STAIRS = block(CsmodModBlocks.MISTIK_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISTIK_SLAB = block(CsmodModBlocks.MISTIK_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> MISTIK_FENCE = block(CsmodModBlocks.MISTIK_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Item> MISTIK_FENCE_GATE = block(CsmodModBlocks.MISTIK_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MISTIK_PRESSURE_PLATE = block(CsmodModBlocks.MISTIK_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final RegistryObject<Item> MISTIK_BUTTON = block(CsmodModBlocks.MISTIK_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
