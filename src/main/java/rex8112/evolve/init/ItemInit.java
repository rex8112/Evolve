package rex8112.evolve.init;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.*;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rex8112.evolve.Evolve;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Evolve.MODID);

    public static final RegistryObject<Item> LARVA = ITEMS.register("larva",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder().nutrition(4).saturationMod(2)
                            .effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 100, 0), 1f).build())));

    public static final RegistryObject<BlockItem> LARVA_CLUSTER_ITEM = ITEMS.register("larva_cluster",
            () -> new BlockItem(BlockInit.LARVA_CLUSTER.get(),
                    new Item.Properties()
                            .rarity(Rarity.UNCOMMON)));
}
