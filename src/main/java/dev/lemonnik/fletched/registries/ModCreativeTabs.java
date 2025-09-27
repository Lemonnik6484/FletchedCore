package dev.lemonnik.fletched.registries;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import static dev.lemonnik.fletched.FletchedCore.MODID;

public class ModCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FLETCHED_TAB = CREATIVE_MODE_TABS.register("fletched_tab",
            () -> CreativeModeTab.builder()
                .title(Component.translatable("itemGroup.fletched"))
                .withTabsBefore(CreativeModeTabs.COMBAT)
                .icon(() -> Items.APPLE.asItem().getDefaultInstance())
                .displayItems((parameters, output) -> {
                    //output.accept(EXAMPLE_ITEM.get());
                }).build());
}
