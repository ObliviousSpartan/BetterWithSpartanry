package com.chaosbuffalo.betterwithspartanry.init;

import betterwithmods.common.items.ItemMaterial;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import static betterwithmods.module.gameplay.AnvilRecipes.addSteelShapedRecipe;

/**
 * Created by Jacob on 7/22/2018.
 */
public class SteelCrafting {

    public static void registerRecipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL.toLowerCase()));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT));
        }
    }

    public static void registerBowRecipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT),
                    'S', "string",
                    'W', "logWood"
                    );
        }
    }

    public static void registerCrossbowRecipe(String itemName, String... crafting){
        Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
        if (weapon != null){
            addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
                    new ItemStack(weapon), crafting,
                    'X', "ingotSoulforgedSteel",
                    'H', ItemMaterial.getMaterial(ItemMaterial.EnumMaterial.HAFT),
                    'S', "string",
                    'W', "logWood",
                    'B', Items.BOW
            );
        }
    }
    
    public static void registerBoomerangRecipe(String itemName, String... crafting)
    {
    	Item weapon = ForgeRegistries.ITEMS.getValue(new ResourceLocation(BetterWithSpartanry.MODID,
                itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL));
    	if(weapon != null)
    	{
    		addSteelShapedRecipe(new ResourceLocation(BetterWithSpartanry.MODID, itemName + "_" + ItemRegistryBWSpartanry.SOULFORGE_STEEL),
    				new ItemStack(weapon), crafting,
    				'X', "ingotSoulforgedSteel",
    				'H', "plankWood");
    	}
    }

    public static void init()
    {
        registerRecipe("dagger","X", "H" );
        registerRecipe("longsword", " X ", " X ", " X ", "XHX");
        registerRecipe("katana", "   X", "  X ", " X  ", "H   ");
        registerRecipe("saber", " X", " X", " X", "XH");
        registerRecipe("rapier", "   X", "  X ", "XX  ", "HX  ");
        registerRecipe("greatsword", " X ", "XXX", "XXX", "XHX");
        registerRecipe("hammer", "XXXX", "XXXX", " HH ", " HH ");
        registerRecipe("warhammer", " XX ", " XXX", "  H ", "  H ");
        registerRecipe("spear", "X", "X", "H", "H");
        registerRecipe("halberd", " X ", "XXX", "XH ", " H ");
        registerRecipe("pike", "X", "H", "H", "H");
        registerRecipe("lance","   X", "  H ", "XH  ", "HX  ");
        registerBowRecipe("longbow", "HWXX", "W  S", "X  S", "XSS ");
        registerCrossbowRecipe("crossbow", "BSXX", "SWS ", "XSW ", "X  H");
        registerRecipe("throwing_knife", "HX");
        registerRecipe("throwing_axe", "HX  ", " X  ");
        registerRecipe("javelin", "HHXX");
        registerRecipe("battleaxe", " XXX", " XHX", "  H ", "  H ");
        registerBoomerangRecipe("boomerang", "XXHH","X   ", "H   ", "H   ");
        registerRecipe("mace", "  XX", "  XX", " H  ", "H   ");
        registerRecipe("glaive", " X", " X", "XH", " H");
        registerRecipe("staff", "X", "H", "H", "X");
    }

}
