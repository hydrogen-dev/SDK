# FinancialHealthApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**diversificationScore**](FinancialHealthApi.md#diversificationScore) | **POST** /diversification_score | Diversification Score
[**emergencyFundCalculator**](FinancialHealthApi.md#emergencyFundCalculator) | **POST** /emergency_fund_calculator | Emergency Fund Calculator
[**financialHealthCheck**](FinancialHealthApi.md#financialHealthCheck) | **POST** /financial_health_check | Financial Health Check
[**portfolioOptimizationScore**](FinancialHealthApi.md#portfolioOptimizationScore) | **POST** /portfolio_optimization_score | Portfolio Optimization Score


<a name="diversificationScore"></a>
# **diversificationScore**
> Map&lt;String, Object&gt; diversificationScore(diversificationScoreRequest)

Diversification Score

Assess how well a group of investments is diversified

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import FinancialHealthApi;

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


FinancialHealthApi apiInstance = new FinancialHealthApi();
DiversificationScoreRequest diversificationScoreRequest = new DiversificationScoreRequest(); // DiversificationScoreRequest | Request payload for Diversification Score
try {
    Map<String, Object> result = apiInstance.diversificationScore(diversificationScoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialHealthApi#diversificationScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **diversificationScoreRequest** | [**DiversificationScoreRequest**](DiversificationScoreRequest.md)| Request payload for Diversification Score |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="emergencyFundCalculator"></a>
# **emergencyFundCalculator**
> Map&lt;String, Object&gt; emergencyFundCalculator(emergencyFundCalculatorRequest)

Emergency Fund Calculator

Calculate a target emergency fund amount and savings plan

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import FinancialHealthApi;

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


FinancialHealthApi apiInstance = new FinancialHealthApi();
EmergencyFundCalculatorRequest emergencyFundCalculatorRequest = new EmergencyFundCalculatorRequest(); // EmergencyFundCalculatorRequest | Request payload for Emergency Fund Calculator
try {
    Map<String, Object> result = apiInstance.emergencyFundCalculator(emergencyFundCalculatorRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialHealthApi#emergencyFundCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **emergencyFundCalculatorRequest** | [**EmergencyFundCalculatorRequest**](EmergencyFundCalculatorRequest.md)| Request payload for Emergency Fund Calculator |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="financialHealthCheck"></a>
# **financialHealthCheck**
> Map&lt;String, Object&gt; financialHealthCheck(financialHealthCheckRequest)

Financial Health Check

Calculate a series of financial ratios to assess financial health

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import FinancialHealthApi;

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


FinancialHealthApi apiInstance = new FinancialHealthApi();
FinancialHealthCheckRequest financialHealthCheckRequest = new FinancialHealthCheckRequest(); // FinancialHealthCheckRequest | Request payload for Financial Health Check
try {
    Map<String, Object> result = apiInstance.financialHealthCheck(financialHealthCheckRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialHealthApi#financialHealthCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialHealthCheckRequest** | [**FinancialHealthCheckRequest**](FinancialHealthCheckRequest.md)| Request payload for Financial Health Check |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioOptimizationScore"></a>
# **portfolioOptimizationScore**
> Map&lt;String, Object&gt; portfolioOptimizationScore(portfolioOptimizationScoreRequest)

Portfolio Optimization Score

Analyze a group of investments against the optimized result

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import FinancialHealthApi;

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


FinancialHealthApi apiInstance = new FinancialHealthApi();
PortfolioOptimizationScoreRequest portfolioOptimizationScoreRequest = new PortfolioOptimizationScoreRequest(); // PortfolioOptimizationScoreRequest | Request payload for Portfolio Optimization Score
try {
    Map<String, Object> result = apiInstance.portfolioOptimizationScore(portfolioOptimizationScoreRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FinancialHealthApi#portfolioOptimizationScore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioOptimizationScoreRequest** | [**PortfolioOptimizationScoreRequest**](PortfolioOptimizationScoreRequest.md)| Request payload for Portfolio Optimization Score |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

