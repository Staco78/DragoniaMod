package fr.staco_78.dragonia.blocks;

import java.util.Random;

import net.minecraft.block.BlockOre;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BlockOreMod extends BlockOre{
	
	private static boolean multipleQuantity = false;
	private static int minDrop;
	private static int maxDrop;
	
	public BlockOreMod(String name, int harvestLevel) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
	}
	
	public BlockOreMod(String name, int harvestLevel, int minDrop, int maxDrop) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		this.multipleQuantity = true;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
	}

	

	
	
	public BlockOreMod(String name, int harvestLevel, Float hardness) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		setHardness(hardness);
	}
	
	public BlockOreMod(String name, int harvestLevel, int minDrop, int maxDrop, Float hardness) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		this.multipleQuantity = true;
		this.minDrop = minDrop;
		this.maxDrop = maxDrop;
		setHardness(hardness);
	}
	public BlockOreMod(String name, int harvestLevel,  Float hardness, Float resistance) {
		setUnlocalizedName(name);
		setRegistryName(name);
		setHarvestLevel("pickaxe", harvestLevel);
		setHardness(hardness);
		setResistance(resistance);
	}
	

	

	
	public Item getItemDropped(IBlockState state, Random rand, int fortune) {
		return Item.getItemFromBlock(this);
	}
	
	public int quantityDropped(Random rand) {
		return this.multipleQuantity ? this.minDrop + rand.nextInt(this.maxDrop - this.minDrop) : 1;
	}
	
	@Override
	public int getExpDrop(IBlockState state, IBlockAccess world, BlockPos pos, int fortune) {
		return this.multipleQuantity ? 2 : 0;
	}
}
