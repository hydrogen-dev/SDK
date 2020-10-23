# HydrogenMoleculeApi.TokenBalanceApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTokenBalanceAllUsingGet**](TokenBalanceApi.md#getTokenBalanceAllUsingGet) | **GET** /token_balance | Fetch Token Balance list
[**getTokenBalanceUsingGet**](TokenBalanceApi.md#getTokenBalanceUsingGet) | **GET** /token_balance/{token_balance_id} | Fetch Token Balance details


<a name="getTokenBalanceAllUsingGet"></a>
# **getTokenBalanceAllUsingGet**
> PageTokenBalanceResponse getTokenBalanceAllUsingGet(opts)

Fetch Token Balance list

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
        getTokenBalanceAllUsingGet();
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
const getTokenBalanceAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.TokenBalanceApi();
    var opts = { 
      'walletId': "walletId_example", // String | To filter response Token Balance list by wallet ID
      'tokenId': "tokenId_example", // String | To filter response Token Balance list by Token ID
      'page': 56, // Number | To filter response Token Balance list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getTokenBalanceAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **walletId** | [**String**](.md)| To filter response Token Balance list by wallet ID | [optional] 
 **tokenId** | [**String**](.md)| To filter response Token Balance list by Token ID | [optional] 
 **page** | **Number**| To filter response Token Balance list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageTokenBalanceResponse**](PageTokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTokenBalanceUsingGet"></a>
# **getTokenBalanceUsingGet**
> TokenBalanceResponse getTokenBalanceUsingGet(tokenBalanceId)

Fetch Token Balance details

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
        getTokenBalanceUsingGet();
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
const getTokenBalanceUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.TokenBalanceApi();
    // String | Token Balance ID
    var tokenBalanceId = "tokenBalanceId_example"; 
    apiInstance.getTokenBalanceUsingGet(tokenBalanceId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tokenBalanceId** | [**String**](.md)| Token Balance ID | 

### Return type

[**TokenBalanceResponse**](TokenBalanceResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

