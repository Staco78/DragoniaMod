package fr.staco_78.dragonia;

import java.io.File;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;

import fr.staco_78.dragonia.init.BlocksMod;
import fr.staco_78.dragonia.init.CreativeTabMod;
import fr.staco_78.dragonia.init.ItemsMod;
import fr.staco_78.dragonia.init.RecipesMod;
import fr.staco_78.dragonia.proxy.ServerProxy;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementRewards;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.DisplayInfo;
import net.minecraft.advancements.FrameType;
import net.minecraft.item.ItemStack;
import net.minecraft.util.text.TextComponentString;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = References.MODID, name = References.NAME, version = References.VERSION, acceptedMinecraftVersions = References.MINECRAFT_VERSION)
public class Dragonia {
	@SidedProxy(clientSide = References.CLIENT_PROXY, serverSide = References.SERVER_PROXY, modId = References.MODID)
	public static ServerProxy proxy;
	
	public Advancement advancement;

	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		BlocksMod.init();
		ItemsMod.init();
	
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.register();
		GameRegistry.registerWorldGenerator(new OreGeneration(), 0);
		RecipesMod.init();
		CreativeTabMod.init();
		
		
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
