package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class fydrolite_pickaxe extends ItemPickaxe {

    public fydrolite_pickaxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("fydrolite_pickaxe");
		this.setRegistryName("fydrolite_pickaxe");
		
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