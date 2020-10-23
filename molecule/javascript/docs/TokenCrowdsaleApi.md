# HydrogenMoleculeApi.TokenCrowdsaleApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/molecule/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deployCrowdsaleUsingPost**](TokenCrowdsaleApi.md#deployCrowdsaleUsingPost) | **POST** /crowdsale/deploy | Deploy token for Crowdsale
[**fundCrowdsaleUsingPost**](TokenCrowdsaleApi.md#fundCrowdsaleUsingPost) | **POST** /crowdsale/fund | Fund/add Tokens supply to Crowdsale
[**purchaseCrowdsaleUsingPost**](TokenCrowdsaleApi.md#purchaseCrowdsaleUsingPost) | **POST** /crowdsale/purchase | Purchase Tokens from Crowdsale


<a name="deployCrowdsaleUsingPost"></a>
# **deployCrowdsaleUsingPost**
> TransactionSuccessResponse deployCrowdsaleUsingPost(crowdsaleDeployParams)

Deploy token for Crowdsale

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
        deployCrowdsaleUsingPost();
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
const deployCrowdsaleUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.TokenCrowdsaleApi();
    var crowdsaleDeployParams = new HydrogenMoleculeApi.CrowdsaleDeployParams(); // CrowdsaleDeployParams | Deploy token for Crowdsale
    apiInstance.deployCrowdsaleUsingPost(crowdsaleDeployParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsaleDeployParams** | [**CrowdsaleDeployParams**](CrowdsaleDeployParams.md)| Deploy token for Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fundCrowdsaleUsingPost"></a>
# **fundCrowdsaleUsingPost**
> TransactionSuccessResponse fundCrowdsaleUsingPost(crowdsaleFundParams)

Fund/add Tokens supply to Crowdsale

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
        fundCrowdsaleUsingPost();
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
const fundCrowdsaleUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.TokenCrowdsaleApi();
    var crowdsaleFundParams = new HydrogenMoleculeApi.CrowdsaleFundParams(); // CrowdsaleFundParams | Fund provided Token's supply to Crowdsale
    apiInstance.fundCrowdsaleUsingPost(crowdsaleFundParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsaleFundParams** | [**CrowdsaleFundParams**](CrowdsaleFundParams.md)| Fund provided Token's supply to Crowdsale | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="purchaseCrowdsaleUsingPost"></a>
# **purchaseCrowdsaleUsingPost**
> TransactionSuccessResponse purchaseCrowdsaleUsingPost(crowdsalePurchaseParams)

Purchase Tokens from Crowdsale

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
        purchaseCrowdsaleUsingPost();
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
const purchaseCrowdsaleUsingPost = () => {
    var apiInstance = new HydrogenMoleculeApi.TokenCrowdsaleApi();
    var crowdsalePurchaseParams = new HydrogenMoleculeApi.CrowdsalePurchaseParams(); // CrowdsalePurchaseParams | Purchase Tokens
    apiInstance.purchaseCrowdsaleUsingPost(crowdsalePurchaseParams, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **crowdsalePurchaseParams** | [**CrowdsalePurchaseParams**](CrowdsalePurchaseParams.md)| Purchase Tokens | 

### Return type

[**TransactionSuccessResponse**](TransactionSuccessResponse.md)

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

