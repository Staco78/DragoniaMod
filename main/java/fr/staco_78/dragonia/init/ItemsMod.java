package fr.staco_78.dragonia.init;

import fr.staco_78.dragonia.References;
import fr.staco_78.dragonia.apple.dragonite_apple;
import fr.staco_78.dragonia.apple.fydrolite_apple;
import fr.staco_78.dragonia.apple.hydrolite_apple;
import fr.staco_78.dragonia.armor.ArmorMod;
import fr.staco_78.dragonia.items.ItemMod;
import fr.staco_78.dragonia.tools.dragonite_axe;
import fr.staco_78.dragonia.tools.dragonite_hoe;
import fr.staco_78.dragonia.tools.dragonite_pickaxe;
import fr.staco_78.dragonia.tools.dragonite_shovel;
import fr.staco_78.dragonia.tools.dragonite_sword;
import fr.staco_78.dragonia.tools.fydrolite_axe;
import fr.staco_78.dragonia.tools.fydrolite_hoe;
import fr.staco_78.dragonia.tools.fydrolite_pickaxe;
import fr.staco_78.dragonia.tools.fydrolite_shovel;
import fr.staco_78.dragonia.tools.fydrolite_sword;
import fr.staco_78.dragonia.tools.hydrolite_axe;
import fr.staco_78.dragonia.tools.hydrolite_hoe;
import fr.staco_78.dragonia.tools.hydrolite_pickaxe;
import fr.staco_78.dragonia.tools.hydrolite_shovel;
import fr.staco_78.dragonia.tools.hydrolite_sword;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = References.MODID)
public class ItemsMod {

	public static Item dragonite_ingot, molten_dragonite, dragonite_piece, dragonite_fragment, refined_dragonite;
	public static Item dragonite_pickaxe, dragonite_sword, dragonite_axe, dragonite_shovel, dragonite_hoe;
	public static ItemArmor dragonite_boots, dragonite_leggings, dragonite_chestplate, dragonite_helmet, fydrolite_boots, fydrolite_leggings, fydrolite_chestplate, fydrolite_helmet;
	public static ItemFood dragonite_apple, fydrolite_apple, hydrolite_apple;
	
	public static Item fydrolite_ingot, fydrolite_pickaxe, fydrolite_sword, fydrolite_axe, fydrolite_shovel, fydrolite_hoe;
	
	
	public static Item hydrolite_ingot, hydrolite_pickaxe, hydrolite_sword, hydrolite_axe, hydrolite_shovel, hydrolite_hoe;
	public static ItemArmor hydrolite_boots, hydrolite_leggings, hydrolite_chestplate, hydrolite_helmet;
	
	public static ToolMaterial toolDragonite = EnumHelper.addToolMaterial("toolDragonite", 2, 3000, 15.0F, 4.0F, 18);
	public static ArmorMaterial dragonite_armor =  EnumHelper.addArmorMaterial("dragoniteArmor", "dragonia:dragonite", 35, new int[] {4,7,9,4}, 12,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F);
	static float speedAxe = -2.8F;
	
	public static ToolMaterial toolFydrolite = EnumHelper.addToolMaterial("toolFydrolite", 2, 2000, 13.0F, 3.0F, 15);
	public static ArmorMaterial fydrolite_armor = EnumHelper.addArmorMaterial("fydrolite_armor", "dragonia:fydrolite", 30, new int[] {3,6,8,3}, 15,  SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.8F);
	
	public static ToolMaterial toolHydrolite = EnumHelper.addToolMaterial("toolHydrolite", 2, 1900, 12.0F, 2.5F, 13);
	public static ArmorMaterial hydrolite_armor = EnumHelper.addArmorMaterial("hydrolite_armor", "dragonia:hydrolite", 28, new int[] {3, 5, 7, 2}, 15, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 2.6F);
	
