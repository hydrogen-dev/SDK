# hydrogen_proton_api

Hydrogen Proton API
- API version: 1.7.18
  - Build date: 2020-05-29T05:03:35.524Z

Financial engineering module of Hydrogen Atom

  For more information, please visit [https://www.hydrogenplatform.com/contact](https://www.hydrogenplatform.com/contact)

*Automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

### Update Base Path 
Follow steps to verify the base URL path:
1. Go to ApiClient file located under src folder.
2.  Search for basePath and change/verify the URL according to the environment.
**Sandbox Base URL**
https://sandbox.hydrogenplatform.com/proton/v1
**Production Base URL**
https://api.hydrogenplatform.com/proton/v1

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.hydrogen</groupId>
  <artifactId>hydrogen_proton_api</artifactId>
  <version>1.7.18</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.hydrogen:hydrogen_proton_api:1.7.18"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/hydrogen_proton_api-1.0.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.hydrogen.ApiException;
import com.hydrogen.AuthApiClient;
import com.hydrogen.model.AnnuityCalculatorAccumulationHorizonRequest;
import com.hydrogen.*;
import com.hydrogen.api.AnnuitiesApi;

import java.util.*;

public class AnnuitiesApiExample {

    public static void main(String[] args) {
        AuthApiClient authApiClient = new AuthApiClient();
        try {
        //          Use one of the below method to generate oauth token        
        //          Creating a token for grant_type=client_credentials            
            authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
        //          Creating a token for grant_type=password
            authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                                    "USERNAME", "PASSWORD");           
        } catch (ApiException e) {
            e.printStackTrace();
        }

        AnnuitiesApi apiInstance = new AnnuitiesApi();
        AnnuityCalculatorAccumulationHorizonRequest annuityCalculatorAccumulationHorizonRequest = new AnnuityCalculatorAccumulationHorizonRequest(); // AnnuityCalculatorAccumulationHorizonRequest | Request payload for Annuity Calculator - Accumulation Horizon
        try {
            Map<String, Object> result = apiInstance.annuityCalculatorAccumulationHorizon(annuityCalculatorAccumulationHorizonRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AnnuitiesApi#annuityCalculatorAccumulationHorizon");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AnnuitiesApi* | [**annuityCalculatorAccumulationHorizon**](docs/AnnuitiesApi.md#annuityCalculatorAccumulationHorizon) | **POST** /annuity_calculator/accumulation_horizon | Annuity Calculator - Accumulation Horizon
*AnnuitiesApi* | [**annuityCalculatorAnnuityAmount**](docs/AnnuitiesApi.md#annuityCalculatorAnnuityAmount) | **POST** /annuity_calculator/annuity_amount | Annuity Calculator - Annuity Amount
*AnnuitiesApi* | [**annuityCalculatorDecumulationHorizon**](docs/AnnuitiesApi.md#annuityCalculatorDecumulationHorizon) | **POST** /annuity_calculator/decumulation_horizon | Annuity Calculator - Decumulation Horizon
*AnnuitiesApi* | [**annuityCalculatorDepositAmount**](docs/AnnuitiesApi.md#annuityCalculatorDepositAmount) | **POST** /annuity_calculator/deposit_amount | Annuity Calculator - Deposit Amount
*AnnuitiesApi* | [**annuityCalculatorInitialBalance**](docs/AnnuitiesApi.md#annuityCalculatorInitialBalance) | **POST** /annuity_calculator/initial_balance | Annuity Calculator - Initial Balance
*AnnuitiesApi* | [**variableAnnuity**](docs/AnnuitiesApi.md#variableAnnuity) | **POST** /variable_annuity | Variable Annuity
*FinancialHealthApi* | [**diversificationScore**](docs/FinancialHealthApi.md#diversificationScore) | **POST** /diversification_score | Diversification Score
*FinancialHealthApi* | [**emergencyFundCalculator**](docs/FinancialHealthApi.md#emergencyFundCalculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
*FinancialHealthApi* | [**financialHealthCheck**](docs/FinancialHealthApi.md#financialHealthCheck) | **POST** /financial_health_check | Financial Health Check
*FinancialHealthApi* | [**portfolioOptimizationScore**](docs/FinancialHealthApi.md#portfolioOptimizationScore) | **POST** /portfolio_optimization_score | Portfolio Optimization Score
*FinancialPlanningApi* | [**educationCalculatorAnnualCost**](docs/FinancialPlanningApi.md#educationCalculatorAnnualCost) | **POST** /education_calculator/annual_cost | Education Calculator - Annual Cost
*FinancialPlanningApi* | [**educationCalculatorDepositAmount**](docs/FinancialPlanningApi.md#educationCalculatorDepositAmount) | **POST** /education_calculator/deposit_amount | Education Calculator - Deposit Amount
*FinancialPlanningApi* | [**educationCalculatorPercentCovered**](docs/FinancialPlanningApi.md#educationCalculatorPercentCovered) | **POST** /education_calculator/percent_covered | Education Calculator - Percent Covered
*FinancialPlanningApi* | [**mortgageCalculatorDownPayment**](docs/FinancialPlanningApi.md#mortgageCalculatorDownPayment) | **POST** /mortgage_calculator/down_payment | Mortgage Calculator - Down Payment
*FinancialPlanningApi* | [**mortgageCalculatorHomePrice**](docs/FinancialPlanningApi.md#mortgageCalculatorHomePrice) | **POST** /mortgage_calculator/home_price | Mortgage Calculator - Home Price
*FinancialPlanningApi* | [**mortgageCalculatorPeriodicPayment**](docs/FinancialPlanningApi.md#mortgageCalculatorPeriodicPayment) | **POST** /mortgage_calculator/period_payment | Mortgage Calculator - Periodic Payment
*FinancialPlanningApi* | [**purchaseCalculatorAmount**](docs/FinancialPlanningApi.md#purchaseCalculatorAmount) | **POST** /purchase_calculator/amount | Purchase Calculator - Amount
*FinancialPlanningApi* | [**purchaseCalculatorDepositAmount**](docs/FinancialPlanningApi.md#purchaseCalculatorDepositAmount) | **POST** /purchase_calculator/deposit_amount | Purchase Calculator - Deposit Amount
*FinancialPlanningApi* | [**purchaseCalculatorHorizon**](docs/FinancialPlanningApi.md#purchaseCalculatorHorizon) | **POST** /purchase_calculator/horizon | Purchase Calculator - Horizon
*FinancialPlanningApi* | [**retirementCalculatorDepositAmount**](docs/FinancialPlanningApi.md#retirementCalculatorDepositAmount) | **POST** /retirement_calculator/deposit_amount | Retirement Calculator - Deposit Amount
*FinancialPlanningApi* | [**retirementCalculatorExpenses**](docs/FinancialPlanningApi.md#retirementCalculatorExpenses) | **POST** /retirement_calculator/expenses | Retirement Calculator - Expenses
*FinancialPlanningApi* | [**retirementCalculatorPercentCovered**](docs/FinancialPlanningApi.md#retirementCalculatorPercentCovered) | **POST** /retirement_calculator/percent_covered | Retirement Calculator - Percent Covered
*GoalsApi* | [**goalAccumulationAllocation**](docs/GoalsApi.md#goalAccumulationAllocation) | **POST** /goal_accumulation/allocation | Goal Accumulation Allocation
*GoalsApi* | [**goalAccumulationRecommendation**](docs/GoalsApi.md#goalAccumulationRecommendation) | **POST** /goal_accumulation/recommendation | Goal Accumulation Recommendation
*GoalsApi* | [**goalAccumulationStatus**](docs/GoalsApi.md#goalAccumulationStatus) | **POST** /goal_accumulation/status | Goal Accumulation Status
*GoalsApi* | [**goalDecumulationAllocation**](docs/GoalsApi.md#goalDecumulationAllocation) | **POST** /goal_decumulation/allocation | Goal Decumulation Allocation
*GoalsApi* | [**goalDecumulationRecommendation**](docs/GoalsApi.md#goalDecumulationRecommendation) | **POST** /goal_decumulation/recommendation | Goal Decumulation Recommendation
*GoalsApi* | [**goalDecumulationStatus**](docs/GoalsApi.md#goalDecumulationStatus) | **POST** /goal_decumulation/status | Goal Decumulation Status
*LifeInsuranceApi* | [**lifeInsuranceNeedsCalculator**](docs/LifeInsuranceApi.md#lifeInsuranceNeedsCalculator) | **POST** /life_insurance/needs_calculator | Life Insurance Needs Calculator
*PersonalFinancialManagementApi* | [**budgetCalculator**](docs/PersonalFinancialManagementApi.md#budgetCalculator) | **POST** /budget_calculator | Budget Calculator
*PersonalFinancialManagementApi* | [**cashFlowAnalysis**](docs/PersonalFinancialManagementApi.md#cashFlowAnalysis) | **POST** /cash_flow_analysis | Cash Flow Analysis
*PersonalFinancialManagementApi* | [**financialPicture**](docs/PersonalFinancialManagementApi.md#financialPicture) | **POST** /financial_picture | Financial Picture
*PortfolioConstructionApi* | [**mvo**](docs/PortfolioConstructionApi.md#mvo) | **POST** /mvo | MVO
*PortfolioManagementApi* | [**rebalancingSignal**](docs/PortfolioManagementApi.md#rebalancingSignal) | **POST** /rebalancing_signal | Rebalancing Signal
*RiskScoringApi* | [**dimensionalRiskScore**](docs/RiskScoringApi.md#dimensionalRiskScore) | **POST** /dimensional_risk_score | Dimensional Risk Score
*RiskScoringApi* | [**riskAllocation**](docs/RiskScoringApi.md#riskAllocation) | **POST** /risk_allocation | Risk Allocation
*RiskScoringApi* | [**riskScore**](docs/RiskScoringApi.md#riskScore) | **POST** /risk_score | Risk Score
*SimulationsApi* | [**backtest**](docs/SimulationsApi.md#backtest) | **POST** /backtest | Backtest
*SimulationsApi* | [**eventStudy**](docs/SimulationsApi.md#eventStudy) | **POST** /event_study | Event Study
*SimulationsApi* | [**monteCarlo**](docs/SimulationsApi.md#monteCarlo) | **POST** /monte_carlo | Monte Carlo
*SimulationsApi* | [**portfolioWhatIf**](docs/SimulationsApi.md#portfolioWhatIf) | **POST** /portfolio_what_if | Porfolio What-If
*SimulationsApi* | [**savingsCalculator**](docs/SimulationsApi.md#savingsCalculator) | **POST** /savings_calculator | Savings Calculator
*SimulationsApi* | [**scenarioAnalysis**](docs/SimulationsApi.md#scenarioAnalysis) | **POST** /scenario_analysis | Scenario Analysis
*SimulationsApi* | [**sensitivityAnalysis**](docs/SimulationsApi.md#sensitivityAnalysis) | **POST** /sensitivity_analysis | Sensitivity Analysis


## Documentation for Models

 - [AccumulationGoalDepositConfig](docs/AccumulationGoalDepositConfig.md)
 - [AnnuityCalculatorAccumulationHorizonRequest](docs/AnnuityCalculatorAccumulationHorizonRequest.md)
 - [AnnuityCalculatorAnnuityAmountRequest](docs/AnnuityCalculatorAnnuityAmountRequest.md)
 - [AnnuityCalculatorDecumulationHorizonRequest](docs/AnnuityCalculatorDecumulationHorizonRequest.md)
 - [AnnuityCalculatorDepositAmountRequest](docs/AnnuityCalculatorDepositAmountRequest.md)
 - [AnnuityCalculatorInitialBalanceRequest](docs/AnnuityCalculatorInitialBalanceRequest.md)
 - [AnnuityDepositSchedule](docs/AnnuityDepositSchedule.md)
 - [BacktestRequest](docs/BacktestRequest.md)
 - [BeneficiaryBequestConfig](docs/BeneficiaryBequestConfig.md)
 - [BudgetCalculatorRequest](docs/BudgetCalculatorRequest.md)
 - [CalculatorDepositSchedule](docs/CalculatorDepositSchedule.md)
 - [CalculatorDepositSchedule1](docs/CalculatorDepositSchedule1.md)
 - [CashFlowAnalysisRequest](docs/CashFlowAnalysisRequest.md)
 - [ChildrenEducationConfig](docs/ChildrenEducationConfig.md)
 - [DecumulationGoalDepositConfig](docs/DecumulationGoalDepositConfig.md)
 - [DimensionalRiskScoreRequest](docs/DimensionalRiskScoreRequest.md)
 - [DiversificationScoreRequest](docs/DiversificationScoreRequest.md)
 - [EducationCalculatorAnnualCostRequest](docs/EducationCalculatorAnnualCostRequest.md)
 - [EducationCalculatorDepositAmountRequest](docs/EducationCalculatorDepositAmountRequest.md)
 - [EducationCalculatorPercentCoveredRequest](docs/EducationCalculatorPercentCoveredRequest.md)
 - [EducationConfig](docs/EducationConfig.md)
 - [EmergencyFundCalculatorRequest](docs/EmergencyFundCalculatorRequest.md)
 - [EventStudyRequest](docs/EventStudyRequest.md)
 - [FinancialHealthCheckRequest](docs/FinancialHealthCheckRequest.md)
 - [FinancialPictureRequest](docs/FinancialPictureRequest.md)
 - [GoalAccumulationAllocationRequest](docs/GoalAccumulationAllocationRequest.md)
 - [GoalAccumulationRecommendationRequest](docs/GoalAccumulationRecommendationRequest.md)
 - [GoalAccumulationStatusRequest](docs/GoalAccumulationStatusRequest.md)
 - [GoalConfig](docs/GoalConfig.md)
 - [GoalDecumulationAllocationRequest](docs/GoalDecumulationAllocationRequest.md)
 - [GoalDecumulationRecommendationRequest](docs/GoalDecumulationRecommendationRequest.md)
 - [GoalDecumulationStatusRequest](docs/GoalDecumulationStatusRequest.md)
 - [GoalWithdrawalConfig](docs/GoalWithdrawalConfig.md)
 - [GuaranteedRateBenefit](docs/GuaranteedRateBenefit.md)
 - [IncomeConfig](docs/IncomeConfig.md)
 - [LifeInsuranceNeedsCalculatorRequest](docs/LifeInsuranceNeedsCalculatorRequest.md)
 - [MonteCarloRequest](docs/MonteCarloRequest.md)
 - [MortgageCalculatorDownPaymentRequest](docs/MortgageCalculatorDownPaymentRequest.md)
 - [MortgageCalculatorHomePriceRequest](docs/MortgageCalculatorHomePriceRequest.md)
 - [MortgageCalculatorPeriodicPaymentRequest](docs/MortgageCalculatorPeriodicPaymentRequest.md)
 - [MvoRequest](docs/MvoRequest.md)
 - [OptConfig](docs/OptConfig.md)
 - [OptConfig1](docs/OptConfig1.md)
 - [PortfolioOptimizationScoreRequest](docs/PortfolioOptimizationScoreRequest.md)
 - [PortfolioWhatIfRequest](docs/PortfolioWhatIfRequest.md)
 - [PurchaseCalculatorAmountRequest](docs/PurchaseCalculatorAmountRequest.md)
 - [PurchaseCalculatorDepositAmountRequest](docs/PurchaseCalculatorDepositAmountRequest.md)
 - [PurchaseCalculatorHorizonRequest](docs/PurchaseCalculatorHorizonRequest.md)
 - [RatioTargets](docs/RatioTargets.md)
 - [RebalancingSignalRequest](docs/RebalancingSignalRequest.md)
 - [RecommendationConfig](docs/RecommendationConfig.md)
 - [RecommendationConfig1](docs/RecommendationConfig1.md)
 - [RetirementCalculatorDepositAmountRequest](docs/RetirementCalculatorDepositAmountRequest.md)
 - [RetirementCalculatorExpensesRequest](docs/RetirementCalculatorExpensesRequest.md)
 - [RetirementCalculatorPercentCoveredRequest](docs/RetirementCalculatorPercentCoveredRequest.md)
 - [RiskAllocationRequest](docs/RiskAllocationRequest.md)
 - [RiskScoreRequest](docs/RiskScoreRequest.md)
 - [SavingsCalculatorRequest](docs/SavingsCalculatorRequest.md)
 - [SavingsDepositSchedule](docs/SavingsDepositSchedule.md)
 - [ScenarioAnalysisRequest](docs/ScenarioAnalysisRequest.md)
 - [SensitivityAnalysisRequest](docs/SensitivityAnalysisRequest.md)
 - [SensitivityFactor](docs/SensitivityFactor.md)
 - [Settings](docs/Settings.md)
 - [VariableAnnuityRequest](docs/VariableAnnuityRequest.md)
 - [WConfig](docs/WConfig.md)
 - [WConfig1](docs/WConfig1.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### oauth2

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: N/A


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

info@hydrogenplatform.com
