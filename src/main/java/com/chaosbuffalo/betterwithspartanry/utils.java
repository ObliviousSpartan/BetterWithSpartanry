package com.chaosbuffalo.betterwithspartanry;

import org.apache.commons.lang3.StringUtils;

import com.oblivioussp.spartanweaponry.api.ToolMaterialEx;

import net.minecraft.item.Item;

/**
 * Created by Jacob on 7/20/2018.
 */
public class utils {

    public static ToolMaterialEx spartanMatFromToolMat(String name, Item.ToolMaterial material,
                                                       int color1, int color2){
        return new ToolMaterialEx(
                name,
                "ingot" + StringUtils.capitalize(name),
                BetterWithSpartanry.MODID,
                color1,
                color2,
                material.getHarvestLevel(),
                material.getMaxUses(),
                material.getEfficiency(),
                material.getAttackDamage(),
                material.getEnchantability());
    }
}
