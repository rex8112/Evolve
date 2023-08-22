package rex8112.evolve.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import rex8112.evolve.Evolve;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Evolve.MODID);

    public static final RegistryObject<Block> LARVA_CLUSTER = BLOCKS.register("larva_cluster",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.COLOR_RED)
                    .strength(5.0f, 17.0f)
                    .lightLevel(state -> 3)
                    .requiresCorrectToolForDrops()
            ));
}
