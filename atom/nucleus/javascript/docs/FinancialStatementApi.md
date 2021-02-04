# HydrogenNucleusApi.FinancialStatementApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialStatementUsingPost**](FinancialStatementApi.md#createFinancialStatementUsingPost) | **POST** /financial_statement | Create an financialStatement
[**deleteFinancialStatementUsingDelete**](FinancialStatementApi.md#deleteFinancialStatementUsingDelete) | **DELETE** /financial_statement/{financial_statement_id} | Delete an financialStatement
[**getFinancialStatementAllUsingGet**](FinancialStatementApi.md#getFinancialStatementAllUsingGet) | **GET** /financial_statement | List all financialStatement
[**getFinancialStatementUsingGet**](FinancialStatementApi.md#getFinancialStatementUsingGet) | **GET** /financial_statement/{financial_statement_id} | Retrieve an financialStatement
[**updateFinancialStatementUsingPut**](FinancialStatementApi.md#updateFinancialStatementUsingPut) | **PUT** /financial_statement/{financial_statement_id} | Update an financialStatement


<a name="createFinancialStatementUsingPost"></a>
# **createFinancialStatementUsingPost**
> FinancialStatement createFinancialStatementUsingPost(financialStatement)

Create an financialStatement

Store stats pulled from financialStatement vendors.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FinancialStatementApi();

var financialStatement = new HydrogenNucleusApi.FinancialStatement(); // FinancialStatement | financialStatement


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createFinancialStatementUsingPost(financialStatement, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatement** | [**FinancialStatement**](FinancialStatement.md)| financialStatement | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFinancialStatementUsingDelete"></a>
# **deleteFinancialStatementUsingDelete**
> deleteFinancialStatementUsingDelete(financialStatementId)

Delete an financialStatement

Permanently delete an financialStatement.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FinancialStatementApi();

var financialStatementId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID financialStatement_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteFinancialStatementUsingDelete(financialStatementId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementId** | [**String**](.md)| UUID financialStatement_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialStatementAllUsingGet"></a>
# **getFinancialStatementAllUsingGet**
> PageFinancialStatement getFinancialStatementAllUsingGet(opts)

List all financialStatement

Get information for all financialStatement for all clients defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FinancialStatementApi();

var opts = { 
  'ascending': false, // Boolean | ascending
  'currencyConversion': "currencyConversion_example", // String | currency_conversion
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
apiInstance.getFinancialStatementAllUsingGet(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| currency_conversion | [optional] 
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageFinancialStatement**](PageFinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialStatementUsingGet"></a>
# **getFinancialStatementUsingGet**
> FinancialStatement getFinancialStatementUsingGet(financialStatementId, opts)

Retrieve an financialStatement

Retrieve the information for a specific financialStatement associated with a client.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FinancialStatementApi();

var financialStatementId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID financial_statement_id

var opts = { 
  'currencyConversion': "currencyConversion_example" // String | USD
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getFinancialStatementUsingGet(financialStatementId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatementId** | [**String**](.md)| UUID financial_statement_id | 
 **currencyConversion** | **String**| USD | [optional] 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFinancialStatementUsingPut"></a>
# **updateFinancialStatementUsingPut**
> FinancialStatement updateFinancialStatementUsingPut(financialStatement, financialStatementId)

Update an financialStatement

Update the information for an financialStatement.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.FinancialStatementApi();

var financialStatement = null; // Object | financialStatement

var financialStatementId = "\"f96fad3e-a8cf-4915-bc0c-da4d9693ab83\""; // String | UUID financialStatement_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateFinancialStatementUsingPut(financialStatement, financialStatementId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialStatement** | **Object**| financialStatement | 
 **financialStatementId** | [**String**](.md)| UUID financialStatement_id | 

### Return type

[**FinancialStatement**](FinancialStatement.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

