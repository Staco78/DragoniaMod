package fr.staco_78.dragonia.armor;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;

public class fydrolite_chestplate extends ItemArmor {

	public fydrolite_chestplate(ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
		super(materialIn, renderIndexIn, equipmentSlotIn);
		
		setRegistryName("fydrolite_chestplate");
		setUnlocalizedName("fydrolite_chestplate");
	}

}
