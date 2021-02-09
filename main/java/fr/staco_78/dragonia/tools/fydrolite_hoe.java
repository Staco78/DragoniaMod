package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class fydrolite_hoe extends ItemHoe {

	public fydrolite_hoe(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName("fydrolite_hoe");
		setRegistryName("fydrolite_hoe");
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

