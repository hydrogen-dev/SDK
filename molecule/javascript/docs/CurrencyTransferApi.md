# HydrogenMoleculeApi.CurrencyTransferApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyTransferUsingPost**](CurrencyTransferApi.md#createCurrencyTransferUsingPost) | **POST** /currency_transfer | Creates Currency Transfer record
[**getCurrencyTransferAllUsingGet**](CurrencyTransferApi.md#getCurrencyTransferAllUsingGet) | **GET** /currency_transfer | Fetch Currency Transfer record list
[**getCurrencyTransferUsingGet**](CurrencyTransferApi.md#getCurrencyTransferUsingGet) | **GET** /currency_transfer/{currency_transfer_id} | Fetch Currency Transfer record details


<a name="createCurrencyTransferUsingPost"></a>
# **createCurrencyTransferUsingPost**
> TransactionSuccessResponse createCurrencyTransferUsingPost(currencyTransferParams)

Creates Currency Transfer record

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createCurrencyTransferUsingPost();
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
const createCurrencyTransferUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyTransferApi();
    var currencyTransferParams = new HydrogenMoleculeApi.CurrencyTransferParams(); // CurrencyTransferParams | It enables a user to transfer Currency
    apiInstance.createCurrencyTransferUsingPost(currencyTransferParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferParams** | [**CurrencyTransferParams**](CurrencyTransferParams.md)| It enables a user to transfer Currency | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyTransferAllUsingGet"></a>
# **getCurrencyTransferAllUsingGet**
> PageCurrencyTransferResponse getCurrencyTransferAllUsingGet(opts)

Fetch Currency Transfer record list

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getCurrencyTransferAllUsingGet();
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
const getCurrencyTransferAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyTransferApi();
    var opts = { 
      'walletId': "walletId_example", // String | To filter response Currency Transfer list by Wallet ID
      'currencyId': "currencyId_example", // String | To filter response Currency Transfer list by Currency ID
      'page': 56, // Number | To filter response Currency Transfer list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getCurrencyTransferAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| To filter response Currency Transfer list by Wallet ID | [optional] 
 **currencyId** | [**String**](.md)| To filter response Currency Transfer list by Currency ID | [optional] 
 **page** | **Number**| To filter response Currency Transfer list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyTransferResponse**](PageCurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyTransferUsingGet"></a>
# **getCurrencyTransferUsingGet**
> CurrencyTransferResponse getCurrencyTransferUsingGet(currencyTransferId)

Fetch Currency Transfer record details

### Example
```javascript
var HydrogenMoleculeApi = require('hydrogen_molecule_api');

var defaultClient = HydrogenMoleculeApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenMoleculeApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        getCurrencyTransferUsingGet();
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
const getCurrencyTransferUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyTransferApi();
    var currencyTransferId = "currencyTransferId_example"; // String | Currency Transfer ID
    apiInstance.getCurrencyTransferUsingGet(currencyTransferId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyTransferId** | [**String**](.md)| Currency Transfer ID | 

### Return type

[**CurrencyTransferResponse**](CurrencyTransferResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

