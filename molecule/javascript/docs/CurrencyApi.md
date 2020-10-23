# HydrogenMoleculeApi.CurrencyApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createCurrencyUsingPost**](CurrencyApi.md#createCurrencyUsingPost) | **POST** /currency | Creates a new Currency
[**getCurrencyAllUsingGet**](CurrencyApi.md#getCurrencyAllUsingGet) | **GET** /currency | Fetch Currency list
[**getCurrencyUsingGet**](CurrencyApi.md#getCurrencyUsingGet) | **GET** /currency/{currency_id} | Fetch Currency details
[**updateCurrencyUsingPut**](CurrencyApi.md#updateCurrencyUsingPut) | **PUT** /currency/{currency_id} | Update Currency details


<a name="createCurrencyUsingPost"></a>
# **createCurrencyUsingPost**
> CurrencyResponse createCurrencyUsingPost(currencyParams)

Creates a new Currency

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
        createCurrencyUsingPost();
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
const createCurrencyUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyApi();
    var currencyParams = new HydrogenMoleculeApi.CurrencyParams(); // CurrencyParams | It enables a user to create a Currency
    apiInstance.createCurrencyUsingPost(currencyParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyParams** | [**CurrencyParams**](CurrencyParams.md)| It enables a user to create a Currency | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyAllUsingGet"></a>
# **getCurrencyAllUsingGet**
> PageCurrencyResponse getCurrencyAllUsingGet(opts)

Fetch Currency list

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
        getCurrencyAllUsingGet();
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
const getCurrencyAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyApi();
    var opts = { 
      'symbol': "symbol_example", // String | To filter response Currency list by Symbol name
      'isAllowed': true, // Boolean | To filter response Currency list
      'page': 56, // Number | To filter response Currency list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getCurrencyAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| To filter response Currency list by Symbol name | [optional] 
 **isAllowed** | **Boolean**| To filter response Currency list | [optional] 
 **page** | **Number**| To filter response Currency list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageCurrencyResponse**](PageCurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrencyUsingGet"></a>
# **getCurrencyUsingGet**
> CurrencyResponse getCurrencyUsingGet(currencyId)

Fetch Currency details

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
        getCurrencyUsingGet();
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
const getCurrencyUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyApi();
    var currencyId = "currencyId_example"; // String | Currency ID
    apiInstance.getCurrencyUsingGet(currencyId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**String**](.md)| Currency ID | 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateCurrencyUsingPut"></a>
# **updateCurrencyUsingPut**
> CurrencyResponse updateCurrencyUsingPut(currencyId, opts)

Update Currency details

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
        updateCurrencyUsingPut();
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
const updateCurrencyUsingPut = () => {
    var apiInstance = new HydrogenMoleculeApi.CurrencyApi();
    var currencyId = "currencyId_example"; // String | Currency ID
    var opts = { 
      'currencyUpdateParams': new HydrogenMoleculeApi.CurrencyUpdateParams() // CurrencyUpdateParams | Currency details to be updated
    };
    apiInstance.updateCurrencyUsingPut(currencyId, opts, callback);
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **currencyId** | [**String**](.md)| Currency ID | 
 **currencyUpdateParams** | [**CurrencyUpdateParams**](CurrencyUpdateParams.md)| Currency details to be updated | [optional] 

### Return type

[**CurrencyResponse**](CurrencyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

