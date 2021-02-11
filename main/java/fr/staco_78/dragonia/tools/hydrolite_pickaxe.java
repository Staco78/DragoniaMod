package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class hydrolite_pickaxe extends ItemPickaxe {

    public hydrolite_pickaxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("hydrolite_pickaxe");
		this.setRegistryName("hydrolite_pickaxe");
		
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