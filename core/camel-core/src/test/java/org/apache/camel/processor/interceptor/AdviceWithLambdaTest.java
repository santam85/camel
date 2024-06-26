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
package org.apache.camel.processor.interceptor;

import org.apache.camel.CamelExecutionException;
import org.apache.camel.ContextTestSupport;
import org.apache.camel.builder.AdviceWith;
import org.apache.camel.builder.RouteBuilder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class AdviceWithLambdaTest extends ContextTestSupport {

    @Test
    public void testNoAdvised() throws Exception {
        getMockEndpoint("mock:foo").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testAdvised() throws Exception {
        AdviceWith.adviceWith(context, null, a -> {
            a.interceptSendToEndpoint("mock:foo").skipSendToOriginalEndpoint().to("log:foo").to("mock:advised");
        });

        getMockEndpoint("mock:foo").expectedMessageCount(0);
        getMockEndpoint("mock:advised").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
    }
    // END SNIPPET: e1

    @Test
    public void testAdvisedSimple() throws Exception {
        AdviceWith.adviceWith(context, null, a -> {
            a.interceptSendToEndpoint("mock:foo").skipSendToOriginalEndpoint().transform(a.simple("Hello ${body}"))
                    .to("log:foo").to("mock:advised");
        });

        getMockEndpoint("mock:foo").expectedMessageCount(0);
        getMockEndpoint("mock:advised").expectedBodiesReceived("Hello World");
        getMockEndpoint("mock:result").expectedBodiesReceived("Hello World");

        template.sendBody("direct:start", "World");

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testAdvisedNoLog() throws Exception {
        AdviceWith.adviceWith(context, null, false, a -> {
            a.weaveByToUri("mock:result").remove();
            a.weaveAddLast().transform().constant("Bye World");
        });

        getMockEndpoint("mock:foo").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(0);

        Object out = template.requestBody("direct:start", "Hello World");
        assertEquals("Bye World", out);

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testAdvisedNoNewRoutesAllowed() throws Exception {
        try {
            AdviceWith.adviceWith(context, 0, a -> {
                a.from("direct:bar").to("mock:bar");

                a.interceptSendToEndpoint("mock:foo").skipSendToOriginalEndpoint().to("log:foo").to("mock:advised");
            });
            fail("Should have thrown exception");
        } catch (IllegalArgumentException e) {
            // expected
        }
    }

    @Test
    public void testAdvisedThrowException() throws Exception {
        AdviceWith.adviceWith(context, "myRoute", a -> {
            a.interceptSendToEndpoint("mock:foo").to("mock:advised").throwException(new IllegalArgumentException("Damn"));
        });

        getMockEndpoint("mock:foo").expectedMessageCount(0);
        getMockEndpoint("mock:advised").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(0);

        try {
            template.sendBody("direct:start", "Hello World");
            fail("Should have thrown exception");
        } catch (CamelExecutionException e) {
            assertIsInstanceOf(IllegalArgumentException.class, e.getCause());
            assertEquals("Damn", e.getCause().getMessage());
        }

        assertMockEndpointsSatisfied();
    }

    @Test
    public void testAdvisedRouteDefinition() throws Exception {
        AdviceWith.adviceWith(context, context.getRouteDefinitions().get(0), a -> {
            a.interceptSendToEndpoint("mock:foo").skipSendToOriginalEndpoint().to("log:foo").to("mock:advised");
        });

        getMockEndpoint("mock:foo").expectedMessageCount(0);
        getMockEndpoint("mock:advised").expectedMessageCount(1);
        getMockEndpoint("mock:result").expectedMessageCount(1);

        template.sendBody("direct:start", "Hello World");

        assertMockEndpointsSatisfied();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:start").id("myRoute").to("mock:foo").to("mock:result");
            }
        };
    }
}
