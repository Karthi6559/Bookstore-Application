package com.group1.apigateway;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.jwt.ReactiveJwtDecoder;

@SpringBootTest
class ApiGatewayApplicationTests {

    // Prevents Spring from calling Keycloak on startup to fetch the JWK Set.
    // In CI there is no Keycloak, so without this mock the context fails to load.
    @MockBean
    ReactiveJwtDecoder jwtDecoder;

    @Test
    void contextLoads() {
    }

}
