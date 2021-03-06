package fr.staco_78.dragonia.apple;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemAppleGold;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;

public class dragonite_apple extends ItemAppleGold {

	public dragonite_apple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);

		setRegistryName("dragonite_apple");
		setUnlocalizedName("dragonite_apple");
		setAlwaysEdible();
	}

	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH, 3600, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, 3600, 1));
		player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE, 3600, 0));
		player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING, 3600, 2));
		player.addPotionEffect(new PotionEffect(MobEffects.REGENERATION, 2400, 1));
	}
	
	@Override
	public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
		if (this.isInCreativeTab(tab))
        {
            items.add(new ItemStack(this));
        }
	}

}
