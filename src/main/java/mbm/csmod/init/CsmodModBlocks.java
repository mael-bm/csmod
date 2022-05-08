
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package mbm.csmod.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import mbm.csmod.block.MistikWoodBlock;
import mbm.csmod.block.MistikStairsBlock;
import mbm.csmod.block.MistikSlabBlock;
import mbm.csmod.block.MistikPressurePlateBlock;
import mbm.csmod.block.MistikPlanksBlock;
import mbm.csmod.block.MistikLogBlock;
import mbm.csmod.block.MistikLeavesBlock;
import mbm.csmod.block.MistikFenceGateBlock;
import mbm.csmod.block.MistikFenceBlock;
import mbm.csmod.block.MistikButtonBlock;
import mbm.csmod.CsmodMod;

public class CsmodModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, CsmodMod.MODID);
	public static final RegistryObject<Block> MISTIK_WOOD = REGISTRY.register("mistik_wood", () -> new MistikWoodBlock());
	public static final RegistryObject<Block> MISTIK_LOG = REGISTRY.register("mistik_log", () -> new MistikLogBlock());
	public static final RegistryObject<Block> MISTIK_PLANKS = REGISTRY.register("mistik_planks", () -> new MistikPlanksBlock());
	public static final RegistryObject<Block> MISTIK_LEAVES = REGISTRY.register("mistik_leaves", () -> new MistikLeavesBlock());
	public static final RegistryObject<Block> MISTIK_STAIRS = REGISTRY.register("mistik_stairs", () -> new MistikStairsBlock());
	public static final RegistryObject<Block> MISTIK_SLAB = REGISTRY.register("mistik_slab", () -> new MistikSlabBlock());
	public static final RegistryObject<Block> MISTIK_FENCE = REGISTRY.register("mistik_fence", () -> new MistikFenceBlock());
	public static final RegistryObject<Block> MISTIK_FENCE_GATE = REGISTRY.register("mistik_fence_gate", () -> new MistikFenceGateBlock());
	public static final RegistryObject<Block> MISTIK_PRESSURE_PLATE = REGISTRY.register("mistik_pressure_plate",
			() -> new MistikPressurePlateBlock());
	public static final RegistryObject<Block> MISTIK_BUTTON = REGISTRY.register("mistik_button", () -> new MistikButtonBlock());
}
