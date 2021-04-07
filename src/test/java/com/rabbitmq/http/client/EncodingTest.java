package com.rabbitmq.http.client;

import org.apache.http.client.utils.URIBuilder;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.DefaultUriBuilderFactory;
import org.springframework.web.util.UriBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.web.util.UriUtils;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class EncodingTest {
    String queryParameterValue = "^outbound-ack|msg-.+$";

    @Test
    void uriEncodeOfSpecialCharactersWithSpringUriBuilder_DoesNotWork() {
        DefaultUriBuilderFactory factory = new DefaultUriBuilderFactory();
        factory.setEncodingMode(DefaultUriBuilderFactory.EncodingMode.TEMPLATE_AND_VALUES);
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("name", queryParameterValue);

        URI uri = factory
                .uriString("/exchanges")
                .queryParams(map)
                .build();
        assertNotEquals("/exchanges?name=%5Eoutbound-ack%7Cmsg-.%2B%24", uri.toASCIIString());

    }

    @Test
    void uriEncodeOfSpecialCharactersWithApacheURIBuilder_DoesWork() throws URISyntaxException {
        URI uri = new URIBuilder()
                .setPath("/exchanges")
                .addParameter("name", queryParameterValue)
                .build();
        assertEquals("/exchanges?name=%5Eoutbound-ack%7Cmsg-.%2B%24", uri.toASCIIString());
    }
}
