/*
 * Hydrogen Nucleus API
 * The Hydrogen Nucleus API
 *
 * OpenAPI spec version: 1.9.2
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.nucleus.api;

import com.hydrogen.nucleus.ApiException;
import com.hydrogen.nucleus.model.Account;
import com.hydrogen.nucleus.model.AccountAllocationMapping;
import com.hydrogen.nucleus.model.AccountPermissionVO;
import com.hydrogen.nucleus.model.AccountStatus;
import com.hydrogen.nucleus.model.AccountType;
import com.hydrogen.nucleus.model.AclClientPermissionVO;
import com.hydrogen.nucleus.model.AvailableDateDoubleVO;
import org.threeten.bp.LocalDate;
import com.hydrogen.nucleus.model.PageAccount;
import com.hydrogen.nucleus.model.PageAccountAllocationMapping;
import com.hydrogen.nucleus.model.PageAccountPermissionVO;
import com.hydrogen.nucleus.model.PageAccountStatus;
import com.hydrogen.nucleus.model.PageAccountType;
import com.hydrogen.nucleus.model.PagePortfolioHoldingAgg;
import com.hydrogen.nucleus.model.PagePortfolioTransaction;
import com.hydrogen.nucleus.model.Portfolio;
import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AccountApi
 */
@Ignore
public class AccountApiTest {

