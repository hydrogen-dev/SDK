/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.3
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.PageSecurity;
import com.hydrogen.nucleus.model.PageSecurityExclusion;
import com.hydrogen.nucleus.model.PageSecurityPrice;
import com.hydrogen.nucleus.model.Security;
import com.hydrogen.nucleus.model.SecurityExclusion;
import com.hydrogen.nucleus.model.SecurityPrice;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SecuritiesApi
 */
@Ignore
public class SecuritiesApiTest {

    private final SecuritiesApi api = new SecuritiesApi();

    
    /**
     * Create a security exclusion
     *
     * Create a new security exclusion for a specific account or portfolio.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSecurityExclusionUsingPostTest() throws ApiException {
        SecurityExclusion securityExclusionRequest = null;
        SecurityExclusion response = api.createSecurityExclusionUsingPost(securityExclusionRequest);

        // TODO: test validations
    }
    
    /**
     * Create a security price
     *
     * Create a new price for a security defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSecurityPriceUsingPostTest() throws ApiException {
        SecurityPrice securityPriceRequest = null;
        SecurityPrice response = api.createSecurityPriceUsingPost(securityPriceRequest);

        // TODO: test validations
    }
    
    /**
     * Create a security
     *
     * Create a new security for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createSecurityUsingPostTest() throws ApiException {
        Security securitiesInfoRequest = null;
        Security response = api.createSecurityUsingPost(securitiesInfoRequest);

        // TODO: test validations
    }
    
    /**
     * Delete a security exclusion
     *
     * Permanently delete a security exclusion
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSecurityExclusionUsingDeleteTest() throws ApiException {
        UUID securityExclusionId = null;
        api.deleteSecurityExclusionUsingDelete(securityExclusionId);

        // TODO: test validations
    }
    
    /**
     * Delete a security price
     *
     * Permanently delete a security price from a security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSecurityPriceUsingDeleteTest() throws ApiException {
        UUID securityPriceId = null;
        api.deleteSecurityPriceUsingDelete(securityPriceId);

        // TODO: test validations
    }
    
    /**
     * Delete a security
     *
     * Permanently delete a security for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSecurityUsingDeleteTest() throws ApiException {
        UUID securityId = null;
        api.deleteSecurityUsingDelete(securityId);

        // TODO: test validations
    }
    
    /**
     * List all securities
     *
     * Get details for all securities defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSecurity response = api.getSecurityAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all security exclusions
     *
     * Get details for all security exclusions defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityExclusionAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSecurityExclusion response = api.getSecurityExclusionAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a security exclusion
     *
     * Retrieve the information for a security exclusion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityExclusionUsingGetTest() throws ApiException {
        UUID securityExclusionId = null;
        SecurityExclusion response = api.getSecurityExclusionUsingGet(securityExclusionId);

        // TODO: test validations
    }
    
    /**
     * List all security prices
     *
     * Get prices for all securities defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageSecurityPrice response = api.getSecurityPriceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a security price
     *
     * Retrieve the information for a security price for a security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityPriceUsingGetTest() throws ApiException {
        UUID securityPriceId = null;
        String currencyConversion = null;
        SecurityPrice response = api.getSecurityPriceUsingGet(securityPriceId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Retrieve a security
     *
     * Retrieve the information for a security defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSecurityUsingGetTest() throws ApiException {
        UUID securityId = null;
        Security response = api.getSecurityUsingGet(securityId);

        // TODO: test validations
    }
    
    /**
     * Update a security exclusion
     *
     * Update the information for a security exclusion.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSecurityExclusionUsingPutTest() throws ApiException {
        Object securityExclusion = null;
        UUID securityExclusionId = null;
        SecurityExclusion response = api.updateSecurityExclusionUsingPut(securityExclusion, securityExclusionId);

        // TODO: test validations
    }
    
    /**
     * Update a security price
     *
     * Update a security price for a security.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSecurityPriceUsingPutTest() throws ApiException {
        Object securityPrice = null;
        UUID securityPriceId = null;
        SecurityPrice response = api.updateSecurityPriceUsingPut(securityPrice, securityPriceId);

        // TODO: test validations
    }
    
    /**
     * Update a security
     *
     * Update a security for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSecurityUsingPutTest() throws ApiException {
        Object security = null;
        UUID securityId = null;
        Security response = api.updateSecurityUsingPut(security, securityId);

        // TODO: test validations
    }
    
}
