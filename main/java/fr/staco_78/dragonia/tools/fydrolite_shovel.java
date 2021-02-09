package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;

public class fydrolite_shovel extends ItemSpade {

	public fydrolite_shovel(ToolMaterial material) {
		super(material);
		
		setRegistryName("fydrolite_shovel");
		setUnlocalizedName("fydrolite_shovel");
		
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
