/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.5
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Country;
import com.hydrogen.nucleus.model.Currency;
import com.hydrogen.nucleus.model.FxRate;
import com.hydrogen.nucleus.model.FxRateView;
import com.hydrogen.nucleus.model.Institution;
import com.hydrogen.nucleus.model.MXMerchantRes;
import com.hydrogen.nucleus.model.MerchantCategoryCode;
import com.hydrogen.nucleus.model.PageInstitution;
import com.hydrogen.nucleus.model.State;
import java.util.UUID;

import com.hydrogen.nucleus.model.StatisticResourceVO;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResourceApi
 */
@Ignore
public class ResourceApiTest {

    private final ResourceApi api = new ResourceApi();

    
    /**
     * Create a bulk fxRate
     *
     * Create a bulk fxRate.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createFxRateBulkUsingPostTest() throws ApiException {
        List<FxRate> fxRateList = null;
        List<FxRate> response = api.createFxRateBulkUsingPost(fxRateList);

        // TODO: test validations
    }
    
    /**
     * Create a institution
     *
     * Create a new institution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createInstitutionUsingPostTest() throws ApiException {
        Institution institution = null;
        Institution response = api.createInstitutionUsingPost(institution);

        // TODO: test validations
    }
    
    /**
     * Delete a institution
     *
     * Delete a institution. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInstitutionUsingDeleteTest() throws ApiException {
        UUID institutionId = null;
        api.deleteInstitutionUsingDelete(institutionId);

        // TODO: test validations
    }
    
    /**
     * Get all account category mapping
     *
     * Get all account category mapping
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountResultForMappingTest() throws ApiException {
        String filter = null;
        UUID hydrogenAccountCategoryId = null;
        Boolean matchPrimary = null;
        String tenantName = null;
        String vendorName = null;
        List<Object> response = api.getAccountResultForMapping(filter, hydrogenAccountCategoryId, matchPrimary, tenantName, vendorName);

        // TODO: test validations
    }
    
    /**
     * Get All Countries
     *
     * Get All Countries. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCountryUsingGetTest() throws ApiException {
        List<Country> response = api.getAllCountryUsingGet();

        // TODO: test validations
    }
    
    /**
     * Get All Currencies
     *
     * Get All Currencies. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllCurrencyUsingGetTest() throws ApiException {
        List<Currency> response = api.getAllCurrencyUsingGet();

        // TODO: test validations
    }
    
    /**
     * Get All Merchant Category Codes
     *
     * Get All Merchant Category Codes.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllMerchantCategoryCodeUsingGetTest() throws ApiException {
        String filter = null;
        List<MerchantCategoryCode> response = api.getAllMerchantCategoryCodeUsingGet(filter);

        // TODO: test validations
    }
    
    /**
     * List all state resource
     *
     * Get the information for all possible state resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStatesUsingGetTest() throws ApiException {
        String countryCode = null;
        List<State> response = api.getAllStatesUsingGet(countryCode);

        // TODO: test validations
    }
    
    /**
     * List all statistic resource
     *
     * Get the information for all possible statistic resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllStatisticsUsingGetTest() throws ApiException {
        Map<String, List<StatisticResourceVO>> response = api.getAllStatisticsUsingGet();

        // TODO: test validations
    }
    
    /**
     * List all fxRates
     *
     * Get information for all fxRates defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyExchangeRateAllUsingGetTest() throws ApiException {
        String filter = null;
        List<FxRateView> response = api.getCurrencyExchangeRateAllUsingGet(filter);

        // TODO: test validations
    }
    
    /**
     * List all institutions
     *
     * List all institution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageInstitution response = api.getInstitutionAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve a institution
     *
     * Retrieve a institution. 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInstitutionUsingGetTest() throws ApiException {
        UUID institutionId = null;
        Institution response = api.getInstitutionUsingGet(institutionId);

        // TODO: test validations
    }
    
    /**
     * Get all merchants
     *
     * List all merchants.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMerchantsAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        MXMerchantRes response = api.getMerchantsAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Get all transaction category mapping
     *
     * Get all transaction category mapping
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransactionResultForMappingTest() throws ApiException {
        String filter = null;
        UUID hydrogenTransactionCategoryId = null;
        Boolean matchPrimary = null;
        String tenantName = null;
        String vendorName = null;
        List<Object> response = api.getTransactionResultForMapping(filter, hydrogenTransactionCategoryId, matchPrimary, tenantName, vendorName);

        // TODO: test validations
    }
    
    /**
     * Update a institution
     *
     * Update a institution.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInstitutionUsingPutTest() throws ApiException {
        Object institution = null;
        UUID institutionId = null;
        Institution response = api.updateInstitutionUsingPut(institution, institutionId);

        // TODO: test validations
    }
    
}
