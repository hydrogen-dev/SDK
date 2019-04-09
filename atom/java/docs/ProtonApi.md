# ProtonApi

All URIs are relative to *https://api.hydrogenplatform.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**annuityCalculatorAccumulationHorizon**](ProtonApi.md#annuityCalculatorAccumulationHorizon) | **POST** /proton/v1/annuity_calculator/accumulation_horizon | Annuity calculator - accumulation horizon
[**annuityCalculatorAnnuityAmount**](ProtonApi.md#annuityCalculatorAnnuityAmount) | **POST** /proton/v1/annuity_calculator/annuity_amount | Annuity calculator - annuity amount
[**annuityCalculatorDecumulationHorizon**](ProtonApi.md#annuityCalculatorDecumulationHorizon) | **POST** /proton/v1/annuity_calculator/decumulation_horizon | Annuity calculator - decumulation horizon
[**annuityCalculatorDepositAmount**](ProtonApi.md#annuityCalculatorDepositAmount) | **POST** /proton/v1/annuity_calculator/deposit_amount | Annuity calculator - deposit amount
[**annuityCalculatorInitialBalance**](ProtonApi.md#annuityCalculatorInitialBalance) | **POST** /proton/v1/annuity_calculator/initial_balance | Annuity calculator - initial balance
[**dimensionalRiskScore**](ProtonApi.md#dimensionalRiskScore) | **POST** /proton/v1/dimensional_risk_score | Dimensional risk score
[**educationCalculatorAnnualCost**](ProtonApi.md#educationCalculatorAnnualCost) | **POST** /proton/v1/education_calculator/annual_cost | Education calculator - total annual cost
[**educationCalculatorDepositAmount**](ProtonApi.md#educationCalculatorDepositAmount) | **POST** /proton/v1/education_calculator/deposit_amount | Education calculator - deposit amount
[**educationCalculatorPercentCovered**](ProtonApi.md#educationCalculatorPercentCovered) | **POST** /proton/v1/education_calculator/percent_covered | Education calculator - percent covered
[**emergencyFundCalculator**](ProtonApi.md#emergencyFundCalculator) | **POST** /proton/v1/emergency_fund_calculator | Emergency fund calculator
[**eventStudy**](ProtonApi.md#eventStudy) | **POST** /proton/v1/event_study | Event study
[**financialHealthCheck**](ProtonApi.md#financialHealthCheck) | **POST** /proton/v1/financial_health_check | Financial health check
[**goalAccumulationAllocation**](ProtonApi.md#goalAccumulationAllocation) | **POST** /proton/v1/goal_accumulation/allocation | Goal accumulation allocation
[**goalAccumulationRecommendation**](ProtonApi.md#goalAccumulationRecommendation) | **POST** /proton/v1/goal_accumulation/recommendation | Goal accumulation recommendation
[**goalAccumulationStatus**](ProtonApi.md#goalAccumulationStatus) | **POST** /proton/v1/goal_accumulation/status | Goal accumulation status
[**goalDecumulationAllocation**](ProtonApi.md#goalDecumulationAllocation) | **POST** /proton/v1/goal_decumulation/allocation | Goal decumulation allocation
[**goalDecumulationRecommendation**](ProtonApi.md#goalDecumulationRecommendation) | **POST** /proton/v1/goal_decumulation/recommendation | Goal decumulation recommendation
[**goalDecumulationStatus**](ProtonApi.md#goalDecumulationStatus) | **POST** /proton/v1/goal_decumulation/status | Goal decumulation status
[**lifeInsuranceNeedsCalculator**](ProtonApi.md#lifeInsuranceNeedsCalculator) | **POST** /proton/v1/life_insurance/needs_calculator | Life insurance needs calculator
[**modelBacktest**](ProtonApi.md#modelBacktest) | **POST** /proton/v1/backtest | Model backtest
[**monteCarlo**](ProtonApi.md#monteCarlo) | **POST** /proton/v1/monte_carlo | Monte Carlo
[**mortgageCalculatorDownPayment**](ProtonApi.md#mortgageCalculatorDownPayment) | **POST** /proton/v1/mortgage_calculator/down_payment | Mortgage calculator - down payment
[**mortgageCalculatorHomePrice**](ProtonApi.md#mortgageCalculatorHomePrice) | **POST** /proton/v1/mortgage_calculator/home_price | Mortgage calculator - home price
[**mortgageCalculatorPeriodicPayment**](ProtonApi.md#mortgageCalculatorPeriodicPayment) | **POST** /proton/v1/mortgage_calculator/periodic_payment | Mortgage calculator - periodic payment
[**mvo**](ProtonApi.md#mvo) | **POST** /proton/v1/mvo | Mean-variance optimization
[**portfolioDiversificationScore**](ProtonApi.md#portfolioDiversificationScore) | **POST** /proton/v1/diversification_score | Portfolio diversification score
[**portfolioOptimizationScore**](ProtonApi.md#portfolioOptimizationScore) | **POST** /proton/v1/portfolio_optimization_score | Portfolio optimization score
[**portfolioWhatIf**](ProtonApi.md#portfolioWhatIf) | **POST** /proton/v1/portfolio_what_if | Portfolio what-if
[**purchaseCalculatorDepositAmount**](ProtonApi.md#purchaseCalculatorDepositAmount) | **POST** /proton/v1/purchase_calculator/deposit_amount | Purchase calculator - deposit amount
[**purchaseCalculatorHorizon**](ProtonApi.md#purchaseCalculatorHorizon) | **POST** /proton/v1/purchase_calculator/horizon | Purchase calculator - horizon
[**purchaseCalculatorPurchaseAmount**](ProtonApi.md#purchaseCalculatorPurchaseAmount) | **POST** /proton/v1/purchase_calculator/amount | Purchase calculator - purchase amount
[**rebalancingSignal**](ProtonApi.md#rebalancingSignal) | **POST** /proton/v1/rebalancing_signal | Rebalancing
[**retirementCalculatorDepositAmount**](ProtonApi.md#retirementCalculatorDepositAmount) | **POST** /proton/v1/retirement_calculator/deposit_amount | Retirement calculator - deposit amount
[**retirementCalculatorExpenses**](ProtonApi.md#retirementCalculatorExpenses) | **POST** /proton/v1/retirement_calculator/expenses | Retirement calculator - expenses
[**retirementCalculatorPercentCovered**](ProtonApi.md#retirementCalculatorPercentCovered) | **POST** /proton/v1/retirement_calculator/percent_covered | Retirement calculator - percent of costs covered
[**riskAllocation**](ProtonApi.md#riskAllocation) | **POST** /proton/v1/risk_allocation | Risk allocation
[**riskScore**](ProtonApi.md#riskScore) | **POST** /proton/v1/risk_score | Risk score
[**savingsCalculator**](ProtonApi.md#savingsCalculator) | **POST** /proton/v1/savings_calculator | Savings calculator
[**scenarioAnalysis**](ProtonApi.md#scenarioAnalysis) | **POST** /proton/v1/scenario_analysis | Scenario analysis
[**sensitivityAnalysis**](ProtonApi.md#sensitivityAnalysis) | **POST** /proton/v1/sensitivity_analysis | Sensitivity analysis


<a name="annuityCalculatorAccumulationHorizon"></a>
# **annuityCalculatorAccumulationHorizon**
> AnnuityAccumulationResponse annuityCalculatorAccumulationHorizon(payload)

Annuity calculator - accumulation horizon

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
AnnuityCalculatorAccumulationHorizon payload = new AnnuityCalculatorAccumulationHorizon(); // AnnuityCalculatorAccumulationHorizon | 
try {
    AnnuityAccumulationResponse result = apiInstance.annuityCalculatorAccumulationHorizon(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#annuityCalculatorAccumulationHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAccumulationHorizon**](AnnuityCalculatorAccumulationHorizon.md)|  |

### Return type

[**AnnuityAccumulationResponse**](AnnuityAccumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorAnnuityAmount"></a>
# **annuityCalculatorAnnuityAmount**
> AnnuityAmountResponse annuityCalculatorAnnuityAmount(payload)

Annuity calculator - annuity amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
AnnuityCalculatorAnnuityAmount payload = new AnnuityCalculatorAnnuityAmount(); // AnnuityCalculatorAnnuityAmount | 
try {
    AnnuityAmountResponse result = apiInstance.annuityCalculatorAnnuityAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#annuityCalculatorAnnuityAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorAnnuityAmount**](AnnuityCalculatorAnnuityAmount.md)|  |

### Return type

[**AnnuityAmountResponse**](AnnuityAmountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDecumulationHorizon"></a>
# **annuityCalculatorDecumulationHorizon**
> AnnuityDecumulationResponse annuityCalculatorDecumulationHorizon(payload)

Annuity calculator - decumulation horizon

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
AnnuityCalculatorDecumulationHorizon payload = new AnnuityCalculatorDecumulationHorizon(); // AnnuityCalculatorDecumulationHorizon | 
try {
    AnnuityDecumulationResponse result = apiInstance.annuityCalculatorDecumulationHorizon(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#annuityCalculatorDecumulationHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDecumulationHorizon**](AnnuityCalculatorDecumulationHorizon.md)|  |

### Return type

[**AnnuityDecumulationResponse**](AnnuityDecumulationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorDepositAmount"></a>
# **annuityCalculatorDepositAmount**
> AnnuityDepositamountResponse annuityCalculatorDepositAmount(payload)

Annuity calculator - deposit amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
AnnuityCalculatorDepositAmount payload = new AnnuityCalculatorDepositAmount(); // AnnuityCalculatorDepositAmount | 
try {
    AnnuityDepositamountResponse result = apiInstance.annuityCalculatorDepositAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#annuityCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorDepositAmount**](AnnuityCalculatorDepositAmount.md)|  |

### Return type

[**AnnuityDepositamountResponse**](AnnuityDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="annuityCalculatorInitialBalance"></a>
# **annuityCalculatorInitialBalance**
> AnnuityInitialbalanceResponse annuityCalculatorInitialBalance(payload)

Annuity calculator - initial balance

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
AnnuityCalculatorInitialBalance payload = new AnnuityCalculatorInitialBalance(); // AnnuityCalculatorInitialBalance | 
try {
    AnnuityInitialbalanceResponse result = apiInstance.annuityCalculatorInitialBalance(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#annuityCalculatorInitialBalance");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**AnnuityCalculatorInitialBalance**](AnnuityCalculatorInitialBalance.md)|  |

### Return type

[**AnnuityInitialbalanceResponse**](AnnuityInitialbalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="dimensionalRiskScore"></a>
# **dimensionalRiskScore**
> DimRiskScoreResponse dimensionalRiskScore(payload)

Dimensional risk score

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
DimensionalRiskScore payload = new DimensionalRiskScore(); // DimensionalRiskScore | 
try {
    DimRiskScoreResponse result = apiInstance.dimensionalRiskScore(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#dimensionalRiskScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DimensionalRiskScore**](DimensionalRiskScore.md)|  |

### Return type

[**DimRiskScoreResponse**](DimRiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorAnnualCost"></a>
# **educationCalculatorAnnualCost**
> EducationCalculatorAnnualcostResponse educationCalculatorAnnualCost(payload)

Education calculator - total annual cost

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
EducationCalculatorAnnualCost payload = new EducationCalculatorAnnualCost(); // EducationCalculatorAnnualCost | 
try {
    EducationCalculatorAnnualcostResponse result = apiInstance.educationCalculatorAnnualCost(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#educationCalculatorAnnualCost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorAnnualCost**](EducationCalculatorAnnualCost.md)|  |

### Return type

[**EducationCalculatorAnnualcostResponse**](EducationCalculatorAnnualcostResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorDepositAmount"></a>
# **educationCalculatorDepositAmount**
> EducationCalculatorDepositamountResponse educationCalculatorDepositAmount(payload)

Education calculator - deposit amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
EducationCalculatorDepositAmount payload = new EducationCalculatorDepositAmount(); // EducationCalculatorDepositAmount | 
try {
    EducationCalculatorDepositamountResponse result = apiInstance.educationCalculatorDepositAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#educationCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorDepositAmount**](EducationCalculatorDepositAmount.md)|  |

### Return type

[**EducationCalculatorDepositamountResponse**](EducationCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="educationCalculatorPercentCovered"></a>
# **educationCalculatorPercentCovered**
> EducationCalculatorPctcoveredResponse educationCalculatorPercentCovered(payload)

Education calculator - percent covered

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
EducationCalculatorPercentCovered payload = new EducationCalculatorPercentCovered(); // EducationCalculatorPercentCovered | 
try {
    EducationCalculatorPctcoveredResponse result = apiInstance.educationCalculatorPercentCovered(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#educationCalculatorPercentCovered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EducationCalculatorPercentCovered**](EducationCalculatorPercentCovered.md)|  |

### Return type

[**EducationCalculatorPctcoveredResponse**](EducationCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emergencyFundCalculator"></a>
# **emergencyFundCalculator**
> EmergencyFundResponse emergencyFundCalculator(payload)

Emergency fund calculator

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
EmergencyFundCalculator payload = new EmergencyFundCalculator(); // EmergencyFundCalculator | 
try {
    EmergencyFundResponse result = apiInstance.emergencyFundCalculator(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#emergencyFundCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EmergencyFundCalculator**](EmergencyFundCalculator.md)|  |

### Return type

[**EmergencyFundResponse**](EmergencyFundResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventStudy"></a>
# **eventStudy**
> EventStudyResponse eventStudy(payload)

Event study

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
EventStudy payload = new EventStudy(); // EventStudy | 
try {
    EventStudyResponse result = apiInstance.eventStudy(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#eventStudy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**EventStudy**](EventStudy.md)|  |

### Return type

[**EventStudyResponse**](EventStudyResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialHealthCheck"></a>
# **financialHealthCheck**
> HealthCheckResponse financialHealthCheck(payload)

Financial health check

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
FinancialHealthCheck payload = new FinancialHealthCheck(); // FinancialHealthCheck | 
try {
    HealthCheckResponse result = apiInstance.financialHealthCheck(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#financialHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**FinancialHealthCheck**](FinancialHealthCheck.md)|  |

### Return type

[**HealthCheckResponse**](HealthCheckResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationAllocation"></a>
# **goalAccumulationAllocation**
> GoalAllocationResponse goalAccumulationAllocation(payload)

Goal accumulation allocation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalAccumulationAllocation payload = new GoalAccumulationAllocation(); // GoalAccumulationAllocation | 
try {
    GoalAllocationResponse result = apiInstance.goalAccumulationAllocation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalAccumulationAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationAllocation**](GoalAccumulationAllocation.md)|  |

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationRecommendation"></a>
# **goalAccumulationRecommendation**
> GoalRecommendationResponse goalAccumulationRecommendation(payload)

Goal accumulation recommendation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalAccumulationRecommendation payload = new GoalAccumulationRecommendation(); // GoalAccumulationRecommendation | 
try {
    GoalRecommendationResponse result = apiInstance.goalAccumulationRecommendation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalAccumulationRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationRecommendation**](GoalAccumulationRecommendation.md)|  |

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalAccumulationStatus"></a>
# **goalAccumulationStatus**
> GoalStatusResponse goalAccumulationStatus(payload)

Goal accumulation status

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalAccumulationStatus payload = new GoalAccumulationStatus(); // GoalAccumulationStatus | 
try {
    GoalStatusResponse result = apiInstance.goalAccumulationStatus(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalAccumulationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalAccumulationStatus**](GoalAccumulationStatus.md)|  |

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationAllocation"></a>
# **goalDecumulationAllocation**
> GoalAllocationResponse goalDecumulationAllocation(payload)

Goal decumulation allocation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalDecumulationAllocation payload = new GoalDecumulationAllocation(); // GoalDecumulationAllocation | 
try {
    GoalAllocationResponse result = apiInstance.goalDecumulationAllocation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalDecumulationAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationAllocation**](GoalDecumulationAllocation.md)|  |

### Return type

[**GoalAllocationResponse**](GoalAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationRecommendation"></a>
# **goalDecumulationRecommendation**
> GoalRecommendationResponse goalDecumulationRecommendation(payload)

Goal decumulation recommendation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalDecumulationRecommendation payload = new GoalDecumulationRecommendation(); // GoalDecumulationRecommendation | 
try {
    GoalRecommendationResponse result = apiInstance.goalDecumulationRecommendation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalDecumulationRecommendation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationRecommendation**](GoalDecumulationRecommendation.md)|  |

### Return type

[**GoalRecommendationResponse**](GoalRecommendationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="goalDecumulationStatus"></a>
# **goalDecumulationStatus**
> GoalStatusResponse goalDecumulationStatus(payload)

Goal decumulation status

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
GoalDecumulationStatus payload = new GoalDecumulationStatus(); // GoalDecumulationStatus | 
try {
    GoalStatusResponse result = apiInstance.goalDecumulationStatus(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#goalDecumulationStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**GoalDecumulationStatus**](GoalDecumulationStatus.md)|  |

### Return type

[**GoalStatusResponse**](GoalStatusResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="lifeInsuranceNeedsCalculator"></a>
# **lifeInsuranceNeedsCalculator**
> LifeInsuranceNeedsResponse lifeInsuranceNeedsCalculator(payload)

Life insurance needs calculator

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
LifeInsuranceCalculator payload = new LifeInsuranceCalculator(); // LifeInsuranceCalculator | 
try {
    LifeInsuranceNeedsResponse result = apiInstance.lifeInsuranceNeedsCalculator(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#lifeInsuranceNeedsCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**LifeInsuranceCalculator**](LifeInsuranceCalculator.md)|  |

### Return type

[**LifeInsuranceNeedsResponse**](LifeInsuranceNeedsResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="modelBacktest"></a>
# **modelBacktest**
> BacktestResponse modelBacktest(payload)

Model backtest

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
Backtest payload = new Backtest(); // Backtest | 
try {
    BacktestResponse result = apiInstance.modelBacktest(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#modelBacktest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Backtest**](Backtest.md)|  |

### Return type

[**BacktestResponse**](BacktestResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="monteCarlo"></a>
# **monteCarlo**
> MonteCarloResponse monteCarlo(payload)

Monte Carlo

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
MonteCarlo payload = new MonteCarlo(); // MonteCarlo | 
try {
    MonteCarloResponse result = apiInstance.monteCarlo(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#monteCarlo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MonteCarlo**](MonteCarlo.md)|  |

### Return type

[**MonteCarloResponse**](MonteCarloResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorDownPayment"></a>
# **mortgageCalculatorDownPayment**
> MortgageCalculatorDownpaymentResponse mortgageCalculatorDownPayment(payload)

Mortgage calculator - down payment

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
MortgageCalculatorDownPayment payload = new MortgageCalculatorDownPayment(); // MortgageCalculatorDownPayment | 
try {
    MortgageCalculatorDownpaymentResponse result = apiInstance.mortgageCalculatorDownPayment(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#mortgageCalculatorDownPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorDownPayment**](MortgageCalculatorDownPayment.md)|  |

### Return type

[**MortgageCalculatorDownpaymentResponse**](MortgageCalculatorDownpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorHomePrice"></a>
# **mortgageCalculatorHomePrice**
> MortgageCalculatorHomepriceResponse mortgageCalculatorHomePrice(payload)

Mortgage calculator - home price

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
MortgageCalculatorHomePrice payload = new MortgageCalculatorHomePrice(); // MortgageCalculatorHomePrice | 
try {
    MortgageCalculatorHomepriceResponse result = apiInstance.mortgageCalculatorHomePrice(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#mortgageCalculatorHomePrice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorHomePrice**](MortgageCalculatorHomePrice.md)|  |

### Return type

[**MortgageCalculatorHomepriceResponse**](MortgageCalculatorHomepriceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mortgageCalculatorPeriodicPayment"></a>
# **mortgageCalculatorPeriodicPayment**
> MortgageCalculatorPeriodicpaymentResponse mortgageCalculatorPeriodicPayment(payload)

Mortgage calculator - periodic payment

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
MortgageCalculatorPeriodicPayment payload = new MortgageCalculatorPeriodicPayment(); // MortgageCalculatorPeriodicPayment | 
try {
    MortgageCalculatorPeriodicpaymentResponse result = apiInstance.mortgageCalculatorPeriodicPayment(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#mortgageCalculatorPeriodicPayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**MortgageCalculatorPeriodicPayment**](MortgageCalculatorPeriodicPayment.md)|  |

### Return type

[**MortgageCalculatorPeriodicpaymentResponse**](MortgageCalculatorPeriodicpaymentResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="mvo"></a>
# **mvo**
> MvoResponse mvo(payload)

Mean-variance optimization

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
OptConfigPortfolio payload = new OptConfigPortfolio(); // OptConfigPortfolio | 
try {
    MvoResponse result = apiInstance.mvo(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#mvo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptConfigPortfolio**](OptConfigPortfolio.md)|  |

### Return type

[**MvoResponse**](MvoResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioDiversificationScore"></a>
# **portfolioDiversificationScore**
> PfloDiversificationScoreResponse portfolioDiversificationScore(payload)

Portfolio diversification score

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
DiversificationScore payload = new DiversificationScore(); // DiversificationScore | 
try {
    PfloDiversificationScoreResponse result = apiInstance.portfolioDiversificationScore(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#portfolioDiversificationScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**DiversificationScore**](DiversificationScore.md)|  |

### Return type

[**PfloDiversificationScoreResponse**](PfloDiversificationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioOptimizationScore"></a>
# **portfolioOptimizationScore**
> PfloOptimizationScoreResponse portfolioOptimizationScore(payload)

Portfolio optimization score

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
OptimizationScore payload = new OptimizationScore(); // OptimizationScore | 
try {
    PfloOptimizationScoreResponse result = apiInstance.portfolioOptimizationScore(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#portfolioOptimizationScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**OptimizationScore**](OptimizationScore.md)|  |

### Return type

[**PfloOptimizationScoreResponse**](PfloOptimizationScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioWhatIf"></a>
# **portfolioWhatIf**
> PortfolioWhatIfResponse portfolioWhatIf(payload)

Portfolio what-if

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
WhatIfPortfolio payload = new WhatIfPortfolio(); // WhatIfPortfolio | 
try {
    PortfolioWhatIfResponse result = apiInstance.portfolioWhatIf(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#portfolioWhatIf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**WhatIfPortfolio**](WhatIfPortfolio.md)|  |

### Return type

[**PortfolioWhatIfResponse**](PortfolioWhatIfResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorDepositAmount"></a>
# **purchaseCalculatorDepositAmount**
> PurchaseCalculatorDepositamountResponse purchaseCalculatorDepositAmount(payload)

Purchase calculator - deposit amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
PurchaseCalculatorDepositAmount payload = new PurchaseCalculatorDepositAmount(); // PurchaseCalculatorDepositAmount | 
try {
    PurchaseCalculatorDepositamountResponse result = apiInstance.purchaseCalculatorDepositAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#purchaseCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorDepositAmount**](PurchaseCalculatorDepositAmount.md)|  |

### Return type

[**PurchaseCalculatorDepositamountResponse**](PurchaseCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorHorizon"></a>
# **purchaseCalculatorHorizon**
> PurchaseCalculatorPurchasehorizonResponse purchaseCalculatorHorizon(payload)

Purchase calculator - horizon

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
PurchaseCalculatorHorizon payload = new PurchaseCalculatorHorizon(); // PurchaseCalculatorHorizon | 
try {
    PurchaseCalculatorPurchasehorizonResponse result = apiInstance.purchaseCalculatorHorizon(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#purchaseCalculatorHorizon");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorHorizon**](PurchaseCalculatorHorizon.md)|  |

### Return type

[**PurchaseCalculatorPurchasehorizonResponse**](PurchaseCalculatorPurchasehorizonResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="purchaseCalculatorPurchaseAmount"></a>
# **purchaseCalculatorPurchaseAmount**
> PurchaseCalculatorPurchaseamountResponse purchaseCalculatorPurchaseAmount(payload)

Purchase calculator - purchase amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
PurchaseCalculatorAmount payload = new PurchaseCalculatorAmount(); // PurchaseCalculatorAmount | 
try {
    PurchaseCalculatorPurchaseamountResponse result = apiInstance.purchaseCalculatorPurchaseAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#purchaseCalculatorPurchaseAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**PurchaseCalculatorAmount**](PurchaseCalculatorAmount.md)|  |

### Return type

[**PurchaseCalculatorPurchaseamountResponse**](PurchaseCalculatorPurchaseamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="rebalancingSignal"></a>
# **rebalancingSignal**
> RebalanceResponse rebalancingSignal(payload)

Rebalancing

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
Rebalance payload = new Rebalance(); // Rebalance | 
try {
    RebalanceResponse result = apiInstance.rebalancingSignal(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#rebalancingSignal");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**Rebalance**](Rebalance.md)|  |

### Return type

[**RebalanceResponse**](RebalanceResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorDepositAmount"></a>
# **retirementCalculatorDepositAmount**
> RetirementCalculatorDepositamountResponse retirementCalculatorDepositAmount(payload)

Retirement calculator - deposit amount

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
RetirementCalculatorDepositAmount payload = new RetirementCalculatorDepositAmount(); // RetirementCalculatorDepositAmount | 
try {
    RetirementCalculatorDepositamountResponse result = apiInstance.retirementCalculatorDepositAmount(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#retirementCalculatorDepositAmount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorDepositAmount**](RetirementCalculatorDepositAmount.md)|  |

### Return type

[**RetirementCalculatorDepositamountResponse**](RetirementCalculatorDepositamountResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorExpenses"></a>
# **retirementCalculatorExpenses**
> RetirementCalculatorExpensesResponse retirementCalculatorExpenses(payload)

Retirement calculator - expenses

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
RetirementCalculatorExpenses payload = new RetirementCalculatorExpenses(); // RetirementCalculatorExpenses | 
try {
    RetirementCalculatorExpensesResponse result = apiInstance.retirementCalculatorExpenses(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#retirementCalculatorExpenses");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorExpenses**](RetirementCalculatorExpenses.md)|  |

### Return type

[**RetirementCalculatorExpensesResponse**](RetirementCalculatorExpensesResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="retirementCalculatorPercentCovered"></a>
# **retirementCalculatorPercentCovered**
> RetirementCalculatorPctcoveredResponse retirementCalculatorPercentCovered(payload)

Retirement calculator - percent of costs covered

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
RetirementCalculatorPercentCovered payload = new RetirementCalculatorPercentCovered(); // RetirementCalculatorPercentCovered | 
try {
    RetirementCalculatorPctcoveredResponse result = apiInstance.retirementCalculatorPercentCovered(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#retirementCalculatorPercentCovered");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RetirementCalculatorPercentCovered**](RetirementCalculatorPercentCovered.md)|  |

### Return type

[**RetirementCalculatorPctcoveredResponse**](RetirementCalculatorPctcoveredResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskAllocation"></a>
# **riskAllocation**
> RiskAllocationResponse riskAllocation(payload)

Risk allocation

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
RiskAllocation payload = new RiskAllocation(); // RiskAllocation | 
try {
    RiskAllocationResponse result = apiInstance.riskAllocation(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#riskAllocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskAllocation**](RiskAllocation.md)|  |

### Return type

[**RiskAllocationResponse**](RiskAllocationResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="riskScore"></a>
# **riskScore**
> RiskScoreResponse riskScore(payload)

Risk score

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
RiskScore payload = new RiskScore(); // RiskScore | 
try {
    RiskScoreResponse result = apiInstance.riskScore(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#riskScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**RiskScore**](RiskScore.md)|  |

### Return type

[**RiskScoreResponse**](RiskScoreResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savingsCalculator"></a>
# **savingsCalculator**
> SavingsCalculatorResponse savingsCalculator(payload)

Savings calculator

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
SimpleSavingsCalculator payload = new SimpleSavingsCalculator(); // SimpleSavingsCalculator | 
try {
    SavingsCalculatorResponse result = apiInstance.savingsCalculator(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#savingsCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SimpleSavingsCalculator**](SimpleSavingsCalculator.md)|  |

### Return type

[**SavingsCalculatorResponse**](SavingsCalculatorResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scenarioAnalysis"></a>
# **scenarioAnalysis**
> ScenarioAnalysisResponse scenarioAnalysis(payload)

Scenario analysis

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
ScenarioAnalysis payload = new ScenarioAnalysis(); // ScenarioAnalysis | 
try {
    ScenarioAnalysisResponse result = apiInstance.scenarioAnalysis(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#scenarioAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**ScenarioAnalysis**](ScenarioAnalysis.md)|  |

### Return type

[**ScenarioAnalysisResponse**](ScenarioAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sensitivityAnalysis"></a>
# **sensitivityAnalysis**
> SensitivityAnalysisResponse sensitivityAnalysis(payload)

Sensitivity analysis

### Example
```java
// Import classes:
//import atom_api.ApiClient;
//import atom_api.ApiException;
//import atom_api.Configuration;
//import atom_api.auth.*;
//import io.swagger.client.api.ProtonApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: oauth
OAuth oauth = (OAuth) defaultClient.getAuthentication("oauth");
// Method 1: Fetch and set access token with client_id and client_secret
String token = oauth.fetchAccessToken("MYCLIENTID", "MYCLIENTSECRET");
oauth.setAccessToken(token);
// Method 2: Set access token using an existing token
oauth.setAccessToken("YOUR ACCESS TOKEN");

ProtonApi apiInstance = new ProtonApi();
SensitivityAnalysis payload = new SensitivityAnalysis(); // SensitivityAnalysis | 
try {
    SensitivityAnalysisResponse result = apiInstance.sensitivityAnalysis(payload);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProtonApi#sensitivityAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **payload** | [**SensitivityAnalysis**](SensitivityAnalysis.md)|  |

### Return type

[**SensitivityAnalysisResponse**](SensitivityAnalysisResponse.md)

### Authorization

[oauth](../README.md#oauth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

