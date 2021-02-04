# PerformanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountPerformanceUsingGet**](PerformanceApi.md#getAccountPerformanceUsingGet) | **GET** /account/{account_id}/performance | Account Performance
[**getAllocationPerformanceUsingGet**](PerformanceApi.md#getAllocationPerformanceUsingGet) | **GET** /allocation/{allocation_id}/performance | Allocation Performance
[**getBenchmarkPerformanceUsingGet**](PerformanceApi.md#getBenchmarkPerformanceUsingGet) | **GET** /benchmark/{benchmark_id}/performance | Benchmark Performance
[**getClientPerformanceUsingGet**](PerformanceApi.md#getClientPerformanceUsingGet) | **GET** /client/{client_id}/performance | Client Performance
[**getGoalPerformanceUsingGet**](PerformanceApi.md#getGoalPerformanceUsingGet) | **GET** /goal/{goal_id}/performance | Goal Performance
[**getHouseholdClientPerformanceUsingGet**](PerformanceApi.md#getHouseholdClientPerformanceUsingGet) | **GET** /household/{household_id}/performance | Household Performance
[**getModelPerformanceUsingGet**](PerformanceApi.md#getModelPerformanceUsingGet) | **GET** /model/{model_id}/performance | Model Performance
[**getPortfolioPerformanceUsingGet**](PerformanceApi.md#getPortfolioPerformanceUsingGet) | **GET** /portfolio/{portfolio_id}/performance | Portfolio Performance
[**getSecurityPerformanceUsingGet**](PerformanceApi.md#getSecurityPerformanceUsingGet) | **GET** /security/{security_id}/performance | Security Performance


<a name="getAccountPerformanceUsingGet"></a>
# **getAccountPerformanceUsingGet**
> Object getAccountPerformanceUsingGet(accountId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Account Performance

Get information on the performance of an account using IRR (Internal Rate of Return). You must provide the unique account_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID accountId = new UUID(); // UUID | Account Id -/account
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Client Benchmark or Tenant Benchmark id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type - /statistics
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getAccountPerformanceUsingGet(accountId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getAccountPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | [**UUID**](.md)| Account Id -/account |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| A stat type - /statistics | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationPerformanceUsingGet"></a>
# **getAllocationPerformanceUsingGet**
> Map&lt;String, Object&gt; getAllocationPerformanceUsingGet(allocationId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, isCurrentWeight, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Allocation Performance

Get information on the performance of an allocation using TWR (Time Weighted Return). You must provide the unique allocation_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID allocationId = new UUID(); // UUID | Allocation Id -/allocation
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Tenant Benchmark Id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Boolean isCurrentWeight = true; // Boolean | is_current_weight
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type found under the Statistics banner
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Map<String, Object> result = apiInstance.getAllocationPerformanceUsingGet(allocationId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, isCurrentWeight, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getAllocationPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | [**UUID**](.md)| Allocation Id -/allocation |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Tenant Benchmark Id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **isCurrentWeight** | **Boolean**| is_current_weight | [optional] [default to true]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| A stat type found under the Statistics banner | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Map&lt;String, Object&gt;**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkPerformanceUsingGet"></a>
# **getBenchmarkPerformanceUsingGet**
> Object getBenchmarkPerformanceUsingGet(benchmarkId, activePremiumPeriod, annualizedReturnPeriod, comparisonBenchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Benchmark Performance

Get information on the performance of a benchmark using TWR (Time Weighted Return). You must provide the unique benchmark_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID benchmarkId = new UUID(); // UUID | Benchmark Id - /benchmark
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID comparisonBenchmarkId = new UUID(); // UUID | comparison_benchmark_id
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | Stat type - /statistics endpoint
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getBenchmarkPerformanceUsingGet(benchmarkId, activePremiumPeriod, annualizedReturnPeriod, comparisonBenchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getBenchmarkPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | [**UUID**](.md)| Benchmark Id - /benchmark |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **comparisonBenchmarkId** | [**UUID**](.md)| comparison_benchmark_id | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| Stat type - /statistics endpoint | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientPerformanceUsingGet"></a>
# **getClientPerformanceUsingGet**
> Object getClientPerformanceUsingGet(clientId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Client Performance

Get information on the performance of a client using IRR (Internal Rate of Return). You must provide the unique client_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID clientId = new UUID(); // UUID | Client Id -/client
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Client Benchmark or Tenant Benchmark id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type -- /statistics
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getClientPerformanceUsingGet(clientId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getClientPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| Client Id -/client |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| A stat type -- /statistics | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalPerformanceUsingGet"></a>
# **getGoalPerformanceUsingGet**
> Object getGoalPerformanceUsingGet(clientId, goalId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, portfolioGoal, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Goal Performance

Get information on the performance of a goal using IRR (Internal Rate of Return). You must provide the unique goal_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID clientId = new UUID(); // UUID | client_id
UUID goalId = new UUID(); // UUID | Goal Id - /account
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Client Benchmark or Tenant Benchmark id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Boolean portfolioGoal = false; // Boolean | portfolio_goal
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type - /statistics
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getGoalPerformanceUsingGet(clientId, goalId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, portfolioGoal, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getGoalPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | [**UUID**](.md)| client_id |
 **goalId** | [**UUID**](.md)| Goal Id - /account |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional] [default to null]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional] [default to null]
 **stat** | **String**| A stat type - /statistics | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdClientPerformanceUsingGet"></a>
# **getHouseholdClientPerformanceUsingGet**
> Object getHouseholdClientPerformanceUsingGet(householdId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Household Performance

Get information on the performance of a Household using IRR (Internal Rate of Return). You must provide the unique household_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID householdId = new UUID(); // UUID | Household Id -/household
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Client Benchmark or Tenant Benchmark id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type -- /statistics
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getHouseholdClientPerformanceUsingGet(householdId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getHouseholdClientPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | [**UUID**](.md)| Household Id -/household |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Client Benchmark or Tenant Benchmark id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| A stat type -- /statistics | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelPerformanceUsingGet"></a>
# **getModelPerformanceUsingGet**
> Object getModelPerformanceUsingGet(modelId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Model Performance

Get information on the performance of a model using TWR (Time Weighted Return). You must provide the unique model_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID modelId = new UUID(); // UUID | Model Id - /model
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Tenant Benchmark Id -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | Stat Type
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getModelPerformanceUsingGet(modelId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getModelPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | [**UUID**](.md)| Model Id - /model |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Tenant Benchmark Id -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| Stat Type | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioPerformanceUsingGet"></a>
# **getPortfolioPerformanceUsingGet**
> Object getPortfolioPerformanceUsingGet(portfolioId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval)

Portfolio Performance

Get information on the performance of a portfolio using IRR (Internal Rate of Return). You must provide the unique portfolio_id.

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID portfolioId = new UUID(); // UUID | Portfolio Id -/portoflio
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
UUID benchmarkId = new UUID(); // UUID | Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark
LocalDate endDate = LocalDate.now(); // LocalDate | end date
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | start date
String stat = "stat_example"; // String | A stat type - /statistics endpoint to get types
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getPortfolioPerformanceUsingGet(portfolioId, activePremiumPeriod, annualizedReturnPeriod, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getPortfolioPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **portfolioId** | [**UUID**](.md)| Portfolio Id -/portoflio |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchmarkId** | [**UUID**](.md)| Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark | [optional]
 **endDate** | **LocalDate**| end date | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| start date | [optional]
 **stat** | **String**| A stat type - /statistics endpoint to get types | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPerformanceUsingGet"></a>
# **getSecurityPerformanceUsingGet**
> Object getSecurityPerformanceUsingGet(securityId, activePremiumPeriod, annualizedReturnPeriod, benchTicker, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, ticker, varConfInterval)

Security Performance

Get performance statistics for a security using TWR (Time Weighted Return). You must provide the unique security_id

### Example
```java
//import com.hydrogen.nucleus.AuthApiClient;
//import com.hydrogen.nucleus.ApiException;
//import PerformanceApi;

AuthApiClient authApiClient = new AuthApiClient();
try {
//          Use one of the below method to generate oauth token        
//          Creating a token for grant_type=client_credentials            
    authApiClient.createClientCredential("CLIENT_ID", "CLIENT_SECRET");
//          Creating a token for grant_type=password
    authApiClient.createPasswordCredential("CLIENT_ID", "CLIENT_SECRET",
                            "USERNAME", "PASSWORD");     
//  Creating a token using client_token
    authApiClient.createClientTokenCredential("CLIENT_ID", "CLIENT_SECRET",
            "CLIENT_TOKEN");      
} catch (ApiException e) {
    e.printStackTrace();
}
PerformanceApi apiInstance = new PerformanceApi();
UUID securityId = new UUID(); // UUID | security_id
String activePremiumPeriod = "activePremiumPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String annualizedReturnPeriod = "annualizedReturnPeriod_example"; // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
String benchTicker = "benchTicker_example"; // String | Bench Ticker for security - (default: ^GSPC) 
UUID benchmarkId = new UUID(); // UUID | benchmark_id
LocalDate endDate = LocalDate.now(); // LocalDate | Ending parameter for time window
Double histFactor = 3.4D; // Double | Histogram factor- (statId: 39, default: 5)
Double marDownSideDeviation = 3.4D; // Double | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
Double maxPercentileMonteCarlo = 3.4D; // Double | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
Double meanPercentileMonteCarlo = 3.4D; // Double | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
Double minPercentileMonteCarlo = 3.4D; // Double | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
Integer movingAverageNDay = 56; // Integer | number of days for moving average n-day - (statId: 18, default: 7)
Integer nDayReturns = 56; // Integer | number of days for Rolling n-day returns - (statId: 2, default: 7)  
Integer nPathMonteCarlo = 56; // Integer | number of points for a simulation- (statId: 62, default: 100)
Integer nRollingMaxDrawdown = 56; // Integer | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
Integer nRollingVolatility = 56; // Integer | number of days for Rolling n-day volatility- (statId: 34, default: 7)
Integer numSimMonteCarlo = 56; // Integer | number of simulations - (statId: 62, default: 1000) 
String periodType = "periodType_example"; // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
Double riskFreeAlpha = 3.4D; // Double | risk free val alpha - (statId: 52, default: 0)
Double riskFreeSharpe = 3.4D; // Double | risk free val sharpe- (statId: 49, default: 0) 
Double riskFreeSortino = 3.4D; // Double | risk free val sortino - (statId: 56, default: 0)
Double riskFreeTreynor = 3.4D; // Double | risk free val treynor- (statId: 51, default: 0) 
LocalDate startDate = LocalDate.now(); // LocalDate | Starting parameter for time window
String stat = "stat_example"; // String | A stat type - /statistics endpoint
String ticker = "ticker_example"; // String | Ticker for security
Double varConfInterval = 3.4D; // Double | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
try {
    Object result = apiInstance.getSecurityPerformanceUsingGet(securityId, activePremiumPeriod, annualizedReturnPeriod, benchTicker, benchmarkId, endDate, histFactor, marDownSideDeviation, maxPercentileMonteCarlo, meanPercentileMonteCarlo, minPercentileMonteCarlo, movingAverageNDay, nDayReturns, nPathMonteCarlo, nRollingMaxDrawdown, nRollingVolatility, numSimMonteCarlo, periodType, riskFreeAlpha, riskFreeSharpe, riskFreeSortino, riskFreeTreynor, startDate, stat, ticker, varConfInterval);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PerformanceApi#getSecurityPerformanceUsingGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | [**UUID**](.md)| security_id |
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional]
 **benchTicker** | **String**| Bench Ticker for security - (default: ^GSPC)  | [optional]
 **benchmarkId** | [**UUID**](.md)| benchmark_id | [optional]
 **endDate** | **LocalDate**| Ending parameter for time window | [optional]
 **histFactor** | **Double**| Histogram factor- (statId: 39, default: 5) | [optional]
 **marDownSideDeviation** | **Double**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional]
 **maxPercentileMonteCarlo** | **Double**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional]
 **meanPercentileMonteCarlo** | **Double**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional]
 **minPercentileMonteCarlo** | **Double**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional]
 **movingAverageNDay** | **Integer**| number of days for moving average n-day - (statId: 18, default: 7) | [optional]
 **nDayReturns** | **Integer**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional]
 **nPathMonteCarlo** | **Integer**| number of points for a simulation- (statId: 62, default: 100) | [optional]
 **nRollingMaxDrawdown** | **Integer**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional]
 **nRollingVolatility** | **Integer**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional]
 **numSimMonteCarlo** | **Integer**| number of simulations - (statId: 62, default: 1000)  | [optional]
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional]
 **riskFreeAlpha** | **Double**| risk free val alpha - (statId: 52, default: 0) | [optional]
 **riskFreeSharpe** | **Double**| risk free val sharpe- (statId: 49, default: 0)  | [optional]
 **riskFreeSortino** | **Double**| risk free val sortino - (statId: 56, default: 0) | [optional]
 **riskFreeTreynor** | **Double**| risk free val treynor- (statId: 51, default: 0)  | [optional]
 **startDate** | **LocalDate**| Starting parameter for time window | [optional]
 **stat** | **String**| A stat type - /statistics endpoint | [optional]
 **ticker** | **String**| Ticker for security | [optional]
 **varConfInterval** | **Double**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

