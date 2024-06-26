/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan.embedded;

import javax.annotation.processing.Generated;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedAggregationRepository;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.GenerateConfigurerMojo")
@SuppressWarnings("unchecked")
public class InfinispanEmbeddedAggregationRepositoryConfigurer extends org.apache.camel.support.component.PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedAggregationRepository target = (org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "allowSerializedHeaders": target.setAllowSerializedHeaders(property(camelContext, boolean.class, value)); return true;
        case "cachename":
        case "cacheName": target.setCacheName(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class, value)); return true;
        case "deadletteruri":
        case "deadLetterUri": target.setDeadLetterUri(property(camelContext, java.lang.String.class, value)); return true;
        case "maximumredeliveries":
        case "maximumRedeliveries": target.setMaximumRedeliveries(property(camelContext, int.class, value)); return true;
        case "recoveryinterval":
        case "recoveryInterval": target.setRecoveryInterval(property(camelContext, long.class, value)); return true;
        case "userecovery":
        case "useRecovery": target.setUseRecovery(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "allowSerializedHeaders": return boolean.class;
        case "cachename":
        case "cacheName": return java.lang.String.class;
        case "configuration": return org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedConfiguration.class;
        case "deadletteruri":
        case "deadLetterUri": return java.lang.String.class;
        case "maximumredeliveries":
        case "maximumRedeliveries": return int.class;
        case "recoveryinterval":
        case "recoveryInterval": return long.class;
        case "userecovery":
        case "useRecovery": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedAggregationRepository target = (org.apache.camel.component.infinispan.embedded.InfinispanEmbeddedAggregationRepository) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "allowserializedheaders":
        case "allowSerializedHeaders": return target.isAllowSerializedHeaders();
        case "cachename":
        case "cacheName": return target.getCacheName();
        case "configuration": return target.getConfiguration();
        case "deadletteruri":
        case "deadLetterUri": return target.getDeadLetterUri();
        case "maximumredeliveries":
        case "maximumRedeliveries": return target.getMaximumRedeliveries();
        case "recoveryinterval":
        case "recoveryInterval": return target.getRecoveryInterval();
        case "userecovery":
        case "useRecovery": return target.isUseRecovery();
        default: return null;
        }
    }
}

