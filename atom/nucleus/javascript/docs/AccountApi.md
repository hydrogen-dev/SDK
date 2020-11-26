# HydrogenNucleusApi.AccountApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/nucleus/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountAllocationMappingUsingPost**](AccountApi.md#createAccountAllocationMappingUsingPost) | **POST** /account_allocation | Create an account allocation
[**createAccountStatusUsingPost**](AccountApi.md#createAccountStatusUsingPost) | **POST** /account_status | Create an account status
[**createAccountTypeUsingPost**](AccountApi.md#createAccountTypeUsingPost) | **POST** /account_type | Create an account type
[**createAccountUsingPost**](AccountApi.md#createAccountUsingPost) | **POST** /account | Create an account
[**deleteAccountAllocationMappingUsingDelete**](AccountApi.md#deleteAccountAllocationMappingUsingDelete) | **DELETE** /account_allocation/{account_allocation_id} | Delete an account allocation
[**deleteAccountPermissionUsingDELETE**](AccountApi.md#deleteAccountPermissionUsingDELETE) | **DELETE** /account_permission/{account_id} | Delete an account permission
[**deleteAccountStatusUsingDelete**](AccountApi.md#deleteAccountStatusUsingDelete) | **DELETE** /account_status/{account_status_id} | Delete an account status
[**deleteAccountTypeUsingDelete**](AccountApi.md#deleteAccountTypeUsingDelete) | **DELETE** /account_type/{account_type_id} | Delete an account type
[**deleteAccountUsingDelete**](AccountApi.md#deleteAccountUsingDelete) | **DELETE** /account/{account_id} | Delete an account
[**getAccountAllUsingGet**](AccountApi.md#getAccountAllUsingGet) | **GET** /account | List all accounts
[**getAccountAllocationMappingAllUsingGet**](AccountApi.md#getAccountAllocationMappingAllUsingGet) | **GET** /account_allocation | List all account allocations
[**getAccountAllocationMappingUsingGet**](AccountApi.md#getAccountAllocationMappingUsingGet) | **GET** /account_allocation/{account_allocation_id} | Retrieve an account allocation
[**getAccountAssetSizeAggAllUsingGet**](AccountApi.md#getAccountAssetSizeAggAllUsingGet) | **GET** /account/{account_id}/asset_size | List all account asset sizes
[**getAccountAssetSizeAllUsingGet**](AccountApi.md#getAccountAssetSizeAllUsingGet) | **GET** /account_asset_size | List all account asset sizes
[**getAccountOverviewUsingGet**](AccountApi.md#getAccountOverviewUsingGet) | **GET** /account/{account_id}/account_overview | List all Account overview
[**getAccountPermissionUsingGET**](AccountApi.md#getAccountPermissionUsingGET) | **GET** /account_permission/{account_id} | Get an account permission
[**getAccountStatusAllUsingGet**](AccountApi.md#getAccountStatusAllUsingGet) | **GET** /account_status | List all account statuses
[**getAccountStatusUsingGet**](AccountApi.md#getAccountStatusUsingGet) | **GET** /account_status/{account_status_id} | Retrieve an account status
[**getAccountTypeAllUsingGet**](AccountApi.md#getAccountTypeAllUsingGet) | **GET** /account_type | List all account types
[**getAccountTypeUsingGet**](AccountApi.md#getAccountTypeUsingGet) | **GET** /account_type/{account_type_id} | Get an Account Type
[**getAccountUsingGet**](AccountApi.md#getAccountUsingGet) | **GET** /account/{account_id} | Retrieve an account
[**getAllAccountPermissionUsingGET**](AccountApi.md#getAllAccountPermissionUsingGET) | **GET** /account_permission | List all account permission
[**getPortfolioHoldingAggAllUsingGet**](AccountApi.md#getPortfolioHoldingAggAllUsingGet) | **GET** /account/{account_id}/holding | List all account holdings
[**getPortfolioTransactionAggAllUsingGet**](AccountApi.md#getPortfolioTransactionAggAllUsingGet) | **GET** /account/{account_id}/transaction | List all account transactions
[**insertAccountAndRelatedPermissionUsingPOST**](AccountApi.md#insertAccountAndRelatedPermissionUsingPOST) | **POST** /account_permission | create an account permission
[**subscribeAccountUsingPost**](AccountApi.md#subscribeAccountUsingPost) | **POST** /account/{account_id}/subscribe | Subscribe an account
[**updateAccountAllocationMappingUsingPut**](AccountApi.md#updateAccountAllocationMappingUsingPut) | **PUT** /account_allocation/{account_allocation_id} | Update an account allocation
[**updateAccountStatusUsingPut**](AccountApi.md#updateAccountStatusUsingPut) | **PUT** /account_status/{account_status_id} | Update an account status
[**updateAccountTypeUsingPut**](AccountApi.md#updateAccountTypeUsingPut) | **PUT** /account_type/{account_type_id} | Update an account type
[**updateAccountUsingPut**](AccountApi.md#updateAccountUsingPut) | **PUT** /account/{account_id} | Update an account
[**updateClientAccountPermissionUsingPUT**](AccountApi.md#updateClientAccountPermissionUsingPUT) | **PUT** /account_permission/{account_id} | Update an account permission


<a name="createAccountAllocationMappingUsingPost"></a>
# **createAccountAllocationMappingUsingPost**
> AccountAllocationMapping createAccountAllocationMappingUsingPost(allocRequest)

Create an account allocation

Create an account-allocation mapping for an account.

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
        createAccountAllocationMapping();
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
const createAccountAllocationMapping = () => {
    var api = new HydrogenNucleusApi.AccountApi()
    var allocRequest = new HydrogenNucleusApi.AccountAllocationMapping(); // {AccountAllocationMapping} allocRequest
    api.createAccountAllocationMappingUsingPost(allocRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **allocRequest** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountStatusUsingPost"></a>
# **createAccountStatusUsingPost**
> AccountStatus createAccountStatusUsingPost(accountStatusRequest)

Create an account status

Create an account status record for an account.

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
        createAccountStatus();
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
const createAccountStatus = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountStatusRequest = new HydrogenNucleusApi.AccountStatus(); // AccountStatus | accountStatusRequest
    apiInstance.createAccountStatusUsingPost(accountStatusRequest, callback);

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusRequest** | [**AccountStatus**](AccountStatus.md)| accountStatusRequest | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountTypeUsingPost"></a>
# **createAccountTypeUsingPost**
> AccountType createAccountTypeUsingPost(accountTypeRequest)

Create an account type

Create a new account type for your firm.

### Example
```javascript
var HydrogenNucleusApi = require('hydrogen_nucleus_api');
var defaultClient = HydrogenNucleusApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];
oauth2.accessToken = 'YOUR ACCESS TOKEN';

var apiInstance = new HydrogenNucleusApi.AccountApi();
var accountTypeRequest = new HydrogenNucleusApi.AccountType(); // AccountType | accountTypeRequest


var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.createAccountTypeUsingPost(accountTypeRequest, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeRequest** | [**AccountType**](AccountType.md)| accountTypeRequest | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createAccountUsingPost"></a>
# **createAccountUsingPost**
> Account createAccountUsingPost(clientAccountRequest)

Create an account

Create an account under a client.

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
        createAccountType();
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
const createAccountType = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountTypeRequest = new HydrogenNucleusApi.AccountType(); // AccountType | accountTypeRequest
    apiInstance.createAccountTypeUsingPost(accountTypeRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientAccountRequest** | [**Account**](Account.md)| clientAccountRequest | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteAccountAllocationMappingUsingDelete"></a>
# **deleteAccountAllocationMappingUsingDelete**
> deleteAccountAllocationMappingUsingDelete(accountAllocationId)

Delete an account allocation

Permanently delete an account-allocation mapping for an account.

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
        deleteAccountAllocationMapping();
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
const deleteAccountAllocationMapping = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountAllocationId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID account_allocation_id
    apiInstance.deleteAccountAllocationMappingUsingDelete(accountAllocationId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | **String**| UUID account_allocation_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountPermissionUsingDELETE"></a>
# **deleteAccountPermissionUsingDELETE**
> AccountPermissionVO deleteAccountPermissionUsingDELETE(accountId)

Delete an account permission

Delete an account permission

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
        deleteAccountPermission();
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
const deleteAccountPermission = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "accountId_example"; // String | account_id
    apiInstance.deleteAccountPermissionUsingDELETE(accountId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountStatusUsingDelete"></a>
# **deleteAccountStatusUsingDelete**
> deleteAccountStatusUsingDelete(accountStatusId)

Delete an account status

Permanently delete an account status record from an account’s history.

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
        deleteAccountStatus();
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
const deleteAccountStatus = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountStatusId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID account_status_id
    apiInstance.deleteAccountStatusUsingDelete(accountStatusId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | **String**| UUID account_status_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountTypeUsingDelete"></a>
# **deleteAccountTypeUsingDelete**
> deleteAccountTypeUsingDelete(accountTypeId)

Delete an account type

Permanently delete a possible account type defined for your firm.

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
        deleteAccountType();
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
const deleteAccountType = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountTypeId = "50d76212-0fcd-4d36-8633-e4a52cbcb79f"; // String | UUID account_type_id
    apiInstance.deleteAccountTypeUsingDelete(accountTypeId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | **String**| UUID account_type_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="deleteAccountUsingDelete"></a>
# **deleteAccountUsingDelete**
> deleteAccountUsingDelete(accountId)

Delete an account

Permanently delete an account under a client.

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
        deleteAccount();
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
const deleteAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | UUID account_id
    apiInstance.deleteAccountUsingDelete(accountId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 

### Return type

null (empty response body)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllUsingGet"></a>
# **getAccountAllUsingGet**
> PageAccount getAccountAllUsingGet(opts)

List all accounts

Get information for all accounts for all clients defined for your firm.

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
        getAccountAll();
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
const getAccountAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };    
    apiInstance.getAccountAllUsingGet(opts, callback);
}
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

[**PageAccount**](PageAccount.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllocationMappingAllUsingGet"></a>
# **getAccountAllocationMappingAllUsingGet**
> PageAccountAllocationMapping getAccountAllocationMappingAllUsingGet(opts)

List all account allocations

Get information for all account-allocation mappings for all accounts defined for your firm.

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
        getAccountAllocationMappingAll();
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
const getAccountAllocationMappingAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };    
    apiInstance.getAccountAllocationMappingAllUsingGet(opts, callback);

}
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

[**PageAccountAllocationMapping**](PageAccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAllocationMappingUsingGet"></a>
# **getAccountAllocationMappingUsingGet**
> AccountAllocationMapping getAccountAllocationMappingUsingGet(accountAllocationId)

Retrieve an account allocation

Retrieve the information for a specific account-allocation mapping for an account.

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
        getAccountAllocationMapping();
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
const getAccountAllocationMapping = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountAllocationId = "04907eaa-3f33-49be-a35b-378cdf639fba"; // String | UUID account_allocation_id
    apiInstance.getAccountAllocationMappingUsingGet(accountAllocationId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | **String**| UUID account_allocation_id | 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAssetSizeAggAllUsingGet"></a>
# **getAccountAssetSizeAggAllUsingGet**
> [AvailableDateDoubleVO] getAccountAssetSizeAggAllUsingGet(accountId, opts)

List all account asset sizes

Get a list of asset sizes by date for an account.

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
        getAccountAssetSizeAggAll();
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
const getAccountAssetSizeAggAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | Account Id
    var opts = { 
      'currencyConversion': "currencyConversion_example", // String | USD
      'endDate': new Date("2013-10-20"), // Date | end date
      'excludeSubledger': true, // Boolean | true or false
      'getLatest': true, // Boolean | true or false
      'sortType': "sortType_example", // String |  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in ()
      'startDate': new Date("2013-10-20") // Date | start date
    };
    apiInstance.getAccountAssetSizeAggAllUsingGet(accountId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| Account Id | 
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date | [optional] 
 **excludeSubledger** | **Boolean**| true or false | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **sortType** | **String**|  Quarter (Q), Monthly (M) , Annually (Y), Daily (D) --caps matter, codes in () | [optional] 
 **startDate** | **Date**| start date | [optional] 

### Return type

[**[AvailableDateDoubleVO]**](AvailableDateDoubleVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountAssetSizeAllUsingGet"></a>
# **getAccountAssetSizeAllUsingGet**
> PageVAccountAssetSize getAccountAssetSizeAllUsingGet(opts)

List all account asset sizes

Get information for all account asset sizes

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
        getAccountAssetSizeAll();
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
const getAccountAssetSizeAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };
    apiInstance.getAccountAssetSizeAllUsingGet(opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **filter** | **String**| filter | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]

### Return type

[**PageVAccountAssetSize**](PageVAccountAssetSize.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountOverviewUsingGet"></a>
# **getAccountOverviewUsingGet**
> Object getAccountOverviewUsingGet(accountId, opts)

List all Account overview

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
        getAccountOverview();
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
const getAccountOverview = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID account_id
    var opts = { 
      'ascending': false, // Boolean | ascending
      'orderBy': "update_date" // String | order_by
    };
    apiInstance.getAccountOverviewUsingGet(accountId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **orderBy** | **String**| order_by | [optional] [default to update_date]

### Return type

**Object**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountPermissionUsingGET"></a>
# **getAccountPermissionUsingGET**
> AccountPermissionVO getAccountPermissionUsingGET(accountId)

Get an account permission

Get an account permission

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
        getAccountPermission();
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
const getAccountPermission = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "2035f52d-2c5b-4e07-8904-cb037bad7aff"; // String | UUID account_id
    apiInstance.getAccountPermissionUsingGET(accountId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountStatusAllUsingGet"></a>
# **getAccountStatusAllUsingGet**
> PageAccountStatus getAccountStatusAllUsingGet(opts)

List all account statuses

Get the account status history information for all accounts.

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
        getAccountStatusAll();
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
const getAccountStatusAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };    
    apiInstance.getAccountStatusAllUsingGet(opts, callback);
}
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

[**PageAccountStatus**](PageAccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountStatusUsingGet"></a>
# **getAccountStatusUsingGet**
> AccountStatus getAccountStatusUsingGet(accountStatusId)

Retrieve an account status

Retrieve the information for a specific account status record for an account.

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
        getAccountStatus();
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
const getAccountStatus = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountStatusId = "62fd0a9f-4bac-4b1d-94d2-2c5ea2adca3d"; // String | UUID account_status_id
    apiInstance.getAccountStatusUsingGet(accountStatusId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatusId** | **String**| UUID account_status_id | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountTypeAllUsingGet"></a>
# **getAccountTypeAllUsingGet**
> PageAccountType getAccountTypeAllUsingGet(opts)

List all account types

List all account types defined for your firm.

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
        getAccountTypeAll();
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
const getAccountTypeAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };    
    apiInstance.getAccountTypeAllUsingGet(opts, callback);
}
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

[**PageAccountType**](PageAccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountTypeUsingGet"></a>
# **getAccountTypeUsingGet**
> AccountType getAccountTypeUsingGet(accountTypeId)

Get an Account Type

Get an account types defined for your firm.

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
        getAccountType();
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
const getAccountType = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountTypeId = "50d76212-0fcd-4d36-8633-e4a52cbcb79f"; // String | UUID account_type_id   
    apiInstance.getAccountTypeUsingGet(accountTypeId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountTypeId** | **String**| UUID account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAccountUsingGet"></a>
# **getAccountUsingGet**
> Account getAccountUsingGet(accountId)

Retrieve an account

Retrieve the information for a specific account associated with a client.

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
        getAccount();
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
const getAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | UUID account_id
    apiInstance.getAccountUsingGet(accountId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getAllAccountPermissionUsingGET"></a>
# **getAllAccountPermissionUsingGET**
> PageAccountPermissionVO getAllAccountPermissionUsingGET(opts)

List all account permission

List all account permission

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
        getAllAccountPermission();
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
const getAllAccountPermission = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var opts = { 
      'ascending': false, // Boolean | ascending
      'filter': "filter_example", // String | filter
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25 // Number | size
    };    
    apiInstance.getAllAccountPermissionUsingGET(opts, callback);
}
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

[**PageAccountPermissionVO**](PageAccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioHoldingAggAllUsingGet"></a>
# **getPortfolioHoldingAggAllUsingGet**
> [PortfolioHoldingAgg] getPortfolioHoldingAggAllUsingGet(accountId, opts)

List all account holdings

Get information for all the securities that are currently being held by an account.

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
        getPortfolioHoldingAggAll();
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
const getPortfolioHoldingAggAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | UUID account_id

    var opts = { 
      'currencyConversion': "currencyConversion_example", // String | USD
      'endDate': new Date("2013-10-20"), // Date | end date 
      'getLatest': true, // Boolean | true or false
      'startDate': new Date("2013-10-20") // Date | start date 
    };
    apiInstance.getPortfolioHoldingAggAllUsingGet(accountId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date  | [optional] 
 **getLatest** | **Boolean**| true or false | [optional] 
 **startDate** | **Date**| start date  | [optional] 

### Return type

[**[PortfolioHoldingAgg]**](PortfolioHoldingAgg.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getPortfolioTransactionAggAllUsingGet"></a>
# **getPortfolioTransactionAggAllUsingGet**
> PagePortfolioTransaction getPortfolioTransactionAggAllUsingGet(accountId, opts)

List all account transactions

Get the information for all transactions for an account.

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
        getPortfolioTransactionAggAll();
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
const getPortfolioTransactionAggAll = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "accountId_example"; // String | UUID account_id

    var opts = { 
      'ascending': false, // Boolean | ascending
      'currencyConversion': "currencyConversion_example", // String | USD
      'endDate': new Date("2013-10-20"), // Date | end date 
      'orderBy': "update_date", // String | order_by
      'page': 0, // Number | page
      'size': 25, // Number | size
      'startDate': new Date("2013-10-20") // Date | start date 
    };
    apiInstance.getPortfolioTransactionAggAllUsingGet(accountId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 
 **ascending** | **Boolean**| ascending | [optional] [default to false]
 **currencyConversion** | **String**| USD | [optional] 
 **endDate** | **Date**| end date  | [optional] 
 **orderBy** | **String**| order_by | [optional] [default to update_date]
 **page** | **Number**| page | [optional] [default to 0]
 **size** | **Number**| size | [optional] [default to 25]
 **startDate** | **Date**| start date  | [optional] 

### Return type

[**PagePortfolioTransaction**](PagePortfolioTransaction.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="insertAccountAndRelatedPermissionUsingPOST"></a>
# **insertAccountAndRelatedPermissionUsingPOST**
> AccountPermissionVO insertAccountAndRelatedPermissionUsingPOST(aclClientPermissionVO)

create an account permission

create an account permission

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
        insertAccountAndRelatedPermission();
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
const insertAccountAndRelatedPermission = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var aclClientPermissionVO = new HydrogenNucleusApi.AclClientPermissionVO(); // AclClientPermissionVO | aclClientPermissionVO
    apiInstance.insertAccountAndRelatedPermissionUsingPOST(aclClientPermissionVO, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aclClientPermissionVO** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscribeAccountUsingPost"></a>
# **subscribeAccountUsingPost**
> [Portfolio] subscribeAccountUsingPost(accountId, allocRequest)

Subscribe an account

After creating an account, you may create portfolios for the account to track a client’s investment, savings, or insurance products.

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
        subscribeAccount();
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
const subscribeAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | UUID account_id
    var allocRequest = new HydrogenNucleusApi.AccountAllocationMapping(); // AccountAllocationMapping | allocRequest
    apiInstance.subscribeAccountUsingPost(accountId, allocRequest, callback);

}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| UUID account_id | 
 **allocRequest** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| allocRequest | 

### Return type

[**[Portfolio]**](Portfolio.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountAllocationMappingUsingPut"></a>
# **updateAccountAllocationMappingUsingPut**
> AccountAllocationMapping updateAccountAllocationMappingUsingPut(accountAllocationId, opts)

Update an account allocation

Update the information for an account-allocation mapping.

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
        updateAccountAllocationMapping();
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
const updateAccountAllocationMapping = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountAllocationId = "11c28dade-8679-4df5-9b9d-c508d04fcb0c"; // String | UUID account_allocation_id

    var opts = { 
      'accountAllocationMapping': new HydrogenNucleusApi.AccountAllocationMapping() // AccountAllocationMapping | account_allocation_mapping
    };
    apiInstance.updateAccountAllocationMappingUsingPut(accountAllocationId, opts, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountAllocationId** | **String**| UUID account_allocation_id | 
 **accountAllocationMapping** | [**AccountAllocationMapping**](AccountAllocationMapping.md)| account_allocation_mapping | [optional] 

### Return type

[**AccountAllocationMapping**](AccountAllocationMapping.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountStatusUsingPut"></a>
# **updateAccountStatusUsingPut**
> AccountStatus updateAccountStatusUsingPut(accountStatus, accountStatusId)

Update an account status

Update an account status record for an account.

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
        updateAccountStatus();
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
const updateAccountStatus = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountStatus = new HydrogenNucleusApi.AccountStatus(); // AccountStatus | account_status
    var accountStatusId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID account_status_id
    apiInstance.updateAccountStatusUsingPut(accountStatus, accountStatusId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountStatus** | [**AccountStatus**](AccountStatus.md)| account_status | 
 **accountStatusId** | **String**| UUID account_status_id | 

### Return type

[**AccountStatus**](AccountStatus.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountTypeUsingPut"></a>
# **updateAccountTypeUsingPut**
> AccountType updateAccountTypeUsingPut(accountType, accountTypeId)

Update an account type

Update the information for a possible account type defined for your firm.

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
        updateAccountType();
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
const updateAccountType = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountType = new HydrogenNucleusApi.AccountType(); // AccountType | account_type
    var accountTypeId = "f96fad3e-a8cf-4915-bc0c-da4d9693ab83"; // String | UUID account_type_id
    apiInstance.updateAccountTypeUsingPut(accountType, accountTypeId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountType** | [**AccountType**](AccountType.md)| account_type | 
 **accountTypeId** | **String**| UUID account_type_id | 

### Return type

[**AccountType**](AccountType.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateAccountUsingPut"></a>
# **updateAccountUsingPut**
> Account updateAccountUsingPut(account, accountId)

Update an account

Update the information for an account.

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
        updateAccount();
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
const updateAccount = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var account = new HydrogenNucleusApi.Account(); // Account | account
    var accountId = "bab849d6-de96-4dc7-a5ea-19be45c52a4e"; // String | UUID account_id
    apiInstance.updateAccountUsingPut(account, accountId, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **account** | [**Account**](Account.md)| account | 
 **accountId** | **String**| UUID account_id | 

### Return type

[**Account**](Account.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateClientAccountPermissionUsingPUT"></a>
# **updateClientAccountPermissionUsingPUT**
> AccountPermissionVO updateClientAccountPermissionUsingPUT(accountId, aclClientPermissionVO)

Update an account permission

Update an account permission

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
        updateClientAccountPermission();
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
const updateClientAccountPermission = () => {
    var apiInstance = new HydrogenNucleusApi.AccountApi();
    var accountId = "accountId_example"; // String | account_id
    var aclClientPermissionVO = new HydrogenNucleusApi.AclClientPermissionVO(); // AclClientPermissionVO | aclClientPermissionVO
    apiInstance.updateClientAccountPermissionUsingPUT(accountId, aclClientPermissionVO, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| account_id | 
 **aclClientPermissionVO** | [**AclClientPermissionVO**](AclClientPermissionVO.md)| aclClientPermissionVO | 

### Return type

[**AccountPermissionVO**](AccountPermissionVO.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

