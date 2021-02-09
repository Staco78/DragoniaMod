package fr.staco_78.dragonia.armor;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class dragonite_boots extends ItemArmor {

	public dragonite_boots(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setRegistryName("dragonite_boots");
		setUnlocalizedName("dragonite_boots");
	}

}
