package fr.staco_78.dragonia.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockMod extends Block{

	public BlockMod(String name, Material materialIn) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		
	}
	
	public BlockMod(String name, Material materialIn, Float resistance , Float hardness) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		 setResistance(resistance);
		 setHardness(hardness);
		
	}

	public BlockMod(String name, Material materialIn,Float hardness) {
		super(materialIn);
		setUnlocalizedName(name);
		setRegistryName(name);
		
		setHardness(hardness);
		 
		
	}

}