    private final AccountApi api = new AccountApi();

    
    /**
     * Create an account allocation
     *
     * Create an account-allocation mapping for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountAllocationMappingUsingPostTest() throws ApiException {
        AccountAllocationMapping allocRequest = null;
        AccountAllocationMapping response = api.createAccountAllocationMappingUsingPost(allocRequest);

        // TODO: test validations
    }
    
    /**
     * Create an account status
     *
     * Create an account status record for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountStatusUsingPostTest() throws ApiException {
        AccountStatus accountStatusRequest = null;
        AccountStatus response = api.createAccountStatusUsingPost(accountStatusRequest);

        // TODO: test validations
    }
    
    /**
     * Create an account type
     *
     * Create a new account type for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountTypeUsingPostTest() throws ApiException {
        AccountType accountTypeRequest = null;
        AccountType response = api.createAccountTypeUsingPost(accountTypeRequest);

        // TODO: test validations
    }
    
    /**
     * Create an account
     *
     * Create an account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createAccountUsingPostTest() throws ApiException {
        Account account = null;
        Account response = api.createAccountUsingPost(account);

        // TODO: test validations
    }
    
    /**
     * Delete an account allocation
     *
     * Permanently delete an account-allocation mapping for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountAllocationMappingUsingDeleteTest() throws ApiException {
        UUID accountAllocationId = null;
        api.deleteAccountAllocationMappingUsingDelete(accountAllocationId);

        // TODO: test validations
    }
    
    /**
     * Delete an account permission
     *
     * Delete an account permission
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountPermissionUsingDELETETest() throws ApiException {
        UUID accountId = null;
        AccountPermissionVO response = api.deleteAccountPermissionUsingDELETE(accountId);

        // TODO: test validations
    }
    
    /**
     * Delete an account status
     *
     * Permanently delete an account status record from an account’s history.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountStatusUsingDeleteTest() throws ApiException {
        UUID accountStatusId = null;
        api.deleteAccountStatusUsingDelete(accountStatusId);

        // TODO: test validations
    }
    
    /**
     * Delete an account type
     *
     * Permanently delete a possible account type defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountTypeUsingDeleteTest() throws ApiException {
        UUID accountTypeId = null;
        api.deleteAccountTypeUsingDelete(accountTypeId);

        // TODO: test validations
    }
    
    /**
     * Delete an account
     *
     * Permanently delete an account under a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAccountUsingDeleteTest() throws ApiException {
        UUID accountId = null;
        api.deleteAccountUsingDelete(accountId);

        // TODO: test validations
    }
    
    /**
     * List all accounts
     *
     * Get information for all accounts for all clients defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAccount response = api.getAccountAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all account allocations
     *
     * Get information for all account-allocation mappings for all accounts defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountAllocationMappingAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAccountAllocationMapping response = api.getAccountAllocationMappingAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an account allocation
     *
     * Retrieve the information for a specific account-allocation mapping for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountAllocationMappingUsingGetTest() throws ApiException {
        UUID accountAllocationId = null;
        AccountAllocationMapping response = api.getAccountAllocationMappingUsingGet(accountAllocationId);

        // TODO: test validations
    }
    
    /**
     * List all account asset sizes
     *
     * Get a list of asset sizes by date for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountAssetSizeAggAllUsingGetTest() throws ApiException {
        UUID accountId = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        Boolean excludeSubledger = null;
        Boolean getLatest = null;
        String sortType = null;
        LocalDate startDate = null;
        List<AvailableDateDoubleVO> response = api.getAccountAssetSizeAggAllUsingGet(accountId, currencyConversion, endDate, excludeSubledger, getLatest, sortType, startDate);

        // TODO: test validations
    }
    
    /**
     * List all Account overview
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountOverviewUsingGetTest() throws ApiException {
        UUID accountId = null;
        Boolean ascending = null;
        String orderBy = null;
        Object response = api.getAccountOverviewUsingGet(accountId, ascending, orderBy);

        // TODO: test validations
    }
    
    /**
     * Get an account permission
     *
     * Get an account permission
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountPermissionUsingGETTest() throws ApiException {
        UUID accountId = null;
        AccountPermissionVO response = api.getAccountPermissionUsingGET(accountId);

        // TODO: test validations
    }
    
    /**
     * List all account statuses
     *
     * Get the account status history information for all accounts.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountStatusAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAccountStatus response = api.getAccountStatusAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Retrieve an account status
     *
     * Retrieve the information for a specific account status record for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountStatusUsingGetTest() throws ApiException {
        UUID accountStatusId = null;
        AccountStatus response = api.getAccountStatusUsingGet(accountStatusId);

        // TODO: test validations
    }
    
    /**
     * List all account types
     *
     * List all account types defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTypeAllUsingGetTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAccountType response = api.getAccountTypeAllUsingGet(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * Get an Account Type
     *
     * Get an account types defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountTypeUsingGetTest() throws ApiException {
        UUID accountTypeId = null;
        AccountType response = api.getAccountTypeUsingGet(accountTypeId);

        // TODO: test validations
    }
    
    /**
     * Retrieve an account
     *
     * Retrieve the information for a specific account associated with a client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAccountUsingGetTest() throws ApiException {
        UUID accountId = null;
        Account response = api.getAccountUsingGet(accountId);

        // TODO: test validations
    }
    
    /**
     * List all account permission
     *
     * List all account permission
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAllAccountPermissionUsingGETTest() throws ApiException {
        Boolean ascending = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        PageAccountPermissionVO response = api.getAllAccountPermissionUsingGET(ascending, filter, orderBy, page, size);

        // TODO: test validations
    }
    
    /**
     * List all account holdings
     *
     * Get information for all the securities that are currently being held by an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioHoldingAggAllUsingGetTest() throws ApiException {
        UUID accountId = null;
        Boolean ascending = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        String filter = null;
        Boolean getLatest = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        LocalDate startDate = null;
        PagePortfolioHoldingAgg response = api.getPortfolioHoldingAggAllUsingGet(accountId, ascending, currencyConversion, endDate, filter, getLatest, orderBy, page, size, startDate);

        // TODO: test validations
    }
    
    /**
     * List all account transactions
     *
     * Get the information for all transactions for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getPortfolioTransactionAggAllUsingGetTest() throws ApiException {
        UUID accountId = null;
        Boolean ascending = null;
        String currencyConversion = null;
        LocalDate endDate = null;
        String filter = null;
        String orderBy = null;
        Integer page = null;
        Integer size = null;
        LocalDate startDate = null;
        PagePortfolioTransaction response = api.getPortfolioTransactionAggAllUsingGet(accountId, ascending, currencyConversion, endDate, filter, orderBy, page, size, startDate);

        // TODO: test validations
    }
    
    /**
     * create an account permission
     *
     * create an account permission
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void insertAccountAndRelatedPermissionUsingPOSTTest() throws ApiException {
        AclClientPermissionVO aclClientPermissionVO = null;
        AccountPermissionVO response = api.insertAccountAndRelatedPermissionUsingPOST(aclClientPermissionVO);

        // TODO: test validations
    }
    
    /**
     * Subscribe an account
     *
     * After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void subscribeAccountUsingPostTest() throws ApiException {
        UUID accountId = null;
        AccountAllocationMapping allocRequest = null;
        List<Portfolio> response = api.subscribeAccountUsingPost(accountId, allocRequest);

        // TODO: test validations
    }
    
    /**
     * Update an account allocation
     *
     * Update the information for an account-allocation mapping.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountAllocationMappingUsingPutTest() throws ApiException {
        UUID accountAllocationId = null;
        Object accountAllocationMapping = null;
        AccountAllocationMapping response = api.updateAccountAllocationMappingUsingPut(accountAllocationId, accountAllocationMapping);

        // TODO: test validations
    }
    
    /**
     * Update an account status
     *
     * Update an account status record for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountStatusUsingPutTest() throws ApiException {
        Object accountStatus = null;
        UUID accountStatusId = null;
        AccountStatus response = api.updateAccountStatusUsingPut(accountStatus, accountStatusId);

        // TODO: test validations
    }
    
    /**
     * Update an account type
     *
     * Update the information for a possible account type defined for your firm.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountTypeUsingPutTest() throws ApiException {
        Object accountType = null;
        UUID accountTypeId = null;
        AccountType response = api.updateAccountTypeUsingPut(accountType, accountTypeId);

        // TODO: test validations
    }
    
    /**
     * Update an account
     *
     * Update the information for an account.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAccountUsingPutTest() throws ApiException {
        Object account = null;
        UUID accountId = null;
        Account response = api.updateAccountUsingPut(account, accountId);

        // TODO: test validations
    }
    
    /**
     * Update an account permission
     *
     * Update an account permission
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateClientAccountPermissionUsingPUTTest() throws ApiException {
        UUID accountId = null;
        Object aclClientPermissionVO = null;
        AccountPermissionVO response = api.updateClientAccountPermissionUsingPUT(accountId, aclClientPermissionVO);

        // TODO: test validations
    }
    
}
