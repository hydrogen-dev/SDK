# HydrogenNucleusApi.SecuritiesApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createSecurityExclusionUsingPost**](SecuritiesApi.md#createSecurityExclusionUsingPost) | **POST** /security_exclusion | Create a security exclusion
[**createSecurityPriceUsingPost**](SecuritiesApi.md#createSecurityPriceUsingPost) | **POST** /security_price | Create a security price
[**createSecurityUsingPost**](SecuritiesApi.md#createSecurityUsingPost) | **POST** /security | Create a security
[**deleteSecurityExclusionUsingDelete**](SecuritiesApi.md#deleteSecurityExclusionUsingDelete) | **DELETE** /security_exclusion/{security_exclusion_id} | Delete a security exclusion
[**deleteSecurityPriceUsingDelete**](SecuritiesApi.md#deleteSecurityPriceUsingDelete) | **DELETE** /security_price/{security_price_id} | Delete a security price
[**deleteSecurityUsingDelete**](SecuritiesApi.md#deleteSecurityUsingDelete) | **DELETE** /security/{security_id} | Delete a security
[**getSecurityAllUsingGet**](SecuritiesApi.md#getSecurityAllUsingGet) | **GET** /security | List all securities
[**getSecurityExclusionAllUsingGet**](SecuritiesApi.md#getSecurityExclusionAllUsingGet) | **GET** /security_exclusion | List all security exclusions
[**getSecurityExclusionUsingGet**](SecuritiesApi.md#getSecurityExclusionUsingGet) | **GET** /security_exclusion/{security_exclusion_id} | Retrieve a security exclusion
[**getSecurityPriceAllUsingGet**](SecuritiesApi.md#getSecurityPriceAllUsingGet) | **GET** /security_price | List all security prices
[**getSecurityPriceUsingGet**](SecuritiesApi.md#getSecurityPriceUsingGet) | **GET** /security_price/{security_price_id} | Retrieve a security price
[**getSecurityUsingGet**](SecuritiesApi.md#getSecurityUsingGet) | **GET** /security/{security_id} | Retrieve a security
[**updateSecurityExclusionUsingPut**](SecuritiesApi.md#updateSecurityExclusionUsingPut) | **PUT** /security_exclusion/{security_exclusion_id} | Update a security exclusion
[**updateSecurityPriceUsingPut**](SecuritiesApi.md#updateSecurityPriceUsingPut) | **PUT** /security_price/{security_price_id} | Update a security price
[**updateSecurityUsingPut**](SecuritiesApi.md#updateSecurityUsingPut) | **PUT** /security/{security_id} | Update a security


<a name="createSecurityExclusionUsingPost"></a>
# **createSecurityExclusionUsingPost**
> SecurityExclusion createSecurityExclusionUsingPost(securityExclusionRequest)

Create a security exclusion

Create a new security exclusion for a specific account or portfolio.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityExclusionRequest = new HydrogenNucleusApi.SecurityExclusion(); // SecurityExclusion | securityExclusionRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSecurityExclusionUsingPost(securityExclusionRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionRequest** | [**SecurityExclusion**](SecurityExclusion.md)| securityExclusionRequest | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSecurityPriceUsingPost"></a>
# **createSecurityPriceUsingPost**
> SecurityPrice createSecurityPriceUsingPost(securityPriceRequest)

Create a security price

Create a new price for a security defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityPriceRequest = new HydrogenNucleusApi.SecurityPrice(); // SecurityPrice | securityPriceRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSecurityPriceUsingPost(securityPriceRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceRequest** | [**SecurityPrice**](SecurityPrice.md)| securityPriceRequest | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createSecurityUsingPost"></a>
# **createSecurityUsingPost**
> Security createSecurityUsingPost(securitiesInfoRequest)

Create a security

Create a new security for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securitiesInfoRequest = new HydrogenNucleusApi.Security(); // Security | securitiesInfoRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createSecurityUsingPost(securitiesInfoRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securitiesInfoRequest** | [**Security**](Security.md)| securitiesInfoRequest | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteSecurityExclusionUsingDelete"></a>
# **deleteSecurityExclusionUsingDelete**
> deleteSecurityExclusionUsingDelete(securityExclusionId)

Delete a security exclusion

Permanently delete a security exclusion

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityExclusionId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID security_exclusion_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurityExclusionUsingDelete(securityExclusionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | **String**| UUID security_exclusion_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSecurityPriceUsingDelete"></a>
# **deleteSecurityPriceUsingDelete**
> deleteSecurityPriceUsingDelete(securityPriceId)

Delete a security price

Permanently delete a security price from a security.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityPriceId = "739ecd39-e1ae-4a0b-b266-dd3ddc616163"; // String | UUID security_price_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurityPriceUsingDelete(securityPriceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | **String**| UUID security_price_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteSecurityUsingDelete"></a>
# **deleteSecurityUsingDelete**
> deleteSecurityUsingDelete(securityId)

Delete a security

Permanently delete a security for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID security_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
};
apiInstance.deleteSecurityUsingDelete(securityId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | **String**| UUID security_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityAllUsingGet"></a>
# **getSecurityAllUsingGet**
> PageSecurity getSecurityAllUsingGet(opts)

List all securities

Get details for all securities defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

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
apiInstance.getSecurityAllUsingGet(opts, callback);
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

[**PageSecurity**](PageSecurity.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityExclusionAllUsingGet"></a>
# **getSecurityExclusionAllUsingGet**
> PageSecurityExclusion getSecurityExclusionAllUsingGet(securityExclusionId, opts)

List all security exclusions

Get details for all security exclusions defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityExclusionId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID security_exclusion_id

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
apiInstance.getSecurityExclusionAllUsingGet(securityExclusionId, opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | **String**| UUID security_exclusion_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageSecurityExclusion**](PageSecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityExclusionUsingGet"></a>
# **getSecurityExclusionUsingGet**
> SecurityExclusion getSecurityExclusionUsingGet(securityExclusionId)

Retrieve a security exclusion

Retrieve the information for a security exclusion.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityExclusionId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | security exclusion id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityExclusionUsingGet(securityExclusionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusionId** | **String**| security exclusion id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPriceAllUsingGet"></a>
# **getSecurityPriceAllUsingGet**
> PageSecurityPrice getSecurityPriceAllUsingGet(opts)

List all security prices

Get prices for all securities defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

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
apiInstance.getSecurityPriceAllUsingGet(opts, callback);
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

[**PageSecurityPrice**](PageSecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityPriceUsingGet"></a>
# **getSecurityPriceUsingGet**
> SecurityPrice getSecurityPriceUsingGet(securityPriceId)

Retrieve a security price

Retrieve the information for a security price for a security.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityPriceId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID security_price_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityPriceUsingGet(securityPriceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPriceId** | **String**| UUID security_price_id | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getSecurityUsingGet"></a>
# **getSecurityUsingGet**
> Security getSecurityUsingGet(securityId)

Retrieve a security

Retrieve the information for a security defined for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityId = "739ecd39-e1ae-4a0b-b266-dd3ddc616163"; // String | UUID security_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getSecurityUsingGet(securityId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityId** | **String**| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateSecurityExclusionUsingPut"></a>
# **updateSecurityExclusionUsingPut**
> SecurityExclusion updateSecurityExclusionUsingPut(securityExclusion, securityExclusionId)

Update a security exclusion

Update the information for a security exclusion.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityExclusion = new HydrogenNucleusApi.SecurityExclusion(); // SecurityExclusion | security_exclusion

var securityExclusionId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID security_exclusion_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurityExclusionUsingPut(securityExclusion, securityExclusionId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityExclusion** | [**SecurityExclusion**](SecurityExclusion.md)| security_exclusion | 
 **securityExclusionId** | **String**| UUID security_exclusion_id | 

### Return type

[**SecurityExclusion**](SecurityExclusion.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSecurityPriceUsingPut"></a>
# **updateSecurityPriceUsingPut**
> SecurityPrice updateSecurityPriceUsingPut(securityPrice, securityPriceId)

Update a security price

Update a security price for a security.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var securityPrice = new HydrogenNucleusApi.SecurityPrice(); // SecurityPrice | security_price

var securityPriceId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID security_price_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurityPriceUsingPut(securityPrice, securityPriceId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **securityPrice** | [**SecurityPrice**](SecurityPrice.md)| security_price | 
 **securityPriceId** | **String**| UUID security_price_id | 

### Return type

[**SecurityPrice**](SecurityPrice.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateSecurityUsingPut"></a>
# **updateSecurityUsingPut**
> Security updateSecurityUsingPut(security, securityId)

Update a security

Update a security for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;
// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.SecuritiesApi();

var security = new HydrogenNucleusApi.Security(); // Security | security

var securityId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID security_id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateSecurityUsingPut(security, securityId, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **security** | [**Security**](Security.md)| security | 
 **securityId** | **String**| UUID security_id | 

### Return type

[**Security**](Security.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

