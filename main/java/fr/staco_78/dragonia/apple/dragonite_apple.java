package fr.staco_78.dragonia.apple;

import java.util.Timer;
import java.util.TimerTask;

import fr.staco_78.dragonia.init.ItemsMod;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class dragonite_apple extends ItemFood {
	
	public static boolean delay = false;
	
	public static PotionEffect[] effets = {
			new PotionEffect(MobEffects.STRENGTH, 3600, 1),
			new PotionEffect(MobEffects.RESISTANCE, 3600, 1),
			new PotionEffect(MobEffects.FIRE_RESISTANCE, 3600, 0),
			new PotionEffect(MobEffects.WATER_BREATHING, 3600, 2),
			new PotionEffect(MobEffects.REGENERATION, 2400, 1)
	};

	public dragonite_apple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setAlwaysEdible();
		
		setRegistryName("dragonite_apple");
		setUnlocalizedName("dragonite_apple");
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		for (int i = 0; i < effets.length; i++) {
			player.addPotionEffect(effets[i]);
			System.out.println(effets[i].getEffectName() + " : " + effets[i].getDuration());
		}
		
		super.onFoodEaten(stack, worldIn, player);
	}
	
}
