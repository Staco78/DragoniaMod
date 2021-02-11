package fr.staco_78.dragonia.apple;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class fydrolite_apple extends ItemAppleGold {

	public fydrolite_apple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		setRegistryName("fydrolite_apple");
		setUnlocalizedName("fydrolite_apple");
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 6000, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 6000, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 600, 0));
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
        }
	}


}
