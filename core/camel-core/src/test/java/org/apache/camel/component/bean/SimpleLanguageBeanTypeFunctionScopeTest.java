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
package org.apache.camel.component.bean;

import org.apache.camel.builder.RouteBuilder;

public class SimpleLanguageBeanTypeFunctionScopeTest extends SimpleLanguageBeanFunctionScopeTest {

    @Override
    protected RouteBuilder createRouteBuilder() {
        return new RouteBuilder() {
            @Override
            public void configure() {
                from("direct:single").choice().when().simple(
                        "${bean:type:org.apache.camel.component.bean.SimpleLanguageBeanFunctionScopeTest$MyBean?scope=Singleton}")
                        .to("mock:result")
                        .otherwise().to("mock:other");

                from("direct:proto").choice().when().simple(
                        "${bean:type:org.apache.camel.component.bean.SimpleLanguageBeanFunctionScopeTest$MyBean?scope=Prototype}")
                        .to("mock:result")
                        .otherwise().to("mock:other");

                from("direct:request")
                        .to("direct:sub")
                        .to("direct:sub")
                        .to("direct:sub");

                from("direct:sub").choice().when().simple(
                        "${bean:type:org.apache.camel.component.bean.SimpleLanguageBeanFunctionScopeTest$MyBean?scope=Request}")
                        .to("mock:result")
                        .otherwise().to("mock:other");

            }
        };
    }

}
