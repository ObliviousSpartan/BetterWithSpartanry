package com.chaosbuffalo.betterwithspartanry;

import org.apache.logging.log4j.Logger;

import com.chaosbuffalo.betterwithspartanry.init.SteelCrafting;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = BetterWithSpartanry.MODID, name = BetterWithSpartanry.NAME, version = BetterWithSpartanry.VERSION,
        dependencies="required-after:betterwithmods;required-after:spartanweaponry@[beta 1.3.0,)")
public class BetterWithSpartanry
{
    public static final String MODID = "betterwithspartanry";
    public static final String NAME = "Better With Spartanry";
    public static final String VERSION = "@VERSION@";

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        SteelCrafting.init();
    }
}
