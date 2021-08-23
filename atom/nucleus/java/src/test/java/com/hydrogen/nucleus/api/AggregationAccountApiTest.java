/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.4
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.AggregationAccount;
import com.hydrogen.nucleus.model.AggregationAccountBalance;
import com.hydrogen.nucleus.model.AggregationAccountHolding;
import com.hydrogen.nucleus.model.AggregationAccountTransaction;
import com.hydrogen.nucleus.model.PageAggregationAccount;
import com.hydrogen.nucleus.model.PageAggregationAccountBalance;
import com.hydrogen.nucleus.model.PageAggregationAccountHolding;
import com.hydrogen.nucleus.model.PageAggregationAccountTransaction;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AggregationAccountApi
 */
@Ignore
public class AggregationAccountApiTest {

    private final AggregationAccountApi api = new AggregationAccountApi();

    
    /**
     * Create a bulk aggregation account balance
     *
     * Create a balance records under an aggregation accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountBalanceBulkUsingPostTest() throws ApiException {
        List<AggregationAccountBalance> aggregationAccountBalance = null;
        List<AggregationAccountBalance> response = api.createAggregationAccountBalanceBulkUsingPost(aggregationAccountBalance);

        // TODO: test validations
    }
    
    /**
     * Create an aggregation account balance
     *
     * Create a balance record under an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountBalanceUsingPostTest() throws ApiException {
        AggregationAccountBalance aggregationAccountBalance = null;
        AggregationAccountBalance response = api.createAggregationAccountBalanceUsingPost(aggregationAccountBalance);

        // TODO: test validations
    }
    
    /**
     * Create a bulk aggregation account
     *
     * Create a bulk aggregation account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountBulkUsingPostTest() throws ApiException {
        List<AggregationAccount> aggregationAccountList = null;
        List<AggregationAccount> response = api.createAggregationAccountBulkUsingPost(aggregationAccountList);

        // TODO: test validations
    }
    
    /**
     * Create a bulk aggregation account holding
     *
     * Create a bulk aggregation account holding.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountHoldingBulkUsingPostTest() throws ApiException {
        List<AggregationAccountHolding> aggregationTransaction = null;
        List<AggregationAccountHolding> response = api.createAggregationAccountHoldingBulkUsingPost(aggregationTransaction);

        // TODO: test validations
    }
    
    /**
     * Create an aggregation account holding
     *
     * Create a holding record under an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountHoldingUsingPostTest() throws ApiException {
        AggregationAccountHolding aggregationAccountHolding = null;
        AggregationAccountHolding response = api.createAggregationAccountHoldingUsingPost(aggregationAccountHolding);

        // TODO: test validations
    }
    
    /**
     * Create a bulk aggregation account transaction
     *
     * Create a bulk transaction record under an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountTransactionBulkUsingPostTest() throws ApiException {
        List<AggregationAccountTransaction> aggregationAccountTransactions = null;
        List<AggregationAccountTransaction> response = api.createAggregationAccountTransactionBulkUsingPost(aggregationAccountTransactions);

        // TODO: test validations
    }
    
    /**
     * Create an aggregation account transaction
     *
     * Create a transaction record under an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountTransactionUsingPostTest() throws ApiException {
        AggregationAccountTransaction aggregationAccountTransaction = null;
        AggregationAccountTransaction response = api.createAggregationAccountTransactionUsingPost(aggregationAccountTransaction);

        // TODO: test validations
    }
    
    /**
     * Create an aggregation account
     *
     * Create an aggregation account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAggregationAccountUsingPostTest() throws ApiException {
        AggregationAccount aggregationAccount = null;
        AggregationAccount response = api.createAggregationAccountUsingPost(aggregationAccount);

        // TODO: test validations
    }
    
    /**
     * Delete an aggregation account balance
     *
     * Permanently delete a balance record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAggregationAccountBalanceUsingDeleteTest() throws ApiException {
        UUID aggregationAccountBalanceId = null;
        api.deleteAggregationAccountBalanceUsingDelete(aggregationAccountBalanceId);

        // TODO: test validations
    }
    
    /**
     * Delete an aggregation account holding
     *
     * Permanently delete a holding record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAggregationAccountHoldingUsingDeleteTest() throws ApiException {
        UUID aggregationAccountHoldingId = null;
        api.deleteAggregationAccountHoldingUsingDelete(aggregationAccountHoldingId);

        // TODO: test validations
    }
    
    /**
     * Delete an aggregation account transaction
     *
     * Permanently delete a transaction record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAggregationAccountTransactionUsingDeleteTest() throws ApiException {
        UUID aggregationAccountTransactionId = null;
        api.deleteAggregationAccountTransactionUsingDelete(aggregationAccountTransactionId);

        // TODO: test validations
    }
    
    /**
     * Delete an aggregation account
     *
     * Permanently delete an aggregation account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAggregationAccountUsingDeleteTest() throws ApiException {
        UUID aggregationAccountId = null;
        api.deleteAggregationAccountUsingDelete(aggregationAccountId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account aggregate data
     *
     * Retrieve the information for a specific aggregation account associated with a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountAggregateDataUsingGetTest() throws ApiException {
        UUID aggregationAccountId = null;
        String currencyConversion = null;
        Object response = api.getAggregationAccountAggregateDataUsingGet(aggregationAccountId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * List all aggregation accounts
     *
     * Get information for all aggregation accounts for all clients defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAggregationAccount response = api.getAggregationAccountAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all aggregation account balances
     *
     * Get all of the balance records for all aggregation accounts defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountBalanceAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAggregationAccountBalance response = api.getAggregationAccountBalanceAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account balance
     *
     * Retrieve the information for a specific balance record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountBalanceUsingGetTest() throws ApiException {
        UUID aggregationAccountBalanceId = null;
        String currencyConversion = null;
        AggregationAccountBalance response = api.getAggregationAccountBalanceUsingGet(aggregationAccountBalanceId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * List all aggregation account holdings
     *
     * Get all of the holding records for all aggregation accounts defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountHoldingAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAggregationAccountHolding response = api.getAggregationAccountHoldingAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account holding
     *
     * Retrieve the information for a specific holding record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountHoldingUsingGetTest() throws ApiException {
        UUID aggregationAccountHoldingId = null;
        String currencyConversion = null;
        AggregationAccountHolding response = api.getAggregationAccountHoldingUsingGet(aggregationAccountHoldingId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account aggregate data
     *
     * Retrieve the information for a specific aggregation account with aggregate data for a business.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountOverviewByBusinessIdUsingGetTest() throws ApiException {
        UUID businessId = null;
        String currencyConversion = null;
        Object response = api.getAggregationAccountOverviewByBusinessIdUsingGet(businessId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account aggregate data
     *
     * Retrieve the information for a specific aggregation account with aggregate data for a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountOverviewUsingGetTest() throws ApiException {
        UUID clientId = null;
        String currencyConversion = null;
        Object response = api.getAggregationAccountOverviewUsingGet(clientId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * List all aggregation account transactions
     *
     * Get all of the transaction records for all aggregation accounts defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountTransactionAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String currencyConversion = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAggregationAccountTransaction response = api.getAggregationAccountTransactionAllUsingGet(ascending, currencyConversion, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account transaction
     *
     * Retrieve the information for a specific transaction record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountTransactionUsingGetTest() throws ApiException {
        UUID aggregationAccountTransactionId = null;
        String currencyConversion = null;
        AggregationAccountTransaction response = api.getAggregationAccountTransactionUsingGet(aggregationAccountTransactionId, currencyConversion);

        // TODO: test validations
    }
    
    /**
     * Retrieve an aggregation account
     *
     * Retrieve the information for a specific aggregation account associated with a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAggregationAccountUsingGetTest() throws ApiException {
        UUID aggregationAccountId = null;
        AggregationAccount response = api.getAggregationAccountUsingGet(aggregationAccountId);

        // TODO: test validations
    }
    
    /**
     * Update an aggregation account balance
     *
     * Update a balance record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountBalanceUsingPutTest() throws ApiException {
        Object aggregationAccountBalance = null;
        UUID aggregationAccountBalanceId = null;
        AggregationAccountBalance response = api.updateAggregationAccountBalanceUsingPut(aggregationAccountBalance, aggregationAccountBalanceId);

        // TODO: test validations
    }
    
    /**
     * Update a bulk aggregation account
     *
     * Update a bulk aggregation account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountBulkUsingPutTest() throws ApiException {
        List<Object> aggregationAccountList = null;
        List<AggregationAccount> response = api.updateAggregationAccountBulkUsingPut(aggregationAccountList);

        // TODO: test validations
    }
    
    /**
     * Update an bulk aggregation account holding
     *
     * Update a bulk holding record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountHoldingBulkUsingPutTest() throws ApiException {
        List<Object> aggregationAccountHolding = null;
        List<AggregationAccountHolding> response = api.updateAggregationAccountHoldingBulkUsingPut(aggregationAccountHolding);

        // TODO: test validations
    }
    
    /**
     * Update an aggregation account holding
     *
     * Update a holding record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountHoldingUsingPutTest() throws ApiException {
        Object aggregationAccountHolding = null;
        UUID aggregationAccountHoldingId = null;
        AggregationAccountHolding response = api.updateAggregationAccountHoldingUsingPut(aggregationAccountHolding, aggregationAccountHoldingId);

        // TODO: test validations
    }
    
    /**
     * Update an aggregation account transaction
     *
     * Update a transaction record for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountTransactionUsingPutTest() throws ApiException {
        Object aggregationAccountTransaction = null;
        UUID aggregationAccountTransactionId = null;
        AggregationAccountTransaction response = api.updateAggregationAccountTransactionUsingPut(aggregationAccountTransaction, aggregationAccountTransactionId);

        // TODO: test validations
    }
    
    /**
     * Update an aggregation account
     *
     * Update the information for an aggregation account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAggregationAccountUsingPutTest() throws ApiException {
        Object aggregationAccount = null;
        UUID aggregationAccountId = null;
        AggregationAccount response = api.updateAggregationAccountUsingPut(aggregationAccount, aggregationAccountId);

        // TODO: test validations
    }
    
}
