package rex8112.evolve.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import rex8112.evolve.Evolve;

public class CreativeTabInit {
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Evolve.MODID);

    public static final RegistryObject<CreativeModeTab> EVOLVE_TAB = TABS.register("evolve_tab",
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.evolve"))
                    .icon(ItemInit.LARVA.get()::getDefaultInstance)
                    .displayItems((parameters, output) -> {
                        output.accept(ItemInit.LARVA.get());
                        output.accept(ItemInit.LARVA_CLUSTER_ITEM.get());
                    })
                    .build()
    );
}
