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

import com.hydrogen.integration.model.BaasBusinessVO;
import com.hydrogen.integration.model.BaasClientVO;
import com.hydrogen.integration.model.BaasStatementsVO;
import com.hydrogen.integration.model.BaasSubAccountCO;
import com.hydrogen.integration.model.BaasSubAccountVO;
import com.hydrogen.integration.model.BaasTransactionsVO;
import com.hydrogen.integration.model.UpdateBaasBusinessCO;
import com.hydrogen.integration.ApiException;
import com.hydrogen.integration.model.BaasAccountCO;
import com.hydrogen.integration.model.BaasAccountVO;
import com.hydrogen.integration.model.BaasBalanceVO;
import com.hydrogen.integration.model.CreateBaasBusinessCO;
import com.hydrogen.integration.model.CreateBaasClientCO;
import org.threeten.bp.LocalDate;
import java.util.UUID;

import com.hydrogen.integration.model.UpdateBaasClientCO;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for BaasApi
 */
@Ignore
public class BaasApiTest {

    private final BaasApi api = new BaasApi();

    
    /**
     * create a Baas account
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBaasAccountUsingPostTest() throws ApiException {
        BaasAccountCO baasAccountCO = null;
        BaasAccountVO response = api.createBaasAccountUsingPost(baasAccountCO);

        // TODO: test validations
    }
    
    /**
     * Create a Baas Business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBaasBusinessUsingPostTest() throws ApiException {
        CreateBaasBusinessCO baasBusinessCO = null;
        BaasBusinessVO response = api.createBaasBusinessUsingPost(baasBusinessCO);

        // TODO: test validations
    }
    
    /**
     * Create a Baas Client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBaasClientUsingPostTest() throws ApiException {
        CreateBaasClientCO baasClientCO = null;
        BaasClientVO response = api.createBaasClientUsingPost(baasClientCO);

        // TODO: test validations
    }
    
    /**
     * create a Baas subaccount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createBaasSubAccountUsingPostTest() throws ApiException {
        BaasSubAccountCO baasSubAccountCO = null;
        BaasSubAccountVO response = api.createBaasSubAccountUsingPost(baasSubAccountCO);

        // TODO: test validations
    }
    
    /**
     * Get a Baas account statement
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaasAccountStatementUsingGetTest() throws ApiException {
        LocalDate endDate = null;
        UUID nucleusAccountId = null;
        LocalDate startDate = null;
        String statementType = null;
        BaasStatementsVO response = api.getBaasAccountStatementUsingGet(endDate, nucleusAccountId, startDate, statementType);

        // TODO: test validations
    }
    
    /**
     * Get a Baas portfolio balance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaasPortfolioBalanceUsingGetTest() throws ApiException {
        UUID nucleusPortfolioId = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        BaasBalanceVO response = api.getBaasPortfolioBalanceUsingGet(nucleusPortfolioId, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * Get a Baas portfolio transaction
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getBaasPortfolioTransactionUsingGetTest() throws ApiException {
        UUID nucleusPortfolioId = null;
        LocalDate endDate = null;
        LocalDate startDate = null;
        BaasTransactionsVO response = api.getBaasPortfolioTransactionUsingGet(nucleusPortfolioId, endDate, startDate);

        // TODO: test validations
    }
    
    /**
     * Update a Baas business
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBaasBusinessUsingPutTest() throws ApiException {
        UUID nucleusBusinessId = null;
        UpdateBaasBusinessCO baasBusinessCO = null;
        BaasBusinessVO response = api.updateBaasBusinessUsingPut(nucleusBusinessId, baasBusinessCO);

        // TODO: test validations
    }
    
    /**
     * Update a Baas client
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateBaasClientUsingPutTest() throws ApiException {
        UUID nucleusClientId = null;
        UpdateBaasClientCO baasClientCO = null;
        BaasClientVO response = api.updateBaasClientUsingPut(nucleusClientId, baasClientCO);

        // TODO: test validations
    }
    
}
