package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.item.Item.ToolMaterial;

public class fydrolite_sword extends ItemSword {


	public fydrolite_sword(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("fydrolite_sword");
		this.setRegistryName("fydrolite_sword");
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
