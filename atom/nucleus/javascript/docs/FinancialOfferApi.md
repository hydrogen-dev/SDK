# HydrogenNucleusApi.FinancialOfferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createFinancialOfferUsingPost**](FinancialOfferApi.md#createFinancialOfferUsingPost) | **POST** /financial_offer | Create a comparison request
[**deleteFinancialOfferUsingDelete**](FinancialOfferApi.md#deleteFinancialOfferUsingDelete) | **DELETE** /financial_offer/{financial_offer_id} | Delete a comparison request
[**getFinancialOfferAllUsingGet**](FinancialOfferApi.md#getFinancialOfferAllUsingGet) | **GET** /financial_offer | List all comparison requests
[**getFinancialOfferUsingGet**](FinancialOfferApi.md#getFinancialOfferUsingGet) | **GET** /financial_offer/{financial_offer_id} | Retrieve a comparison request
[**updateFinancialOfferUsingPut**](FinancialOfferApi.md#updateFinancialOfferUsingPut) | **PUT** /financial_offer/{financial_offer_id} | Update a comparison request


<a name="createFinancialOfferUsingPost"></a>
# **createFinancialOfferUsingPost**
> FinancialOffer createFinancialOfferUsingPost(financialOffer)

Create a comparison request

Create a new comparison request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createFinancialOffer();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const createFinancialOffer = () => {  
    var apiInstance = new HydrogenNucleusApi.FinancialOfferApi();
    var financialOffer = new HydrogenNucleusApi.FinancialOffer(); // FinancialOffer | financialOffer
    apiInstance.createFinancialOfferUsingPost(financialOffer, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**FinancialOffer**](FinancialOffer.md)| financialOffer | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteFinancialOfferUsingDelete"></a>
# **deleteFinancialOfferUsingDelete**
> deleteFinancialOfferUsingDelete(financialOfferId)

Delete a comparison request

Permanently delete a comparison request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        deleteFinancialOffer();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const deleteFinancialOffer = () => {  
    var apiInstance = new HydrogenNucleusApi.FinancialOfferApi();
    var financialOfferId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID financial_offer_id
    apiInstance.deleteFinancialOfferUsingDelete(financialOfferId, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOfferId** | **String**| UUID financial_offer_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialOfferAllUsingGet"></a>
# **getFinancialOfferAllUsingGet**
> PageFinancialOffer getFinancialOfferAllUsingGet(opts)

List all comparison requests

Get the information for all comparison requests.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getFinancialOfferAll();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getFinancialOfferAll = () => {  
    var apiInstance = new HydrogenNucleusApi.FinancialOfferApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'currencyConversion': "currencyConversion_example", // String | currency_conversion
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getFinancialOfferAllUsingGet(opts, callback);
}   
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

[**PageFinancialOffer**](PageFinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFinancialOfferUsingGet"></a>
# **getFinancialOfferUsingGet**
> FinancialOffer getFinancialOfferUsingGet(financialOfferId, opts)

Retrieve a comparison request

Retrieve the information for a comparison request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getFinancialOffer();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const getFinancialOffer = () => {  
    var apiInstance = new HydrogenNucleusApi.FinancialOfferApi();
    var financialOfferId = "1a2bb85f-c1b4-41d5-9bf3-e23cce54b71c"; // String | UUID financial_offer_id
    var opts = { 
      'currencyConversion': "currencyConversion_example" // String | USD
    };
    apiInstance.getFinancialOfferUsingGet(financialOfferId, opts, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOfferId** | **String**| UUID financial_offer_id | 
 **currencyConversion** | **String**| USD | [optional] 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="updateFinancialOfferUsingPut"></a>
# **updateFinancialOfferUsingPut**
> FinancialOffer updateFinancialOfferUsingPut(financialOffer, financialOfferId)

Update a comparison request

Update the information for a comparison request.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');

var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenNucleusApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        updateFinancialOffer();
    }
};
//          Use one of the below method to generate oauth token        
// Token Generation for grant_type = client_credentials
api.createUsingPostClientCredentials({
    'grant_type': 'client_credentials',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

// Token Generation for grant_type = password
api.createUsingPostPassword({
    'grant_type': 'password',
    'username' : 'MYUSERNAME',
    'password' : 'MYPASSWORD',
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET'
}, tokenGenerationCallback);

//Token Generation using client token
api.createUsingPostClientTokenCredentials({
    'client_id': 'MYCLIENTID',
    'client_secret': 'MYCLIENTSECRET',
    'client_token' : 'CLIENT_TOKEN'
}, tokenGenerationCallback);

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
const updateFinancialOffer = () => {  
    var apiInstance = new HydrogenNucleusApi.FinancialOfferApi();
    var financialOffer = new HydrogenNucleusApi.FinancialOffer(); // FinancialOffer | financial_offer
    var financialOfferId = "d79bb3a3-f259-430c-8fa8-a93f87cc3bdf"; // String | UUID financial_offer_id
    apiInstance.updateFinancialOfferUsingPut(financialOffer, financialOfferId, callback);
}   
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **financialOffer** | [**FinancialOffer**](FinancialOffer.md)| financial_offer | 
 **financialOfferId** | **String**| UUID financial_offer_id | 

### Return type

[**FinancialOffer**](FinancialOffer.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

