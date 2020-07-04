package me.bitasy.sloths;

import me.bitasy.sloths.client.SlothRenderer;
import net.minecraft.block.Blocks;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Sloths.MOD_ID)
public class Sloths
{
    public final static String MOD_ID = "sloths";
    public final static String MOD_NAME = "Sloths";
    private static final Logger LOGGER = LogManager.getLogger();

    public Sloths() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

    @Mod.EventBusSubscriber(bus=Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {

        public static EntityType<SlothEntity> sloth = null;

        @SubscribeEvent
        public static void registerEntites(final RegistryEvent.Register<EntityType<?>> event) {
            LOGGER.debug("Registering sloth entity");
            sloth = EntityType.Builder.create(SlothEntity::new, EntityClassification.CREATURE)
                    .size(1, 1)
                    .build("sloths:sloth");
            sloth.setRegistryName(MOD_ID, "sloth");
            event.getRegistry().register(sloth);

            if(FMLEnvironment.dist.isClient()){
                RenderingRegistry.registerEntityRenderingHandler(sloth, SlothRenderer::new);
            }



            GlobalEntityTypeAttributes.put(sloth, SlothEntity.func_234215_eI_().func_233813_a_());

        }
    }
}
