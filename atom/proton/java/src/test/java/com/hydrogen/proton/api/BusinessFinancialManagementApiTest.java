/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.1
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.api;

import com.hydrogen.proton.ApiException;
import com.hydrogen.proton.model.BusinessFinancialHealthCheckRequest;
import com.hydrogen.proton.model.BusinessInvoiceAnalysisRequest;
import com.hydrogen.proton.model.CashAnalysisRequest;
import com.hydrogen.proton.model.CustomerAnalysisRequest;
import com.hydrogen.proton.model.FinancialStatementAnalysisRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Map;

/**
 * API tests for BusinessFinancialManagementApi
 */
@Ignore
public class BusinessFinancialManagementApiTest {

    private final BusinessFinancialManagementApi api = new BusinessFinancialManagementApi();

    
    /**
     * Business Financial Health Check
     *
     * Calculate a series of financial ratios to assess business financial health
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void businessFinancialHealthCheckTest() throws ApiException {
        BusinessFinancialHealthCheckRequest businessFinancialHealthCheckRequest = null;
        Map<String, Object> response = api.businessFinancialHealthCheck(businessFinancialHealthCheckRequest);

        // TODO: test validations
    }
    
    /**
     * Cash Analysis
     *
     * Analyze cash activity over time
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void cashAnalysisTest() throws ApiException {
        CashAnalysisRequest cashAnalysisRequest = null;
        Map<String, Object> response = api.cashAnalysis(cashAnalysisRequest);

        // TODO: test validations
    }
    
    /**
     * Customer Analysis
     *
     * Analyze customer revenues over a time period
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void customerAnalysisTest() throws ApiException {
        CustomerAnalysisRequest customerAnalysisRequest = null;
        Map<String, Object> response = api.customerAnalysis(customerAnalysisRequest);

        // TODO: test validations
    }
    
    /**
     * Financial Statement Analysis
     *
     * Analyze financial statement accounting data for a business
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void financialStatementAnalysisTest() throws ApiException {
        FinancialStatementAnalysisRequest financialStatementAnalysisRequest = null;
        Map<String, Object> response = api.financialStatementAnalysis(financialStatementAnalysisRequest);

        // TODO: test validations
    }
    
    /**
     * Invoice Analysis
     *
     * Analyze invoices to understand the context of money owed and paid to a business
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invoiceAnalysisTest() throws ApiException {
        BusinessInvoiceAnalysisRequest invoiceAnalysisRequest = null;
        Map<String, Object> response = api.invoiceAnalysis(invoiceAnalysisRequest);

        // TODO: test validations
    }
    
}
