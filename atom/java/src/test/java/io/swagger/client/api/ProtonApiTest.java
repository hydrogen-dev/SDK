/*
 * Hydrogen Atom API
 * The Hydrogen Atom API
 *
 * OpenAPI spec version: 1.0.0
 * Contact: info@hydrogenplatform.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

import atom_api.ApiException;
import io.swagger.client.model.AnnuityAccumulationResponse;
import io.swagger.client.model.AnnuityAmountResponse;
import io.swagger.client.model.AnnuityCalculatorAccumulationHorizon;
import io.swagger.client.model.AnnuityCalculatorAnnuityAmount;
import io.swagger.client.model.AnnuityCalculatorDecumulationHorizon;
import io.swagger.client.model.AnnuityCalculatorDepositAmount;
import io.swagger.client.model.AnnuityCalculatorInitialBalance;
import io.swagger.client.model.AnnuityDecumulationResponse;
import io.swagger.client.model.AnnuityDepositamountResponse;
import io.swagger.client.model.AnnuityInitialbalanceResponse;
import io.swagger.client.model.Backtest;
import io.swagger.client.model.BacktestResponse;
import io.swagger.client.model.DimRiskScoreResponse;
import io.swagger.client.model.DimensionalRiskScore;
import io.swagger.client.model.DiversificationScore;
import io.swagger.client.model.EducationCalculatorAnnualCost;
import io.swagger.client.model.EducationCalculatorAnnualcostResponse;
import io.swagger.client.model.EducationCalculatorDepositAmount;
import io.swagger.client.model.EducationCalculatorDepositamountResponse;
import io.swagger.client.model.EducationCalculatorPctcoveredResponse;
import io.swagger.client.model.EducationCalculatorPercentCovered;
import io.swagger.client.model.EmergencyFundCalculator;
import io.swagger.client.model.EmergencyFundResponse;
import io.swagger.client.model.EventStudy;
import io.swagger.client.model.EventStudyResponse;
import io.swagger.client.model.FinancialHealthCheck;
import io.swagger.client.model.GoalAccumulationAllocation;
import io.swagger.client.model.GoalAccumulationRecommendation;
import io.swagger.client.model.GoalAccumulationStatus;
import io.swagger.client.model.GoalAllocationResponse;
import io.swagger.client.model.GoalDecumulationAllocation;
import io.swagger.client.model.GoalDecumulationRecommendation;
import io.swagger.client.model.GoalDecumulationStatus;
import io.swagger.client.model.GoalRecommendationResponse;
import io.swagger.client.model.GoalStatusResponse;
import io.swagger.client.model.HealthCheckResponse;
import io.swagger.client.model.LifeInsuranceCalculator;
import io.swagger.client.model.LifeInsuranceNeedsResponse;
import io.swagger.client.model.MonteCarlo;
import io.swagger.client.model.MonteCarloResponse;
import io.swagger.client.model.MortgageCalculatorDownPayment;
import io.swagger.client.model.MortgageCalculatorDownpaymentResponse;
import io.swagger.client.model.MortgageCalculatorHomePrice;
import io.swagger.client.model.MortgageCalculatorHomepriceResponse;
import io.swagger.client.model.MortgageCalculatorPeriodicPayment;
import io.swagger.client.model.MortgageCalculatorPeriodicpaymentResponse;
import io.swagger.client.model.MvoResponse;
import io.swagger.client.model.OptConfigPortfolio;
import io.swagger.client.model.OptimizationScore;
import io.swagger.client.model.PfloDiversificationScoreResponse;
import io.swagger.client.model.PfloOptimizationScoreResponse;
import io.swagger.client.model.PortfolioWhatIfResponse;
import io.swagger.client.model.PurchaseCalculatorAmount;
import io.swagger.client.model.PurchaseCalculatorDepositAmount;
import io.swagger.client.model.PurchaseCalculatorDepositamountResponse;
import io.swagger.client.model.PurchaseCalculatorHorizon;
import io.swagger.client.model.PurchaseCalculatorPurchaseamountResponse;
import io.swagger.client.model.PurchaseCalculatorPurchasehorizonResponse;
import io.swagger.client.model.Rebalance;
import io.swagger.client.model.RebalanceResponse;
import io.swagger.client.model.RetirementCalculatorDepositAmount;
import io.swagger.client.model.RetirementCalculatorDepositamountResponse;
import io.swagger.client.model.RetirementCalculatorExpenses;
import io.swagger.client.model.RetirementCalculatorExpensesResponse;
import io.swagger.client.model.RetirementCalculatorPctcoveredResponse;
import io.swagger.client.model.RetirementCalculatorPercentCovered;
import io.swagger.client.model.RiskAllocation;
import io.swagger.client.model.RiskAllocationResponse;
import io.swagger.client.model.RiskScore;
import io.swagger.client.model.RiskScoreResponse;
import io.swagger.client.model.SavingsCalculatorResponse;
import io.swagger.client.model.ScenarioAnalysis;
import io.swagger.client.model.ScenarioAnalysisResponse;
import io.swagger.client.model.SensitivityAnalysis;
import io.swagger.client.model.SensitivityAnalysisResponse;
import io.swagger.client.model.SimpleSavingsCalculator;
import io.swagger.client.model.WhatIfPortfolio;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProtonApi
 */
