# HydrogenNucleusApi.PerformanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAccountPerformanceUsingGet**](PerformanceApi.md#getAccountPerformanceUsingGet) | **GET** /account/{account_id}/performance | Account Performance
[**getAllocationPerformanceUsingGet**](PerformanceApi.md#getAllocationPerformanceUsingGet) | **GET** /allocation/{allocation_id}/performance | Allocation Performance
[**getBenchmarkPerformanceUsingGet**](PerformanceApi.md#getBenchmarkPerformanceUsingGet) | **GET** /benchmark/{benchmark_id}/performance | Benchmark Performance
[**getClientPerformanceUsingGet**](PerformanceApi.md#getClientPerformanceUsingGet) | **GET** /client/{client_id}/performance | Client Performance
[**getGoalPerformanceUsingGet**](PerformanceApi.md#getGoalPerformanceUsingGet) | **GET** /goal/{goal_id}/performance | Goal Performance
[**getModelPerformanceUsingGet**](PerformanceApi.md#getModelPerformanceUsingGet) | **GET** /model/{model_id}/performance | Model Performance
[**getPortfolioPerformanceUsingGet**](PerformanceApi.md#getPortfolioPerformanceUsingGet) | **GET** /portfolio/{portfolio_id}/performance | Portfolio Performance
[**getSecurityPerformanceUsingGet**](PerformanceApi.md#getSecurityPerformanceUsingGet) | **GET** /security/{security_id}/performance | Security Performance


<a name="getAccountPerformanceUsingGet"></a>
# **getAccountPerformanceUsingGet**
> Object getAccountPerformanceUsingGet(accountId, opts)

Account Performance

Get information on the performance of an account using IRR (Internal Rate of Return). You must provide the unique account_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var accountId = "accountId_example"; // String | Account Id -/account

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Client Benchmark or Tenant Benchmark id -/benchmark
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | A stat type - /statistics
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAccountPerformanceUsingGet(accountId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id -/account | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type - /statistics | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllocationPerformanceUsingGet"></a>
# **getAllocationPerformanceUsingGet**
> {&#39;String&#39;: Object} getAllocationPerformanceUsingGet(allocationId, opts)

Allocation Performance

Get information on the performance of an allocation using TWR (Time Weighted Return). You must provide the unique allocation_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var allocationId = "allocationId_example"; // String | Allocation Id -/allocation

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Tenant Benchmark Id -/benchmark
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'isCurrentWeight': true, // Boolean | is_current_weight
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | A stat type found under the Statistics banner
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllocationPerformanceUsingGet(allocationId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocationId** | **String**| Allocation Id -/allocation | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Tenant Benchmark Id -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **isCurrentWeight** | **Boolean**| is_current_weight | [optional] [default to true]
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type found under the Statistics banner | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**{&#39;String&#39;: Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBenchmarkPerformanceUsingGet"></a>
# **getBenchmarkPerformanceUsingGet**
> Object getBenchmarkPerformanceUsingGet(benchmarkId, opts)

Benchmark Performance

Get information on the performance of a benchmark using TWR (Time Weighted Return). You must provide the unique benchmark_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var benchmarkId = "benchmarkId_example"; // String | Benchmark Id - /benchmark

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'comparisonBenchmarkId': "comparisonBenchmarkId_example", // String | comparison_benchmark_id
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | Stat type - /statistics endpoint
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBenchmarkPerformanceUsingGet(benchmarkId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmarkId** | **String**| Benchmark Id - /benchmark | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **comparisonBenchmarkId** | **String**| comparison_benchmark_id | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| Stat type - /statistics endpoint | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getClientPerformanceUsingGet"></a>
# **getClientPerformanceUsingGet**
> Object getClientPerformanceUsingGet(clientId, opts)

Client Performance

Get information on the performance of a client using IRR (Internal Rate of Return). You must provide the unique client_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var clientId = "clientId_example"; // String | Client Id -/client

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Client Benchmark or Tenant Benchmark id -/benchmark
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | A stat type -- /statistics
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getClientPerformanceUsingGet(clientId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client Id -/client | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type -- /statistics | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getGoalPerformanceUsingGet"></a>
# **getGoalPerformanceUsingGet**
> Object getGoalPerformanceUsingGet(clientId, goalId, opts)

Goal Performance

Get information on the performance of a goal using IRR (Internal Rate of Return). You must provide the unique goal_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var clientId = "clientId_example"; // String | Client associated with the account - /client

var goalId = "goalId_example"; // String | Goal Id - /account

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Client Benchmark or Tenant Benchmark id -/benchmark
  'endDate': new Date("null"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'portfolioGoal': false, // Boolean | portfolio_goal
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("null"), // Date | start date
  'stat': "stat_example", // String | A stat type - /statistics
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getGoalPerformanceUsingGet(clientId, goalId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientId** | **String**| Client associated with the account - /client | 
 **goalId** | **String**| Goal Id - /account | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Client Benchmark or Tenant Benchmark id -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] [default to null]
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **portfolioGoal** | **Boolean**| portfolio_goal | [optional] [default to false]
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] [default to null]
 **stat** | **String**| A stat type - /statistics | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getModelPerformanceUsingGet"></a>
# **getModelPerformanceUsingGet**
> Object getModelPerformanceUsingGet(modelId, opts)

Model Performance

Get information on the performance of a model using TWR (Time Weighted Return). You must provide the unique model_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var modelId = "modelId_example"; // String | Model Id - /model

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Tenant Benchmark Id -/benchmark
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | Stat Type
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getModelPerformanceUsingGet(modelId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modelId** | **String**| Model Id - /model | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Tenant Benchmark Id -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| Stat Type | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioPerformanceUsingGet"></a>
# **getPortfolioPerformanceUsingGet**
> Object getPortfolioPerformanceUsingGet(accountId, clientId, portfolioId, portfolioid, opts)

Portfolio Performance

Get information on the performance of a portfolio using IRR (Internal Rate of Return). You must provide the unique portfolio_id.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var accountId = "accountId_example"; // String | Account Id -/account

var clientId = "clientId_example"; // String | Client Id -/client

var portfolioId = "portfolioId_example"; // String | portfolio_id

var portfolioid = "portfolioid_example"; // String | Portfolio Id -/portoflio

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchmarkId': "benchmarkId_example", // String | Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark
  'endDate': new Date("2013-10-20"), // Date | end date
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | start date
  'stat': "stat_example", // String | A stat type - /statistics endpoint to get types
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getPortfolioPerformanceUsingGet(accountId, clientId, portfolioId, portfolioid, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id -/account | 
 **clientId** | **String**| Client Id -/client | 
 **portfolioId** | **String**| portfolio_id | 
 **portfolioid** | **String**| Portfolio Id -/portoflio | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchmarkId** | **String**| Benchmark Id - benchmarkId or clientBenchmarkId -/benchmark | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| start date | [optional] 
 **stat** | **String**| A stat type - /statistics endpoint to get types | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPerformanceUsingGet"></a>
# **getSecurityPerformanceUsingGet**
> Object getSecurityPerformanceUsingGet(securityId, opts)

Security Performance

Get performance statistics for a security using TWR (Time Weighted Return). You must provide the unique security_id

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.PerformanceApi();

var securityId = "securityId_example"; // String | security_id

var opts = { 
  'activePremiumPeriod': "activePremiumPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'annualizedReturnPeriod': "annualizedReturnPeriod_example", // String | Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: 'D')
  'benchTicker': "benchTicker_example", // String | Bench Ticker for security - (default: ^GSPC) 
  'benchmarkId': "benchmarkId_example", // String | benchmark_id
  'endDate': new Date("2013-10-20"), // Date | Ending parameter for time window
  'histFactor': 1.2, // Number | Histogram factor- (statId: 39, default: 5)
  'marDownSideDeviation': 1.2, // Number | minimum acceptable return for downside deviation - (statId: 58, default: 0) 
  'maxPercentileMonteCarlo': 1.2, // Number | max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95)
  'meanPercentileMonteCarlo': 1.2, // Number | mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50)
  'minPercentileMonteCarlo': 1.2, // Number | min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5)
  'movingAverageNDay': 56, // Number | number of days for moving average n-day - (statId: 18, default: 7)
  'nDayReturns': 56, // Number | number of days for Rolling n-day returns - (statId: 2, default: 7)  
  'nPathMonteCarlo': 56, // Number | number of points for a simulation- (statId: 62, default: 100)
  'nRollingMaxDrawdown': 56, // Number | number of days for Rolling n-day max drawdown- (statId: 46, default: 7)
  'nRollingVolatility': 56, // Number | number of days for Rolling n-day volatility- (statId: 34, default: 7)
  'numSimMonteCarlo': 56, // Number | number of simulations - (statId: 62, default: 1000) 
  'periodType': "periodType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: 'D')
  'riskFreeAlpha': 1.2, // Number | risk free val alpha - (statId: 52, default: 0)
  'riskFreeSharpe': 1.2, // Number | risk free val sharpe- (statId: 49, default: 0) 
  'riskFreeSortino': 1.2, // Number | risk free val sortino - (statId: 56, default: 0)
  'riskFreeTreynor': 1.2, // Number | risk free val treynor- (statId: 51, default: 0) 
  'startDate': new Date("2013-10-20"), // Date | Starting parameter for time window
  'stat': "stat_example", // String | A stat type - /statistics endpoint
  'ticker': "ticker_example", // String | Ticker for security
  'varConfInterval': 1.2 // Number | VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95)
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityPerformanceUsingGet(securityId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | **String**| security_id | 
 **activePremiumPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **annualizedReturnPeriod** | **String**| Q (quarterly), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () - (statId: 19, default: &#39;D&#39;) | [optional] 
 **benchTicker** | **String**| Bench Ticker for security - (default: ^GSPC)  | [optional] 
 **benchmarkId** | **String**| benchmark_id | [optional] 
 **endDate** | **Date**| Ending parameter for time window | [optional] 
 **histFactor** | **Number**| Histogram factor- (statId: 39, default: 5) | [optional] 
 **marDownSideDeviation** | **Number**| minimum acceptable return for downside deviation - (statId: 58, default: 0)  | [optional] 
 **maxPercentileMonteCarlo** | **Number**| max percentile for monte carlo, i.entity. 80 - (statId: 62, default: 95) | [optional] 
 **meanPercentileMonteCarlo** | **Number**| mean percentile for monte carlo i.entity. 50- (statId: 62, default: 50) | [optional] 
 **minPercentileMonteCarlo** | **Number**| min percentile for monte carlo i.entity. 20 - (statId: 62, default: 5) | [optional] 
 **movingAverageNDay** | **Number**| number of days for moving average n-day - (statId: 18, default: 7) | [optional] 
 **nDayReturns** | **Number**| number of days for Rolling n-day returns - (statId: 2, default: 7)   | [optional] 
 **nPathMonteCarlo** | **Number**| number of points for a simulation- (statId: 62, default: 100) | [optional] 
 **nRollingMaxDrawdown** | **Number**| number of days for Rolling n-day max drawdown- (statId: 46, default: 7) | [optional] 
 **nRollingVolatility** | **Number**| number of days for Rolling n-day volatility- (statId: 34, default: 7) | [optional] 
 **numSimMonteCarlo** | **Number**| number of simulations - (statId: 62, default: 1000)  | [optional] 
 **periodType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () -Carries out stats on either daily, monthly, annually or quarterly dates (default: &#39;D&#39;) | [optional] 
 **riskFreeAlpha** | **Number**| risk free val alpha - (statId: 52, default: 0) | [optional] 
 **riskFreeSharpe** | **Number**| risk free val sharpe- (statId: 49, default: 0)  | [optional] 
 **riskFreeSortino** | **Number**| risk free val sortino - (statId: 56, default: 0) | [optional] 
 **riskFreeTreynor** | **Number**| risk free val treynor- (statId: 51, default: 0)  | [optional] 
 **startDate** | **Date**| Starting parameter for time window | [optional] 
 **stat** | **String**| A stat type - /statistics endpoint | [optional] 
 **ticker** | **String**| Ticker for security | [optional] 
 **varConfInterval** | **Number**| VaR Confidence Interval ( alpha ) i.entity 99, 95, etc - (statId: 40, default: 95) | [optional] 

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

