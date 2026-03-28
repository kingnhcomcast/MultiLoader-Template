package io.drahlek.examplemod.client;

import io.drahlek.examplemod.Constants;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;

import static io.drahlek.examplemod.Constants.MOD_ID;

@EventBusSubscriber(modid = MOD_ID, value = Dist.CLIENT)
public final class NeoForgeClientInit {
    private NeoForgeClientInit() {
    }

    @SubscribeEvent
    public static void onClientSetup(FMLClientSetupEvent event) {
        Constants.LOG.info("{} client init", Constants.MOD_NAME);
    }
}
