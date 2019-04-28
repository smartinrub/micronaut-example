package com.sergiomartinrubio;

import io.micronaut.http.HttpRequest;
import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.test.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

import static org.junit.jupiter.api.Assertions.*;

@MicronautTest
class UpperCaseControllerTest {

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    public void toUpperCase_givenStringPathParam_whenParamIsValid_thenReturnsStringInUpperCase() {
        HttpRequest request = HttpRequest.GET("/touppercase/test");
        String response = client.toBlocking().retrieve(request);

        assertNotNull(response);
        assertEquals("TEST", response);
    }

}