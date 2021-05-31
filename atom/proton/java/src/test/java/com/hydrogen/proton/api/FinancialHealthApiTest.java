/*
 * Hydrogen Proton API
 * Financial engineering module of Hydrogen Atom
 *
 * OpenAPI spec version: 1.9.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hydrogen.proton.api;

import com.hydrogen.proton.model.FinancialHealthCheckRequest;
import com.hydrogen.proton.ApiException;
import com.hydrogen.proton.model.DiversificationScoreRequest;
import com.hydrogen.proton.model.EmergencyFundCalculatorRequest;
import com.hydrogen.proton.model.PortfolioOptimizationScoreRequest;
import org.junit.Test;
import org.junit.Ignore;

import java.util.Map;

/**
 * API tests for FinancialHealthApi
 */
@Ignore
public class FinancialHealthApiTest {

    private final FinancialHealthApi api = new FinancialHealthApi();

    
    /**
     * Diversification Score
     *
     * Assess how well a group of investments is diversified
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void diversificationScoreTest() throws ApiException {
        DiversificationScoreRequest diversificationScoreRequest = null;
        Map<String, Object> response = api.diversificationScore(diversificationScoreRequest);

        // TODO: test validations
    }
    
    /**
     * Emergency Fund Calculator
     *
     * Calculate a target emergency fund amount and savings plan
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emergencyFundCalculatorTest() throws ApiException {
        EmergencyFundCalculatorRequest emergencyFundCalculatorRequest = null;
        Map<String, Object> response = api.emergencyFundCalculator(emergencyFundCalculatorRequest);

        // TODO: test validations
    }
    
    /**
     * Financial Health Check
     *
     * Calculate a series of financial ratios to assess financial health
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void financialHealthCheckTest() throws ApiException {
        FinancialHealthCheckRequest financialHealthCheckRequest = null;
        Map<String, Object> response = api.financialHealthCheck(financialHealthCheckRequest);

        // TODO: test validations
    }
    
    /**
     * Portfolio Optimization Score
     *
     * Analyze a group of investments against the optimized result
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void portfolioOptimizationScoreTest() throws ApiException {
        PortfolioOptimizationScoreRequest portfolioOptimizationScoreRequest = null;
        Map<String, Object> response = api.portfolioOptimizationScore(portfolioOptimizationScoreRequest);

        // TODO: test validations
    }
    
}
