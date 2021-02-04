# HydrogenNucleusApi.BusinessApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBusinessUsingPost**](BusinessApi.md#createBusinessUsingPost) | **POST** /business | Create a business
[**deleteBusinessUsingDelete**](BusinessApi.md#deleteBusinessUsingDelete) | **DELETE** /business/{business_id} | Delete a business
[**getBusinessAllUsingGet**](BusinessApi.md#getBusinessAllUsingGet) | **GET** /business | List all business
[**getBusinessAssetSizeUsingGet**](BusinessApi.md#getBusinessAssetSizeUsingGet) | **GET** /business/{business_id}/asset_size | List all business asset sizes
[**getBusinessClientTransactionAllUsingGet**](BusinessApi.md#getBusinessClientTransactionAllUsingGet) | **GET** /business/{business_id}/transaction | List all business transactions
[**getBusinessHoldingUsingGet**](BusinessApi.md#getBusinessHoldingUsingGet) | **GET** /business/{business_id}/holding | List all business holdings
[**getBusinessUsingGet**](BusinessApi.md#getBusinessUsingGet) | **GET** /business/{business_id} | Retrieve a business
[**updateBusinessUsingPut**](BusinessApi.md#updateBusinessUsingPut) | **PUT** /business/{business_id} | Update a business


<a name="createBusinessUsingPost"></a>
# **createBusinessUsingPost**
> Business createBusinessUsingPost(businessRequest)

Create a business

Create a new business, or register a new business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessRequest = new HydrogenNucleusApi.Business(); // Business | businessRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBusinessUsingPost(businessRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessRequest** | [**Business**](Business.md)| businessRequest | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteBusinessUsingDelete"></a>
# **deleteBusinessUsingDelete**
> deleteBusinessUsingDelete(businessId)

Delete a business

Permanently delete a business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID business_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteBusinessUsingDelete(businessId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**String**](.md)| UUID business_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessAllUsingGet"></a>
# **getBusinessAllUsingGet**
> PageBusiness getBusinessAllUsingGet(opts)

List all business

Get details for all business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'filter': "filter_example", // String | filter
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25 // Number | size
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBusinessAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageBusiness**](PageBusiness.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessAssetSizeUsingGet"></a>
# **getBusinessAssetSizeUsingGet**
> [AvailableDateDoubleVO] getBusinessAssetSizeUsingGet(businessId, opts)

List all business asset sizes

Get a list of asset sizes per date for a business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID business_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | Currency Code
  'endDate': new Date("null"), // Date | end date
  'excludeSubledger': false, // Boolean | exclude_subledger
  'getLatest': true, // Boolean | true or false
  'sortType': "sortType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
  'startDate': new Date("null") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBusinessAssetSizeUsingGet(businessId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**String**](.md)| UUID business_id | 
 **currencyConversion** | **String**| Currency Code | [optional] 
 **endDate** | **Date**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| exclude_subledger | [optional] [default to false]
 **getLatest** | **Boolean**| true or false | [optional] 
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **startDate** | **Date**| start date | [optional] [default to null]

### Return type

[**[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessClientTransactionAllUsingGet"></a>
# **getBusinessClientTransactionAllUsingGet**
> PagePortfolioTransaction getBusinessClientTransactionAllUsingGet(businessId, opts)

List all business transactions

Get the information for all transactions under all client registered with your business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID business_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'currencyConversion': "currencyConversion_example", // String | currency_conversion
  'endDate': "endDate_example", // String | end date - yyyy-mm-dd
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': "startDate_example" // String | start date - yyyy-mm-dd
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBusinessClientTransactionAllUsingGet(businessId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**String**](.md)| UUID business_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
 **endDate** | **String**| end date - yyyy-mm-dd | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessHoldingUsingGet"></a>
# **getBusinessHoldingUsingGet**
> [PortfolioHoldingAgg] getBusinessHoldingUsingGet(businessId, opts)

List all business holdings

Get a list of holdings for a business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID business_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | Currency Code
  'endDate': "endDate_example", // String | end date - yyyy-mm-dd
  'getLatest': true, // Boolean | true or false
  'startDate': "startDate_example" // String | start date - yyyy-mm-dd
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBusinessHoldingUsingGet(businessId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**String**](.md)| UUID business_id | 
 **currencyConversion** | **String**| Currency Code | [optional] 
 **endDate** | **String**| end date - yyyy-mm-dd | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **startDate** | **String**| start date - yyyy-mm-dd | [optional] 

### Return type

[**[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getBusinessUsingGet"></a>
# **getBusinessUsingGet**
> Business getBusinessUsingGet(businessId)

Retrieve a business

Retrieve the information for a business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var businessId = "\"2035f52d-2c5b-4e07-8904-cb037bad7aff\""; // String | UUID business_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBusinessUsingGet(businessId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | [**String**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateBusinessUsingPut"></a>
# **updateBusinessUsingPut**
> Business updateBusinessUsingPut(business, businessId)

Update a business

Update the information for a business.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.BusinessApi();

var business = null; // Object | business

var businessId = "\"d79bb3a3-f259-430c-8fa8-a93f87cc3bdf\""; // String | UUID business_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBusinessUsingPut(business, businessId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business** | **Object**| business | 
 **businessId** | [**String**](.md)| UUID business_id | 

### Return type

[**Business**](Business.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

