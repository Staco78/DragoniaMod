package fr.staco_78.dragonia.init;

import fr.staco_78.dragonia.References;
import fr.staco_78.dragonia.blocks.BlockMod;
import fr.staco_78.dragonia.blocks.BlockOreMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class BlocksMod {
	
	public static Block dragonite_block, dragonite_ore, fydrolite_ore, fydrolite_block;
	
	public static void init() {
		dragonite_block = new BlockMod("dragonite_block", Material.ROCK, 10.0F, 3.0F);
		dragonite_ore = new BlockOreMod("dragonite_ore", 2,  3.0F, 10.0F);
		
		fydrolite_block = new BlockMod("fydrolite_block", Material.ROCK, 10.0F, 3.0F);
		fydrolite_ore = new BlockOreMod("fydrolite_ore", 2, 3.0F, 10.0F);
	}
	
	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(dragonite_block, dragonite_ore, fydrolite_ore, fydrolite_block);
	}
	
	@SubscribeEvent
	public static void registerItemBlocks(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new ItemBlock(dragonite_block).setRegistryName(dragonite_block.getRegistryName()),
				new ItemBlock(dragonite_ore).setRegistryName(dragonite_ore.getRegistryName()),
				new ItemBlock(fydrolite_ore).setRegistryName(fydrolite_ore.getRegistryName()),
				new ItemBlock(fydrolite_block).setRegistryName(fydrolite_block.getRegistryName())
				);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(Item.getItemFromBlock(dragonite_block));
		registerRender(Item.getItemFromBlock(dragonite_ore));
		registerRender(Item.getItemFromBlock(fydrolite_ore));
		registerRender(Item.getItemFromBlock(fydrolite_block));
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
