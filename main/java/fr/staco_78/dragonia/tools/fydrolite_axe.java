package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;

public class fydrolite_axe extends ItemAxe {

	public fydrolite_axe(ToolMaterial material, float speed) {

		super(material, material.getAttackDamage(), speed);
		
		this.setUnlocalizedName("fydrolite_axe");
		this.setRegistryName("fydrolite_axe");

	}
	

	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsMod.fydrolite_ingot)
        {
            return true;
        }
        return false;
    }

	
}
