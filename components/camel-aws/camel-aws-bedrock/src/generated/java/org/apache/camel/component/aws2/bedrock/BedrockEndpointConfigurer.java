/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.aws2.bedrock;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class BedrockEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        BedrockEndpoint target = (BedrockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": target.getConfiguration().setAccessKey(property(camelContext, java.lang.String.class, value)); return true;
        case "bedrockruntimeclient":
        case "bedrockRuntimeClient": target.getConfiguration().setBedrockRuntimeClient(property(camelContext, software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "modelid":
        case "modelId": target.getConfiguration().setModelId(property(camelContext, java.lang.String.class, value)); return true;
        case "operation": target.getConfiguration().setOperation(property(camelContext, org.apache.camel.component.aws2.bedrock.BedrockOperations.class, value)); return true;
        case "overrideendpoint":
        case "overrideEndpoint": target.getConfiguration().setOverrideEndpoint(property(camelContext, boolean.class, value)); return true;
        case "pojorequest":
        case "pojoRequest": target.getConfiguration().setPojoRequest(property(camelContext, boolean.class, value)); return true;
        case "profilecredentialsname":
        case "profileCredentialsName": target.getConfiguration().setProfileCredentialsName(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyhost":
        case "proxyHost": target.getConfiguration().setProxyHost(property(camelContext, java.lang.String.class, value)); return true;
        case "proxyport":
        case "proxyPort": target.getConfiguration().setProxyPort(property(camelContext, java.lang.Integer.class, value)); return true;
        case "proxyprotocol":
        case "proxyProtocol": target.getConfiguration().setProxyProtocol(property(camelContext, software.amazon.awssdk.core.Protocol.class, value)); return true;
        case "region": target.getConfiguration().setRegion(property(camelContext, java.lang.String.class, value)); return true;
        case "secretkey":
        case "secretKey": target.getConfiguration().setSecretKey(property(camelContext, java.lang.String.class, value)); return true;
        case "sessiontoken":
        case "sessionToken": target.getConfiguration().setSessionToken(property(camelContext, java.lang.String.class, value)); return true;
        case "trustallcertificates":
        case "trustAllCertificates": target.getConfiguration().setTrustAllCertificates(property(camelContext, boolean.class, value)); return true;
        case "uriendpointoverride":
        case "uriEndpointOverride": target.getConfiguration().setUriEndpointOverride(property(camelContext, java.lang.String.class, value)); return true;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": target.getConfiguration().setUseDefaultCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": target.getConfiguration().setUseProfileCredentialsProvider(property(camelContext, boolean.class, value)); return true;
        case "usesessioncredentials":
        case "useSessionCredentials": target.getConfiguration().setUseSessionCredentials(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public String[] getAutowiredNames() {
        return new String[]{"bedrockRuntimeClient"};
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return java.lang.String.class;
        case "bedrockruntimeclient":
        case "bedrockRuntimeClient": return software.amazon.awssdk.services.bedrockruntime.BedrockRuntimeClient.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "modelid":
        case "modelId": return java.lang.String.class;
        case "operation": return org.apache.camel.component.aws2.bedrock.BedrockOperations.class;
        case "overrideendpoint":
        case "overrideEndpoint": return boolean.class;
        case "pojorequest":
        case "pojoRequest": return boolean.class;
        case "profilecredentialsname":
        case "profileCredentialsName": return java.lang.String.class;
        case "proxyhost":
        case "proxyHost": return java.lang.String.class;
        case "proxyport":
        case "proxyPort": return java.lang.Integer.class;
        case "proxyprotocol":
        case "proxyProtocol": return software.amazon.awssdk.core.Protocol.class;
        case "region": return java.lang.String.class;
        case "secretkey":
        case "secretKey": return java.lang.String.class;
        case "sessiontoken":
        case "sessionToken": return java.lang.String.class;
        case "trustallcertificates":
        case "trustAllCertificates": return boolean.class;
        case "uriendpointoverride":
        case "uriEndpointOverride": return java.lang.String.class;
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return boolean.class;
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return boolean.class;
        case "usesessioncredentials":
        case "useSessionCredentials": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        BedrockEndpoint target = (BedrockEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "accesskey":
        case "accessKey": return target.getConfiguration().getAccessKey();
        case "bedrockruntimeclient":
        case "bedrockRuntimeClient": return target.getConfiguration().getBedrockRuntimeClient();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "modelid":
        case "modelId": return target.getConfiguration().getModelId();
        case "operation": return target.getConfiguration().getOperation();
        case "overrideendpoint":
        case "overrideEndpoint": return target.getConfiguration().isOverrideEndpoint();
        case "pojorequest":
        case "pojoRequest": return target.getConfiguration().isPojoRequest();
        case "profilecredentialsname":
        case "profileCredentialsName": return target.getConfiguration().getProfileCredentialsName();
        case "proxyhost":
        case "proxyHost": return target.getConfiguration().getProxyHost();
        case "proxyport":
        case "proxyPort": return target.getConfiguration().getProxyPort();
        case "proxyprotocol":
        case "proxyProtocol": return target.getConfiguration().getProxyProtocol();
        case "region": return target.getConfiguration().getRegion();
        case "secretkey":
        case "secretKey": return target.getConfiguration().getSecretKey();
        case "sessiontoken":
        case "sessionToken": return target.getConfiguration().getSessionToken();
        case "trustallcertificates":
        case "trustAllCertificates": return target.getConfiguration().isTrustAllCertificates();
        case "uriendpointoverride":
        case "uriEndpointOverride": return target.getConfiguration().getUriEndpointOverride();
        case "usedefaultcredentialsprovider":
        case "useDefaultCredentialsProvider": return target.getConfiguration().isUseDefaultCredentialsProvider();
        case "useprofilecredentialsprovider":
        case "useProfileCredentialsProvider": return target.getConfiguration().isUseProfileCredentialsProvider();
        case "usesessioncredentials":
        case "useSessionCredentials": return target.getConfiguration().isUseSessionCredentials();
        default: return null;
        }
    }
}

