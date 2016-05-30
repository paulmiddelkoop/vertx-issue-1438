package io.vertx.core;

public class ServiceVerticle extends AbstractVerticle {

    @Override
    public void start() throws Exception {
        if (!Context.isOnWorkerThread()) {
            throw new IllegalStateException("Verticle is not loaded as worker");
        }
        System.out.println("Loaded succesfull");
    }
}
