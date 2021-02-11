package fr.staco_78.dragonia.init;

import fr.staco_78.dragonia.blocks.BlockMod;
import fr.staco_78.dragonia.init.BlocksMod;
import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class RecipesMod {
	public static void init() {
		GameRegistry.addSmelting(BlocksMod.dragonite_ore, new ItemStack(ItemsMod.molten_dragonite), 5.0F);
		GameRegistry.addSmelting(BlocksMod.fydrolite_ore, new ItemStack(ItemsMod.fydrolite_ingot), 5.0F);
		GameRegistry.addSmelting(BlocksMod.hydrolite_ore, new ItemStack(ItemsMod.hydrolite_ingot), 5.0F);		
	}
}
