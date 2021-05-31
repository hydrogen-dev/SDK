/*
 * Hydrogen Integration API
 * The Hydrogen Integration API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.integration.api;

import com.hydrogen.integration.model.AsyncTransaction;
import com.hydrogen.integration.model.AsyncTransactionVO;
import com.hydrogen.integration.ApiException;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for AsyncApi
 */
@Ignore
public class AsyncApiTest {

    private final AsyncApi api = new AsyncApi();

    
    /**
     * Create async transaction for GET endpoints for bulk data
     *
     * Create async transaction for GET endpoints for bulk data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncDataTest() throws ApiException {
        String integrationType = null;
        String service = null;
        AsyncTransaction response = api.getAsyncData(integrationType, service);

        // TODO: test validations
    }
    
    /**
     * Create async transaction for POST endpoints for bulk data
     *
     * Create async transaction for POST endpoints for bulk data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncData2Test() throws ApiException {
        Object data = null;
        String integrationType = null;
        String service = null;
        AsyncTransaction response = api.getAsyncData2(data, integrationType, service);

        // TODO: test validations
    }
    
    /**
     * Create async transaction for GET endpoints for bulk data
     *
     * Create async transaction for GET endpoints for bulk data
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncDataByIdTest() throws ApiException {
        UUID id = null;
        String integrationType = null;
        String service = null;
        AsyncTransaction response = api.getAsyncDataById(id, integrationType, service);

        // TODO: test validations
    }
    
    /**
     * Get Status of async transaction created through GET/POST endpoints
     *
     * Get Status of async transaction created through GET/POST endpoints
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAsyncStatusTest() throws ApiException {
        UUID id = null;
        AsyncTransactionVO response = api.getAsyncStatus(id);

        // TODO: test validations
    }
    
}
