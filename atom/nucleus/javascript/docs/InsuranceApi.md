# HydrogenNucleusApi.InsuranceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createInsuranceCoverageUsingPost**](InsuranceApi.md#createInsuranceCoverageUsingPost) | **POST** /insurance_coverage | Create a insurance coverage request
[**createInsuranceDiscountUsingPost**](InsuranceApi.md#createInsuranceDiscountUsingPost) | **POST** /insurance_discount | Create a insurance discount request
[**createInsuranceQuoteUsingPost**](InsuranceApi.md#createInsuranceQuoteUsingPost) | **POST** /insurance_quote | Create a insuranceQuote request
[**deleteInsuranceCoverageUsingDelete**](InsuranceApi.md#deleteInsuranceCoverageUsingDelete) | **DELETE** /insurance_coverage/{insurance_coverage_id} | Delete an insurance coverage request
[**deleteInsuranceDiscountUsingDelete**](InsuranceApi.md#deleteInsuranceDiscountUsingDelete) | **DELETE** /insurance_discount/{insurance_discount_id} | Delete an insurance discount request
[**deleteInsuranceQuoteUsingDelete**](InsuranceApi.md#deleteInsuranceQuoteUsingDelete) | **DELETE** /insurance_quote/{insurance_quote_id} | Delete a insuranceQuote request
[**getInsuranceCoverageAllUsingGet**](InsuranceApi.md#getInsuranceCoverageAllUsingGet) | **GET** /insurance_coverage | Get all insurance coverage request
[**getInsuranceCoverageUsingGet**](InsuranceApi.md#getInsuranceCoverageUsingGet) | **GET** /insurance_coverage/{insurance_coverage_id} | Get a insurance coverage request
[**getInsuranceDiscountAllUsingGet**](InsuranceApi.md#getInsuranceDiscountAllUsingGet) | **GET** /insurance_discount | Get all insurance discount request
[**getInsuranceDiscountUsingGet**](InsuranceApi.md#getInsuranceDiscountUsingGet) | **GET** /insurance_discount/{insurance_discount_id} | Get a insurance discount request
[**getInsuranceQuoteAllUsingGet**](InsuranceApi.md#getInsuranceQuoteAllUsingGet) | **GET** /insurance_quote | List all insuranceQuote requests
[**getInsuranceQuoteUsingGet**](InsuranceApi.md#getInsuranceQuoteUsingGet) | **GET** /insurance_quote/{insurance_quote_id} | Retrieve a insuranceQuote request
[**updateInsuranceCoverageUsingPut**](InsuranceApi.md#updateInsuranceCoverageUsingPut) | **PUT** /insurance_coverage/{insurance_coverage_id} | Update a insurance coverage request
[**updateInsuranceDiscountUsingPut**](InsuranceApi.md#updateInsuranceDiscountUsingPut) | **PUT** /insurance_discount/{insurance_discount_id} | Update an insurance discount 
[**updateInsuranceQuoteUsingPut**](InsuranceApi.md#updateInsuranceQuoteUsingPut) | **PUT** /insurance_quote/{insurance_quote_id} | Update a insuranceQuote request


<a name="createInsuranceCoverageUsingPost"></a>
# **createInsuranceCoverageUsingPost**
> InsuranceCoverage createInsuranceCoverageUsingPost(insuranceCoverage)

Create a insurance coverage request

Create a new insurance coverage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceCoverage = new HydrogenNucleusApi.InsuranceCoverage(); // InsuranceCoverage | insuranceCoverage


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createInsuranceCoverageUsingPost(insuranceCoverage, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insuranceCoverage | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInsuranceDiscountUsingPost"></a>
# **createInsuranceDiscountUsingPost**
> InsuranceDiscount createInsuranceDiscountUsingPost(insuranceDiscount)

Create a insurance discount request

Create a new insurance discount.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceDiscount = new HydrogenNucleusApi.InsuranceDiscount(); // InsuranceDiscount | insuranceDiscount


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createInsuranceDiscountUsingPost(insuranceDiscount, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insuranceDiscount | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInsuranceQuoteUsingPost"></a>
# **createInsuranceQuoteUsingPost**
> InsuranceQuote createInsuranceQuoteUsingPost(insuranceQuote)

Create a insuranceQuote request

Create a new insuranceQuote request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceQuote = new HydrogenNucleusApi.InsuranceQuote(); // InsuranceQuote | insuranceQuote


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createInsuranceQuoteUsingPost(insuranceQuote, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**InsuranceQuote**](InsuranceQuote.md)| insuranceQuote | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteInsuranceCoverageUsingDelete"></a>
# **deleteInsuranceCoverageUsingDelete**
> deleteInsuranceCoverageUsingDelete(insuranceCoverageId)

Delete an insurance coverage request

Delete an  insurance coverage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceCoverageId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID insurance_coverage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteInsuranceCoverageUsingDelete(insuranceCoverageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverageId** | **String**| UUID insurance_coverage_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInsuranceDiscountUsingDelete"></a>
# **deleteInsuranceDiscountUsingDelete**
> deleteInsuranceDiscountUsingDelete(insuranceDiscountId)

Delete an insurance discount request

Delete an  insurance discount.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceDiscountId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID insurance_discount_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteInsuranceDiscountUsingDelete(insuranceDiscountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscountId** | **String**| UUID insurance_discount_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteInsuranceQuoteUsingDelete"></a>
# **deleteInsuranceQuoteUsingDelete**
> deleteInsuranceQuoteUsingDelete(insuranceQuote, insuranceQuoteId)

Delete a insuranceQuote request

Permanently delete a insuranceQuote request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceQuote = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID insurance_quote_id

var insuranceQuoteId = "insuranceQuoteId_example"; // String | insurance_quote_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteInsuranceQuoteUsingDelete(insuranceQuote, insuranceQuoteId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | **String**| UUID insurance_quote_id | 
 **insuranceQuoteId** | **String**| insurance_quote_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceCoverageAllUsingGet"></a>
# **getInsuranceCoverageAllUsingGet**
> PageInsuranceCoverage getInsuranceCoverageAllUsingGet(opts)

Get all insurance coverage request

Get all new insurance coverage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

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
apiInstance.getInsuranceCoverageAllUsingGet(opts, callback);
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

[**PageInsuranceCoverage**](PageInsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceCoverageUsingGet"></a>
# **getInsuranceCoverageUsingGet**
> InsuranceCoverage getInsuranceCoverageUsingGet(insuranceCoverageId)

Get a insurance coverage request

Get a new insurance coverage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceCoverageId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID insurance_coverage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInsuranceCoverageUsingGet(insuranceCoverageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverageId** | **String**| UUID insurance_coverage_id | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceDiscountAllUsingGet"></a>
# **getInsuranceDiscountAllUsingGet**
> PageInsuranceDiscount getInsuranceDiscountAllUsingGet(opts)

Get all insurance discount request

Get all new insurance discount.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

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
apiInstance.getInsuranceDiscountAllUsingGet(opts, callback);
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

[**PageInsuranceDiscount**](PageInsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceDiscountUsingGet"></a>
# **getInsuranceDiscountUsingGet**
> InsuranceDiscount getInsuranceDiscountUsingGet(insuranceDiscountId)

Get a insurance discount request

Get a new insurance discount.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceDiscountId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String |  UUID insurance_discount_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInsuranceDiscountUsingGet(insuranceDiscountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscountId** | **String**|  UUID insurance_discount_id | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceQuoteAllUsingGet"></a>
# **getInsuranceQuoteAllUsingGet**
> PageInsuranceQuote getInsuranceQuoteAllUsingGet(opts)

List all insuranceQuote requests

Get the information for all insuranceQuote requests.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

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
apiInstance.getInsuranceQuoteAllUsingGet(opts, callback);
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

[**PageInsuranceQuote**](PageInsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getInsuranceQuoteUsingGet"></a>
# **getInsuranceQuoteUsingGet**
> InsuranceQuote getInsuranceQuoteUsingGet(insuranceQuote, insuranceQuoteId)

Retrieve a insuranceQuote request

Retrieve the information for a insuranceQuote request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceQuote = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID insurance_quote_id

var insuranceQuoteId = "insuranceQuoteId_example"; // String | insurance_quote_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getInsuranceQuoteUsingGet(insuranceQuote, insuranceQuoteId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | **String**| UUID insurance_quote_id | 
 **insuranceQuoteId** | **String**| insurance_quote_id | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateInsuranceCoverageUsingPut"></a>
# **updateInsuranceCoverageUsingPut**
> InsuranceCoverage updateInsuranceCoverageUsingPut(insuranceCoverage, insuranceCoverageId)

Update a insurance coverage request

Update a new insurance coverage.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceCoverage = new HydrogenNucleusApi.InsuranceCoverage(); // InsuranceCoverage | insurance_coverage

var insuranceCoverageId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID insurance_coverage_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInsuranceCoverageUsingPut(insuranceCoverage, insuranceCoverageId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceCoverage** | [**InsuranceCoverage**](InsuranceCoverage.md)| insurance_coverage | 
 **insuranceCoverageId** | **String**| UUID insurance_coverage_id | 

### Return type

[**InsuranceCoverage**](InsuranceCoverage.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInsuranceDiscountUsingPut"></a>
# **updateInsuranceDiscountUsingPut**
> InsuranceDiscount updateInsuranceDiscountUsingPut(insuranceDiscount, insuranceDiscountId)

Update an insurance discount 

Update an new insurance .

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceDiscount = new HydrogenNucleusApi.InsuranceDiscount(); // InsuranceDiscount | insurance_discount

var insuranceDiscountId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID insurance_discount_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInsuranceDiscountUsingPut(insuranceDiscount, insuranceDiscountId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceDiscount** | [**InsuranceDiscount**](InsuranceDiscount.md)| insurance_discount | 
 **insuranceDiscountId** | **String**| UUID insurance_discount_id | 

### Return type

[**InsuranceDiscount**](InsuranceDiscount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateInsuranceQuoteUsingPut"></a>
# **updateInsuranceQuoteUsingPut**
> InsuranceQuote updateInsuranceQuoteUsingPut(insuranceQuote, insuranceQuoteId)

Update a insuranceQuote request

Update the information for a insuranceQuote request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.InsuranceApi();

var insuranceQuote = new HydrogenNucleusApi.InsuranceQuote(); // InsuranceQuote | insurance_quote

var insuranceQuoteId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID insurance_quote_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateInsuranceQuoteUsingPut(insuranceQuote, insuranceQuoteId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insuranceQuote** | [**InsuranceQuote**](InsuranceQuote.md)| insurance_quote | 
 **insuranceQuoteId** | **String**| UUID insurance_quote_id | 

### Return type

[**InsuranceQuote**](InsuranceQuote.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

