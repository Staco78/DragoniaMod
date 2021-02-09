package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class dragonite_pickaxe extends ItemPickaxe {

    public dragonite_pickaxe(ToolMaterial material) {
		super(material);
		
		this.setUnlocalizedName("dragonite_pickaxe");
		this.setRegistryName("dragonite_pickaxe");
		
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