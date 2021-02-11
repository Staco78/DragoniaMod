package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class hydrolite_hoe extends ItemHoe {

	public hydrolite_hoe(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName("hydrolite_hoe");
		setRegistryName("hydrolite_hoe");
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

