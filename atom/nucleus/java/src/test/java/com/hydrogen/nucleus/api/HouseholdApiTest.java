/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.AvailableDateDoubleVO;
import com.hydrogen.nucleus.model.Household;
import org.threeten.bp.LocalDate;
import com.hydrogen.nucleus.model.PageHousehold;
import com.hydrogen.nucleus.model.PagePortfolioTransaction;
import com.hydrogen.nucleus.model.PortfolioHoldingAgg;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for HouseholdApi
 */
@Ignore
public class HouseholdApiTest {

    private final HouseholdApi api = new HouseholdApi();

    
    /**
     * Create a Household
     *
     * Create a new household, with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createHouseholdUsingPostTest() throws ApiException {
        Household household = null;
        Household response = api.createHouseholdUsingPost(household);

        // TODO: test validations
    }
    
    /**
     * Delete a Household
     *
     * Permanently delete a household
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteHouseholdUsingDeleteTest() throws ApiException {
        UUID householdId = null;
        api.deleteHouseholdUsingDelete(householdId);

        // TODO: test validations
    }
    
    /**
     * List all household
     *
     * Get details for all Household.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHouseholdAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageHousehold response = api.getHouseholdAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all household client asset sizes
     *
     * Get a list of asset sizes per date for a client&#39;s household.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHouseholdClientAssetSizeUsingGetTest() throws ApiException {
        UUID householdId = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        Boolean excludeSubledger = null;
        Boolean getLatest = null;
        String sortType = null;
        LocalDate startDate = null;
        List<AvailableDateDoubleVO> response = api.getHouseholdClientAssetSizeUsingGet(householdId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate);

        // TODO: test validations
    }
    
    /**
     * List all household&#39;s clientIds holdings
     *
     * Get the information for all the securities that are currently being held by a household&#39;s client ids registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHouseholdClientHoldingUsingGetTest() throws ApiException {
        UUID householdId = null;
        Boolean ascending = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        String filter = null;
        Boolean getLatest = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        LocalDate startDate = null;
        List<PortfolioHoldingAgg> response = api.getHouseholdClientHoldingUsingGet(householdId, ascending, currencyConversion, endDate, filter, getLatest, orderBy, page, size, startDate);

        // TODO: test validations
    }
    
    /**
     * List all household&#39;s client ids transactions
     *
     * Get the information for all transactions under a household client ids registered with your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHouseholdClientTransactionUsingGetTest() throws ApiException {
        UUID householdId = null;
        Boolean ascending = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        LocalDate startDate = null;
        PagePortfolioTransaction response = api.getHouseholdClientTransactionUsingGet(householdId, ascending, currencyConversion, endDate, filter, orderBy, page, size, startDate);

        // TODO: test validations
    }
    
    /**
     * Retrieve a Household
     *
     * Retrieve the information for a Household.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getHouseholdUsingGetTest() throws ApiException {
        UUID householdId = null;
        Household response = api.getHouseholdUsingGet(householdId);

        // TODO: test validations
    }
    
    /**
     * Update a Household
     *
     * Update the information for a Household.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateHouseholdUsingPutTest() throws ApiException {
        Object household = null;
        UUID householdId = null;
        Household response = api.updateHouseholdUsingPut(household, householdId);

        // TODO: test validations
    }
    
}
