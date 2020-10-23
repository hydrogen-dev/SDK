# HydrogenMoleculeApi.DocumentApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createDocumentUsingPost**](DocumentApi.md#createDocumentUsingPost) | **POST** /document | Create a new Document
[**getDocumentUsingGet**](DocumentApi.md#getDocumentUsingGet) | **GET** /document/{document_id} | Retrieve a Document
[**verifyDocumentUsingPost**](DocumentApi.md#verifyDocumentUsingPost) | **POST** /document/verify | Verify a Document


<a name="createDocumentUsingPost"></a>
# **createDocumentUsingPost**
> TransactionSuccessResponse createDocumentUsingPost(documentParams)

Create a new Document

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
        createDocumentUsingPost();
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
const createDocumentUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.DocumentApi();
    var documentParams = new HydrogenMoleculeApi.DocumentParams(); // DocumentParams | Enables a user to store a Document hash on the blockchain
    apiInstance.createDocumentUsingPost(documentParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentParams** | [**DocumentParams**](DocumentParams.md)| Enables a user to store a Document hash on the blockchain | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDocumentUsingGet"></a>
# **getDocumentUsingGet**
> DocumentResponse getDocumentUsingGet(documentId)

Retrieve a Document

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
        getDocumentUsingGet();
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
const getDocumentUsingGet = () => {
    var apiInstance = new HydrogenMoleculeApi.DocumentApi();
    var documentId = "documentId_example"; // String | Document ID
    apiInstance.getDocumentUsingGet(documentId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentId** | [**String**](.md)| Document ID | 

### Return type

[**DocumentResponse**](DocumentResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="verifyDocumentUsingPost"></a>
# **verifyDocumentUsingPost**
> DocumentVerifyResponse verifyDocumentUsingPost(documentParams)

Verify a Document

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
        verifyDocumentUsingPost();
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
const verifyDocumentUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.DocumentApi();
    var documentParams = new HydrogenMoleculeApi.DocumentParams(); // DocumentParams | Enables a user to verify a Document has not been changed
    apiInstance.verifyDocumentUsingPost(documentParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **documentParams** | [**DocumentParams**](DocumentParams.md)| Enables a user to verify a Document has not been changed | 

### Return type

[**DocumentVerifyResponse**](DocumentVerifyResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

