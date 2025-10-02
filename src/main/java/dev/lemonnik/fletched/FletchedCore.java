package dev.lemonnik.fletched;

import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.config.ModConfig;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;

import static dev.lemonnik.fletched.registries.ModBlocks.BLOCKS;
import static dev.lemonnik.fletched.registries.ModCreativeTabs.CREATIVE_MODE_TABS;
import static dev.lemonnik.fletched.registries.ModItems.ITEMS;

@Mod(FletchedCore.MODID)
public class FletchedCore {
    public static final String MODID = "fletched";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }

    public static void info(String message) {
        LOGGER.info("[FletchedCore/INFO] {}", message);
    }

    public static void error(String message) {
        LOGGER.error("[FletchedCore/ERROR] {}", message);
    }

    public static void warn(String message) {
        LOGGER.warn("[FletchedCore/INFO] {}", message);
    }

    public FletchedCore(IEventBus modEventBus, ModContainer modContainer) {
        modEventBus.addListener(this::commonSetup);

        BLOCKS.register(modEventBus);
        ITEMS.register(modEventBus);
        CREATIVE_MODE_TABS.register(modEventBus);

        modContainer.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        info("Chicken butt :D");
    }
}
