package io.drahlek.examplemod;

import net.fabricmc.api.ClientModInitializer;

public class ExamplemodClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Constants.LOG.info("ExampleModClient init {}", Constants.MOD_NAME);
    }
}
