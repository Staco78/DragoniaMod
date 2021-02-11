package fr.staco_78.dragonia.apple;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class hydrolite_apple extends ItemAppleGold {

	public hydrolite_apple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		setRegistryName("hydrolite_apple");
		setUnlocalizedName("hydrolite_apple");
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 6000, 2));
		
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
        }
	}

}
