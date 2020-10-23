# HydrogenMoleculeApi.WalletApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createWalletUsingPost**](WalletApi.md#createWalletUsingPost) | **POST** /wallet | Creates a new Wallet
[**getWalletAllUsingGet**](WalletApi.md#getWalletAllUsingGet) | **GET** /wallet | Fetch Wallet list
[**getWalletByWalletKeyUsingGet**](WalletApi.md#getWalletByWalletKeyUsingGet) | **GET** /wallet/wallet_key/{wallet_key_id} | Fetch Wallet details by Wallet Key ID
[**getWalletUsingGet**](WalletApi.md#getWalletUsingGet) | **GET** /wallet/{wallet_id} | Fetch Wallet details
[**updateWalletUsingPut**](WalletApi.md#updateWalletUsingPut) | **PUT** /wallet/{wallet_id} | Update Wallet details


<a name="createWalletUsingPost"></a>
# **createWalletUsingPost**
> WalletResponse createWalletUsingPost(walletParams)

Creates a new Wallet

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
        createWalletUsingPost();
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
const createWalletUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.WalletApi();
    var walletParams = new HydrogenMoleculeApi.WalletParams(); // WalletParams | It enables a user to create a Wallet
    apiInstance.createWalletUsingPost(walletParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletParams** | [**WalletParams**](WalletParams.md)| It enables a user to create a Wallet | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletAllUsingGet"></a>
# **getWalletAllUsingGet**
> PageWalletResponse getWalletAllUsingGet(opts)

Fetch Wallet list

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
        getWalletAllUsingGet();
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
const getWalletAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.WalletApi();
    var opts = { 
      'nucleusClientId': "nucleusClientId_example", // String | To filter response wallet list by client's ID
      'isPrimary': true, // Boolean | To filter response for primary wallets
      'page': 56, // Number | To filter response wallet list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getWalletAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nucleusClientId** | [**String**](.md)| To filter response wallet list by client's ID | [optional] 
 **isPrimary** | **Boolean**| To filter response for primary wallets | [optional] 
 **page** | **Number**| To filter response wallet list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageWalletResponse**](PageWalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletByWalletKeyUsingGet"></a>
# **getWalletByWalletKeyUsingGet**
> WalletResponse getWalletByWalletKeyUsingGet(walletKeyId)

Fetch Wallet details by Wallet Key ID

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
        getWalletByWalletKeyUsingGet();
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
const getWalletByWalletKeyUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.WalletApi();
    var walletKeyId = "walletKeyId_example"; // String | Wallet Key ID
    apiInstance.getWalletByWalletKeyUsingGet(walletKeyId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletKeyId** | [**String**](.md)| Wallet Key ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getWalletUsingGet"></a>
# **getWalletUsingGet**
> WalletResponse getWalletUsingGet(walletId)

Fetch Wallet details

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
        getWalletUsingGet();
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
const getWalletUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.WalletApi();
    var walletKeyId = "walletKeyId_example"; // String | Wallet Key ID
    apiInstance.getWalletUsingGet(walletKeyId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| Wallet ID | 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateWalletUsingPut"></a>
# **updateWalletUsingPut**
> WalletResponse updateWalletUsingPut(walletId, opts)

Update Wallet details

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
        updateWalletUsingPut();
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
const updateWalletUsingPut = () => {
    var apiInstance = new HydrogenMoleculeApi.WalletApi();
    var walletId = "walletId_example"; // String | Wallet ID
    apiInstance.updateWalletUsingPut(walletId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| Wallet ID | 
 **walletUpdateParams** | [**WalletParams**](WalletParams.md)| Wallet details to be updated | [optional] 

### Return type

[**WalletResponse**](WalletResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

