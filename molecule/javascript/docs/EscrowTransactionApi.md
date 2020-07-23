# HydrogenMoleculeApi.EscrowTransactionApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createEscrowTransactionUsingPost**](EscrowTransactionApi.md#createEscrowTransactionUsingPost) | **POST** /escrow_transaction | Create a new Escrow Transaction
[**getEscrowTransactionAllUsingGet**](EscrowTransactionApi.md#getEscrowTransactionAllUsingGet) | **GET** /escrow_transaction | List all Escrow Transaction
[**getEscrowTransactionUsingGet**](EscrowTransactionApi.md#getEscrowTransactionUsingGet) | **GET** /escrow_transaction/{escrow_transaction_id} | Fetch Escrow Transaction
[**updateEscrowTransactionUsingPut**](EscrowTransactionApi.md#updateEscrowTransactionUsingPut) | **PUT** /escrow_transaction/{escrow_transaction_id} | Update Escrow Transaction


<a name="createEscrowTransactionUsingPost"></a>
# **createEscrowTransactionUsingPost**
> EscrowTransactionResponse createEscrowTransactionUsingPost(escrowDepositParams)

Create a new Escrow Transaction

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
        createEscrowTransactionUsingPost();
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

var callback = function(error, data, response) {
    if (error) {
        console.error(error);
    } else {
        console.log('API called successfully. Returned data: ' + data);
    }
};
const createEscrowTransactionUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.EscrowTransactionApi();
    var escrowDepositParams = new HydrogenMoleculeApi.EscrowDepositParams(); // EscrowDepositParams | It enables a user to create a escrow transaction
    apiInstance.createEscrowTransactionUsingPost(escrowDepositParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowDepositParams** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowTransactionAllUsingGet"></a>
# **getEscrowTransactionAllUsingGet**
> PageEscrowTransactionResponse getEscrowTransactionAllUsingGet(opts)

List all Escrow Transaction

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
        getEscrowTransactionAllUsingGet();
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

var callback = function(error, data, response) {
    if (error) {
        console.error(error);
    } else {
        console.log('API called successfully. Returned data: ' + data);
    }
};
const getEscrowTransactionAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.EscrowTransactionApi();
    
    var opts = { 
      'page': 56, // Number | To filter response Escrow Transaction list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getEscrowTransactionAllUsingGet(opts, callback)
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page** | **Number**| To filter response Escrow Transaction list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageEscrowTransactionResponse**](PageEscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getEscrowTransactionUsingGet"></a>
# **getEscrowTransactionUsingGet**
> EscrowTransactionResponse getEscrowTransactionUsingGet(escrowTransactionId)

Fetch Escrow Transaction

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
        getEscrowTransactionUsingGet();
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

var callback = function(error, data, response) {
    if (error) {
        console.error(error);
    } else {
        console.log('API called successfully. Returned data: ' + data);
    }
};
const getEscrowTransactionUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.EscrowTransactionApi();
    var escrowTransactionId = "escrowTransactionId_example"; // String | Escrow Transaction ID
    apiInstance.getEscrowTransactionUsingGet(escrowTransactionId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowTransactionId** | [**String**](.md)| Escrow Transaction ID | 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateEscrowTransactionUsingPut"></a>
# **updateEscrowTransactionUsingPut**
> EscrowTransactionResponse updateEscrowTransactionUsingPut(escrowTransactionId, opts)

Update Escrow Transaction

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
        updateEscrowTransactionUsingPut();
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

var callback = function(error, data, response) {
    if (error) {
        console.error(error);
    } else {
        console.log('API called successfully. Returned data: ' + data);
    }
};
const updateEscrowTransactionUsingPut = () => {
    var apiInstance = new HydrogenMoleculeApi.EscrowTransactionApi();
    var escrowTransactionId = "escrowTransactionId_example"; // String | Escrow Transaction ID
    var opts = { 
    'escrowDepositParams': new HydrogenMoleculeApi.EscrowDepositParams() // EscrowDepositParams | It enables a user to create a escrow transaction
    };
    apiInstance.updateEscrowTransactionUsingPut(escrowTransactionId, opts, callback);
}

```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **escrowTransactionId** | [**String**](.md)| Escrow Transaction ID | 
 **escrowDepositParams** | [**EscrowDepositParams**](EscrowDepositParams.md)| It enables a user to create a escrow transaction | [optional] 

### Return type

[**EscrowTransactionResponse**](EscrowTransactionResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