@Ignore
public class ProtonApiTest {

    private final ProtonApi api = new ProtonApi();

    
    /**
     * Annuity calculator - accumulation horizon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annuityCalculatorAccumulationHorizonTest() throws ApiException {
        AnnuityCalculatorAccumulationHorizon payload = null;
        AnnuityAccumulationResponse response = api.annuityCalculatorAccumulationHorizon(payload);

        // TODO: test validations
    }
    
    /**
     * Annuity calculator - annuity amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annuityCalculatorAnnuityAmountTest() throws ApiException {
        AnnuityCalculatorAnnuityAmount payload = null;
        AnnuityAmountResponse response = api.annuityCalculatorAnnuityAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Annuity calculator - decumulation horizon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annuityCalculatorDecumulationHorizonTest() throws ApiException {
        AnnuityCalculatorDecumulationHorizon payload = null;
        AnnuityDecumulationResponse response = api.annuityCalculatorDecumulationHorizon(payload);

        // TODO: test validations
    }
    
    /**
     * Annuity calculator - deposit amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annuityCalculatorDepositAmountTest() throws ApiException {
        AnnuityCalculatorDepositAmount payload = null;
        AnnuityDepositamountResponse response = api.annuityCalculatorDepositAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Annuity calculator - initial balance
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void annuityCalculatorInitialBalanceTest() throws ApiException {
        AnnuityCalculatorInitialBalance payload = null;
        AnnuityInitialbalanceResponse response = api.annuityCalculatorInitialBalance(payload);

        // TODO: test validations
    }
    
    /**
     * Dimensional risk score
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dimensionalRiskScoreTest() throws ApiException {
        DimensionalRiskScore payload = null;
        DimRiskScoreResponse response = api.dimensionalRiskScore(payload);

        // TODO: test validations
    }
    
    /**
     * Education calculator - total annual cost
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void educationCalculatorAnnualCostTest() throws ApiException {
        EducationCalculatorAnnualCost payload = null;
        EducationCalculatorAnnualcostResponse response = api.educationCalculatorAnnualCost(payload);

        // TODO: test validations
    }
    
    /**
     * Education calculator - deposit amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void educationCalculatorDepositAmountTest() throws ApiException {
        EducationCalculatorDepositAmount payload = null;
        EducationCalculatorDepositamountResponse response = api.educationCalculatorDepositAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Education calculator - percent covered
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void educationCalculatorPercentCoveredTest() throws ApiException {
        EducationCalculatorPercentCovered payload = null;
        EducationCalculatorPctcoveredResponse response = api.educationCalculatorPercentCovered(payload);

        // TODO: test validations
    }
    
    /**
     * Emergency fund calculator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void emergencyFundCalculatorTest() throws ApiException {
        EmergencyFundCalculator payload = null;
        EmergencyFundResponse response = api.emergencyFundCalculator(payload);

        // TODO: test validations
    }
    
    /**
     * Event study
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void eventStudyTest() throws ApiException {
        EventStudy payload = null;
        EventStudyResponse response = api.eventStudy(payload);

        // TODO: test validations
    }
    
    /**
     * Financial health check
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void financialHealthCheckTest() throws ApiException {
        FinancialHealthCheck payload = null;
        HealthCheckResponse response = api.financialHealthCheck(payload);

        // TODO: test validations
    }
    
    /**
     * Goal accumulation allocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalAccumulationAllocationTest() throws ApiException {
        GoalAccumulationAllocation payload = null;
        GoalAllocationResponse response = api.goalAccumulationAllocation(payload);

        // TODO: test validations
    }
    
    /**
     * Goal accumulation recommendation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalAccumulationRecommendationTest() throws ApiException {
        GoalAccumulationRecommendation payload = null;
        GoalRecommendationResponse response = api.goalAccumulationRecommendation(payload);

        // TODO: test validations
    }
    
    /**
     * Goal accumulation status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalAccumulationStatusTest() throws ApiException {
        GoalAccumulationStatus payload = null;
        GoalStatusResponse response = api.goalAccumulationStatus(payload);

        // TODO: test validations
    }
    
    /**
     * Goal decumulation allocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalDecumulationAllocationTest() throws ApiException {
        GoalDecumulationAllocation payload = null;
        GoalAllocationResponse response = api.goalDecumulationAllocation(payload);

        // TODO: test validations
    }
    
    /**
     * Goal decumulation recommendation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalDecumulationRecommendationTest() throws ApiException {
        GoalDecumulationRecommendation payload = null;
        GoalRecommendationResponse response = api.goalDecumulationRecommendation(payload);

        // TODO: test validations
    }
    
    /**
     * Goal decumulation status
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void goalDecumulationStatusTest() throws ApiException {
        GoalDecumulationStatus payload = null;
        GoalStatusResponse response = api.goalDecumulationStatus(payload);

        // TODO: test validations
    }
    
    /**
     * Life insurance needs calculator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void lifeInsuranceNeedsCalculatorTest() throws ApiException {
        LifeInsuranceCalculator payload = null;
        LifeInsuranceNeedsResponse response = api.lifeInsuranceNeedsCalculator(payload);

        // TODO: test validations
    }
    
    /**
     * Model backtest
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void modelBacktestTest() throws ApiException {
        Backtest payload = null;
        BacktestResponse response = api.modelBacktest(payload);

        // TODO: test validations
    }
    
    /**
     * Monte Carlo
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void monteCarloTest() throws ApiException {
        MonteCarlo payload = null;
        MonteCarloResponse response = api.monteCarlo(payload);

        // TODO: test validations
    }
    
    /**
     * Mortgage calculator - down payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mortgageCalculatorDownPaymentTest() throws ApiException {
        MortgageCalculatorDownPayment payload = null;
        MortgageCalculatorDownpaymentResponse response = api.mortgageCalculatorDownPayment(payload);

        // TODO: test validations
    }
    
    /**
     * Mortgage calculator - home price
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mortgageCalculatorHomePriceTest() throws ApiException {
        MortgageCalculatorHomePrice payload = null;
        MortgageCalculatorHomepriceResponse response = api.mortgageCalculatorHomePrice(payload);

        // TODO: test validations
    }
    
    /**
     * Mortgage calculator - periodic payment
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mortgageCalculatorPeriodicPaymentTest() throws ApiException {
        MortgageCalculatorPeriodicPayment payload = null;
        MortgageCalculatorPeriodicpaymentResponse response = api.mortgageCalculatorPeriodicPayment(payload);

        // TODO: test validations
    }
    
    /**
     * Mean-variance optimization
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void mvoTest() throws ApiException {
        OptConfigPortfolio payload = null;
        MvoResponse response = api.mvo(payload);

        // TODO: test validations
    }
    
    /**
     * Portfolio diversification score
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void portfolioDiversificationScoreTest() throws ApiException {
        DiversificationScore payload = null;
        PfloDiversificationScoreResponse response = api.portfolioDiversificationScore(payload);

        // TODO: test validations
    }
    
    /**
     * Portfolio optimization score
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void portfolioOptimizationScoreTest() throws ApiException {
        OptimizationScore payload = null;
        PfloOptimizationScoreResponse response = api.portfolioOptimizationScore(payload);

        // TODO: test validations
    }
    
    /**
     * Portfolio what-if
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void portfolioWhatIfTest() throws ApiException {
        WhatIfPortfolio payload = null;
        PortfolioWhatIfResponse response = api.portfolioWhatIf(payload);

        // TODO: test validations
    }
    
    /**
     * Purchase calculator - deposit amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purchaseCalculatorDepositAmountTest() throws ApiException {
        PurchaseCalculatorDepositAmount payload = null;
        PurchaseCalculatorDepositamountResponse response = api.purchaseCalculatorDepositAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Purchase calculator - horizon
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purchaseCalculatorHorizonTest() throws ApiException {
        PurchaseCalculatorHorizon payload = null;
        PurchaseCalculatorPurchasehorizonResponse response = api.purchaseCalculatorHorizon(payload);

        // TODO: test validations
    }
    
    /**
     * Purchase calculator - purchase amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void purchaseCalculatorPurchaseAmountTest() throws ApiException {
        PurchaseCalculatorAmount payload = null;
        PurchaseCalculatorPurchaseamountResponse response = api.purchaseCalculatorPurchaseAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Rebalancing
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void rebalancingSignalTest() throws ApiException {
        Rebalance payload = null;
        RebalanceResponse response = api.rebalancingSignal(payload);

        // TODO: test validations
    }
    
    /**
     * Retirement calculator - deposit amount
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retirementCalculatorDepositAmountTest() throws ApiException {
        RetirementCalculatorDepositAmount payload = null;
        RetirementCalculatorDepositamountResponse response = api.retirementCalculatorDepositAmount(payload);

        // TODO: test validations
    }
    
    /**
     * Retirement calculator - expenses
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retirementCalculatorExpensesTest() throws ApiException {
        RetirementCalculatorExpenses payload = null;
        RetirementCalculatorExpensesResponse response = api.retirementCalculatorExpenses(payload);

        // TODO: test validations
    }
    
    /**
     * Retirement calculator - percent of costs covered
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void retirementCalculatorPercentCoveredTest() throws ApiException {
        RetirementCalculatorPercentCovered payload = null;
        RetirementCalculatorPctcoveredResponse response = api.retirementCalculatorPercentCovered(payload);

        // TODO: test validations
    }
    
    /**
     * Risk allocation
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void riskAllocationTest() throws ApiException {
        RiskAllocation payload = null;
        RiskAllocationResponse response = api.riskAllocation(payload);

        // TODO: test validations
    }
    
    /**
     * Risk score
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void riskScoreTest() throws ApiException {
        RiskScore payload = null;
        RiskScoreResponse response = api.riskScore(payload);

        // TODO: test validations
    }
    
    /**
     * Savings calculator
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void savingsCalculatorTest() throws ApiException {
        SimpleSavingsCalculator payload = null;
        SavingsCalculatorResponse response = api.savingsCalculator(payload);

        // TODO: test validations
    }
    
    /**
     * Scenario analysis
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scenarioAnalysisTest() throws ApiException {
        ScenarioAnalysis payload = null;
        ScenarioAnalysisResponse response = api.scenarioAnalysis(payload);

        // TODO: test validations
    }
    
    /**
     * Sensitivity analysis
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void sensitivityAnalysisTest() throws ApiException {
        SensitivityAnalysis payload = null;
        SensitivityAnalysisResponse response = api.sensitivityAnalysis(payload);

        // TODO: test validations
    }
    
}