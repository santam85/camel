/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.dataformat.csv;

import javax.annotation.processing.Generated;
import java.util.HashMap;
import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@Generated("org.apache.camel.maven.packaging.PackageDataFormatMojo")
@SuppressWarnings("unchecked")
public class CsvDataFormatConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object target, String name, Object value, boolean ignoreCase) {
        CsvDataFormat dataformat = (CsvDataFormat) target;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "commentmarkerdisabled":
        case "commentMarkerDisabled": dataformat.setCommentMarkerDisabled(property(camelContext, boolean.class, value)); return true;
        case "commentmarker":
        case "commentMarker": dataformat.setCommentMarker(property(camelContext, java.lang.Character.class, value)); return true;
        case "delimiter": dataformat.setDelimiter(property(camelContext, java.lang.Character.class, value)); return true;
        case "escapedisabled":
        case "escapeDisabled": dataformat.setEscapeDisabled(property(camelContext, boolean.class, value)); return true;
        case "escape": dataformat.setEscape(property(camelContext, java.lang.Character.class, value)); return true;
        case "headerdisabled":
        case "headerDisabled": dataformat.setHeaderDisabled(property(camelContext, boolean.class, value)); return true;
        case "header": dataformat.setHeader(property(camelContext, java.lang.String.class, value)); return true;
        case "allowmissingcolumnnames":
        case "allowMissingColumnNames": dataformat.setAllowMissingColumnNames(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "ignoreemptylines":
        case "ignoreEmptyLines": dataformat.setIgnoreEmptyLines(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "ignoresurroundingspaces":
        case "ignoreSurroundingSpaces": dataformat.setIgnoreSurroundingSpaces(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "nullstringdisabled":
        case "nullStringDisabled": dataformat.setNullStringDisabled(property(camelContext, boolean.class, value)); return true;
        case "nullstring":
        case "nullString": dataformat.setNullString(property(camelContext, java.lang.String.class, value)); return true;
        case "quotedisabled":
        case "quoteDisabled": dataformat.setQuoteDisabled(property(camelContext, boolean.class, value)); return true;
        case "quote": dataformat.setQuote(property(camelContext, java.lang.Character.class, value)); return true;
        case "quotemode":
        case "quoteMode": dataformat.setQuoteMode(property(camelContext, org.apache.commons.csv.QuoteMode.class, value)); return true;
        case "recordseparatordisabled":
        case "recordSeparatorDisabled": dataformat.setRecordSeparatorDisabled(property(camelContext, boolean.class, value)); return true;
        case "recordseparator":
        case "recordSeparator": dataformat.setRecordSeparator(property(camelContext, java.lang.String.class, value)); return true;
        case "skipheaderrecord":
        case "skipHeaderRecord": dataformat.setSkipHeaderRecord(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "trim": dataformat.setTrim(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "ignoreheadercase":
        case "ignoreHeaderCase": dataformat.setIgnoreHeaderCase(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "trailingdelimiter":
        case "trailingDelimiter": dataformat.setTrailingDelimiter(property(camelContext, java.lang.Boolean.class, value)); return true;
        case "captureheaderrecord":
        case "captureHeaderRecord": dataformat.setCaptureHeaderRecord(property(camelContext, boolean.class, value)); return true;
        case "lazyload":
        case "lazyLoad": dataformat.setLazyLoad(property(camelContext, boolean.class, value)); return true;
        case "usemaps":
        case "useMaps": dataformat.setUseMaps(property(camelContext, boolean.class, value)); return true;
        case "useorderedmaps":
        case "useOrderedMaps": dataformat.setUseOrderedMaps(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

