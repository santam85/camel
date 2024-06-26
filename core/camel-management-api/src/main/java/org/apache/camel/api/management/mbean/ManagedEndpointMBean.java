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
package org.apache.camel.api.management.mbean;

import java.util.Map;

import org.apache.camel.api.management.ManagedAttribute;

public interface ManagedEndpointMBean {

    @ManagedAttribute(description = "Camel ID")
    String getCamelId();

    @ManagedAttribute(description = "Camel ManagementName")
    String getCamelManagementName();

    @ManagedAttribute(description = "Endpoint URI", mask = true)
    String getEndpointUri();

    @ManagedAttribute(description = "Endpoint Base URI (no query parameters)", mask = true)
    String getEndpointBaseUri();

    @ManagedAttribute(description = "Singleton")
    boolean isSingleton();

    @ManagedAttribute(description = "Whether this endpoint connects to remote or local systems")
    boolean isRemote();

    @ManagedAttribute(description = "Endpoint State")
    String getState();

    @ManagedAttribute(description = "Url used for network connecting to service (only available for some components)")
    String getServiceLocationUrl();

    @ManagedAttribute(description = "Protocol used for service connecting (only available for some components)")
    String getServiceLocationProtocol();

    @ManagedAttribute(description = "Additional metadata this endpoint is used for connecting (only available for some components)")
    Map<String, String> getServiceLocationMetadata();

}
