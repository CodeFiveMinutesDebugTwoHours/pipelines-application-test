package org.acme;

import io.quarkus.logging.Log;
import io.quarkus.runtime.StartupEvent;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;

/**
 * @author qhx
 * @version V1.0
 * @since 2024/10/24 15:07
 */
@ApplicationScoped
public class Runner {

    @Inject
    GreetingConfig config;

    public void doSomething(@Observes StartupEvent event) {
        Log.info("message: ------> " + config.message());
    }

}
