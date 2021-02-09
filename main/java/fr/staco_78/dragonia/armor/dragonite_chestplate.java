package fr.staco_78.dragonia.armor;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class dragonite_chestplate extends ItemArmor {

	public dragonite_chestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setRegistryName("dragonite_chestplate");
		setUnlocalizedName("dragonite_chestplate");
	}

}
