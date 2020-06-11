# SimulationsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**backtest**](SimulationsApi.md#backtest) | **POST** /backtest | Backtest
[**eventStudy**](SimulationsApi.md#eventStudy) | **POST** /event_study | Event Study
[**monteCarlo**](SimulationsApi.md#monteCarlo) | **POST** /monte_carlo | Monte Carlo
[**portfolioWhatIf**](SimulationsApi.md#portfolioWhatIf) | **POST** /portfolio_what_if | Porfolio What-If
[**savingsCalculator**](SimulationsApi.md#savingsCalculator) | **POST** /savings_calculator | Savings Calculator
[**scenarioAnalysis**](SimulationsApi.md#scenarioAnalysis) | **POST** /scenario_analysis | Scenario Analysis
[**sensitivityAnalysis**](SimulationsApi.md#sensitivityAnalysis) | **POST** /sensitivity_analysis | Sensitivity Analysis


<a name="backtest"></a>
# **backtest**
> Map&lt;String, Object&gt; backtest(backtestRequest)

Backtest

Run a historical analysis for a group of investments

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
BacktestRequest backtestRequest = new BacktestRequest(); // BacktestRequest | Request payload for Backtest
try {
    Map<String, Object> result = apiInstance.backtest(backtestRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#backtest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **backtestRequest** | [**BacktestRequest**](BacktestRequest.md)| Request payload for Backtest |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="eventStudy"></a>
# **eventStudy**
> Map&lt;String, Object&gt; eventStudy(eventStudyRequest)

Event Study

Analyze a group of investments against key historical events

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
EventStudyRequest eventStudyRequest = new EventStudyRequest(); // EventStudyRequest | Request payload for Event Study
try {
    Map<String, Object> result = apiInstance.eventStudy(eventStudyRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#eventStudy");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **eventStudyRequest** | [**EventStudyRequest**](EventStudyRequest.md)| Request payload for Event Study |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="monteCarlo"></a>
# **monteCarlo**
> Map&lt;String, Object&gt; monteCarlo(monteCarloRequest)

Monte Carlo

Simulate the future growth of a group of investments

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
MonteCarloRequest monteCarloRequest = new MonteCarloRequest(); // MonteCarloRequest | Request payload for Monte Carlo
try {
    Map<String, Object> result = apiInstance.monteCarlo(monteCarloRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#monteCarlo");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monteCarloRequest** | [**MonteCarloRequest**](MonteCarloRequest.md)| Request payload for Monte Carlo |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="portfolioWhatIf"></a>
# **portfolioWhatIf**
> Map&lt;String, Object&gt; portfolioWhatIf(portfolioWhatIfRequest)

Porfolio What-If

Simulate the impact of adding, removing, reducing, or increasing various positions in a group of investments

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
PortfolioWhatIfRequest portfolioWhatIfRequest = new PortfolioWhatIfRequest(); // PortfolioWhatIfRequest | Request payload for Portfolio What-If
try {
    Map<String, Object> result = apiInstance.portfolioWhatIf(portfolioWhatIfRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#portfolioWhatIf");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioWhatIfRequest** | [**PortfolioWhatIfRequest**](PortfolioWhatIfRequest.md)| Request payload for Portfolio What-If |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="savingsCalculator"></a>
# **savingsCalculator**
> Map&lt;String, Object&gt; savingsCalculator(savingsCalculatorRequest)

Savings Calculator

Simulate the future growth of a simple savings account

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
SavingsCalculatorRequest savingsCalculatorRequest = new SavingsCalculatorRequest(); // SavingsCalculatorRequest | Request payload for Savings Calculator
try {
    Map<String, Object> result = apiInstance.savingsCalculator(savingsCalculatorRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#savingsCalculator");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **savingsCalculatorRequest** | [**SavingsCalculatorRequest**](SavingsCalculatorRequest.md)| Request payload for Savings Calculator |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="scenarioAnalysis"></a>
# **scenarioAnalysis**
> Map&lt;String, Object&gt; scenarioAnalysis(scnearioAnalysisRequest)

Scenario Analysis

Analyze a group of investments against a series of external economic factors

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
ScenarioAnalysisRequest scnearioAnalysisRequest = new ScenarioAnalysisRequest(); // ScenarioAnalysisRequest | Request payload for Scenario Analysis
try {
    Map<String, Object> result = apiInstance.scenarioAnalysis(scnearioAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#scenarioAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scnearioAnalysisRequest** | [**ScenarioAnalysisRequest**](ScenarioAnalysisRequest.md)| Request payload for Scenario Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="sensitivityAnalysis"></a>
# **sensitivityAnalysis**
> Map&lt;String, Object&gt; sensitivityAnalysis(sensitivityAnalysisRequest)

Sensitivity Analysis

Analyze a group of investments against an external economic factor

### Example
```java
// Import classes:
//import com.hydrogen.ApiException;
//import com.hydrogen.AuthApiClient;

//import com.hydrogen.auth.*;
//import SimulationsApi;

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


SimulationsApi apiInstance = new SimulationsApi();
SensitivityAnalysisRequest sensitivityAnalysisRequest = new SensitivityAnalysisRequest(); // SensitivityAnalysisRequest | Request payload for Sensitivity Analysis
try {
    Map<String, Object> result = apiInstance.sensitivityAnalysis(sensitivityAnalysisRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SimulationsApi#sensitivityAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **sensitivityAnalysisRequest** | [**SensitivityAnalysisRequest**](SensitivityAnalysisRequest.md)| Request payload for Sensitivity Analysis |

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

