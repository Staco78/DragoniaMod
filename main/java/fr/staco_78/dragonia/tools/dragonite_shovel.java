package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class dragonite_shovel extends ItemSpade {

	public dragonite_shovel(ToolMaterial material) {
		super(material);
		
		setRegistryName("dragonite_shovel");
		setUnlocalizedName("dragonite_shovel");
		
	}
	public boolean getIsRepairable(ItemStack input, ItemStack repair)
    {
        if(repair.getItem() == ItemsMod.dragonite_ingot)
        {
            return true;
        }
        return false;
    }

}
