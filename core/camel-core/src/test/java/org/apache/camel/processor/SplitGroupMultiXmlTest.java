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
package org.apache.camel.processor;

import org.apache.camel.ContextTestSupport;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.junit.jupiter.api.Test;

/**
 *
 */
public class SplitGroupMultiXmlTest extends ContextTestSupport {

    @Test
    public void testTokenXMLPairGroup() throws Exception {
        MockEndpoint mock = getMockEndpoint("mock:split");
        mock.expectedMessageCount(3);
        mock.message(0).body().isEqualTo(
                "<order id=\"1\" xmlns=\"http:acme.com\">Camel in Action</order><order id=\"2\" xmlns=\"http:acme.com\">ActiveMQ in Action</order>");
        mock.message(1).body().isEqualTo(
                "<order id=\"3\" xmlns=\"http:acme.com\">Spring in Action</order><order id=\"4\" xmlns=\"http:acme.com\">Scala in Action</order>");
        mock.message(2).body().isEqualTo("<order id=\"5\" xmlns=\"http:acme.com\">Groovy in Action</order>");

        String body = createBody();
        template.sendBodyAndHeader(fileUri(), body, Exchange.FILE_NAME, "orders.xml");

        assertMockEndpointsSatisfied();
    }

    protected String createBody() {
        StringBuilder sb = new StringBuilder("<?xml version=\"1.0\"?>\n");
        sb.append("<orders xmlns=\"http:acme.com\">\n");
        sb.append("  <order id=\"1\">Camel in Action</order>\n");
        sb.append("  <order id=\"2\">ActiveMQ in Action</order>\n");
        sb.append("  <order id=\"3\">Spring in Action</order>\n");
        sb.append("  <order id=\"4\">Scala in Action</order>\n");
        sb.append("  <order id=\"5\">Groovy in Action</order>\n");
        sb.append("</orders>");
        return sb.toString();
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                // START SNIPPET: e1
                from(fileUri("?initialDelay=0&delay=10"))
                        // split the order child tags, and inherit namespaces from
                        // the orders root tag
                        .split().tokenizeXML("order", "orders", 2).to("log:split").to("mock:split");
                // END SNIPPET: e1
            }
        };
    }

}
