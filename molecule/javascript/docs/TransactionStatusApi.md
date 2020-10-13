# HydrogenMoleculeApi.TransactionStatusApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTransactionStatusAllUsingGet**](TransactionStatusApi.md#getTransactionStatusAllUsingGet) | **GET** /transaction_status | Fetch Transaction Status list
[**getTransactionStatusUsingGet**](TransactionStatusApi.md#getTransactionStatusUsingGet) | **GET** /transaction_status/{transaction_id} | Fetch Transaction record details


<a name="getTransactionStatusAllUsingGet"></a>
# **getTransactionStatusAllUsingGet**
> PageTransactionSuccessResponse getTransactionStatusAllUsingGet(opts)

Fetch Transaction Status list

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
        getTransactionStatusAllUsingGet();
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
const getTransactionStatusAllUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.TransactionStatusApi();
    var opts = { 
      'hash': "hash_example", // String | To filter response Transaction record list by Transaction's hash
      'walletId': "walletId_example", // String | To filter response Transaction record list by Wallet ID
      'status': "status_example", // String | To filter response Transaction record list by Transaction's status
      'page': 56, // Number | To filter response Transaction record list by page number
      'size': 56, // Number | Number of records per page
      'orderBy': "orderBy_example", // String | Field to sort record list
      'ascending': true, // Boolean | Sorting order
      'getLatest': true // Boolean | To fetch latest (one) record
    };
    apiInstance.getTransactionStatusAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **hash** | **String**| To filter response Transaction record list by Transaction's hash | [optional] 
 **walletId** | [**String**](.md)| To filter response Transaction record list by Wallet ID | [optional] 
 **status** | **String**| To filter response Transaction record list by Transaction's status | [optional] 
 **page** | **Number**| To filter response Transaction record list by page number | [optional] 
 **size** | **Number**| Number of records per page | [optional] 
 **orderBy** | **String**| Field to sort record list | [optional] 
 **ascending** | **Boolean**| Sorting order | [optional] 
 **getLatest** | **Boolean**| To fetch latest (one) record | [optional] 

### Return type

[**PageTransactionSuccessResponse**](PageTransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactionStatusUsingGet"></a>
# **getTransactionStatusUsingGet**
> TransactionSuccessResponse getTransactionStatusUsingGet(transactionId)

Fetch Transaction record details

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
        getTransactionStatusUsingGet();
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
const getTransactionStatusUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.TransactionStatusApi();
    var transactionId = "transactionId_example"; // String | Transaction ID
    apiInstance.getTransactionStatusUsingGet(transactionId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactionId** | [**String**](.md)| Transaction ID | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

