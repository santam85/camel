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
package org.apache.camel.builder.endpoint.dsl;

import javax.annotation.Generated;
import org.apache.camel.builder.EndpointConsumerBuilder;
import org.apache.camel.builder.EndpointProducerBuilder;
import org.apache.camel.builder.endpoint.AbstractEndpointBuilder;

/**
 * The aws2-translate component is used for managing Amazon Translate
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.EndpointDslMojo")
public interface Translate2EndpointBuilderFactory {


    /**
     * Builder for endpoint for the AWS 2 Translate component.
     */
    public interface Translate2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default AdvancedTranslate2EndpointBuilder advanced() {
            return (AdvancedTranslate2EndpointBuilder) this;
        }
        /**
         * Amazon AWS Access Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder accessKey(String accessKey) {
            doSetProperty("accessKey", accessKey);
            return this;
        }
        /**
         * Being able to autodetect the source language.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Translate2EndpointBuilder autodetectSourceLanguage(
                boolean autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
            return this;
        }
        /**
         * Being able to autodetect the source language.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Translate2EndpointBuilder autodetectSourceLanguage(
                String autodetectSourceLanguage) {
            doSetProperty("autodetectSourceLanguage", autodetectSourceLanguage);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Translate2EndpointBuilder lazyStartProducer(
                boolean lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * Whether the producer should be started lazy (on the first message).
         * By starting lazy you can use this to allow CamelContext and routes to
         * startup in situations where a producer may otherwise fail during
         * starting and cause the route to fail being started. By deferring this
         * startup to be lazy then the startup failure can be handled during
         * routing messages via Camel's routing error handlers. Beware that when
         * the first message is processed then creating and starting the
         * producer may take a little time and prolong the total processing time
         * of the processing.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: producer
         */
        default Translate2EndpointBuilder lazyStartProducer(
                String lazyStartProducer) {
            doSetProperty("lazyStartProducer", lazyStartProducer);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option is a:
         * <code>org.apache.camel.component.aws2.translate.Translate2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default Translate2EndpointBuilder operation(
                Translate2Operations operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * The operation to perform.
         * 
         * The option will be converted to a
         * <code>org.apache.camel.component.aws2.translate.Translate2Operations</code> type.
         * 
         * Required: true
         * Group: producer
         */
        default Translate2EndpointBuilder operation(String operation) {
            doSetProperty("operation", operation);
            return this;
        }
        /**
         * To define a proxy host when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder proxyHost(String proxyHost) {
            doSetProperty("proxyHost", proxyHost);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option is a: <code>java.lang.Integer</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder proxyPort(Integer proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy port when instantiating the Translate client.
         * 
         * The option will be converted to a <code>java.lang.Integer</code>
         * type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder proxyPort(String proxyPort) {
            doSetProperty("proxyPort", proxyPort);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option is a: <code>software.amazon.awssdk.core.Protocol</code>
         * type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Translate2EndpointBuilder proxyProtocol(Protocol proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * To define a proxy protocol when instantiating the Translate client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.core.Protocol</code> type.
         * 
         * Default: HTTPS
         * Group: producer
         */
        default Translate2EndpointBuilder proxyProtocol(String proxyProtocol) {
            doSetProperty("proxyProtocol", proxyProtocol);
            return this;
        }
        /**
         * The region in which Translate client needs to work. When using this
         * parameter, the configuration will expect the capitalized name of the
         * region (for example AP_EAST_1) You'll need to use the name
         * Regions.EU_WEST_1.name().
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder region(String region) {
            doSetProperty("region", region);
            return this;
        }
        /**
         * Amazon AWS Secret Key.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder secretKey(String secretKey) {
            doSetProperty("secretKey", secretKey);
            return this;
        }
        /**
         * Source language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder sourceLanguage(String sourceLanguage) {
            doSetProperty("sourceLanguage", sourceLanguage);
            return this;
        }
        /**
         * Target language to use.
         * 
         * The option is a: <code>java.lang.String</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder targetLanguage(String targetLanguage) {
            doSetProperty("targetLanguage", targetLanguage);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option is a:
         * <code>software.amazon.awssdk.services.translate.TranslateClient</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder translateClient(Object translateClient) {
            doSetProperty("translateClient", translateClient);
            return this;
        }
        /**
         * To use a existing configured AWS Translate as client.
         * 
         * The option will be converted to a
         * <code>software.amazon.awssdk.services.translate.TranslateClient</code> type.
         * 
         * Group: producer
         */
        default Translate2EndpointBuilder translateClient(String translateClient) {
            doSetProperty("translateClient", translateClient);
            return this;
        }
    }

    /**
     * Advanced builder for endpoint for the AWS 2 Translate component.
     */
    public interface AdvancedTranslate2EndpointBuilder
            extends
                EndpointProducerBuilder {
        default Translate2EndpointBuilder basic() {
            return (Translate2EndpointBuilder) this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedTranslate2EndpointBuilder basicPropertyBinding(
                boolean basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Whether the endpoint should use basic property binding (Camel 2.x) or
         * the newer property binding with additional capabilities.
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedTranslate2EndpointBuilder basicPropertyBinding(
                String basicPropertyBinding) {
            doSetProperty("basicPropertyBinding", basicPropertyBinding);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option is a: <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedTranslate2EndpointBuilder synchronous(
                boolean synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
        /**
         * Sets whether synchronous processing should be strictly used, or Camel
         * is allowed to use asynchronous processing (if supported).
         * 
         * The option will be converted to a <code>boolean</code> type.
         * 
         * Default: false
         * Group: advanced
         */
        default AdvancedTranslate2EndpointBuilder synchronous(String synchronous) {
            doSetProperty("synchronous", synchronous);
            return this;
        }
    }

    /**
     * Proxy enum for
     * <code>org.apache.camel.component.aws2.translate.Translate2Operations</code> enum.
     */
    enum Translate2Operations {
        translateText;
    }

    /**
     * Proxy enum for <code>software.amazon.awssdk.core.Protocol</code> enum.
     */
    enum Protocol {
        http,
        https;
    }
    /**
     * AWS 2 Translate (camel-aws2-translate)
     * The aws2-translate component is used for managing Amazon Translate
     * 
     * Category: cloud,management
     * Since: 3.1
     * Maven coordinates: org.apache.camel:camel-aws2-translate
     * 
     * Syntax: <code>aws2-translate:label</code>
     * 
     * Path parameter: label (required)
     * Logical name
     */
    default Translate2EndpointBuilder aws2Translate(String path) {
        class Translate2EndpointBuilderImpl extends AbstractEndpointBuilder implements Translate2EndpointBuilder, AdvancedTranslate2EndpointBuilder {
            public Translate2EndpointBuilderImpl(String path) {
                super("aws2-translate", path);
            }
        }
        return new Translate2EndpointBuilderImpl(path);
    }
}