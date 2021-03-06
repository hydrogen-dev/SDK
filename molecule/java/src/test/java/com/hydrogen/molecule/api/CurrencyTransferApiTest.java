/*
 * Molecule API Documentation
 * The Hydrogen Molecule API
 *
 * OpenAPI spec version: 1.3.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.molecule.api;

import com.hydrogen.molecule.ApiException;
import com.hydrogen.molecule.model.CurrencyTransferParams;
import com.hydrogen.molecule.model.CurrencyTransferResponse;
import com.hydrogen.molecule.model.PageCurrencyTransferResponse;
import com.hydrogen.molecule.model.TransactionSuccessResponse;

import java.util.UUID;
import org.junit.Test;
import org.junit.Ignore;

/**
 * API tests for CurrencyTransferApi
 */
@Ignore
public class CurrencyTransferApiTest {

    private final CurrencyTransferApi api = new CurrencyTransferApi();

    
    /**
     * Creates Currency Transfer record
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createCurrencyTransferUsingPostTest() throws ApiException {
        CurrencyTransferParams currencyTransferParams = null;
        TransactionSuccessResponse response = api.createCurrencyTransferUsingPost(currencyTransferParams);

        // TODO: test validations
    }
    
    /**
     * Fetch Currency Transfer record list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTransferAllUsingGetTest() throws ApiException {
        UUID walletId = null;
        UUID currencyId = null;
        Integer page = null;
        Integer size = null;
        String orderBy = null;
        Boolean ascending = null;
        Boolean getLatest = null;
        PageCurrencyTransferResponse response = api.getCurrencyTransferAllUsingGet(walletId, currencyId, page, size, orderBy, ascending, getLatest);

        // TODO: test validations
    }
    
    /**
     * Fetch Currency Transfer record details
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getCurrencyTransferUsingGetTest() throws ApiException {
        UUID currencyTransferId = null;
        CurrencyTransferResponse response = api.getCurrencyTransferUsingGet(currencyTransferId);

        // TODO: test validations
    }
    
}
