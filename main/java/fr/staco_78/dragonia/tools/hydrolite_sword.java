package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class hydrolite_sword extends ItemSword {


	public hydrolite_sword(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("hydrolite_sword");
		this.setRegistryName("hydrolite_sword");
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
