package com.chaosbuffalo.betterwithspartanry.init;

import java.util.HashSet;
import java.util.Set;

import com.chaosbuffalo.betterwithspartanry.BWMMatConverter;
import com.chaosbuffalo.betterwithspartanry.BetterWithSpartanry;
import com.chaosbuffalo.betterwithspartanry.utils;
import com.oblivioussp.spartanweaponry.api.SpartanWeaponryAPI;
import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;
import com.oblivioussp.spartanweaponry.client.gui.CreativeTabsSW;

import betterwithmods.common.BWMItems;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber
public class ItemRegistryBWSpartanry 
{
    //public static final Set<BWMMatConverter> MATERIALS_TO_REGISTER = new HashSet<>();

    public static final String SOULFORGE_STEEL = "soulforgedSteel";
    public static final ToolMaterialEx materialSoulforgedSteel =  utils.spartanMatFromToolMat(SOULFORGE_STEEL, BWMItems.SOULFORGED_STEEL, 0x404040, 0xA0A0A0);
    //static 
    //{
    //    MATERIALS_TO_REGISTER.add(new BWMMatConverter(SOULFORGE_STEEL,
    //            utils.spartanMatFromToolMat(SOULFORGE_STEEL, BWMItems.SOULFORGED_STEEL,
    //                    /*0x272727*/ 0x404040, /*0x727272*/ 0xA0A0A0)));
    //}

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> ev) 
    {
        Set<Item> itemSet = new HashSet<>();
        //for (BWMMatConverter mat : MATERIALS_TO_REGISTER){
        
            Item dagger = SpartanWeaponryAPI.createDagger(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(dagger, new ResourceLocation(BetterWithSpartanry.MODID, "dagger_custom"));
            itemSet.add(dagger);
            
            Item longsword = SpartanWeaponryAPI.createLongsword(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(longsword, new ResourceLocation(BetterWithSpartanry.MODID, "longsword_custom"));
            itemSet.add(longsword);
            
            Item katana = SpartanWeaponryAPI.createKatana(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(katana, new ResourceLocation(BetterWithSpartanry.MODID, "katana_custom"));
            itemSet.add(katana);
            
            Item saber = SpartanWeaponryAPI.createSaber(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(saber, new ResourceLocation(BetterWithSpartanry.MODID, "saber_custom"));
            itemSet.add(saber);
            
            Item rapier = SpartanWeaponryAPI.createRapier(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(rapier, new ResourceLocation(BetterWithSpartanry.MODID, "rapier_custom"));
            itemSet.add(rapier);
            
            Item greatsword = SpartanWeaponryAPI.createGreatsword(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(greatsword, new ResourceLocation(BetterWithSpartanry.MODID, "greatsword_custom"));
            itemSet.add(greatsword);
            
            Item hammer = SpartanWeaponryAPI.createHammer(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(hammer, new ResourceLocation(BetterWithSpartanry.MODID, "hammer_custom"));
            itemSet.add(hammer);
            
            Item warhammer = SpartanWeaponryAPI.createWarhammer(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(warhammer, new ResourceLocation(BetterWithSpartanry.MODID, "warhammer_custom"));
            itemSet.add(warhammer);
            
            Item spear = SpartanWeaponryAPI.createSpear(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(spear, new ResourceLocation(BetterWithSpartanry.MODID, "spear_custom"));
            itemSet.add(spear);
            
            Item halberd = SpartanWeaponryAPI.createHalberd(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(halberd, new ResourceLocation(BetterWithSpartanry.MODID, "halberd_custom"));
            itemSet.add(halberd);
            
            Item pike = SpartanWeaponryAPI.createPike(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(pike, new ResourceLocation(BetterWithSpartanry.MODID, "pike_custom"));
            itemSet.add(pike);
            
            Item lance = SpartanWeaponryAPI.createLance(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(lance, new ResourceLocation(BetterWithSpartanry.MODID, "lance_custom"));
            itemSet.add(lance);
            
            Item longbow = SpartanWeaponryAPI.createLongbow(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD, null);
            SpartanWeaponryAPI.addItemModelToRegistry(longbow, new ResourceLocation(BetterWithSpartanry.MODID, "longbow_custom"));
            itemSet.add(longbow);
            
            Item crossbow = SpartanWeaponryAPI.createCrossbow(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD, null);
            SpartanWeaponryAPI.addItemModelToRegistry(crossbow, new ResourceLocation(BetterWithSpartanry.MODID, "crossbow_custom"));
            itemSet.add(crossbow);
            
            Item throwingKnife = SpartanWeaponryAPI.createThrowingKnife(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(throwingKnife, new ResourceLocation(BetterWithSpartanry.MODID, "throwing_knife_custom"));
            itemSet.add(throwingKnife);
            
            Item throwingAxe = SpartanWeaponryAPI.createThrowingAxe(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(throwingAxe, new ResourceLocation(BetterWithSpartanry.MODID, "throwing_axe_custom"));
            itemSet.add(throwingAxe);
            
            Item javelin = SpartanWeaponryAPI.createJavelin(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(javelin, new ResourceLocation(BetterWithSpartanry.MODID, "javelin_custom"));
            itemSet.add(javelin);
            
            Item battleaxe = SpartanWeaponryAPI.createBattleaxe(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(battleaxe, new ResourceLocation(BetterWithSpartanry.MODID, "battleaxe_custom"));
            itemSet.add(battleaxe);
            
            Item boomerang = SpartanWeaponryAPI.createBoomerang(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(boomerang, new ResourceLocation(BetterWithSpartanry.MODID, "boomerang_custom"));
            itemSet.add(boomerang);
            
            Item mace = SpartanWeaponryAPI.createMace(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(mace, new ResourceLocation(BetterWithSpartanry.MODID, "mace_custom"));
            itemSet.add(mace);
            
            Item glaive = SpartanWeaponryAPI.createGlaive(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(glaive, new ResourceLocation(BetterWithSpartanry.MODID, "glaive_custom"));
            itemSet.add(glaive);
            
            Item quarterstaff = SpartanWeaponryAPI.createQuarterstaff(materialSoulforgedSteel, BetterWithSpartanry.MODID, CreativeTabsSW.TAB_SW_MOD);
            SpartanWeaponryAPI.addItemModelToRegistry(quarterstaff, new ResourceLocation(BetterWithSpartanry.MODID, "staff_custom"));
            itemSet.add(quarterstaff);
            
            /*new ItemDagger("dagger_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.DAGGER, mat.material.getMaterial().getAttackDamage()));*/
            //ModelRenderRegistry.addItemToRegistry(dagger, mat.material, "dagger_custom");
            
            
            /*ItemKatana katana = new ItemKatana("katana_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.KATANA, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(katana, mat.material, "katana_custom");
            item_set.add(katana);
            ItemGreatsword greatsword = new ItemGreatsword("greatsword_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.GREATSWORD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(greatsword, mat.material, "greatsword_custom");
            item_set.add(greatsword);
            ItemLongsword longsword = new ItemLongsword("longsword_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LONGSWORD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(longsword, mat.material, "longsword_custom");
            item_set.add(longsword);
            ItemSaber saber = new ItemSaber("saber_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SABER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(saber, mat.material, "saber_custom");
            item_set.add(saber);
            ItemRapier rapier = new ItemRapier("rapier_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.RAPIER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(rapier, mat.material, "rapier_custom");
            item_set.add(rapier);
            ItemSpear spear = new ItemSpear("spear_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.SPEAR, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(spear, mat.material, "spear_custom");
            item_set.add(spear);
            ItemPike pike = new ItemPike("pike_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.PIKE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(pike, mat.material, "pike_custom");
            item_set.add(pike);
            ItemLance lance = new ItemLance("lance_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.LANCE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(lance, mat.material, "lance_custom");
            item_set.add(lance);
            ItemHalberd halberd = new ItemHalberd("halberd_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HALBERD, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(halberd, mat.material, "halberd_custom");
            item_set.add(halberd);
            ItemWarhammer warhammer = new ItemWarhammer("warhammer_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.WARHAMMER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(warhammer, mat.material, "warhammer_custom");
            item_set.add(warhammer);
            ItemHammer hammer = new ItemHammer("hammer_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.HAMMER, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(hammer, mat.material, "hammer_custom");
            item_set.add(hammer);
            ItemThrowingAxe throwing_axe = new ItemThrowingAxe("throwing_axe_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_AXE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(throwing_axe, mat.material, "throwing_axe_custom");
            item_set.add(throwing_axe);
            ItemThrowingKnife throwing_knife = new ItemThrowingKnife("throwing_knife_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.THROWING_KNIFE, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(throwing_knife, mat.material, "throwing_knife_custom");
            item_set.add(throwing_knife);
            ItemLongbow longbow = new ItemLongbow("longbow_" + mat.name, BetterWithSpartanry.MODID, mat.material);
            ModelRenderRegistry.addItemToRegistry(longbow, mat.material, "longbow_custom");
            item_set.add(longbow);
            ItemCrossbow crossbow = new ItemCrossbow("crossbow_" + mat.name, BetterWithSpartanry.MODID, mat.material);
            ModelRenderRegistry.addItemToRegistry(crossbow, mat.material, "crossbow_custom");
            item_set.add(crossbow);
            ItemJavelin javelin = new ItemJavelin("javelin_" + mat.name, BetterWithSpartanry.MODID, mat.material,
                    DamageHelper.getDamage(DamageHelper.WeaponType.JAVELIN, mat.material.getMaterial().getAttackDamage()));
            ModelRenderRegistry.addItemToRegistry(javelin, mat.material, "javelin_custom");
            item_set.add(javelin);*/
            
            SpartanWeaponryAPI.registerColourHandler(materialSoulforgedSteel, dagger, longsword, katana, saber, rapier, greatsword,
            		hammer, warhammer, spear, halberd, pike, lance, longbow, crossbow,
            		throwingKnife, throwingAxe, javelin, battleaxe, boomerang, mace,
            		glaive, quarterstaff);

        //}
        for (Item it : itemSet)
        {
        	if(it != null)
        		ev.getRegistry().register(it);
        }
    }
}
