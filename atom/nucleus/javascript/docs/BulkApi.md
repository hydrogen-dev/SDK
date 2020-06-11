# HydrogenAtomApi.BulkApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createBulkUsingPost**](BulkApi.md#createBulkUsingPost) | **POST** /bulk/{entity_uri} | Create a bulk data
[**deleteBulkUsingDelete**](BulkApi.md#deleteBulkUsingDelete) | **DELETE** /bulk/{entity_uri} | Delete a bulk data
[**getBulkStatusUsingGet**](BulkApi.md#getBulkStatusUsingGet) | **GET** /bulk/status/{id} | Status of bulk transaction
[**updateBulkUsingPut**](BulkApi.md#updateBulkUsingPut) | **PUT** /bulk/{entity_uri} | Update a bulk data


<a name="createBulkUsingPost"></a>
# **createBulkUsingPost**
> BulkTransaction createBulkUsingPost(data, entityUri)

Create a bulk data

Create a new bulk data for your firm.

### Example
```javascript
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenAtomApi.BulkApi();

var data = new HydrogenAtomApi.JsonNode(); // JsonNode | data

var entityUri = "model"; // String | UUID entity_uri


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createBulkUsingPost(data, entityUri, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entityUri** | **String**| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteBulkUsingDelete"></a>
# **deleteBulkUsingDelete**
> BulkTransaction deleteBulkUsingDelete(data, entityUri)

Delete a bulk data

Delete a bulk data for your firm.

### Example
```javascript
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenAtomApi.BulkApi();

var data = new HydrogenAtomApi.JsonNode(); // JsonNode | data

var entityUri = "model"; // String | UUID entity_uri


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.deleteBulkUsingDelete(data, entityUri, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entityUri** | **String**| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulkStatusUsingGet"></a>
# **getBulkStatusUsingGet**
> BulkTransactionVO getBulkStatusUsingGet(id)

Status of bulk transaction

Get the status of bulk transaction.

### Example
```javascript
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenAtomApi.BulkApi();

var id = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID Bulk Transaction Id


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getBulkStatusUsingGet(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| UUID Bulk Transaction Id | 

### Return type

[**BulkTransactionVO**](BulkTransactionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateBulkUsingPut"></a>
# **updateBulkUsingPut**
> BulkTransaction updateBulkUsingPut(data, entityUri)

Update a bulk data

Update a bulk data for your firm.

### Example
```javascript
var HydrogenAtomApi = require('hydrogen_atom_api');

var defaultClient = HydrogenAtomApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenAtomApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
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


var apiInstance = new HydrogenAtomApi.BulkApi();

var data = new HydrogenAtomApi.JsonNode(); // JsonNode | data

var entityUri = "model"; // String | UUID entity_uri


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.updateBulkUsingPut(data, entityUri, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data** | [**JsonNode**](JsonNode.md)| data | 
 **entityUri** | **String**| UUID entity_uri | 

### Return type

[**BulkTransaction**](BulkTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

