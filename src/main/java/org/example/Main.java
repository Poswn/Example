package org.example;

import org.cloudburstmc.api.plugin.Plugin;
import org.cloudburstmc.server.event.Listener;
import org.cloudburstmc.server.event.server.ServerInitializationEvent;
import org.cloudburstmc.server.utils.TextFormat;

import javax.inject.Inject;
import java.util.logging.Logger;

@Plugin(id = "Example", version = "1.0")
public class Main {

    private final Logger logger;

    @Inject
    private Main(Logger logger) {
        this.logger = logger;
    }

    @Listener
    public void onServerInitialization(ServerInitializationEvent event) {
        logger.info(TextFormat.GREEN + "Plugin initializing!");
    }
}
