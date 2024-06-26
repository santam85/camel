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
package org.apache.camel.component.jetty;

import java.nio.charset.StandardCharsets;

import org.apache.camel.builder.RouteBuilder;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.CloseableHttpResponse;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JettyMuteExceptionTest extends BaseJettyTest {

    @Test
    public void testMuteException() throws Exception {
        HttpGet get = new HttpGet("http://localhost:" + getPort() + "/foo");
        get.addHeader("Accept", "application/text");
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(get)) {

            String responseString = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            assertTrue(responseString.isEmpty());
            assertEquals(500, response.getCode());
        }
    }

    @Test
    public void testDefaultMuteException() throws Exception {
        HttpGet get = new HttpGet("http://localhost:" + getPort() + "/fooDefault");
        get.addHeader("Accept", "application/text");
        try (CloseableHttpClient client = HttpClients.createDefault();
             CloseableHttpResponse response = client.execute(get)) {

            String responseString = EntityUtils.toString(response.getEntity(), StandardCharsets.UTF_8);
            assertTrue(responseString.isEmpty());
            assertEquals(500, response.getCode());
        }
    }

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("jetty:http://localhost:{{port}}/foo?muteException=true").to("mock:destination")
                        .throwException(new IllegalArgumentException("Camel cannot do this"));

                from("jetty:http://localhost:{{port}}/fooDefault").to("mock:destination")
                        .throwException(new IllegalArgumentException("Camel cannot do this"));
            }
        };
    }

}
