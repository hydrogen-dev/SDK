# HydrogenNucleusApi.HouseholdApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHouseholdUsingPost**](HouseholdApi.md#createHouseholdUsingPost) | **POST** /household | Create a Household
[**deleteHouseholdUsingDelete**](HouseholdApi.md#deleteHouseholdUsingDelete) | **DELETE** /household/{household_id} | Delete a Household
[**getHouseholdAllUsingGet**](HouseholdApi.md#getHouseholdAllUsingGet) | **GET** /household | List all household
[**getHouseholdClientAssetSizeUsingGet**](HouseholdApi.md#getHouseholdClientAssetSizeUsingGet) | **GET** /household/{household_id}/asset_size | List all household client asset sizes
[**getHouseholdClientHoldingUsingGet**](HouseholdApi.md#getHouseholdClientHoldingUsingGet) | **GET** /household/{household_id}/holding | List all household&#39;s clientIds holdings
[**getHouseholdClientTransactionUsingGet**](HouseholdApi.md#getHouseholdClientTransactionUsingGet) | **GET** /household/{household_id}/transaction | List all household&#39;s client ids transactions
[**getHouseholdUsingGet**](HouseholdApi.md#getHouseholdUsingGet) | **GET** /household/{household_id} | Retrieve a Household
[**updateHouseholdUsingPut**](HouseholdApi.md#updateHouseholdUsingPut) | **PUT** /household/{household_id} | Update a Household


<a name="createHouseholdUsingPost"></a>
# **createHouseholdUsingPost**
> Household createHouseholdUsingPost(household)

Create a Household

Create a new household, with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var household = new HydrogenNucleusApi.Household(); // Household | household


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createHouseholdUsingPost(household, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteHouseholdUsingDelete"></a>
# **deleteHouseholdUsingDelete**
> deleteHouseholdUsingDelete(householdId)

Delete a Household

Permanently delete a household

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var householdId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID household_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteHouseholdUsingDelete(householdId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | **String**| UUID household_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdAllUsingGet"></a>
# **getHouseholdAllUsingGet**
> PageHousehold getHouseholdAllUsingGet(opts)

List all household

Get details for all Household.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

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
apiInstance.getHouseholdAllUsingGet(opts, callback);
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

[**PageHousehold**](PageHousehold.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdClientAssetSizeUsingGet"></a>
# **getHouseholdClientAssetSizeUsingGet**
> [AvailableDateDoubleVO] getHouseholdClientAssetSizeUsingGet(householdId, opts)

List all household client asset sizes

Get a list of asset sizes per date for a client&#39;s household.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var householdId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID household_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | USD
  'endDate': new Date("null"), // Date | end date
  'excludeSubledger': true, // Boolean | true or false
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
apiInstance.getHouseholdClientAssetSizeUsingGet(householdId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | **String**| UUID household_id | 
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date | [optional] [default to null]
 **excludeSubledger** | **Boolean**| true or false | [optional] 
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

<a name="getHouseholdClientHoldingUsingGet"></a>
# **getHouseholdClientHoldingUsingGet**
> [PortfolioHoldingAgg] getHouseholdClientHoldingUsingGet(householdId, opts)

List all household&#39;s clientIds holdings

Get the information for all the securities that are currently being held by a household&#39;s client ids registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var householdId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID household_id

var opts = { 
  'currencyConversion': "currencyConversion_example", // String | USD
  'endDate': new Date("2013-10-20"), // Date | end date - yyyy-mm-dd
  'getLatest': true, // Boolean | true or false
  'startDate': new Date("2013-10-20") // Date | start date - yyyy-mm-dd
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHouseholdClientHoldingUsingGet(householdId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | **String**| UUID household_id | 
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date - yyyy-mm-dd | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **startDate** | **Date**| start date - yyyy-mm-dd | [optional] 

### Return type

[**[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdClientTransactionUsingGet"></a>
# **getHouseholdClientTransactionUsingGet**
> PagePortfolioTransaction getHouseholdClientTransactionUsingGet(householdId, opts)

List all household&#39;s client ids transactions

Get the information for all transactions under a household client ids registered with your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var householdId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID household_id

var opts = { 
  'ascending': false, // Boolean | ascending
  'currencyConversion': "currencyConversion_example", // String | USD
  'endDate': new Date("2013-10-20"), // Date | end date
  'orderBy': "update_date", // String | order_by
  'page': 0, // Number | page
  'size': 25, // Number | size
  'startDate': new Date("2013-10-20") // Date | start date
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHouseholdClientTransactionUsingGet(householdId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | **String**| UUID household_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start date | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getHouseholdUsingGet"></a>
# **getHouseholdUsingGet**
> Household getHouseholdUsingGet(householdId)

Retrieve a Household

Retrieve the information for a Household.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var householdId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID household_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getHouseholdUsingGet(householdId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **householdId** | **String**| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateHouseholdUsingPut"></a>
# **updateHouseholdUsingPut**
> Household updateHouseholdUsingPut(household, householdId)

Update a Household

Update the information for a Household.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.HouseholdApi();

var household = new HydrogenNucleusApi.Household(); // Household | household

var householdId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID household_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateHouseholdUsingPut(household, householdId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **household** | [**Household**](Household.md)| household | 
 **householdId** | **String**| UUID household_id | 

### Return type

[**Household**](Household.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

