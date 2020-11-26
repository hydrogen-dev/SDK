# HydrogenNucleusApi.ResourceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFxRateBulkUsingPost**](ResourceApi.md#createFxRateBulkUsingPost) | **POST** /resource/fx_rate | Create a bulk fxRate
[**getAllCountryUsingGet**](ResourceApi.md#getAllCountryUsingGet) | **GET** /resource/country | Get All Countries
[**getAllCurrencyUsingGet**](ResourceApi.md#getAllCurrencyUsingGet) | **GET** /resource/currency | Get All Currencies
[**getAllMerchantCategoryCodeUsingGet**](ResourceApi.md#getAllMerchantCategoryCodeUsingGet) | **GET** /resource/merchant_category_code | Get All Merchant Category Codes
[**getAllStatesUsingGet**](ResourceApi.md#getAllStatesUsingGet) | **GET** /resource/state | List all state resource
[**getAllStatisticsUsingGet**](ResourceApi.md#getAllStatisticsUsingGet) | **GET** /resource/statistic | List all statistic resource
[**getCurrencyExchangeRateAllUsingGet**](ResourceApi.md#getCurrencyExchangeRateAllUsingGet) | **GET** /resource/fx_rate | List all fxRates


<a name="createFxRateBulkUsingPost"></a>
# **createFxRateBulkUsingPost**
> [FxRate] createFxRateBulkUsingPost(fxRateList)

Create a bulk fxRate

Create a bulk fxRate.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var fxRateList = [new HydrogenNucleusApi.FxRate()]; // [FxRate] | fxRateList


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFxRateBulkUsingPost(fxRateList, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fxRateList** | [**[FxRate]**](FxRate.md)| fxRateList | 

### Return type

[**[FxRate]**](FxRate.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAllCountryUsingGet"></a>
# **getAllCountryUsingGet**
> [Country] getAllCountryUsingGet()

Get All Countries

Get All Countries. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllCountryUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Country]**](Country.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllCurrencyUsingGet"></a>
# **getAllCurrencyUsingGet**
> [Currency] getAllCurrencyUsingGet()

Get All Currencies

Get All Currencies. 

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllCurrencyUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[Currency]**](Currency.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllMerchantCategoryCodeUsingGet"></a>
# **getAllMerchantCategoryCodeUsingGet**
> [MerchantCategoryCode] getAllMerchantCategoryCodeUsingGet()

Get All Merchant Category Codes

Get All Merchant Category Codes.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllMerchantCategoryCodeUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**[MerchantCategoryCode]**](MerchantCategoryCode.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStatesUsingGet"></a>
# **getAllStatesUsingGet**
> [State] getAllStatesUsingGet(opts)

List all state resource

Get the information for all possible state resource.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var opts = { 
  'countryCode': "US" // String | country_code
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllStatesUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **countryCode** | **String**| country_code | [optional] [default to US]

### Return type

[**[State]**](State.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllStatisticsUsingGet"></a>
# **getAllStatisticsUsingGet**
> {&#39;String&#39;: [StatisticResourceVO]} getAllStatisticsUsingGet()

List all statistic resource

Get the information for all possible statistic resource.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getAllStatisticsUsingGet(callback);
```

### Parameters
This endpoint does not need any parameter.

### Return type

**{&#39;String&#39;: [StatisticResourceVO]}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyExchangeRateAllUsingGet"></a>
# **getCurrencyExchangeRateAllUsingGet**
> [FxRateView] getCurrencyExchangeRateAllUsingGet(opts)

List all fxRates

Get information for all fxRates defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.ResourceApi();

var opts = { 
  'filter': "filter_example" // String | filter
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getCurrencyExchangeRateAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **String**| filter | [optional] 

### Return type

[**[FxRateView]**](FxRateView.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

