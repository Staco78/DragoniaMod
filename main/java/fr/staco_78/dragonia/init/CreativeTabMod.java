package fr.staco_78.dragonia.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class CreativeTabMod {
	public static final CreativeTabs CreativeTabMod = (new CreativeTabs("CreativeTabMod") {

		@Override
		public ItemStack getTabIconItem() { 
			return new ItemStack(ItemsMod.dragonite_ingot);
		}
		
	});
	
	public static void init() {
		BlocksMod.dragonite_block.setCreativeTab(CreativeTabMod);
		BlocksMod.dragonite_ore.setCreativeTab(CreativeTabMod);
		ItemsMod.molten_dragonite.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_piece.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_fragment.setCreativeTab(CreativeTabMod);
		ItemsMod.refined_dragonite.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_ingot.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_sword.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_pickaxe.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_axe.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_shovel.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_hoe.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_helmet.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_chestplate.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_leggings.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_boots.setCreativeTab(CreativeTabMod);
		ItemsMod.dragonite_apple.setCreativeTab(CreativeTabMod);
		
		BlocksMod.fydrolite_block.setCreativeTab(CreativeTabMod);
		BlocksMod.fydrolite_ore.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_ingot.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_apple.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_pickaxe.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_sword.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_axe.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_shovel.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_hoe.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_helmet.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_chestplate.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_leggings.setCreativeTab(CreativeTabMod);
		ItemsMod.fydrolite_boots.setCreativeTab(CreativeTabMod);
		
		BlocksMod.hydrolite_block.setCreativeTab(CreativeTabMod);
		BlocksMod.hydrolite_ore.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_ingot.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_apple.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_pickaxe.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_sword.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_axe.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_shovel.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_hoe.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_helmet.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_chestplate.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_leggings.setCreativeTab(CreativeTabMod);
		ItemsMod.hydrolite_boots.setCreativeTab(CreativeTabMod);
		
	}
}
