/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.undertow;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.camel.BindToRegistry;
import org.apache.camel.CamelContext;
import org.apache.camel.test.AvailablePortFinder;
import org.apache.camel.test.junit5.CamelTestSupport;
import org.junit.jupiter.api.BeforeAll;

/**
 * Base class of tests which allocates ports
 */
public abstract class BaseUndertowTest extends CamelTestSupport {

    private static volatile int port;
    private static volatile int port2;
    private final AtomicInteger counter = new AtomicInteger(1);

    @BeforeAll
    public static void initPort() {
        port = AvailablePortFinder.getNextAvailable();
        port2 = AvailablePortFinder.getNextAvailable();
    }

    protected static int getPort() {
        return port;
    }

    protected static int getPort2() {
        return port2;
    }

    @Override
    protected CamelContext createCamelContext() throws Exception {
        CamelContext context = super.createCamelContext();
        context.getPropertiesComponent().setLocation("ref:prop");
        return context;
    }

    @BindToRegistry("prop")
    public Properties loadProperties() {

        Properties prop = new Properties();
        prop.setProperty("port", Integer.toString(getPort()));
        prop.setProperty("port2", Integer.toString(getPort2()));
        return prop;
    }

    protected int getNextPort() {
        return AvailablePortFinder.getNextAvailable();
    }

    protected int getNextPort(int startWithPort) {
        return AvailablePortFinder.getNextAvailable();
    }
}