	public static void init() {
		dragonite_ingot = new ItemMod("dragonite_ingot");
		molten_dragonite = new ItemMod("molten_dragonite");
		dragonite_piece = new ItemMod("dragonite_piece");
		dragonite_fragment = new ItemMod("dragonite_fragment");
		refined_dragonite = new ItemMod("refined_dragonite");
		dragonite_pickaxe = new dragonite_pickaxe(toolDragonite);
		dragonite_sword = new dragonite_sword(toolDragonite);
		dragonite_axe = new dragonite_axe(toolDragonite, speedAxe);
		dragonite_shovel = new dragonite_shovel(toolDragonite);
		dragonite_hoe = new dragonite_hoe(toolDragonite);
		dragonite_boots = new ArmorMod("dragonite_boots", dragonite_armor, 301, EntityEquipmentSlot.FEET);
		dragonite_leggings = new ArmorMod("dragonite_leggings", dragonite_armor, 302, EntityEquipmentSlot.LEGS);
		dragonite_chestplate = new ArmorMod("dragonite_chestplate", dragonite_armor, 303, EntityEquipmentSlot.CHEST);
		dragonite_helmet = new ArmorMod("dragonite_helmet", dragonite_armor, 303, EntityEquipmentSlot.HEAD);
		dragonite_apple = new dragonite_apple(6, 10.0F, false);
		
		fydrolite_ingot = new ItemMod("fydrolite_ingot");
		fydrolite_apple = new fydrolite_apple(6, 6.0F, false);
		fydrolite_pickaxe = new fydrolite_pickaxe(toolFydrolite);
		fydrolite_sword = new fydrolite_sword(toolFydrolite);
		fydrolite_axe = new fydrolite_axe(toolFydrolite, speedAxe);
		fydrolite_shovel = new fydrolite_shovel(toolFydrolite);
		fydrolite_hoe = new fydrolite_hoe(toolFydrolite);
		fydrolite_boots = new ArmorMod("fydrolite_boots", fydrolite_armor, 304, EntityEquipmentSlot.FEET);
		fydrolite_leggings = new ArmorMod("fydrolite_leggings", fydrolite_armor, 305, EntityEquipmentSlot.LEGS);
		fydrolite_chestplate = new ArmorMod("fydrolite_chestplate", fydrolite_armor, 306, EntityEquipmentSlot.CHEST);
		fydrolite_helmet = new ArmorMod("fydrolite_helmet", fydrolite_armor, 307, EntityEquipmentSlot.HEAD);
		
		hydrolite_ingot = new ItemMod("hydrolite_ingot");
		hydrolite_boots = new ArmorMod("hydrolite_boots", hydrolite_armor, 308, EntityEquipmentSlot.FEET);
		hydrolite_leggings = new ArmorMod("hydrolite_leggings", hydrolite_armor, 309, EntityEquipmentSlot.LEGS);
		hydrolite_chestplate = new ArmorMod("hydrolite_chestplate", hydrolite_armor, 310, EntityEquipmentSlot.CHEST);
		hydrolite_helmet = new ArmorMod("hydrolite_helmet", hydrolite_armor, 311, EntityEquipmentSlot.HEAD);
		hydrolite_apple = new hydrolite_apple(6, 6.0F, false);
		hydrolite_pickaxe = new hydrolite_pickaxe(toolHydrolite);
		hydrolite_sword = new hydrolite_sword(toolHydrolite);
		hydrolite_axe = new hydrolite_axe(toolHydrolite, speedAxe);
		hydrolite_shovel = new hydrolite_shovel(toolHydrolite);
		hydrolite_hoe = new hydrolite_hoe(toolHydrolite);
		
	}
	
	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(dragonite_ingot, dragonite_pickaxe, dragonite_sword, dragonite_axe, dragonite_shovel, dragonite_hoe, molten_dragonite, dragonite_piece,
				dragonite_fragment, refined_dragonite, dragonite_boots, dragonite_leggings, dragonite_chestplate, dragonite_helmet, dragonite_apple, fydrolite_ingot, fydrolite_apple,
				fydrolite_pickaxe, fydrolite_sword, fydrolite_axe, fydrolite_shovel, fydrolite_hoe, fydrolite_boots, fydrolite_chestplate, fydrolite_helmet, fydrolite_leggings,
				hydrolite_ingot, hydrolite_boots, hydrolite_chestplate, hydrolite_helmet, hydrolite_leggings, hydrolite_apple, hydrolite_axe, hydrolite_hoe, hydrolite_pickaxe, hydrolite_shovel, hydrolite_sword);
	}
	
	@SubscribeEvent
	public static void registerRenders(ModelRegistryEvent event) {
		registerRender(dragonite_ingot);
		registerRender(dragonite_pickaxe);
		registerRender(dragonite_sword);
		registerRender(dragonite_axe);
		registerRender(dragonite_shovel);
		registerRender(dragonite_hoe);
		registerRender(molten_dragonite);
		registerRender(dragonite_piece);
		registerRender(dragonite_fragment);
		registerRender(refined_dragonite);
		registerRender(dragonite_boots);
		registerRender(dragonite_leggings);
		registerRender(dragonite_chestplate);
		registerRender(dragonite_helmet);
		registerRender(dragonite_apple);
		
		registerRender(fydrolite_ingot);
		registerRender(fydrolite_apple);
		registerRender(fydrolite_pickaxe);
		registerRender(fydrolite_sword);
		registerRender(fydrolite_axe);
		registerRender(fydrolite_shovel);
		registerRender(fydrolite_hoe);
		registerRender(fydrolite_boots);
		registerRender(fydrolite_leggings);
		registerRender(fydrolite_chestplate);
		registerRender(fydrolite_helmet);
		
		registerRender(hydrolite_ingot);
		registerRender(hydrolite_apple);
		registerRender(hydrolite_pickaxe);
		registerRender(hydrolite_sword);
		registerRender(hydrolite_axe);
		registerRender(hydrolite_shovel);
		registerRender(hydrolite_hoe);
		registerRender(hydrolite_boots);
		registerRender(hydrolite_leggings);
		registerRender(hydrolite_chestplate);
		registerRender(hydrolite_helmet);
	}
	
	private static void registerRender(Item item) {
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}
	
	
}
