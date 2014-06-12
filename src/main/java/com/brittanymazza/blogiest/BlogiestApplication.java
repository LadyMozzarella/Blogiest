package com.brittanymazza.blogiest;

import io.dropwizard.Service;
import io.dropwizard.Bootstrap;
import io.dropwizard.Configuration;
import io.dropwizard.Environment;

/**
 * Created by brittanymazza on 6/11/14.
 */
public class BlogiestApplication extends Service<Configuration> {
    @Override
    public void initialize(Bootstrap<Configuration> configurationBootstrap) {

    }

    @Override
    public void run(Configuration configuration, Environment environment) throws Exception {
        environment.addResource(TestResource.class)
    }
}
