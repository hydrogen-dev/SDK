/*
 * Hydrogen Admin API
 * The Hydrogen Admin API
 *
 * OpenAPI spec version: 1.0.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */



package com.hydrogen.admin.api;

import com.hydrogen.admin.model.AppToken;
import com.hydrogen.admin.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.List;

/**
 * API tests for AppTokenApi
 */
@Ignore
public class AppTokenApiTest {

    private final AppTokenApi api = new AppTokenApi();

    
    /**
     * getAppToken
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppTokenUsingGETTest() throws ApiException {
        List<String> appName = null;
        List<AppToken> response = api.getAppTokenUsingGET(appName);

        // TODO: test validations
    }
    
}
