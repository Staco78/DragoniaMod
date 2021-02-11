package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class hydrolite_axe extends ItemAxe {

	public hydrolite_axe(ToolMaterial material, float speed) {

		super(material, material.getAttackDamage(), speed);
		
		this.setUnlocalizedName("hydrolite_axe");
		this.setRegistryName("hydrolite_axe");

	}
	

	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsMod.hydrolite_ingot)
        {
            return true;
        }
        return false;
    }

	
}
