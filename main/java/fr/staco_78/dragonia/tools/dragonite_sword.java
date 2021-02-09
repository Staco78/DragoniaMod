package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class dragonite_sword extends ItemSword {

	public dragonite_sword(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("dragonite_sword");
		this.setRegistryName("dragonite_sword");
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
