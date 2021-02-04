# HydrogenProtonApi.CardsApi

All URIs are relative to *https://sandbox.hydrogenplatform.com/proton/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cardLimitCheck**](CardsApi.md#cardLimitCheck) | **POST** /card_limit_check | Card Limit Check
[**cardTransactionAuthorization**](CardsApi.md#cardTransactionAuthorization) | **POST** /card_authorization | Card Transaction Authorization


<a name="cardLimitCheck"></a>
# **cardLimitCheck**
> {'String': Object} cardLimitCheck(cardLimitCheckRequest)

Card Limit Check

Evaluate card transaction history against spending controls

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createCardLimitRequest();
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
const createCardLimitRequest = () => {
    var apiInstance = new HydrogenProtonApi.CardsApi();
    var cardLimitCheckRequest = new HydrogenProtonApi.CardLimitCheckRequest(); // CardLimitCheckRequest | Request payload for Card Limit Check
    apiInstance.cardLimitCheck(cardLimitCheckRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardLimitCheckRequest** | [**CardLimitCheckRequest**](CardLimitCheckRequest.md)| Request payload for Card Limit Check | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="cardTransactionAuthorization"></a>
# **cardTransactionAuthorization**
> {'String': Object} cardTransactionAuthorization(cardTransactionAuthorizationRequest)

Card Transaction Authorization

Approve or reject a card transaction based on applicable conditions

### Example
```javascript
var HydrogenProtonApi = require('hydrogen_proton_api');

var defaultClient = HydrogenProtonApi.ApiClient.instance;

// Configure OAuth2 access token for authorization: oauth2
var oauth2 = defaultClient.authentications['oauth2'];

// Create an instance of the Auth API class
var api = new HydrogenProtonApi.AuthApi();

// Callback function definition
var tokenGenerationCallback = function (error, data, response) {
    if (error) {
        console.error(error);
        process.exit(1);
    } else {
        console.log(response.request.method + ' : ' + response.request.url + '\n' + 'Output: ' + JSON.stringify(data, null, '\t') + '\n');
        oauth2.accessToken = data.access_token;
        createCardTransactionAuthorizationRequest();
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
const createCardTransactionAuthorizationRequest = () => {
    var apiInstance = new HydrogenProtonApi.CardsApi();
    var cardTransactionAuthorizationRequest = new HydrogenProtonApi.CardTransactionAuthorizationRequest(); // CardTransactionAuthorizationRequest | Request payload for Card Transaction Authorization
    apiInstance.cardTransactionAuthorization(cardTransactionAuthorizationRequest, callback);
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cardTransactionAuthorizationRequest** | [**CardTransactionAuthorizationRequest**](CardTransactionAuthorizationRequest.md)| Request payload for Card Transaction Authorization | 

### Return type

**{'String': Object}**

### Authorization

[oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

