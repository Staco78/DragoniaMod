package fr.staco_78.dragonia.tools;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;

public class dragonite_axe extends ItemAxe {

	public dragonite_axe(ToolMaterial material, float speed) {

		super(material, material.getAttackDamage(), speed);
		
		this.setUnlocalizedName("dragonite_axe");
		this.setRegistryName("dragonite_axe");

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

