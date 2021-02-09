package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class dragonite_hoe extends ItemHoe {

	public dragonite_hoe(ToolMaterial material) {
		super(material);
		
		setUnlocalizedName("dragonite_hoe");
		setRegistryName("dragonite_hoe");
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
