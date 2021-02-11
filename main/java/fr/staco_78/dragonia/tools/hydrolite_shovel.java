package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class hydrolite_shovel extends ItemSpade {

	public hydrolite_shovel(ToolMaterial material) {
		super(material);
		
		setRegistryName("hydrolite_shovel");
		setUnlocalizedName("hydrolite_shovel");
		
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
