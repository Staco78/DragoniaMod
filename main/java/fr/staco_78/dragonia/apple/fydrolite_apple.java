package fr.staco_78.dragonia.apple;

import java.util.Timer;
import java.util.TimerTask;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class fydrolite_apple extends ItemFood {

	public static boolean delay = false;
	
	public fydrolite_apple(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		
		setRegistryName("fydrolite_apple");
		setUnlocalizedName("fydrolite_apple");
		setAlwaysEdible();
		
		setPotionEffect(new PotionEffect(Potion.getPotionById(8), 300, 4), 100.0F);
	}
}
